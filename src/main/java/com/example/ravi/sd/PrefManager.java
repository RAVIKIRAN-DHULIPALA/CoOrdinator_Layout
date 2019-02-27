package com.example.ravi.sd;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ravi on 26-01-2018.
 */

public class PrefManager {
    Context context;

    PrefManager(loginActivity context) {
        this.context = context;
    }

    public boolean isUserLogedOut() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        boolean ispinEmpty = sharedPreferences.getString("pin", "").isEmpty();
        return ispinEmpty;
    }

    public void saveLoginDetails(String name) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("pin",name);
        editor.commit();
    }

}
