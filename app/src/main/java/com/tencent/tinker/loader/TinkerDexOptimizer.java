package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TinkerDexOptimizer {
    private static final String INTERPRET_LOCK_FILE_NAME = "interpret.lock";
    private static final String TAG = "Tinker.ParallelDex";

    /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$1 */
    static class C16491 implements Comparator<File> {
        C16491() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(File file, File file2) {
        }
    }

    private static class OptimizeWorker {
        private static final PackageManager[] CACHED_SYNC_PM = null;
        private static final String PM_INTERFACE_DESCRIPTOR = "android.content.pm.IPackageManager";
        private static String targetISA;
        private final ResultCallback callback;
        private final Context context;
        private final File dexFile;
        private final File optimizedDir;
        private final boolean useDLC;
        private final boolean useInterpretMode;

        /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$OptimizeWorker$1 */
        static class C16501 extends PackageManager.DexModuleRegisterCallback {
            C16501() {
            }

            public void onDexModuleRegistered(String str, boolean z, String str2) {
            }
        }

        /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$OptimizeWorker$2 */
        static class C16512 implements InvocationHandler {
            final /* synthetic */ IBinder val$pmBinder;

            C16512(IBinder iBinder) {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            }
        }

        OptimizeWorker(Context context, File file, File file2, boolean z, boolean z2, String str, ResultCallback resultCallback) {
        }

        private static PackageManager getSynchronizedPackageManager(Context context) throws Throwable {
        }

        private void interpretDex2Oat(String str, String str2) throws IOException {
        }

        public static void performDexOptSecondary(Context context, String str) throws IllegalStateException {
        }

        private static void performDexOptSecondaryImpl(IBinder iBinder, int i, String str, String str2, boolean z) {
        }

        private static int queryPerformDexOptSecondaryTransactionCode() throws UnsupportedOperationException {
        }

        private static void registerDexModule(Context context, String str, String str2) throws IllegalStateException {
        }

        private static void triggerPMDexOptOnDemand(Context context, String str, String str2) {
        }

        boolean run() {
        }
    }

    public interface ResultCallback {
        void onFailed(File file, File file2, Throwable th);

        void onStart(File file, File file2);

        void onSuccess(File file, File file2, File file3);
    }

    private static class StreamConsumer {
        static final Executor STREAM_CONSUMER = null;

        /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$StreamConsumer$1 */
        static class RunnableC16521 implements Runnable {
            final /* synthetic */ InputStream val$is;

            RunnableC16521(InputStream inputStream) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private StreamConsumer() {
        }

        static void consumeInputStream(InputStream inputStream) {
        }
    }

    public static boolean optimizeAll(Context context, Collection<File> collection, File file, boolean z, ResultCallback resultCallback) {
    }

    public static boolean optimizeAll(Context context, Collection<File> collection, File file, boolean z, boolean z2, String str, ResultCallback resultCallback) {
    }
}
