package com.rumbo.selftraining.trafficlightkata;

import trafficlight.app.*;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;

public class MainActivity extends Activity {

	private static final int ONE_SECOND = 1000;

	private static final String TAG = MainActivity.class.getSimpleName();
	
	private SurfaceView redLight;
	private SurfaceView yellowLight;
	private SurfaceView greenLight;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "[onCreate]");

		setContentView(R.layout.main);
		
		redLight = (SurfaceView) findViewById(R.id.redLight);
		yellowLight = (SurfaceView) findViewById(R.id.yellowLight);
		greenLight = (SurfaceView) findViewById(R.id.greenLight);

		final TrafficLight trafficLight = new TrafficLight(3, 2, 1);
		new TrafficLightUI(redLight, yellowLight, greenLight, this, trafficLight);
		
		new TickTimer(trafficLight, ONE_SECOND).start();
	}
	
}
