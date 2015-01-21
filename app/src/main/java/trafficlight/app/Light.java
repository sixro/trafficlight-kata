package trafficlight.app;

import java.util.*;

public class Light extends Observable {

	private boolean on;

	public Light() {
		super();
		this.on = false;
	}

	public boolean isOn() {
		return on;
	}

	public void turnOn() {
		on = true;
		
		notifyUpdate();
	}

	public void turnOff() {
		on = false;

		notifyUpdate();
	}

	private void notifyUpdate() {
		setChanged();
		notifyObservers();
	}

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
		
		notifyUpdate();
	}
	
}
