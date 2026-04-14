package com.tencent.tinker.loader.hotplug.interceptor;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ServiceBinderInterceptor extends Interceptor<IBinder> {
    private static final String TAG = "Tinker.SvcBndrIntrcptr";
    private static Method sGetServiceMethod;
    private static Field sSCacheField;
    private static Class<?> sServiceManagerClazz;
    private final Context mBaseContext;
    private final BinderInvocationHandler mBinderInvocationHandler;
    private final String mServiceName;

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor$1 */
    static class C16541 extends ClassLoader {
        final /* synthetic */ Set val$uniqueCls;

        C16541(Set set) {
        }

        @Override // java.lang.ClassLoader
        protected Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        }
    }

    public interface BinderInvocationHandler {
        Object invoke(Object obj, Method method, Object[] objArr) throws Throwable;
    }

    private static class FakeClientBinderHandler implements InvocationHandler {
        private final BinderInvocationHandler mBinderInvocationHandler;
        private final IBinder mOriginalClientBinder;

        FakeClientBinderHandler(IBinder iBinder, BinderInvocationHandler binderInvocationHandler) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    private static class FakeInterfaceHandler implements InvocationHandler {
        private final BinderInvocationHandler mBinderInvocationHandler;
        private final IBinder mOriginalClientBinder;
        private final IInterface mOriginalInterface;

        FakeInterfaceHandler(IInterface iInterface, IBinder iBinder, BinderInvocationHandler binderInvocationHandler) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    public ServiceBinderInterceptor(Context context, String str, BinderInvocationHandler binderInvocationHandler) {
    }

    static /* synthetic */ Class[] access$000(Class cls) {
    }

    static /* synthetic */ Object access$100(Class[] clsArr, InvocationHandler invocationHandler) {
    }

    private static <T> T createProxy(Class<?>[] clsArr, InvocationHandler invocationHandler) {
    }

    private static void fixAMSBinderCache(IBinder iBinder) throws Throwable {
    }

    private static void fixPMSBinderCache(Context context, IBinder iBinder) throws Throwable {
    }

    private static Class<?>[] getAllInterfacesThroughDeriveChain(Class<?> cls) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected /* bridge */ /* synthetic */ IBinder decorate(IBinder iBinder) throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected /* bridge */ /* synthetic */ IBinder fetchTarget() throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected /* bridge */ /* synthetic */ void inject(IBinder iBinder) throws Throwable {
    }

    /* renamed from: decorate, reason: avoid collision after fix types in other method */
    protected IBinder decorate2(IBinder iBinder) throws Throwable {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    protected IBinder fetchTarget() throws Throwable {
    }

    /* renamed from: inject, reason: avoid collision after fix types in other method */
    protected void inject2(IBinder iBinder) throws Throwable {
    }
}
