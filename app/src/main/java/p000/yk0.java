package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class yk0 {
    private static Set<String> bpdqqiQNVROMLC1ll1l1l11;
    private static String dpbdpqRKAscW1lll1l;
    private static dpbdpqRKAscW1lll1l dqpqqqbqQyjyB11111l1;
    private static final Object dqqppqiKzJi1l1lll1l = null;
    private static final Object ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
    private final Context dbpqdHhmDSIHIJiwc1ll1l1;
    private final NotificationManager dpbdbdpbLwkLpObyKsq1lll1;

    private interface bpdqqiQNVROMLC1ll1l1l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private static class dbpqdHhmDSIHIJiwc1ll1l1 implements bpdqqiQNVROMLC1ll1l1l11 {
        final String dbpqdHhmDSIHIJiwc1ll1l1;
        final int dpbdbdpbLwkLpObyKsq1lll1;
        final boolean dpbdpqRKAscW1lll1l;
        final String dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(String str, int i, String str2) {
        }

        @Override // yk0.bpdqqiQNVROMLC1ll1l1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
        }

        public String toString() {
        }
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1 implements bpdqqiQNVROMLC1ll1l1l11 {
        final String dbpqdHhmDSIHIJiwc1ll1l1;
        final int dpbdbdpbLwkLpObyKsq1lll1;
        final Notification dpbdpqRKAscW1lll1l;
        final String dqqppqiKzJi1l1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(String str, int i, String str2, Notification notification) {
        }

        @Override // yk0.bpdqqiQNVROMLC1ll1l1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
        }

        public String toString() {
        }
    }

    private static class dpbdpqRKAscW1lll1l implements Handler.Callback, ServiceConnection {
        private final HandlerThread bpdqqiQNVROMLC1ll1l1l11;
        private Set<String> ddbbbeXHXx111ll;
        private final Context dpbdpqRKAscW1lll1l;
        private final Map<ComponentName, dbpqdHhmDSIHIJiwc1ll1l1> dqpqqqbqQyjyB11111l1;
        private final Handler ppbdpwWWljzmXXdHNabfWhgjl111l11;

        private static class dbpqdHhmDSIHIJiwc1ll1l1 {
            int bpdqqiQNVROMLC1ll1l1l11;
            final ComponentName dbpqdHhmDSIHIJiwc1ll1l1;
            boolean dpbdbdpbLwkLpObyKsq1lll1;
            ArrayDeque<bpdqqiQNVROMLC1ll1l1l11> dpbdpqRKAscW1lll1l;
            INotificationSideChannel dqqppqiKzJi1l1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(ComponentName componentName) {
            }
        }

        dpbdpqRKAscW1lll1l(Context context) {
        }

        private void bpdqqiQNVROMLC1ll1l1l11(ComponentName componentName, IBinder iBinder) {
        }

        private void dbppbdqpeLmcbs11l11() {
        }

        private boolean dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        private void dpbdpqRKAscW1lll1l(ComponentName componentName) {
        }

        private void dqpdbEevAufTOvPphbjykClll1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        private void dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        private void dqqppqiKzJi1l1lll1l(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        private void ppbdpwWWljzmXXdHNabfWhgjl111l11(ComponentName componentName) {
        }

        public void ddbbbeXHXx111ll(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static class dqqppqiKzJi1l1lll1l {
        final ComponentName dbpqdHhmDSIHIJiwc1ll1l1;
        final IBinder dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(ComponentName componentName, IBinder iBinder) {
        }
    }

    private yk0(Context context) {
    }

    public static Set<String> bpdqqiQNVROMLC1ll1l1l11(Context context) {
    }

    private void ddbbbeXHXx111ll(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    public static yk0 dpbdpqRKAscW1lll1l(Context context) {
    }

    private static boolean dqpdbEevAufTOvPphbjykClll1l11(Notification notification) {
    }

    public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    public void dpbdbdpbLwkLpObyKsq1lll1(int i) {
    }

    public void dqpqqqbqQyjyB11111l1(String str, int i, Notification notification) {
    }

    public void dqqppqiKzJi1l1lll1l(String str, int i) {
    }

    public void ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, Notification notification) {
    }
}
