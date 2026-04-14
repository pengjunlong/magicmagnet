package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SubscriberRegistry {
    private static final LoadingCache<Class<?>, ImmutableSet<Class<?>>> flattenHierarchyCache = null;
    private static final LoadingCache<Class<?>, ImmutableList<Method>> subscriberMethodsCache = null;

    @Weak
    private final EventBus bus;
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<Subscriber>> subscribers;

    /* renamed from: com.google.common.eventbus.SubscriberRegistry$1 */
    class C08681 extends CacheLoader<Class<?>, ImmutableList<Method>> {
        C08681() {
        }

        @Override // com.google.common.cache.CacheLoader
        public /* bridge */ /* synthetic */ ImmutableList<Method> load(Class<?> cls) throws Exception {
        }

        /* renamed from: load, reason: avoid collision after fix types in other method */
        public ImmutableList<Method> load2(Class<?> cls) throws Exception {
        }
    }

    /* renamed from: com.google.common.eventbus.SubscriberRegistry$2 */
    class C08692 extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        C08692() {
        }

        @Override // com.google.common.cache.CacheLoader
        public /* bridge */ /* synthetic */ ImmutableSet<Class<?>> load(Class<?> cls) throws Exception {
        }

        /* renamed from: load, reason: avoid collision after fix types in other method */
        public ImmutableSet<Class<?>> load2(Class<?> cls) {
        }
    }

    private static final class MethodIdentifier {
        private final String name;
        private final List<Class<?>> parameterTypes;

        MethodIdentifier(Method method) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    SubscriberRegistry(EventBus eventBus) {
    }

    static /* synthetic */ ImmutableList access$000(Class cls) {
    }

    private Multimap<Class<?>, Subscriber> findAllSubscribers(Object obj) {
    }

    @VisibleForTesting
    static ImmutableSet<Class<?>> flattenHierarchy(Class<?> cls) {
    }

    private static ImmutableList<Method> getAnnotatedMethods(Class<?> cls) {
    }

    private static ImmutableList<Method> getAnnotatedMethodsNotCached(Class<?> cls) {
    }

    Iterator<Subscriber> getSubscribers(Object obj) {
    }

    @VisibleForTesting
    Set<Subscriber> getSubscribersForTesting(Class<?> cls) {
    }

    void register(Object obj) {
    }

    void unregister(Object obj) {
    }
}
