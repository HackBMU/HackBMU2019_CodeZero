package com.example.hackbmu;


import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConfig {

    private SharedPreferences sharedPreferences;
    private Context context;


    public static String PREFERENCE = "APP_PREF";
    //public static String LOGIN_CHECK = "LOGIN_CHECK";
    public static String Name = "Name";
    public static String Email = "Email";
    public static String Phone = "Phone";
    public static String BloodGroup = "BloodGroup";
    public static String EmergencyContact = "EmergencyContact";
    public static String height = "Height";
    public static String weight = "Weight";
    public static String address = "Address";




    public static String IsUserInfoShown = "IsUserInfoShown";

    public SharedPreferenceConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
    }

    public void setStringPref(String type, String value) {
        sharedPreferences = context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(type, value);
        editor.commit();
        editor.apply();
    }

    public String getStringPref(String type) {
        sharedPreferences = context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
        return sharedPreferences.getString(type, null);
    }

    public boolean getBooleanPref(String type ) {
        sharedPreferences = context.getSharedPreferences(PREFERENCE,context.MODE_PRIVATE) ;
        return  sharedPreferences.getBoolean(type , false);
    }

    public void setBooleanPref(String type , Boolean value){
        sharedPreferences = context.getSharedPreferences(PREFERENCE,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(type,value);
        editor.commit();
        editor.apply();
    }
}
