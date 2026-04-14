package org.adblockplus.libadblockplus;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Platform implements Disposable {
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

    public Platform(LogSystem logSystem, FileSystem fileSystem, HttpClient httpClient, String str) {
    }

    static /* synthetic */ void access$000(long j) {
    }

    private static native long ctor(LogSystem logSystem, FileSystem fileSystem, HttpClient httpClient, String str);

    private static native void dtor(long j);

    private static native void ensureFilterEngine(long j);

    private static native long getJsEnginePtr(long j);

    private static native void registerNatives();

    private static native void setUpFilterEngine(long j, IsAllowedConnectionCallback isAllowedConnectionCallback, boolean z);

    private static native void setUpJsEngine(long j, AppInfo appInfo, long j2);

    @Override // org.adblockplus.libadblockplus.Disposable
    public void dispose() {
    }

    public FilterEngine getFilterEngine() {
    }

    public JsEngine getJsEngine() {
    }

    public void setUpFilterEngine(IsAllowedConnectionCallback isAllowedConnectionCallback, boolean z) {
    }

    public void setUpJsEngine(AppInfo appInfo, long j) {
    }

    protected Platform(long j) {
    }

    public void setUpJsEngine(AppInfo appInfo) {
    }
}
