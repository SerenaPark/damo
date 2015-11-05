package com.damo.nbic.damo.gcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

public class DamoInstanceIDListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
