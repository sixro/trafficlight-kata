package com.rumbo.selftraining.trafficlightkata;

import java.util.*;

import trafficlight.app.*;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();
	
	private SurfaceView redLight;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "[onCreate]");

		setContentView(R.layout.main);
		
		redLight = (SurfaceView) findViewById(R.id.redLight);

		final TrafficLight trafficLight = new TrafficLight(3, 2, 1);
		trafficLight.addRedLightObserver(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				final Light light = (Light) o;
				MainActivity.this.runOnUiThread(new Runnable() {
					@Override
					public void run() {
						redLight.setBackgroundColor(light.isOn() ? 0xffcc0000 : Color.BLACK);
						redLight.invalidate();
					}
				});
			}
		});
		SurfaceView yellowLight = (SurfaceView) findViewById(R.id.yellowLight);
		yellowLight.setBackgroundColor(0xffff8800);
		yellowLight.invalidate();

		SurfaceView greenLight = (SurfaceView) findViewById(R.id.greenLight);
		greenLight.setBackgroundColor(0xff00cc00);
		greenLight.invalidate();
		
		new Timer().scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				trafficLight.tick();
			}
		}, 1000, 1000);
	}
	
}
