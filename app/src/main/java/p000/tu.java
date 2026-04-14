package p000;

import android.annotation.SuppressLint;
import android.graphics.ImageDecoder;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class tu<T> implements g71<ImageDecoder.Source, T> {
    final nn dbpqdHhmDSIHIJiwc1ll1l1;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements ImageDecoder.OnHeaderDecodedListener {
        final /* synthetic */ o3 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ qdbbpqpbdGZcArXaVirll1lll11l dpbdpqRKAscW1lll1l;
        final /* synthetic */ tu dqpqqqbqQyjyB11111l1;
        final /* synthetic */ boolean dqqppqiKzJi1l1lll1l;
        final /* synthetic */ vv0 ppbdpwWWljzmXXdHNabfWhgjl111l11;

        /* renamed from: tu$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
        class C2090dbpqdHhmDSIHIJiwc1ll1l1 implements ImageDecoder.OnPartialImageListener {
            final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;

            C2090dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            }
        }

        dbpqdHhmDSIHIJiwc1ll1l1(tu tuVar, int i, int i2, boolean z, qdbbpqpbdGZcArXaVirll1lll11l qdbbpqpbdgzcarxavirll1lll11l, o3 o3Var, vv0 vv0Var) {
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        }
    }

    public final boolean bpdqqiQNVROMLC1ll1l1l11(ImageDecoder.Source source, fp0 fp0Var) {
    }

    @Override // p000.g71
    public /* bridge */ /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(ImageDecoder.Source source, fp0 fp0Var) throws IOException {
    }

    @Override // p000.g71
    public /* bridge */ /* synthetic */ a71 dpbdbdpbLwkLpObyKsq1lll1(ImageDecoder.Source source, int i, int i2, fp0 fp0Var) throws IOException {
    }

    protected abstract a71<T> dpbdpqRKAscW1lll1l(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    public final a71<T> dqqppqiKzJi1l1lll1l(ImageDecoder.Source source, int i, int i2, fp0 fp0Var) throws IOException {
    }
}
