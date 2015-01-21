package trafficlight.app;

import java.util.Observer;

public class TrafficLight {

	private int redTicks;
	private int greenTicks;
	private int yellowTicks;
	
	private Light red;
	private Light green;
	private Light yellow;
	
	private int ticks;
	
	public TrafficLight(int redTicks, int greenTicks, int yellowTicks) {
		this.redTicks = redTicks;
		this.greenTicks = greenTicks;
		this.yellowTicks = yellowTicks;

		this.red = new Light();
		this.green = new Light();
		this.yellow = new Light();
		
		this.ticks = 0;
		transitionToRed();
	}

	public boolean isRedOn() {
		return red.isOn();
	}

	public boolean isGreenOn() {
		return green.isOn();
	}

	public boolean isYellowOn() {
		return yellow.isOn();
	}

	public void tick() {
		ticks++;
		
		if (ticks == redTicks)
			transitionToGreen();
		else if (ticks == redTicks + greenTicks)
			transitionToYellow();
		else if (ticks == redTicks + greenTicks + yellowTicks) {
			transitionToRed();
			ticks = 0;
		}
	}

	private void transitionToRed() {
		red.turnOn();
		green.turnOff();
		yellow.turnOff();
	}
	
	private void transitionToGreen() {
		red.turnOff();
		green.turnOn();
		yellow.turnOff();
	}
	
	private void transitionToYellow() {
		red.turnOff();
		green.turnOn();
		yellow.turnOn();
	}

	public void addRedLightObserver(Observer observer) {
		red.addObserver(observer);
	}

	public void addGreenLightObserver(Observer observer) {
		green.addObserver(observer);
	}

	public void addYellowLightObserver(Observer observer) {
		yellow.addObserver(observer);
	}

}
