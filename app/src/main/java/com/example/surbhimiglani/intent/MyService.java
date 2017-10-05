package com.example.surbhimiglani.intent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private  static final String TAG="com.example.surbhimiglani.intent";

    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "starting");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    long futuretime = System.currentTimeMillis() + 3000;
                    while (System.currentTimeMillis() < futuretime) {
                        synchronized (this) {
                            try {
                                wait(futuretime - System.currentTimeMillis());
                                Log.i(TAG, "working");
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        };

            Thread t = new Thread(r);
            t.start();
            return MyService.START_STICKY;
        }

        @Override
        public void onDestroy () {
            Log.i(TAG, "destroying");
        }

        @Override
        public IBinder onBind (Intent intent){
            return null;
        }
    }
