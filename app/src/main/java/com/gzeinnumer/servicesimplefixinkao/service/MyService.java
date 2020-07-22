package com.gzeinnumer.servicesimplefixinkao.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service {

    private static final String TAG = "MyService_";

    private Timer timer;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                //ambil data dan kirim ke function
                sendData();
            }
        }, 1, 30000);
    }

    private void sendData() {
        Log.d(TAG, "sendData: terpanggil");
        //letakan aksi kirim disini
    }
}

