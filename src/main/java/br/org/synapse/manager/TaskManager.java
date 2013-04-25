/*
 * 
 */
package br.org.synapse.manager;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.org.synapse.core.ITask;

public class TaskManager implements Runnable {
    private static TaskManager _taskManager = null;
    private Queue<ITask> _taskQueue;
    private ExecutorService _threadPool;
    
    public static TaskManager getTaskManager() {
        if (_taskManager == null)
            _taskManager = new TaskManager();
        
        return _taskManager;
    }
    
    private TaskManager() {
        _threadPool = createThreadPool();
    }
    
    // Add one task to the queue. Subtasks have priority on the queue
    public void queueTask(ITask task) {
        if (task.hasSubTask()) {
            for (ITask subTask : task.getSubTask())
                queueTask(subTask);
        }
        
        _taskQueue.add(task);
    }
    
    @Override
    public void run() {
        doExecution();
    }
    
    private ExecutorService createThreadPool() {
        int numberOfThread = Managers.getPlatform().getTotalProcessors();
        return Executors.newFixedThreadPool(numberOfThread);
    }
    
    private void doExecution() {
        for (ITask task : _taskQueue)
            _threadPool.execute(task);
        
        _threadPool.shutdown();
        
        while (!_threadPool.isTerminated()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
