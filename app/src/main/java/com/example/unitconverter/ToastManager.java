package com.example.unitconverter;

import android.content.Context;
import android.widget.Toast;

public class ToastManager {

    public static void shortToast(Context context, String massage){
        Toast.makeText(context,massage,Toast.LENGTH_SHORT).show();
    }

    public static void LongToast(Context context,String massage){
        Toast.makeText(context,massage,Toast.LENGTH_LONG).show();
    }

}
