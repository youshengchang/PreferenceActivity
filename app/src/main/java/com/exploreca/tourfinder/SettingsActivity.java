package com.exploreca.tourfinder;

import android.os.Bundle;
import android.preference.PreferenceActivity;



/**
 * Created by youshengchang on 3/15/2015.
 */
public class SettingsActivity extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
