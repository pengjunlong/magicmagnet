package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private static final SparseArray<Constructor<? extends Downloader>> CONSTRUCTORS = null;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory factory) {
    }

    private static SparseArray<Constructor<? extends Downloader>> createDownloaderConstructors() {
    }

    private static Constructor<? extends Downloader> getDownloaderConstructor(Class<?> cls) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, Executor executor) {
    }

    private Downloader createDownloader(DownloadRequest downloadRequest, int i) {
    }
}
