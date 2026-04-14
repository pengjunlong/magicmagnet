package tv.danmaku.ijk.media.exo2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.File;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ExoSourceManager {
    private static final long DEFAULT_MAX_SIZE = 536870912;
    private static final String TAG = "ExoSourceManager";
    public static final int TYPE_RTMP = 14;
    private static boolean isForceRtspTcp = true;
    private static Cache mCache = null;
    private static DatabaseProvider sDatabaseProvider = null;
    private static ExoMediaSourceInterceptListener sExoMediaSourceInterceptListener = null;
    private static int sHttpConnectTimeout = -1;
    private static int sHttpReadTimeout = -1;

    @Deprecated
    private static boolean sSkipSSLChain = false;
    private boolean isCached;
    private Context mAppContext;
    private String mDataSource;
    private Map<String, String> mMapHeadData;

    /* renamed from: tv.danmaku.ijk.media.exo2.ExoSourceManager$1 */
    class C18781 implements DataSource.Factory {
        final /* synthetic */ ExoSourceManager this$0;
        final /* synthetic */ RawResourceDataSource val$rawResourceDataSource;

        C18781(ExoSourceManager exoSourceManager, RawResourceDataSource rawResourceDataSource) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public DataSource createDataSource() {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.exo2.ExoSourceManager$2 */
    class C18792 implements DataSource.Factory {
        final /* synthetic */ ExoSourceManager this$0;
        final /* synthetic */ AssetDataSource val$rawResourceDataSource;

        C18792(ExoSourceManager exoSourceManager, AssetDataSource assetDataSource) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public DataSource createDataSource() {
        }
    }

    private ExoSourceManager(Context context, Map<String, String> map) {
    }

    public static String buildCacheKey(String str) {
    }

    public static boolean cachePreView(Context context, File file, String str) {
    }

    public static void clearCache(Context context, File file, String str) {
    }

    public static synchronized Cache getCacheSingleInstance(Context context, File file) {
    }

    private DataSource.Factory getDataSourceFactory(Context context, boolean z, String str) {
    }

    private DataSource.Factory getDataSourceFactoryCache(Context context, boolean z, boolean z2, File file, String str) {
    }

    public static DatabaseProvider getDatabaseProvider() {
    }

    public static ExoMediaSourceInterceptListener getExoMediaSourceInterceptListener() {
    }

    public static int getHttpConnectTimeout() {
    }

    private DataSource.Factory getHttpDataSourceFactory(Context context, boolean z, String str) {
    }

    public static int getHttpReadTimeout() {
    }

    @SuppressLint({"WrongConstant"})
    public static int inferContentType(String str, String str2) {
    }

    public static boolean isForceRtspTcp() {
    }

    @Deprecated
    public static boolean isSkipSSLChain() {
    }

    public static ExoSourceManager newInstance(Context context, Map<String, String> map) {
    }

    public static void removeCache(Cache cache, String str) {
    }

    public static void resetExoMediaSourceInterceptListener() {
    }

    private static boolean resolveCacheState(Cache cache, String str) {
    }

    public static void setDatabaseProvider(DatabaseProvider databaseProvider) {
    }

    public static void setExoMediaSourceInterceptListener(ExoMediaSourceInterceptListener exoMediaSourceInterceptListener) {
    }

    public static void setForceRtspTcp(boolean z) {
    }

    public static void setHttpConnectTimeout(int i) {
    }

    public static void setHttpReadTimeout(int i) {
    }

    @Deprecated
    public static void setSkipSSLChain(boolean z) {
    }

    public MediaSource getMediaSource(String str, boolean z, boolean z2, boolean z3, File file, String str2) {
    }

    public boolean hadCached() {
    }

    public void release() {
    }

    public static int inferContentType(Uri uri, String str) {
    }
}
