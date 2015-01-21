package trafficlight.main.javafx;

import java.util.*;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.*;
import trafficlight.app.TrafficLight;

public class Main extends Application {

	private static final int DEFAULT_HEIGHT = 600;
	private static final int DEFAULT_WIDTH = 200;

	public static void main(String... args) {
		launch(Main.class, args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
    	TrafficLight trafficLight = new TrafficLight(3, 2, 1);
    	TrafficLightUI trafficLightUI = new TrafficLightUI(DEFAULT_WIDTH, DEFAULT_HEIGHT, trafficLight);
    	
    	createFrame(stage, trafficLightUI);
    	startTimer(trafficLight);
	}

	private void createFrame(Stage stage, TrafficLightUI trafficLightUI) {
		stage.setTitle("Traffic Light");
    	stage.setScene(new Scene(trafficLightUI, DEFAULT_WIDTH, DEFAULT_HEIGHT));
    	stage.show();
    	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				stage.close();
				System.exit(0);
			}
		});
	}

	private void startTimer(TrafficLight trafficLight) {
		new Timer().scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				trafficLight.tick();
			}
		}, 1000, 1000);
	}
	
}