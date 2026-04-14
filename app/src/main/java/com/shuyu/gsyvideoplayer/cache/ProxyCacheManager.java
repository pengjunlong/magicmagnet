package com.shuyu.gsyvideoplayer.cache;

import android.content.Context;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import java.io.File;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import p000.cp;
import p000.dbqqpswOaJEZyjlll1lll1;
import p000.hd;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ProxyCacheManager implements ICacheManager, dbqqpswOaJEZyjlll1lll1 {
    public static int DEFAULT_MAX_COUNT = -1;
    public static long DEFAULT_MAX_SIZE = 536870912;
    private static hd fileNameGenerator;
    private static ProxyCacheManager proxyCacheManager;
    private ICacheManager.ICacheAvailableListener cacheAvailableListener;
    protected File mCacheDir;
    protected boolean mCacheFile;
    protected cp proxy;
    private TrustManager[] trustAllCerts;
    protected ProxyCacheUserAgentHeadersInjector userAgentHeadersInjector;

    /* renamed from: v */
    private HostnameVerifier f207v;

    public static void clearFileNameGenerator() {
    }

    protected static cp getProxy(Context context) {
    }

    public static synchronized ProxyCacheManager instance() {
    }

    public static void setFileNameGenerator(hd hdVar) {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public boolean cachePreview(Context context, File file, String str) {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void clearCache(Context context, File file, String str) {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void doCacheLogic(Context context, IMediaPlayer iMediaPlayer, String str, Map<String, String> map, File file) {
    }

    public HostnameVerifier getHostnameVerifier() {
    }

    public TrustManager[] getTrustAllCerts() {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public boolean hadCached() {
    }

    public cp newProxy(Context context, File file) {
    }

    @Override // p000.dbqqpswOaJEZyjlll1lll1
    public void onCacheAvailable(File file, String str, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void release() {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void setCacheAvailableListener(ICacheManager.ICacheAvailableListener iCacheAvailableListener) {
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
    }

    public void setProxy(cp cpVar) {
    }

    public void setTrustAllCerts(TrustManager[] trustManagerArr) {
    }

    public static cp getProxy(Context context, File file) {
    }

    public cp newProxy(Context context) {
    }
}
