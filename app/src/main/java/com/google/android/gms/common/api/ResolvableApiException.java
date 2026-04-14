package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
    }

    public PendingIntent getResolution() {
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
    }
}
