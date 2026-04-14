package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.pb0;
import p000.qdqddftZvRmltIahaEHKjU1l11ll1l1;
import p000.sq0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean pbppbpqbamJRy11l1l1 = false;
    final ppbdpwWWljzmXXdHNabfWhgjl111l11 bpdqqiQNVROMLC1ll1l1l11;
    MediaSessionCompat.Token dbppbdqpeLmcbs11l11;
    ppbdpwWWljzmXXdHNabfWhgjl111l11 ddbbbeXHXx111ll;
    private dqpqqqbqQyjyB11111l1 dpbdpqRKAscW1lll1l;
    final dqdqbpQposEBDyDxIyyz1ll11 dqpdbEevAufTOvPphbjykClll1l11;
    final qdqddftZvRmltIahaEHKjU1l11ll1l1<IBinder, ppbdpwWWljzmXXdHNabfWhgjl111l11> dqpqqqbqQyjyB11111l1;
    final ArrayList<ppbdpwWWljzmXXdHNabfWhgjl111l11> ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class MediaBrowserServiceImplApi21 implements dqpqqqbqQyjyB11111l1 {
        final List<Bundle> dbpqdHhmDSIHIJiwc1ll1l1;
        MediaBrowserService dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ MediaBrowserServiceCompat dpbdpqRKAscW1lll1l;
        Messenger dqqppqiKzJi1l1lll1l;

        class MediaBrowserServiceApi21 extends MediaBrowserService {
            final /* synthetic */ MediaBrowserServiceImplApi21 dpbdpqRKAscW1lll1l;

            MediaBrowserServiceApi21(MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            }
        }

        class dbpqdHhmDSIHIJiwc1ll1l1 extends dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ MediaBrowserServiceImplApi21 dqpqqqbqQyjyB11111l1;
            final /* synthetic */ pbppbpqbamJRy11l1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21, Object obj, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
            }

            void ddbbbeXHXx111ll(List<MediaBrowserCompat.MediaItem> list) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
            /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(List<MediaBrowserCompat.MediaItem> list) {
            }
        }

        MediaBrowserServiceImplApi21(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dqpqqqbqQyjyB11111l1
        public IBinder dbpqdHhmDSIHIJiwc1ll1l1(Intent intent) {
        }

        public bpdqqiQNVROMLC1ll1l1l11 dpbdbdpbLwkLpObyKsq1lll1(String str, int i, Bundle bundle) {
        }

        public void dqqppqiKzJi1l1lll1l(String str, pbppbpqbamJRy11l1l1<List<Parcel>> pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dqpqqqbqQyjyB11111l1
        public void onCreate() {
        }
    }

    class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {
        final /* synthetic */ MediaBrowserServiceCompat bpdqqiQNVROMLC1ll1l1l11;

        class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            final /* synthetic */ MediaBrowserServiceImplApi23 bpdqqiQNVROMLC1ll1l1l11;

            MediaBrowserServiceApi23(MediaBrowserServiceImplApi23 mediaBrowserServiceImplApi23, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            }
        }

        class dbpqdHhmDSIHIJiwc1ll1l1 extends dbppbdqpeLmcbs11l11<MediaBrowserCompat.MediaItem> {
            final /* synthetic */ MediaBrowserServiceImplApi23 dqpqqqbqQyjyB11111l1;
            final /* synthetic */ pbppbpqbamJRy11l1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(MediaBrowserServiceImplApi23 mediaBrowserServiceImplApi23, Object obj, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
            }

            void ddbbbeXHXx111ll(MediaBrowserCompat.MediaItem mediaItem) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
            /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(MediaBrowserCompat.MediaItem mediaItem) {
            }
        }

        MediaBrowserServiceImplApi23(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void dpbdpqRKAscW1lll1l(String str, pbppbpqbamJRy11l1l1<Parcel> pbppbpqbamjry11l1l1) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.dqpqqqbqQyjyB11111l1
        public void onCreate() {
        }
    }

    class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {
        final /* synthetic */ MediaBrowserServiceCompat ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            final /* synthetic */ MediaBrowserServiceImplApi26 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            MediaBrowserServiceApi26(MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            }
        }

        class dbpqdHhmDSIHIJiwc1ll1l1 extends dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ MediaBrowserServiceImplApi26 ddbbbeXHXx111ll;
            final /* synthetic */ Bundle dqpqqqbqQyjyB11111l1;
            final /* synthetic */ pbppbpqbamJRy11l1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26, Object obj, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, Bundle bundle) {
            }

            void ddbbbeXHXx111ll(List<MediaBrowserCompat.MediaItem> list) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
            /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(List<MediaBrowserCompat.MediaItem> list) {
            }
        }

        MediaBrowserServiceImplApi26(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void bpdqqiQNVROMLC1ll1l1l11(String str, pbppbpqbamJRy11l1l1<List<Parcel>> pbppbpqbamjry11l1l1, Bundle bundle) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.dqpqqqbqQyjyB11111l1
        public void onCreate() {
        }
    }

    private static class bdddqmITkkeGpsxVXHR1l1llll implements qbdpqpstJKhhKkXrsOGvbWw1l1llll {
        final Messenger dbpqdHhmDSIHIJiwc1ll1l1;

        bdddqmITkkeGpsxVXHR1l1llll(Messenger messenger) {
        }

        private void dpbdpqRKAscW1lll1l(int i, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.qbdpqpstJKhhKkXrsOGvbWw1l1llll
        public IBinder asBinder() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.qbdpqpstJKhhKkXrsOGvbWw1l1llll
        public void dbpqdHhmDSIHIJiwc1ll1l1(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.qbdpqpstJKhhKkXrsOGvbWw1l1llll
        public void dpbdbdpbLwkLpObyKsq1lll1() throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.qbdpqpstJKhhKkXrsOGvbWw1l1llll
        public void dqqppqiKzJi1l1lll1l(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
        }
    }

    public static final class bpdqqiQNVROMLC1ll1l1l11 {
        private final String dbpqdHhmDSIHIJiwc1ll1l1;
        private final Bundle dpbdbdpbLwkLpObyKsq1lll1;

        public bpdqqiQNVROMLC1ll1l1l11(String str, Bundle bundle) {
        }

        static /* synthetic */ String dbpqdHhmDSIHIJiwc1ll1l1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        static /* synthetic */ Bundle dpbdbdpbLwkLpObyKsq1lll1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        public String dpbdpqRKAscW1lll1l() {
        }

        public Bundle dqqppqiKzJi1l1lll1l() {
        }
    }

    public static class dbppbdqpeLmcbs11l11<T> {
        private int bpdqqiQNVROMLC1ll1l1l11;
        private final Object dbpqdHhmDSIHIJiwc1ll1l1;
        private boolean dpbdbdpbLwkLpObyKsq1lll1;
        private boolean dpbdpqRKAscW1lll1l;
        private boolean dqqppqiKzJi1l1lll1l;

        dbppbdqpeLmcbs11l11(Object obj) {
        }

        public void bpdqqiQNVROMLC1ll1l1l11(Bundle bundle) {
        }

        int dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        void dpbdpqRKAscW1lll1l(T t) {
        }

        void dqpqqqbqQyjyB11111l1(int i) {
        }

        void dqqppqiKzJi1l1lll1l(Bundle bundle) {
        }

        public void ppbdpwWWljzmXXdHNabfWhgjl111l11(T t) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ MediaBrowserServiceCompat dbppbdqpeLmcbs11l11;
        final /* synthetic */ Bundle ddbbbeXHXx111ll;
        final /* synthetic */ Bundle dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ String dqpqqqbqQyjyB11111l1;
        final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dbpqdHhmDSIHIJiwc1ll1l1(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, String str, Bundle bundle, Bundle bundle2) {
        }

        void ddbbbeXHXx111ll(List<MediaBrowserCompat.MediaItem> list) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
        /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(List<MediaBrowserCompat.MediaItem> list) {
        }
    }

    class ddbbbeXHXx111ll extends MediaBrowserServiceImplApi26 {
        final /* synthetic */ MediaBrowserServiceCompat dqpqqqbqQyjyB11111l1;

        ddbbbeXHXx111ll(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }
    }

    private class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        final /* synthetic */ MediaBrowserServiceCompat dbpqdHhmDSIHIJiwc1ll1l1;

        class bpdqqiQNVROMLC1ll1l1l11 implements Runnable {
            final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dqpqqqbqQyjyB11111l1;
            final /* synthetic */ ResultReceiver ppbdpwWWljzmXXdHNabfWhgjl111l11;

            bpdqqiQNVROMLC1ll1l1l11(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, ResultReceiver resultReceiver) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ Bundle ddbbbeXHXx111ll;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dqpdbEevAufTOvPphbjykClll1l11;
            final /* synthetic */ int dqpqqqbqQyjyB11111l1;
            final /* synthetic */ int ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, int i, int i2, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class ddbbbeXHXx111ll implements Runnable {
            final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddbbbeXHXx111ll;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ ResultReceiver dqpqqqbqQyjyB11111l1;
            final /* synthetic */ Bundle ppbdpwWWljzmXXdHNabfWhgjl111l11;

            ddbbbeXHXx111ll(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, Bundle bundle, ResultReceiver resultReceiver) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class dpbdpqRKAscW1lll1l implements Runnable {
            final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dqpqqqbqQyjyB11111l1;
            final /* synthetic */ IBinder ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dpbdpqRKAscW1lll1l(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, IBinder iBinder) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class dqpdbEevAufTOvPphbjykClll1l11 implements Runnable {
            final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddbbbeXHXx111ll;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ ResultReceiver dqpqqqbqQyjyB11111l1;
            final /* synthetic */ Bundle ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dqpdbEevAufTOvPphbjykClll1l11(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, Bundle bundle, ResultReceiver resultReceiver) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class dqpqqqbqQyjyB11111l1 implements Runnable {
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;

            dqpqqqbqQyjyB11111l1(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class dqqppqiKzJi1l1lll1l implements Runnable {
            final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddbbbeXHXx111ll;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ Bundle dqpqqqbqQyjyB11111l1;
            final /* synthetic */ IBinder ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dqqppqiKzJi1l1lll1l(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, IBinder iBinder, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements Runnable {
            final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ Bundle ddbbbeXHXx111ll;
            final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dqpdbEevAufTOvPphbjykClll1l11;
            final /* synthetic */ int dqpqqqbqQyjyB11111l1;
            final /* synthetic */ String ppbdpwWWljzmXXdHNabfWhgjl111l11;

            ppbdpwWWljzmXXdHNabfWhgjl111l11(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, int i, String str, int i2, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void bpdqqiQNVROMLC1ll1l1l11(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, String str, int i, int i2, Bundle bundle) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(String str, IBinder iBinder, Bundle bundle, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void ddbbbeXHXx111ll(String str, Bundle bundle, ResultReceiver resultReceiver, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(String str, int i, int i2, Bundle bundle, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void dpbdpqRKAscW1lll1l(String str, ResultReceiver resultReceiver, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void dqpdbEevAufTOvPphbjykClll1l11(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void dqpqqqbqQyjyB11111l1(String str, Bundle bundle, ResultReceiver resultReceiver, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void dqqppqiKzJi1l1lll1l(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        public void ppbdpwWWljzmXXdHNabfWhgjl111l11(String str, IBinder iBinder, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends dbppbdqpeLmcbs11l11<MediaBrowserCompat.MediaItem> {
        final /* synthetic */ MediaBrowserServiceCompat dqpqqqbqQyjyB11111l1;
        final /* synthetic */ ResultReceiver ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdbdpbLwkLpObyKsq1lll1(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        }

        void ddbbbeXHXx111ll(MediaBrowserCompat.MediaItem mediaItem) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
        /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(MediaBrowserCompat.MediaItem mediaItem) {
        }
    }

    class dpbdpqRKAscW1lll1l extends dbppbdqpeLmcbs11l11<Bundle> {
        final /* synthetic */ MediaBrowserServiceCompat dqpqqqbqQyjyB11111l1;
        final /* synthetic */ ResultReceiver ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdpqRKAscW1lll1l(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        }

        void ddbbbeXHXx111ll(Bundle bundle) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
        /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(Bundle bundle) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
        void dqqppqiKzJi1l1lll1l(Bundle bundle) {
        }
    }

    private final class dqdqbpQposEBDyDxIyyz1ll11 extends Handler {
        private final ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ MediaBrowserServiceCompat dpbdbdpbLwkLpObyKsq1lll1;

        dqdqbpQposEBDyDxIyyz1ll11(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(Runnable runnable) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
        }
    }

    class dqpdbEevAufTOvPphbjykClll1l11 implements dqpqqqbqQyjyB11111l1 {
        private Messenger dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ MediaBrowserServiceCompat dpbdbdpbLwkLpObyKsq1lll1;

        dqpdbEevAufTOvPphbjykClll1l11(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dqpqqqbqQyjyB11111l1
        public IBinder dbpqdHhmDSIHIJiwc1ll1l1(Intent intent) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dqpqqqbqQyjyB11111l1
        public void onCreate() {
        }
    }

    interface dqpqqqbqQyjyB11111l1 {
        IBinder dbpqdHhmDSIHIJiwc1ll1l1(Intent intent);

        void onCreate();
    }

    class dqqppqiKzJi1l1lll1l extends dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ MediaBrowserServiceCompat dqpqqqbqQyjyB11111l1;
        final /* synthetic */ ResultReceiver ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqqppqiKzJi1l1lll1l(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        }

        void ddbbbeXHXx111ll(List<MediaBrowserCompat.MediaItem> list) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.dbppbdqpeLmcbs11l11
        /* bridge */ /* synthetic */ void dpbdpqRKAscW1lll1l(List<MediaBrowserCompat.MediaItem> list) {
        }
    }

    static class pbppbpqbamJRy11l1l1<T> {
        MediaBrowserService.Result dbpqdHhmDSIHIJiwc1ll1l1;

        pbppbpqbamJRy11l1l1(MediaBrowserService.Result result) {
        }

        List<MediaBrowser.MediaItem> dbpqdHhmDSIHIJiwc1ll1l1(List<Parcel> list) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(T t) {
        }
    }

    private class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements IBinder.DeathRecipient {
        public final Bundle bpdqqiQNVROMLC1ll1l1l11;
        public final String dbpqdHhmDSIHIJiwc1ll1l1;
        public bpdqqiQNVROMLC1ll1l1l11 ddbbbeXHXx111ll;
        public final int dpbdbdpbLwkLpObyKsq1lll1;
        public final pb0 dpbdpqRKAscW1lll1l;
        final /* synthetic */ MediaBrowserServiceCompat dqpdbEevAufTOvPphbjykClll1l11;
        public final HashMap<String, List<sq0<IBinder, Bundle>>> dqpqqqbqQyjyB11111l1;
        public final int dqqppqiKzJi1l1lll1l;
        public final qbdpqpstJKhhKkXrsOGvbWw1l1llll ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        ppbdpwWWljzmXXdHNabfWhgjl111l11(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, Bundle bundle, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    private interface qbdpqpstJKhhKkXrsOGvbWw1l1llll {
        IBinder asBinder();

        void dbpqdHhmDSIHIJiwc1ll1l1(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        void dpbdbdpbLwkLpObyKsq1lll1() throws RemoteException;

        void dqqppqiKzJi1l1lll1l(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    void bdddqmITkkeGpsxVXHR1l1llll(String str, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, ResultReceiver resultReceiver) {
    }

    public abstract bpdqqiQNVROMLC1ll1l1l11 bpdqqiQNVROMLC1ll1l1l11(String str, int i, Bundle bundle);

    public void dbppbdqpeLmcbs11l11(String str, Bundle bundle) {
    }

    void dbpqdHhmDSIHIJiwc1ll1l1(String str, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, IBinder iBinder, Bundle bundle) {
    }

    public void ddbbbeXHXx111ll(String str, dbppbdqpeLmcbs11l11<MediaBrowserCompat.MediaItem> dbppbdqpelmcbs11l11) {
    }

    void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(String str, Bundle bundle, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, ResultReceiver resultReceiver) {
    }

    List<MediaBrowserCompat.MediaItem> dpbdbdpbLwkLpObyKsq1lll1(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
    }

    public void dpbdpqRKAscW1lll1l(String str, Bundle bundle, dbppbdqpeLmcbs11l11<Bundle> dbppbdqpelmcbs11l11) {
    }

    void dqdqbpQposEBDyDxIyyz1ll11(String str, Bundle bundle, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, ResultReceiver resultReceiver) {
    }

    public void dqpdbEevAufTOvPphbjykClll1l11(String str, Bundle bundle, dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> dbppbdqpelmcbs11l11) {
    }

    public void dqpqqqbqQyjyB11111l1(String str, dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> dbppbdqpelmcbs11l11, Bundle bundle) {
    }

    boolean dqqppqiKzJi1l1lll1l(String str, int i) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    public void pbppbpqbamJRy11l1l1(String str) {
    }

    public abstract void ppbdpwWWljzmXXdHNabfWhgjl111l11(String str, dbppbdqpeLmcbs11l11<List<MediaBrowserCompat.MediaItem>> dbppbdqpelmcbs11l11);

    boolean qbddqbdJBkudFfhX1ll1l111(String str, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, IBinder iBinder) {
    }

    void qbdpqpstJKhhKkXrsOGvbWw1l1llll(String str, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, Bundle bundle, Bundle bundle2) {
    }
}
