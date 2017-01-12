package com.giant_monkey.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by 2525j on 2017-01-12.
 */

public class StartReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action.equals("android.intent.action.BOOT_COMPLETED")) {
            // activity start
  //          Intent i = new Intent(context, MainActivity.class);
    //        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      //      context.startActivity(i);

            // service start
            Intent i2 = new Intent(context, MyService.class);
            context.startService(i2);
        }
    }
}
