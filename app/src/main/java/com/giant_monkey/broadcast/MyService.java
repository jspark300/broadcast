package com.giant_monkey.broadcast;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by 2525j on 2017-01-12.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("testxxx", "서비스의 onCreate");
        Toast.makeText(getApplicationContext(),"service onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("testxxx", "서비스의 onDestroy");
        Toast.makeText(getApplicationContext(),"service onDestroy()",Toast.LENGTH_SHORT).show();



    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("testxxx","서비스의 onStartCommand");
        Toast.makeText(getApplicationContext(),"service onStartCommand()",Toast.LENGTH_SHORT).show();

        // file download
//
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

        return super.onStartCommand(intent, flags, startId);
    }
}
