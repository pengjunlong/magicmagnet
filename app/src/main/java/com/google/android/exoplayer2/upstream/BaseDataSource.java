package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseDataSource implements DataSource {
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners;

    protected BaseDataSource(boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
    }

    protected final void bytesTransferred(int i) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
    }

    protected final void transferEnded() {
    }

    protected final void transferInitializing(DataSpec dataSpec) {
    }

    protected final void transferStarted(DataSpec dataSpec) {
    }
}
