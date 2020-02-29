package com.vaishnavi.localstoarge.prefs;

import android.content.Context;
import android.content.SharedPreferences;

public class prefs {
    private static final String EMPLOYEE_USER="employee";
    private static final  String EMPLOYEE_NAME="employee";
    private static final  String EMPLOYEE_USERNAME="employee";


    public void  saveEmployeeName(Context context, String name){
        SharedPreferences sharedPreferences=context.getSharedPreferences(EMPLOYEE_USER,context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(EMPLOYEE_NAME,name).apply();

    }
    public static  String getEmployeeName(Context context){
        SharedPreferences sharedPreferences=context.getSharedPreferences(EMPLOYEE_USER,context.MODE_PRIVATE);
        return  sharedPreferences.getString(EMPLOYEE_NAME, "null");


    }
    public void  saveEmployeeUsername(Context context, String name){
        SharedPreferences sharedPreferences=context.getSharedPreferences(EMPLOYEE_USER,context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(EMPLOYEE_USERNAME,name).apply();

    }
    public static  String getEmployeeUsername(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(EMPLOYEE_USER, context.MODE_PRIVATE);
        return sharedPreferences.getString(EMPLOYEE_USERNAME, "null");

    }







    }
