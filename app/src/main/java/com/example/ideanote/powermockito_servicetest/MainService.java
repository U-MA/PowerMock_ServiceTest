package com.example.ideanote.powermockito_servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MainService extends Service {

    public static Intent createIntent() {
        return new Intent();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(MainService.class.getName(), "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
