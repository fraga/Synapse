package synapse.core;

public interface IObserver {
	void changeNotify(ISubject sender);
	void destroyNotify(ISubject sender);
}
