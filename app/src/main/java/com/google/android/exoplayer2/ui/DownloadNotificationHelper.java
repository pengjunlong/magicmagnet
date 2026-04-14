package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.ppbdpwWWljzmXXdHNabfWhgjl111l11;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l notificationBuilder;

    private static final class Api31 {
        private Api31() {
        }

        @SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }
    }

    public DownloadNotificationHelper(Context context, String str) {
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list) {
    }

    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list, int i2) {
    }
}
