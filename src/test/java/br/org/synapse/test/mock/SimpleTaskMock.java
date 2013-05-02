package br.org.synapse.test.mock;

import java.util.List;

import br.org.synapse.core.ITask;

public class SimpleTaskMock implements ITask{
    private int _value = 0;
    
    @Override
    public void run() {
        AddOneToValue();
    }

    @Override
    public boolean hasSubTask() {
        return false;
    }

    @Override
    public List<ITask> getSubTask() {
        return null;
    }
    
    public void AddOneToValue(){
        _value++;
    }
    
    public int GetValue(){
        return _value;
    }

}
