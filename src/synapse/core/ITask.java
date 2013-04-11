package synapse.core;

import java.util.List;

public interface ITask extends Runnable {
	boolean hasSubTask();
	List<ITask> getSubTask();
}
