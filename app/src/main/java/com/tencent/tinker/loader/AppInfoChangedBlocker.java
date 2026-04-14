package com.tencent.tinker.loader;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class AppInfoChangedBlocker {
    private static final String TAG = "Tinker.AppInfoChangedBlocker";

    private static class HackerCallback implements Handler.Callback {
        private final int APPLICATION_INFO_CHANGED;
        private Handler.Callback origin;

        HackerCallback(Handler.Callback callback, Class cls) {
        }

        private boolean hackMessage(Message message) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    private static Handler fetchMHObject(Context context) throws Exception {
    }

    private static void interceptHandler(Handler handler) throws Exception {
    }

    public static boolean tryStart(Application application) {
    }
}
