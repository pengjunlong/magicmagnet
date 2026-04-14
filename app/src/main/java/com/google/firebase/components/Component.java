package com.google.firebase.components;

import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final Set<Class<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private final Set<Class<? super T>> providedInterfaces;
        private Set<Class<?>> publishedEvents;
        private int type;

        /* synthetic */ Builder(Class cls, Class[] clsArr, C10861 c10861) {
        }

        static /* synthetic */ Builder access$100(Builder builder) {
        }

        private Builder<T> intoSet() {
        }

        private Builder<T> setInstantiation(int i) {
        }

        private void validateInterface(Class<?> cls) {
        }

        public Builder<T> add(Dependency dependency) {
        }

        public Builder<T> alwaysEager() {
        }

        public Component<T> build() {
        }

        public Builder<T> eagerInDefaultApp() {
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
        }

        public Builder<T> publishes(Class<?> cls) {
        }

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
        }
    }

    /* synthetic */ Component(Set set, Set set2, int i, int i2, ComponentFactory componentFactory, Set set3, C10861 c10861) {
    }

    public static <T> Builder<T> builder(Class<T> cls) {
    }

    public static /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1(Object obj, ComponentContainer componentContainer) {
    }

    public static /* synthetic */ Object dpbdbdpbLwkLpObyKsq1lll1(Object obj, ComponentContainer componentContainer) {
    }

    public static /* synthetic */ Object dqqppqiKzJi1l1lll1l(Object obj, ComponentContainer componentContainer) {
    }

    public static <T> Component<T> intoSet(T t, Class<T> cls) {
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
    }

    private static /* synthetic */ Object lambda$intoSet$2(Object obj, ComponentContainer componentContainer) {
    }

    private static /* synthetic */ Object lambda$of$0(Object obj, ComponentContainer componentContainer) {
    }

    private static /* synthetic */ Object lambda$of$1(Object obj, ComponentContainer componentContainer) {
    }

    @Deprecated
    public static <T> Component<T> of(Class<T> cls, T t) {
    }

    public Set<Dependency> getDependencies() {
    }

    public ComponentFactory<T> getFactory() {
    }

    public Set<Class<? super T>> getProvidedInterfaces() {
    }

    public Set<Class<?>> getPublishedEvents() {
    }

    public boolean isAlwaysEager() {
    }

    public boolean isEagerInDefaultApp() {
    }

    public boolean isLazy() {
    }

    public boolean isValue() {
    }

    public String toString() {
    }

    private Component(Set<Class<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
    }

    @SafeVarargs
    public static <T> Component<T> of(T t, Class<T> cls, Class<? super T>... clsArr) {
    }
}
