package com.google.android.exoplayer2.ext.rtmp;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RtmpDataSourceFactory implements DataSource.Factory {
    private final TransferListener listener;

    public RtmpDataSourceFactory() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ DataSource createDataSource() {
    }

    public RtmpDataSourceFactory(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public RtmpDataSource createDataSource() {
    }
}
