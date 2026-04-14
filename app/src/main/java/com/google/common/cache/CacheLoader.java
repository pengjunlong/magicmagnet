package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.errorprone.annotations.CheckReturnValue;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class CacheLoader<K, V> {

    /* renamed from: com.google.common.cache.CacheLoader$1 */
    class C06371 extends CacheLoader<K, V> {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ CacheLoader val$loader;

        /* renamed from: com.google.common.cache.CacheLoader$1$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<V> {
            final /* synthetic */ C06371 this$0;
            final /* synthetic */ Object val$key;
            final /* synthetic */ Object val$oldValue;

            AnonymousClass1(C06371 c06371, Object obj, Object obj2) {
            }

            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
            }
        }

        C06371(CacheLoader cacheLoader, Executor executor) {
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) throws Exception {
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture<V> reload(K k, V v) throws Exception {
        }
    }

    private static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Function<K, V> computingFunction;

        public FunctionToCacheLoader(Function<K, V> function) {
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
        }
    }

    private static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<V> computingSupplier;

        public SupplierToCacheLoader(Supplier<V> supplier) {
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    protected CacheLoader() {
    }

    @CheckReturnValue
    @GwtIncompatible
    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
    }

    @CheckReturnValue
    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
    }

    public abstract V load(K k) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
    }

    @GwtIncompatible
    public ListenableFuture<V> reload(K k, V v) throws Exception {
    }

    @CheckReturnValue
    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
    }
}
