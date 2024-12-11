package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Alarm is ringing!", Toast.LENGTH_LONG).show();
        Log.d("AlarmReceiver", "Alarm triggered!");

        Intent serviceIntent = new Intent(context, AlarmService.class);
        context.startService(serviceIntent);

    }
}
