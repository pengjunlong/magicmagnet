package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> EMPTY_FACTORY = null;
    private final List<vx0<Collection<T>>> collectionProviders;
    private final List<vx0<T>> individualProviders;

    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final List<vx0<Collection<T>>> collectionProviders;
        private final List<vx0<T>> individualProviders;

        /* synthetic */ Builder(int i, int i2, C00651 c00651) {
        }

        public Builder<T> addCollectionProvider(vx0<? extends Collection<? extends T>> vx0Var) {
        }

        public Builder<T> addProvider(vx0<? extends T> vx0Var) {
        }

        public SetFactory<T> build() {
        }

        private Builder(int i, int i2) {
        }
    }

    /* synthetic */ SetFactory(List list, List list2, C00651 c00651) {
    }

    public static <T> Builder<T> builder(int i, int i2) {
    }

    public static <T> Factory<Set<T>> empty() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    private SetFactory(List<vx0<T>> list, List<vx0<Collection<T>>> list2) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public Set<T> get() {
    }
}
