package trafficlight.main.javafx;

import trafficlight.app.TrafficLight;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TrafficLightUI extends VBox {

	public TrafficLightUI(int width, int height, TrafficLight trafficLight) {
		super();

		int oneThird = height / 3;
		LightUI redUI = new LightUI(width, oneThird, Color.RED);
		addChild(redUI);
		LightUI yellowUI = new LightUI(width, oneThird, Color.ORANGE);
		addChild(yellowUI);
		LightUI greenUI = new LightUI(width, oneThird, Color.GREEN);
		addChild(greenUI);

		trafficLight.addRedLightObserver(redUI);
		trafficLight.addGreenLightObserver(greenUI);
		trafficLight.addYellowLightObserver(yellowUI);
	}

	private void addChild(LightUI redUI) {
		getChildren().add(redUI);
	}

}
