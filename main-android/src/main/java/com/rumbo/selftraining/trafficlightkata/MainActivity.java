package com.rumbo.selftraining.trafficlightkata;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "[onCreate]");

		setContentView(R.layout.main);

		/*
		if (LogUtils.isDebugEnabled(TAG))
			Log.d(TAG, "[onCreate] setting onClick action to 'START' button...");
		Button btnStart = (Button) findViewById(R.id.btnStart);
		btnStart.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				onStartButtonClick(view);
			}
		});
		btnStart.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);

		if (LogUtils.isDebugEnabled(TAG))
			Log.d(TAG, "[onCreate] setting onClick action to 'Calibrate' button...");
		Button btnCalibrate = (Button) findViewById(R.id.btnCalibrate);
		btnCalibrate.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				onCalibrateButtonClick(view);
			}
		});

		if (LogUtils.isDebugEnabled(TAG))
			Log.d(TAG, "[onCreate] setting onClick action to 'Settings' button...");
		Button btnSettings = (Button) findViewById(R.id.btnSettings);
		btnSettings.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				onSettingsButtonClick(view);
			}
		});
		*/
	}
	
}
