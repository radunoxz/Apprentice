package ro.changeneers.apprentice.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {

    private SharedPreferences sharedPreferences;
    private Context mContext;
    private int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "sesionPref";
    private SharedPreferences.Editor editor;

    public SharedPrefManager (Context context){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void saveIsLoggedIn(Context context, boolean isLoggedIn){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("IS_LOGGED_IN", isLoggedIn);
        editor.apply();
    }

    public boolean getISLogged_IN() {
        //mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        return sharedPreferences.getBoolean("IS_LOGGED_IN", false);
    }

    public void saveToken(Context context, String toke){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("ID_TOKEN", toke);
        editor.apply();
    }

    public String getUserToken(){
        //mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        return sharedPreferences.getString("ID_TOKEN", "");
    }

    public void saveEmail(Context context, String email){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("EMAIL", email);
        editor.apply();
    }

    public String getUserEmail(){
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        return sharedPreferences.getString("EMAIL", null);
    }


    public void saveName(Context context, String name){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NAME", name);
        editor.apply();
    }

    public  String getName(){
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        return sharedPreferences.getString("NAME", null);
    }

    public void savePhoto(Context context, String photo){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("PHOTO", photo);
        editor.apply();
    }

    public String getPhoto(){
        sharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        return sharedPreferences.getString("PHOTO", null);
    }

    public void clear(){
        editor.clear();
        editor.apply();
    }

}