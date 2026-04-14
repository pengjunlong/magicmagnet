package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static SnackbarManager snackbarManager;
    private SnackbarRecord currentSnackbar;
    private final Handler handler;
    private final Object lock;
    private SnackbarRecord nextSnackbar;

    /* renamed from: com.google.android.material.snackbar.SnackbarManager$1 */
    class C04601 implements Handler.Callback {
        final /* synthetic */ SnackbarManager this$0;

        C04601(SnackbarManager snackbarManager) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    interface Callback {
        void dismiss(int i);

        void show();
    }

    private static class SnackbarRecord {
        final WeakReference<Callback> callback;
        int duration;
        boolean paused;

        SnackbarRecord(int i, Callback callback) {
        }

        boolean isSnackbar(Callback callback) {
        }
    }

    private SnackbarManager() {
    }

    private boolean cancelSnackbarLocked(SnackbarRecord snackbarRecord, int i) {
    }

    static SnackbarManager getInstance() {
    }

    private boolean isCurrentSnackbarLocked(Callback callback) {
    }

    private boolean isNextSnackbarLocked(Callback callback) {
    }

    private void scheduleTimeoutLocked(SnackbarRecord snackbarRecord) {
    }

    private void showNextSnackbarLocked() {
    }

    public void dismiss(Callback callback, int i) {
    }

    void handleTimeout(SnackbarRecord snackbarRecord) {
    }

    public boolean isCurrent(Callback callback) {
    }

    public boolean isCurrentOrNext(Callback callback) {
    }

    public void onDismissed(Callback callback) {
    }

    public void onShown(Callback callback) {
    }

    public void pauseTimeout(Callback callback) {
    }

    public void restoreTimeoutIfPaused(Callback callback) {
    }

    public void show(int i, Callback callback) {
    }
}
