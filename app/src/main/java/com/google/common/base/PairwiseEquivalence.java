package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    final Equivalence<E> elementEquivalence;

    PairwiseEquivalence(Equivalence<E> equivalence) {
    }

    @Override // com.google.common.base.Equivalence
    protected /* bridge */ /* synthetic */ boolean doEquivalent(Object obj, Object obj2) {
    }

    @Override // com.google.common.base.Equivalence
    protected /* bridge */ /* synthetic */ int doHash(Object obj) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    protected boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
    }

    protected int doHash(Iterable<T> iterable) {
    }
}
