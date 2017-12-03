package com.example.jason.ftp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MusicService extends Service
{
    private MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        player = MediaPlayer.create(this, R.raw.background);
        player.start();
        player.setLooping(true);
        return START_STICKY;
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();

        player.release();
        player = null;
    }


}
