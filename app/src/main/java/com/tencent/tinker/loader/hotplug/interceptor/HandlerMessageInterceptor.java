package com.tencent.tinker.loader.hotplug.interceptor;

import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.interceptor.Interceptor;
import java.lang.reflect.Field;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HandlerMessageInterceptor extends Interceptor<Handler.Callback> {
    private static Field sMCallbackField;
    private final MessageHandler mMessageHandler;
    private final Handler mTarget;

    private static class CallbackWrapper implements Handler.Callback, Interceptor.ITinkerHotplugProxy {
        private volatile boolean mIsInHandleMethod;
        private final MessageHandler mMessageHandler;
        private final Handler.Callback mOrigCallback;

        CallbackWrapper(MessageHandler messageHandler, Handler.Callback callback) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    public HandlerMessageInterceptor(Handler handler, MessageHandler messageHandler) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected /* bridge */ /* synthetic */ Handler.Callback decorate(Handler.Callback callback) throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected /* bridge */ /* synthetic */ Handler.Callback fetchTarget() throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected /* bridge */ /* synthetic */ void inject(Handler.Callback callback) throws Throwable {
    }

    /* renamed from: decorate, reason: avoid collision after fix types in other method */
    protected Handler.Callback decorate2(Handler.Callback callback) throws Throwable {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected Handler.Callback fetchTarget() throws Throwable {
    }

    /* renamed from: inject, reason: avoid collision after fix types in other method */
    protected void inject2(Handler.Callback callback) throws Throwable {
    }
}
