package com.rumbo.selftraining.trafficlightkata;

import java.util.*;

import trafficlight.app.*;
import android.app.Activity;
import android.graphics.Color;
import android.view.SurfaceView;

public class TrafficLightUI {

	private SurfaceView redLight;
	private SurfaceView yellowLight;
	private SurfaceView greenLight;
	private Activity activity;
	private TrafficLight trafficLight;

	public TrafficLightUI(SurfaceView redLight, SurfaceView yellowLight, SurfaceView greenLight, Activity activity, TrafficLight trafficLight) {
		super();
		this.redLight = redLight;
		this.yellowLight = yellowLight;
		this.greenLight = greenLight;
		this.activity = activity;
		this.trafficLight = trafficLight;
		
		setupObservers();
	}

	private void setupObservers() {
		trafficLight.addRedLightObserver(makeObserver(redLight, 0xffcc0000));
		trafficLight.addYellowLightObserver(makeObserver(yellowLight, 0xffff8800));
		trafficLight.addGreenLightObserver(makeObserver(greenLight, 0xff00cc00));
	}

	private Observer makeObserver(final SurfaceView lightUI, final int color) {
		return new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				final Light light = (Light) o;
				activity.runOnUiThread(new Runnable() {
					@Override
					public void run() {
						lightUI.setBackgroundColor(light.isOn() ? color : Color.BLACK);
						lightUI.invalidate();
					}
				});
			}
		};
	}
}
