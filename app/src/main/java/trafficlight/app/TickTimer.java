package trafficlight.app;

import java.util.*;

public class TickTimer {

	private final TrafficLight trafficLight;
	private final int tickMillis;
	
	public TickTimer(TrafficLight trafficLight, int tickMillis) {
		super();
		this.trafficLight = trafficLight;
		this.tickMillis = tickMillis;
	}

	public void start() {
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				trafficLight.tick();
			}
		};
		
		new Timer().scheduleAtFixedRate(timerTask, tickMillis, tickMillis);
	}
	
}
