package org.adblockplus.libadblockplus;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class JsValue implements Disposable {
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

    protected JsValue(long j) {
    }

    static /* synthetic */ void access$000(long j) {
    }

    private static native boolean asBoolean(long j);

    private static native List<JsValue> asList(long j);

    private static native long asLong(long j);

    private static native String asString(long j);

    private static native JsValue call(long j, long[] jArr);

    private static native JsValue call(long j, long[] jArr, long j2);

    private static native void dtor(long j);

    private static native String getJsClass(long j);

    private static native List<String> getOwnPropertyNames(long j);

    private static native JsValue getProperty(long j, String str);

    private static native boolean isArray(long j);

    private static native boolean isBoolean(long j);

    private static native boolean isFunction(long j);

    private static native boolean isNull(long j);

    private static native boolean isNumber(long j);

    private static native boolean isObject(long j);

    private static native boolean isString(long j);

    private static native boolean isUndefined(long j);

    private static native void registerNatives();

    private static native void setProperty(long j, String str, long j2);

    public boolean asBoolean() {
    }

    public List<JsValue> asList() {
    }

    public long asLong() {
    }

    public String asString() {
    }

    public JsValue call(List<JsValue> list) {
    }

    protected long[] convertToPtrArray(List<JsValue> list) {
    }

    @Override // org.adblockplus.libadblockplus.Disposable
    public void dispose() {
    }

    public String getJsClass() {
    }

    public List<String> getOwnPropertyNames() {
    }

    public JsValue getProperty(String str) {
    }

    public boolean isArray() {
    }

    public boolean isBoolean() {
    }

    public boolean isFunction() {
    }

    public boolean isNull() {
    }

    public boolean isNumber() {
    }

    public boolean isObject() {
    }

    public boolean isString() {
    }

    public boolean isUndefined() {
    }

    public void setProperty(String str, JsValue jsValue) {
    }

    public String toString() {
    }

    public JsValue call(List<JsValue> list, JsValue jsValue) {
    }

    public JsValue call() {
    }
}
