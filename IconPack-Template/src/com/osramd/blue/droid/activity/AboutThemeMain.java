package com.osramd.blue.droid.activity;

import your.icons.name.here.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class AboutThemeMain extends SherlockFragment {
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.theme_main, container, false);
               
        return rootView;
    }
    
}
