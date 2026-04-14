package com.google.firebase.components;

import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ComponentRuntime extends AbstractComponentContainer implements ComponentLoader {
    private static final Provider<Set<Object>> EMPTY_PROVIDER = null;
    private final Map<Component<?>, Provider<?>> components;
    private final AtomicReference<Boolean> eagerComponentsInitializedWith;
    private final EventBus eventBus;
    private final Map<Class<?>, Provider<?>> lazyInstanceMap;
    private final Map<Class<?>, LazySet<?>> lazySetMap;
    private final List<Provider<ComponentRegistrar>> unprocessedRegistrarProviders;

    public static final class Builder {
        private final List<Component<?>> additionalComponents;
        private final Executor defaultExecutor;
        private final List<Provider<ComponentRegistrar>> lazyRegistrars;

        Builder(Executor executor) {
        }

        public static /* synthetic */ ComponentRegistrar dbpqdHhmDSIHIJiwc1ll1l1(ComponentRegistrar componentRegistrar) {
        }

        private static /* synthetic */ ComponentRegistrar lambda$addComponentRegistrar$0(ComponentRegistrar componentRegistrar) {
        }

        public Builder addComponent(Component<?> component) {
        }

        public Builder addComponentRegistrar(ComponentRegistrar componentRegistrar) {
        }

        public Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
        }

        public ComponentRuntime build() {
        }
    }

    /* synthetic */ ComponentRuntime(Executor executor, Iterable iterable, Collection collection, C10881 c10881) {
    }

    public static Builder builder(Executor executor) {
    }

    public static /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1(ComponentRuntime componentRuntime, Component component) {
    }

    private void discoverComponents(List<Component<?>> list) {
    }

    private void doInitializeEagerComponents(Map<Component<?>, Provider<?>> map, boolean z) {
    }

    public static /* synthetic */ ComponentRegistrar dpbdbdpbLwkLpObyKsq1lll1(ComponentRegistrar componentRegistrar) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(OptionalProvider optionalProvider, Provider provider) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(LazySet lazySet, Provider provider) {
    }

    private static <T> List<T> iterableToList(Iterable<T> iterable) {
    }

    private /* synthetic */ Object lambda$discoverComponents$0(Component component) {
    }

    private static /* synthetic */ void lambda$processInstanceComponents$2(OptionalProvider optionalProvider, Provider provider) {
    }

    private static /* synthetic */ void lambda$processSetComponents$3(LazySet lazySet, Provider provider) {
    }

    private static /* synthetic */ ComponentRegistrar lambda$toProviders$1(ComponentRegistrar componentRegistrar) {
    }

    private void maybeInitializeEagerComponents() {
    }

    private void processDependencies() {
    }

    private List<Runnable> processInstanceComponents(List<Component<?>> list) {
    }

    private List<Runnable> processSetComponents() {
    }

    private static Iterable<Provider<ComponentRegistrar>> toProviders(Iterable<ComponentRegistrar> iterable) {
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Object get(Class cls) {
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Class<T> cls) {
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> getProvider(Class<T> cls) {
    }

    public void initializeAllComponentsForTests() {
    }

    public void initializeEagerComponents(boolean z) {
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection) {
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
    }
}
