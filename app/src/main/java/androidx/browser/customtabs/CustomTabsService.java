package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;
import p000.fg1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class CustomTabsService extends Service {
    private ICustomTabsService.Stub bpdqqiQNVROMLC1ll1l1l11;
    final fg1<IBinder, IBinder.DeathRecipient> dpbdpqRKAscW1lll1l;

    class dbpqdHhmDSIHIJiwc1ll1l1 extends ICustomTabsService.Stub {
        final /* synthetic */ CustomTabsService dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(CustomTabsService customTabsService) {
        }

        private boolean bpdqqiQNVROMLC1ll1l1l11(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }

        private /* synthetic */ void dpbdpqRKAscW1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }

        private PendingIntent dqqppqiKzJi1l1lll1l(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
        }
    }

    protected abstract int bpdqqiQNVROMLC1ll1l1l11(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, String str, Bundle bundle);

    protected abstract boolean dbppbdqpeLmcbs11l11(long j);

    protected boolean dbpqdHhmDSIHIJiwc1ll1l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    protected abstract boolean ddbbbeXHXx111ll(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Bundle bundle);

    protected abstract Bundle dpbdbdpbLwkLpObyKsq1lll1(String str, Bundle bundle);

    protected abstract boolean dpbdpqRKAscW1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l);

    protected abstract boolean dqpdbEevAufTOvPphbjykClll1l11(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, int i, Uri uri, Bundle bundle);

    protected abstract boolean dqpqqqbqQyjyB11111l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Uri uri);

    protected abstract boolean dqqppqiKzJi1l1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Uri uri, Bundle bundle, List<Bundle> list);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    protected abstract boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Uri uri, int i, Bundle bundle);
}
