package com.gavle.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("CUSTOM_RECEIVER" , "onReceive called!");
        switch (intent.getAction()) {
            case Intent.ACTION_BOOT_COMPLETED:
                Log.d("CUSTOM_RECEIVER", "ACTION_BOOT_COMPLETED case called!");
                break;
            case Intent.ACTION_POWER_CONNECTED:
                Log.d("CUSTOM_RECEIVER", "ACTION_POWER_CONNECTED case called!");
                break;
            default:
                Log.d("CUSTOM_RECEIVER", "default case called!");
                break;
        }
    }
}