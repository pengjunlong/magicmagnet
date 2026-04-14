package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractIterator<T> implements Iterator<T> {
    private T next;
    private State state;

    /* renamed from: com.google.common.base.AbstractIterator$1 */
    static /* synthetic */ class C06041 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$base$AbstractIterator$State = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State DONE = null;
        public static final State FAILED = null;
        public static final State NOT_READY = null;
        public static final State READY = null;

        private static /* synthetic */ State[] $values() {
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }
    }

    protected AbstractIterator() {
    }

    private boolean tryToComputeNext() {
    }

    protected abstract T computeNext();

    @CanIgnoreReturnValue
    protected final T endOfData() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
