package com.osramd.blue.droid.activity;

import com.osramd.blue.droid.fragment.ApplyLauncherFragment;

import your.icons.name.here.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;

public class ApplyLauncherMain extends FragmentActivity {

	Button btnCancel;

	// Starts the Activity for the list view
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.apply_launcher_main);
		
		getSupportFragmentManager().beginTransaction()
		.replace(R.id.container_launcher, 
				new ApplyLauncherFragment())
		.commit();

	}

	// This will return the Activity to the Main Screen when the app is in a Paused (not used) state
	@Override
	  public void onPause(){
		  super.onPause();
		  finish();
	  }
}
