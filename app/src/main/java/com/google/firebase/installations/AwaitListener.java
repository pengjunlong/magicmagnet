package com.google.firebase.installations;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class AwaitListener implements OnCompleteListener<Void> {
    private final CountDownLatch latch;

    AwaitListener() {
    }

    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Void> task) {
    }

    public void onSuccess() {
    }
}
