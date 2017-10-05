package com.example.surbhimiglani.intent;

import android.content.Intent;
import android.app.IntentService;
import android.util.Log;

public class Service extends IntentService {

    private static final String Tag="com.example.surbhimiglani.intent";

    public Service() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(Tag,"yeah..i love u surbhi..keep going sweetheart...success is not too far");
    }
}
