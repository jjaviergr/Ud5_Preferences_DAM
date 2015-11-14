package com.pmdm.ud5_preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class AppPreferenceActivity extends PreferenceActivity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//asignar otro nombre al archivo de preferencias
		/*PreferenceManager prefMgr = getPreferenceManager();
		prefMgr.setSharedPreferencesName("appPreferences");*/
		
		//cargar las preferencias desde un archivo XML
		addPreferencesFromResource(R.xml.myapppreferences);
	}
}
