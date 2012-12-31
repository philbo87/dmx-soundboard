package com.soundboard.dmx;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashScreen extends Activity {

	Handler mHandler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		mHandler.postDelayed(mLaunchTask, 3000);

	}

	private Runnable mLaunchTask = new Runnable() {
		public void run() {
			Intent i = new Intent(getApplicationContext(), Soundboard.class);
			startActivity(i);
			finish();
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// getMenuInflater().inflate(R.menu.activity_splash_screen, menu);
		return true;
	}
}
