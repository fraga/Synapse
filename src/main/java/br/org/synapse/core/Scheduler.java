package br.org.synapse.core;

import java.util.Dictionary;
import java.util.Queue;

import br.org.synapse.manager.Managers;

public class Scheduler implements IObserver {

	private Dictionary<ISystem, Queue<ITask>> _task;
	
	public Scheduler() {
		Clock.getClock().addObserver(this);
	}

	@Override
	public void changeNotify(ISubject sender) {
		Managers.getTask().run();		
	}

	@Override
	public void destroyNotify(ISubject sender) {
		// TODO Auto-generated method stub
		
	}
}
