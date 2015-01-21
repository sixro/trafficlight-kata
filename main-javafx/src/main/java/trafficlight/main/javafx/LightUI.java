package trafficlight.main.javafx;

import java.util.*;

import trafficlight.app.Light;
import javafx.application.Platform;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class LightUI extends Canvas implements Observer {

	private final Color color;
	
	public LightUI(int width, int height, Color color) {
		super(width, height);
		this.color = color;
	}

	@Override
	public void update(Observable o, Object arg) {
		Light light = (Light) o;
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				GraphicsContext graphics = getGraphicsContext2D();
				graphics.setFill(light.isOn() ? color : Color.BLACK);
				graphics.fillRect(0, 0, getWidth(), getHeight());
			}
		});
	}

}
