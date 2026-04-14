package com.tencent.bugly.beta.ui;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.ppbdpwWWljzmXXdHNabfWhgjl111l11;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.proguard.C1581B;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BetaNotifyManager {
    private static final String CHANNEL_DESCRIPTION = "bugly upgrade";
    private static final String CHANNEL_ID = "001";
    private static final String CHANNEL_NAME = "bugly_upgrade";
    private static final int NOTIFICATION_DOWNLOAD_ID = 1000;
    private static final int NOTIFICATION_UPGRADE_ID = 1001;
    private static final long NOTIFY_LEN = 307200;
    public static final int REQUEST_CODE_DOWNLOAD = 1;
    public static final int REQUEST_CODE_UPGRADE = 2;
    public static BetaNotifyManager instance;
    public BaseFrag fragment;
    private boolean hasNotification;
    public String intentFilter;
    private long lastLen;
    private ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l mBuilder;
    private Context mContext;
    private NotificationManager mManager;
    private Notification mNotification;
    public C1581B strategy;
    public DownloadTask task;

    private BetaNotifyManager() {
    }

    private void adaptNotificationChannel() {
    }

    public void initNotify(DownloadTask downloadTask) {
    }

    public void postDownloadNotify() {
    }

    public synchronized void postUpgradeNotify(C1581B c1581b, BaseFrag baseFrag) {
    }
}
