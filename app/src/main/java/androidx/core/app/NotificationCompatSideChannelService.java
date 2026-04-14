package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    private class dbpqdHhmDSIHIJiwc1ll1l1 extends INotificationSideChannel.Stub {
        final /* synthetic */ NotificationCompatSideChannelService dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(NotificationCompatSideChannelService notificationCompatSideChannelService) {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
        }
    }

    public abstract void dbpqdHhmDSIHIJiwc1ll1l1(String str, int i, String str2);

    public abstract void dpbdbdpbLwkLpObyKsq1lll1(String str);

    public abstract void dpbdpqRKAscW1lll1l(String str, int i, String str2, Notification notification);

    void dqqppqiKzJi1l1lll1l(int i, String str) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }
}
