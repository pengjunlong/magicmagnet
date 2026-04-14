package com.tencent.tinker.loader.hotplug.interceptor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class Interceptor<T_TARGET> {
    private static final String TAG = "Tinker.Interceptor";
    private volatile boolean mInstalled;
    private T_TARGET mTarget;

    protected interface ITinkerHotplugProxy {
    }

    protected T_TARGET decorate(T_TARGET t_target) throws Throwable {
    }

    protected abstract T_TARGET fetchTarget() throws Throwable;

    protected abstract void inject(T_TARGET t_target) throws Throwable;

    public synchronized void install() throws InterceptFailedException {
    }

    public synchronized void uninstall() throws InterceptFailedException {
    }
}
