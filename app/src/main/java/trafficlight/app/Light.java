package trafficlight.app;

public class Light {

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
	}

	public void turnOff() {
		on = false;
	}

}
