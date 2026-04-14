package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class dpbdbdpbLwkLpObyKsq1lll1 extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = null;
    private static final File DEVICE_ROOT = null;
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static final HashMap<String, InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1> sCache = null;
    private int mResourceId;
    private InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1 mStrategy;

    static class dbpqdHhmDSIHIJiwc1ll1l1 {
        static File[] dbpqdHhmDSIHIJiwc1ll1l1(Context context) {
        }
    }

    /* renamed from: androidx.core.content.dpbdbdpbLwkLpObyKsq1lll1$dpbdbdpbLwkLpObyKsq1lll1, reason: collision with other inner class name */
    interface InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1 {
        Uri dbpqdHhmDSIHIJiwc1ll1l1(File file);

        File dpbdbdpbLwkLpObyKsq1lll1(Uri uri);
    }

    static class dqqppqiKzJi1l1lll1l implements InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1 {
        private final String dbpqdHhmDSIHIJiwc1ll1l1;
        private final HashMap<String, File> dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(String str) {
        }

        @Override // androidx.core.content.dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1
        public Uri dbpqdHhmDSIHIJiwc1ll1l1(File file) {
        }

        @Override // androidx.core.content.dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1
        public File dpbdbdpbLwkLpObyKsq1lll1(Uri uri) {
        }

        void dqqppqiKzJi1l1lll1l(String str, File file) {
        }
    }

    public dpbdbdpbLwkLpObyKsq1lll1() {
    }

    private static File buildPath(File file, String... strArr) {
    }

    private static String[] copyOf(String[] strArr, int i) {
    }

    static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
    }

    private static InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1 getPathStrategy(Context context, String str, int i) {
    }

    public static Uri getUriForFile(Context context, String str, File file) {
    }

    private static int modeToMode(String str) {
    }

    private static InterfaceC1925dpbdbdpbLwkLpObyKsq1lll1 parsePathStrategy(Context context, String str, int i) throws IOException, XmlPullParserException {
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }

    protected dpbdbdpbLwkLpObyKsq1lll1(int i) {
    }

    private static Object[] copyOf(Object[] objArr, int i) {
    }

    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(Context context, String str, File file, String str2) {
    }
}
