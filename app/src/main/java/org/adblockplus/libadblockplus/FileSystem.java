package org.adblockplus.libadblockplus;

import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class FileSystem {

    public static class Callback implements Disposable {
        private final Disposer disposer;
        protected final long ptr;

        private static final class DisposeWrapper implements Disposable {
            private final long ptr;

            public DisposeWrapper(long j) {
            }

            @Override // org.adblockplus.libadblockplus.Disposable
            public void dispose() {
            }
        }

        Callback(long j) {
        }

        @Override // org.adblockplus.libadblockplus.Disposable
        public void dispose() {
        }

        public void onFinished(String str) {
        }
    }

    public static class ReadCallback implements Disposable {
        private final Disposer disposer;
        protected final long ptr;

        private static final class DisposeWrapper implements Disposable {
            private final long ptr;

            public DisposeWrapper(long j) {
            }

            @Override // org.adblockplus.libadblockplus.Disposable
            public void dispose() {
            }
        }

        ReadCallback(long j) {
        }

        @Override // org.adblockplus.libadblockplus.Disposable
        public void dispose() {
        }

        public void onFinished(ByteBuffer byteBuffer) {
        }
    }

    public static class StatCallback implements Disposable {
        private final Disposer disposer;
        protected final long ptr;

        private static final class DisposeWrapper implements Disposable {
            private final long ptr;

            public DisposeWrapper(long j) {
            }

            @Override // org.adblockplus.libadblockplus.Disposable
            public void dispose() {
            }
        }

        StatCallback(long j) {
        }

        @Override // org.adblockplus.libadblockplus.Disposable
        public void dispose() {
        }

        public void onFinished(StatResult statResult, String str) {
        }
    }

    public static class StatResult {
        private boolean exists;
        private long modified;

        public StatResult(boolean z, long j) {
        }

        public long getModified() {
        }

        public boolean isExists() {
        }
    }

    static /* synthetic */ void access$000(long j) {
    }

    static /* synthetic */ void access$100(long j, String str) {
    }

    static /* synthetic */ void access$200(long j) {
    }

    static /* synthetic */ void access$300(long j, ByteBuffer byteBuffer) {
    }

    static /* synthetic */ void access$400(long j) {
    }

    static /* synthetic */ void access$500(long j, StatResult statResult, String str) {
    }

    private static native void callbackDtor(long j);

    private static native void callbackOnFinished(long j, String str);

    private static native void readCallbackDtor(long j);

    private static native void readCallbackOnFinished(long j, ByteBuffer byteBuffer);

    private static native void registerNatives();

    private static native void statCallbackDtor(long j);

    private static native void statCallbackOnFinished(long j, StatResult statResult, String str);

    public abstract void move(String str, String str2, Callback callback);

    public abstract void read(String str, ReadCallback readCallback, Callback callback);

    public abstract void remove(String str, Callback callback);

    public abstract void stat(String str, StatCallback statCallback);

    public abstract void write(String str, ByteBuffer byteBuffer, Callback callback);
}
