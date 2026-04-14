package com.xunlei.downloadlib;

import android.content.Context;
import com.excuseme.ExcuseMe;
import com.xunlei.downloadlib.parameter.InitParam;
import java.io.File;
import java.io.InputStream;
import p000.ee1;
import p000.fe1;
import p000.pqbqbpqbKbRsVQllll1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MagicXLoader {
    private static short APP_ID = 0;
    private static String APP_VERSION = null;
    private static String PACKAGE_NAME = null;
    public static final int RESULT_NO_ERROR = 9000;
    public static final String TAG = "M_XLLoad";
    private static MagicXLoader instance;
    private static XLLoader loader;
    private static Context mContext;
    private static XLDownloadManager manager;
    private static ExcuseMe sExcuseMe;
    private static XLManagerProxy sXLManagerProxy;
    private OnInitListener onInitListener;

    /* renamed from: com.xunlei.downloadlib.MagicXLoader$1 */
    class RunnableC17131 implements Runnable {
        final /* synthetic */ MagicXLoader this$0;
        final /* synthetic */ InitParam val$initParam;

        RunnableC17131(MagicXLoader magicXLoader, InitParam initParam) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.xunlei.downloadlib.MagicXLoader$2 */
    class RunnableC17142 implements Runnable {
        final /* synthetic */ MagicXLoader this$0;

        RunnableC17142(MagicXLoader magicXLoader) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @pqbqbpqbKbRsVQllll1("com.magicmagnet.common.Native")
    interface NativeProxy {
        /* renamed from: s */
        String m852s();
    }

    public interface OnInitListener {
        void onFinish(boolean z, int i);
    }

    @pqbqbpqbKbRsVQllll1("com.xunlei.downloadlib.XLDownloadManager")
    interface XLManagerProxy {
        void loadErrcodeString(Context context);

        int notifyNetWorkCarrier(int i);

        int notifyNetWorkType(int i, XLLoader xLLoader);

        int notifyWifiBSSID(String str, XLLoader xLLoader);

        @ee1("mAllowExecution")
        void setAllowExecution(boolean z);

        @fe1
        void setInstance(Object obj);
    }

    private MagicXLoader() {
    }

    static /* synthetic */ boolean access$000(MagicXLoader magicXLoader, InputStream inputStream, File file) {
    }

    static /* synthetic */ int access$100(MagicXLoader magicXLoader, InitParam initParam) {
    }

    static /* synthetic */ XLDownloadManager access$200() {
    }

    static /* synthetic */ XLManagerProxy access$300() {
    }

    static /* synthetic */ XLLoader access$400() {
    }

    private boolean copyToFile(InputStream inputStream, File file) {
    }

    private void doMonitorNetworkChange() {
    }

    public static Context getContext() {
    }

    public static MagicXLoader getInstance() {
    }

    private void undoMonitorNetworkChange() {
    }

    public int init() {
    }

    public void initASync() {
    }

    public boolean receiverRegisted() {
    }

    public void setContext(Context context) {
    }

    public void setOnInitListener(OnInitListener onInitListener) {
    }

    public int uninit() {
    }

    private int init(InitParam initParam) {
    }
}
