package trafficlight.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightTest {

	private Light light;

	@Before public void setup() {
		light = new Light();
	}
	
	@Test public void test() {
		assertFalse(light.isOn());

		light.turnOn();
		assertTrue(light.isOn());

		light.turnOff();
		assertFalse(light.isOn());
	}

}
