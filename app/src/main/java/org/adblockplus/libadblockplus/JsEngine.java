package org.adblockplus.libadblockplus;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class JsEngine {
    protected final long ptr;

    JsEngine(long j) {
    }

    private static native JsValue evaluate(long j, String str, String str2);

    private static native JsValue newValue(long j, long j2);

    private static native JsValue newValue(long j, String str);

    private static native JsValue newValue(long j, boolean z);

    private static native void onLowMemory(long j);

    private static native void registerNatives();

    private static native void removeEventCallback(long j, String str);

    private static native void setEventCallback(long j, String str, long j2);

    private static native void setGlobalProperty(long j, String str, long j2);

    private static native void triggerEvent(long j, String str, long[] jArr);

    public JsValue evaluate(String str, String str2) {
    }

    public JsValue newValue(long j) {
    }

    public void onLowMemory() {
    }

    public void removeEventCallback(String str) {
    }

    public void setEventCallback(String str, EventCallback eventCallback) {
    }

    public void setGlobalProperty(String str, JsValue jsValue) {
    }

    public void triggerEvent(String str, List<JsValue> list) {
    }

    public JsValue evaluate(String str) {
    }

    public JsValue newValue(boolean z) {
    }

    public JsValue newValue(String str) {
    }

    public void triggerEvent(String str) {
    }
}
