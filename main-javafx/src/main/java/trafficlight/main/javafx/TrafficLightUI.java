package trafficlight.main.javafx;

import trafficlight.app.TrafficLight;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TrafficLightUI extends VBox {

	public TrafficLightUI(int width, int height, TrafficLight trafficLight) {
		super();

		int oneThird = height / 3;
		LightUI redUI = new LightUI(width, oneThird, Color.RED);
		getChildren().add(redUI);
		LightUI yellowUI = new LightUI(width, oneThird, Color.ORANGE);
		getChildren().add(yellowUI);
		LightUI greenUI = new LightUI(width, oneThird, Color.GREEN);
		getChildren().add(greenUI);

		trafficLight.addRedLightObserver(redUI);
		trafficLight.addGreenLightObserver(greenUI);
		trafficLight.addYellowLightObserver(yellowUI);
	}

}
