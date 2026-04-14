package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class GetIdListener implements StateListener {
    final TaskCompletionSource<String> taskCompletionSource;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
    }
}
