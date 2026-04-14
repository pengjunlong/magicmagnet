package com.google.android.gms.tasks;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TaskExecutors {
    public static final Executor MAIN_THREAD = null;
    static final Executor zza = null;

    private static final class zza implements Executor {
        private final Handler zza;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    }

    private TaskExecutors() {
    }
}
