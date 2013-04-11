package synapse.core;

public class Clock implements ISubject {
	private static Clock _mainClock = null;
	private long _number;
	private ActionObserver _actionObserver;
	
	private Clock() {
		_number = 0;
		_actionObserver = new ActionObserver();
	}
	
	public static Clock getClock() {
		if (_mainClock == null)
			_mainClock = new Clock();
		
		return _mainClock;
	}
	
	public long getNumber() {
		return _number;
	}
	
	public void tick() {
		_number++;
		_actionObserver.fireChangeEvent(this);
	}

	@Override
	public void addObserver(IObserver observer) {
		_actionObserver.addObserver(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		_actionObserver.removeObserver(observer);			
	}
}