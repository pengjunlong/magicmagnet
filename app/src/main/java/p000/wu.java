package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.dqqppqiKzJi1l1lll1l;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
interface wu {

    public static final class dbpqdHhmDSIHIJiwc1ll1l1 implements wu {
        private final dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1;
        private final bqqqdboFHPLTwaMWMSXnDNNlll11l1 dpbdbdpbLwkLpObyKsq1lll1;
        private final List<ImageHeaderParser> dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(InputStream inputStream, List<ImageHeaderParser> list, bqqqdboFHPLTwaMWMSXnDNNlll11l1 bqqqdbofhpltwamwmsxndnnlll11l1) {
        }

        @Override // p000.wu
        public Bitmap dbpqdHhmDSIHIJiwc1ll1l1(BitmapFactory.Options options) throws IOException {
        }

        @Override // p000.wu
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.wu
        public ImageHeaderParser.ImageType dpbdpqRKAscW1lll1l() throws IOException {
        }

        @Override // p000.wu
        public int dqqppqiKzJi1l1lll1l() throws IOException {
        }
    }

    public static final class dpbdbdpbLwkLpObyKsq1lll1 implements wu {
        private final bqqqdboFHPLTwaMWMSXnDNNlll11l1 dbpqdHhmDSIHIJiwc1ll1l1;
        private final List<ImageHeaderParser> dpbdbdpbLwkLpObyKsq1lll1;
        private final ParcelFileDescriptorRewinder dqqppqiKzJi1l1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, bqqqdboFHPLTwaMWMSXnDNNlll11l1 bqqqdbofhpltwamwmsxndnnlll11l1) {
        }

        @Override // p000.wu
        public Bitmap dbpqdHhmDSIHIJiwc1ll1l1(BitmapFactory.Options options) throws IOException {
        }

        @Override // p000.wu
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.wu
        public ImageHeaderParser.ImageType dpbdpqRKAscW1lll1l() throws IOException {
        }

        @Override // p000.wu
        public int dqqppqiKzJi1l1lll1l() throws IOException {
        }
    }

    Bitmap dbpqdHhmDSIHIJiwc1ll1l1(BitmapFactory.Options options) throws IOException;

    void dpbdbdpbLwkLpObyKsq1lll1();

    ImageHeaderParser.ImageType dpbdpqRKAscW1lll1l() throws IOException;

    int dqqppqiKzJi1l1lll1l() throws IOException;
}
