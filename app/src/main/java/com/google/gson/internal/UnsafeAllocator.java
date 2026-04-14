package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class UnsafeAllocator {

    /* renamed from: com.google.gson.internal.UnsafeAllocator$1 */
    static class C12371 extends UnsafeAllocator {
        final /* synthetic */ Method val$allocateInstance;
        final /* synthetic */ Object val$unsafe;

        C12371(Method method, Object obj) {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$2 */
    static class C12382 extends UnsafeAllocator {
        final /* synthetic */ int val$constructorId;
        final /* synthetic */ Method val$newInstance;

        C12382(Method method, int i) {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$3 */
    static class C12393 extends UnsafeAllocator {
        final /* synthetic */ Method val$newInstance;

        C12393(Method method) {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$4 */
    static class C12404 extends UnsafeAllocator {
        C12404() {
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
        }
    }

    static void assertInstantiable(Class<?> cls) {
    }

    public static UnsafeAllocator create() {
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
