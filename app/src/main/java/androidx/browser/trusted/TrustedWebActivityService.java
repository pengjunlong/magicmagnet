package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import p000.ys1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class TrustedWebActivityService extends Service {
    int bpdqqiQNVROMLC1ll1l1l11;
    private NotificationManager dpbdpqRKAscW1lll1l;
    private final ITrustedWebActivityService.Stub ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class dbpqdHhmDSIHIJiwc1ll1l1 extends ITrustedWebActivityService.Stub {
        final /* synthetic */ TrustedWebActivityService dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(TrustedWebActivityService trustedWebActivityService) {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) {
        }
    }

    private static String dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    private void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    public void bpdqqiQNVROMLC1ll1l1l11(String str, int i) {
    }

    public boolean dbppbdqpeLmcbs11l11(String str, int i, Notification notification, String str2) {
    }

    public Bundle ddbbbeXHXx111ll() {
    }

    public boolean dpbdpqRKAscW1lll1l(String str) {
    }

    public int dqpdbEevAufTOvPphbjykClll1l11() {
    }

    public Parcelable[] dqpqqqbqQyjyB11111l1() {
    }

    public abstract ys1 dqqppqiKzJi1l1lll1l();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
    }

    public Bundle ppbdpwWWljzmXXdHNabfWhgjl111l11(String str, Bundle bundle, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }
}
