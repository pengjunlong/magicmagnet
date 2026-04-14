package p000;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p000.bp0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class q02<T> implements g71<T, Bitmap> {
    public static final bp0<Integer> bpdqqiQNVROMLC1ll1l1l11 = null;
    public static final bp0<Long> dpbdpqRKAscW1lll1l = null;
    private static final bpdqqiQNVROMLC1ll1l1l11 ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
    private final ppbdpwWWljzmXXdHNabfWhgjl111l11<T> dbpqdHhmDSIHIJiwc1ll1l1;
    private final qdqqdddcEQXCUffpXJtzkbnl1l111 dpbdbdpbLwkLpObyKsq1lll1;
    private final bpdqqiQNVROMLC1ll1l1l11 dqqppqiKzJi1l1lll1l;

    static class bpdqqiQNVROMLC1ll1l1l11 {
        bpdqqiQNVROMLC1ll1l1l11() {
        }

        public MediaMetadataRetriever dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements bp0.dpbdbdpbLwkLpObyKsq1lll1<Long> {
        private final ByteBuffer dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // bp0.dpbdbdpbLwkLpObyKsq1lll1
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(byte[] bArr, Long l, MessageDigest messageDigest) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(byte[] bArr, Long l, MessageDigest messageDigest) {
        }
    }

    private static final class ddbbbeXHXx111ll extends RuntimeException {
        ddbbbeXHXx111ll() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements bp0.dpbdbdpbLwkLpObyKsq1lll1<Integer> {
        private final ByteBuffer dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // bp0.dpbdbdpbLwkLpObyKsq1lll1
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(byte[] bArr, Integer num, MessageDigest messageDigest) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(byte[] bArr, Integer num, MessageDigest messageDigest) {
        }
    }

    static final class dpbdpqRKAscW1lll1l implements ppbdpwWWljzmXXdHNabfWhgjl111l11<ByteBuffer> {

        class dbpqdHhmDSIHIJiwc1ll1l1 extends MediaDataSource {
            final /* synthetic */ dpbdpqRKAscW1lll1l bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ ByteBuffer dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, ByteBuffer byteBuffer) {
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
            }
        }

        dpbdpqRKAscW1lll1l() {
        }

        @Override // q02.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        }
    }

    static final class dqpqqqbqQyjyB11111l1 implements ppbdpwWWljzmXXdHNabfWhgjl111l11<ParcelFileDescriptor> {
        dqpqqqbqQyjyB11111l1() {
        }

        @Override // q02.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        }
    }

    private static final class dqqppqiKzJi1l1lll1l implements ppbdpwWWljzmXXdHNabfWhgjl111l11<AssetFileDescriptor> {
        private dqqppqiKzJi1l1lll1l() {
        }

        @Override // q02.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        }

        /* synthetic */ dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    interface ppbdpwWWljzmXXdHNabfWhgjl111l11<T> {
        void dbpqdHhmDSIHIJiwc1ll1l1(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    q02(qdqqdddcEQXCUffpXJtzkbnl1l111 qdqqdddceqxcuffpxjtzkbnl1l111, ppbdpwWWljzmXXdHNabfWhgjl111l11<T> ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    private static Bitmap bpdqqiQNVROMLC1ll1l1l11(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, o3 o3Var) {
    }

    public static g71<ParcelFileDescriptor, Bitmap> ddbbbeXHXx111ll(qdqqdddcEQXCUffpXJtzkbnl1l111 qdqqdddceqxcuffpxjtzkbnl1l111) {
    }

    public static g71<ByteBuffer, Bitmap> dpbdpqRKAscW1lll1l(qdqqdddcEQXCUffpXJtzkbnl1l111 qdqqdddceqxcuffpxjtzkbnl1l111) {
    }

    @TargetApi(27)
    private static Bitmap dqpqqqbqQyjyB11111l1(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, o3 o3Var) {
    }

    public static g71<AssetFileDescriptor, Bitmap> dqqppqiKzJi1l1lll1l(qdqqdddcEQXCUffpXJtzkbnl1l111 qdqqdddceqxcuffpxjtzkbnl1l111) {
    }

    private static Bitmap ppbdpwWWljzmXXdHNabfWhgjl111l11(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
    }

    @Override // p000.g71
    public boolean dbpqdHhmDSIHIJiwc1ll1l1(T t, fp0 fp0Var) {
    }

    @Override // p000.g71
    public a71<Bitmap> dpbdbdpbLwkLpObyKsq1lll1(T t, int i, int i2, fp0 fp0Var) throws IOException {
    }

    q02(qdqqdddcEQXCUffpXJtzkbnl1l111 qdqqdddceqxcuffpxjtzkbnl1l111, ppbdpwWWljzmXXdHNabfWhgjl111l11<T> ppbdpwwwljzmxxdhnabfwhgjl111l11, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }
}
