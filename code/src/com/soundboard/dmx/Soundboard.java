package com.soundboard.dmx;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Soundboard extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // getMenuInflater().inflate(R.menu.activity_soundboard, menu);
        return true;
    }
}
