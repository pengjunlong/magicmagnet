package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {
    private final DataSource.Factory baseDataSourceFactory;
    private final Context context;
    private final TransferListener listener;

    public DefaultDataSourceFactory(Context context) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ DataSource createDataSource() {
    }

    public DefaultDataSourceFactory(Context context, String str) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DefaultDataSource createDataSource() {
    }

    public DefaultDataSourceFactory(Context context, String str, TransferListener transferListener) {
    }

    public DefaultDataSourceFactory(Context context, DataSource.Factory factory) {
    }

    public DefaultDataSourceFactory(Context context, TransferListener transferListener, DataSource.Factory factory) {
    }
}
