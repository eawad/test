package com.example.amitbroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	 @Override
	  public void onReceive(Context context, Intent intent) {
//Toast.makeText(context, "mahmoud adel Broadcast",Toast.LENGTH_LONG).show();
		 Bundle extras = intent.getExtras();
		    if (extras != null) {
		      String state = extras.getString(TelephonyManager.EXTRA_STATE);
		     // Log.w("MY_DEBUG_TAG", state);
		      if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
		        String phoneNumber = extras
		            .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
		        Toast.makeText(context, phoneNumber,Toast.LENGTH_LONG).show();
		      }
		    }
		 
		 
		// Toast.makeText(context, "callllllllll", Toast.LENGTH_LONG).show();
	  }
	} 