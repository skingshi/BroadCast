package com.sking.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    public static String TAG = "MyReceiver";
    public static String ACTION = "com.sking.broadcast.ACTION.MyReceiver";
    public static String ACTION1 = "com.sking.broadcast.ACTION.MyReceiver1";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.w(TAG,"MyReceiver");
    }

}
