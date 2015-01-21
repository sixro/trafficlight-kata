package trafficlight.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrafficLightTest {

	private TrafficLight trafficLight;

	@Before public void setup() {
		trafficLight = new TrafficLight(3, 2, 1);
	}
	
	@Test public void test() {
		assertRed();
		
		waitForTicks(3);
		assertGreen();

		waitForTicks(2);
		assertYellow();

		waitForTicks(1);
		assertRed();
	}

	private void assertRed() {
		assertTrue(trafficLight.isRedOn());
		assertFalse(trafficLight.isGreenOn());
		assertFalse(trafficLight.isYellowOn());
	}
	
	private void assertGreen() {
		assertFalse(trafficLight.isRedOn());
		assertTrue(trafficLight.isGreenOn());
		assertFalse(trafficLight.isYellowOn());
	}
	
	private void assertYellow() {
		assertFalse(trafficLight.isRedOn());
		assertTrue(trafficLight.isGreenOn());
		assertTrue(trafficLight.isYellowOn());
	}
	
	private void waitForTicks(int ticks) {
		for (int i = 0; i < ticks; i++)
			trafficLight.tick();
	}
	
}
