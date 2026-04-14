package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Set;
import p000.pd0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class cx1<Data> implements pd0<Uri, Data> {
    private static final Set<String> dpbdbdpbLwkLpObyKsq1lll1 = null;
    private final dqqppqiKzJi1l1lll1l<Data> dbpqdHhmDSIHIJiwc1ll1l1;

    public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements qd0<Uri, AssetFileDescriptor>, dqqppqiKzJi1l1lll1l<AssetFileDescriptor> {
        private final ContentResolver dbpqdHhmDSIHIJiwc1ll1l1;

        public dbpqdHhmDSIHIJiwc1ll1l1(ContentResolver contentResolver) {
        }

        @Override // cx1.dqqppqiKzJi1l1lll1l
        public pbppdqbpJmyQKew1l11l<AssetFileDescriptor> dbpqdHhmDSIHIJiwc1ll1l1(Uri uri) {
        }

        @Override // p000.qd0
        public pd0<Uri, AssetFileDescriptor> dpbdbdpbLwkLpObyKsq1lll1(xe0 xe0Var) {
        }
    }

    public static class dpbdbdpbLwkLpObyKsq1lll1 implements qd0<Uri, ParcelFileDescriptor>, dqqppqiKzJi1l1lll1l<ParcelFileDescriptor> {
        private final ContentResolver dbpqdHhmDSIHIJiwc1ll1l1;

        public dpbdbdpbLwkLpObyKsq1lll1(ContentResolver contentResolver) {
        }

        @Override // cx1.dqqppqiKzJi1l1lll1l
        public pbppdqbpJmyQKew1l11l<ParcelFileDescriptor> dbpqdHhmDSIHIJiwc1ll1l1(Uri uri) {
        }

        @Override // p000.qd0
        public pd0<Uri, ParcelFileDescriptor> dpbdbdpbLwkLpObyKsq1lll1(xe0 xe0Var) {
        }
    }

    public static class dpbdpqRKAscW1lll1l implements qd0<Uri, InputStream>, dqqppqiKzJi1l1lll1l<InputStream> {
        private final ContentResolver dbpqdHhmDSIHIJiwc1ll1l1;

        public dpbdpqRKAscW1lll1l(ContentResolver contentResolver) {
        }

        @Override // cx1.dqqppqiKzJi1l1lll1l
        public pbppdqbpJmyQKew1l11l<InputStream> dbpqdHhmDSIHIJiwc1ll1l1(Uri uri) {
        }

        @Override // p000.qd0
        public pd0<Uri, InputStream> dpbdbdpbLwkLpObyKsq1lll1(xe0 xe0Var) {
        }
    }

    public interface dqqppqiKzJi1l1lll1l<Data> {
        pbppdqbpJmyQKew1l11l<Data> dbpqdHhmDSIHIJiwc1ll1l1(Uri uri);
    }

    public cx1(dqqppqiKzJi1l1lll1l<Data> dqqppqikzji1l1lll1l) {
    }

    @Override // p000.pd0
    public /* bridge */ /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(Uri uri) {
    }

    @Override // p000.pd0
    public /* bridge */ /* synthetic */ pd0.dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1(Uri uri, int i, int i2, fp0 fp0Var) {
    }

    public boolean dpbdpqRKAscW1lll1l(Uri uri) {
    }

    public pd0.dbpqdHhmDSIHIJiwc1ll1l1<Data> dqqppqiKzJi1l1lll1l(Uri uri, int i, int i2, fp0 fp0Var) {
    }
}
