package com.google.android.exoplayer2.ext.rtmp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.antmedia.rtmp_client.RtmpClient;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RtmpDataSource extends BaseDataSource {
    public static final /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1 = 0;
    private RtmpClient rtmpClient;
    private Uri uri;

    public static final class Factory implements DataSource.Factory {
        private TransferListener transferListener;

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        @CanIgnoreReturnValue
        public Factory setTransferListener(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public RtmpDataSource createDataSource() {
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RtmpClient.RtmpIOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }
}
