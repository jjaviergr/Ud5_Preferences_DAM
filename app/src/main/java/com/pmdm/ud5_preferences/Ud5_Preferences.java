package com.pmdm.ud5_preferences;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ud5_Preferences extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ud5__preferences);
    }
    //botón, cargar pantalla de preferencias
    public void onClickLoad(View view){
 	   Intent i=new Intent("com.pmdm.ud5_preferences.AppPreferenceActivity");
 	   startActivity(i);
    }
    //botón, mostrar valores de preferencias
    public void onClickDisplay(View view){
    	//obtenemos una instancia SharedPreferences, utilizando el formato <NombrePaquete>_preferences
        //MODE_PRIVATE: el archivo de preferencia solo lo puede abrir la aplicación que lo creó
    	SharedPreferences appPrefs=
 		getSharedPreferences("com.pmdm.ud5_preferences_preferences", MODE_PRIVATE);
    	//recupera una preferencia de cadena pasándole la clave y valor por defecto si no existe la preferencia
    	DisplayText(appPrefs.getString("editTextPref", ""));
    }  
 	
    //Botón, modificar valores de preferencias
    public void onClickModify(View view){
 		SharedPreferences appPrefs=
 		getSharedPreferences("com.pmdm.ud5_preferences_preferences",  MODE_PRIVATE);			
 	   //obtiene un objeto Editor mediante edit()
 	   SharedPreferences.Editor prefsEditor = appPrefs.edit();
 	   //cambia el valor de cadena mediante putString()
 	   prefsEditor.putString("editTextPref", ((EditText) findViewById(R.id.txtString)).getText().toString());
 	   //confirma los cambios
 	   prefsEditor.commit();
 	   
    }
     
    private void DisplayText(String str){
 	   Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
    }
    
     
}
