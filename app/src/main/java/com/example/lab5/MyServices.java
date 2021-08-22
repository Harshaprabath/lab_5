package com.example.lab5;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;

import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyServices extends Service {

    private MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);

        player = MediaPlayer.create(this,Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        super.onDestroy();
        player.stop();

    }


}
