package com.example.alarm;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class AlarmService extends Service {

    MediaPlayer player;
    public AlarmService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        player = MediaPlayer.create(getApplicationContext(), Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
        return  START_NOT_STICKY;

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}