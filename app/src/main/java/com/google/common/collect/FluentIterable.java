package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class FluentIterable<E> implements Iterable<E> {
    private final Optional<Iterable<E>> iterableDelegate;

    /* renamed from: com.google.common.collect.FluentIterable$1 */
    class C06991 extends FluentIterable<E> {
        final /* synthetic */ Iterable val$iterable;

        C06991(Iterable iterable, Iterable iterable2) {
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.FluentIterable$2 */
    class C07002<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$inputs;

        C07002(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.FluentIterable$3 */
    class C07013<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable[] val$inputs;

        /* renamed from: com.google.common.collect.FluentIterable$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<? extends T>> {
            final /* synthetic */ C07013 this$0;

            AnonymousClass1(C07013 c07013, int i) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public /* bridge */ /* synthetic */ Object get(int i) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Iterator<? extends T> get(int i) {
            }
        }

        C07013(Iterable[] iterableArr) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    private static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        private FromIterableFunction() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public FluentIterable<E> apply(Iterable<E> iterable) {
        }
    }

    protected FluentIterable() {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
    }

    private static <T> FluentIterable<T> concatNoDefensiveCopy(Iterable<? extends T>... iterableArr) {
    }

    public static <E> FluentIterable<E> from(Iterable<E> iterable) {
    }

    private Iterable<E> getDelegate() {
    }

    @Beta
    public static <E> FluentIterable<E> of() {
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
    }

    @Beta
    public final FluentIterable<E> append(Iterable<? extends E> iterable) {
    }

    public final boolean contains(Object obj) {
    }

    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C copyInto(C c) {
    }

    public final FluentIterable<E> cycle() {
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
    }

    public final Optional<E> first() {
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
    }

    @ParametricNullness
    public final E get(int i) {
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> function) {
    }

    public final boolean isEmpty() {
    }

    @Beta
    public final String join(Joiner joiner) {
    }

    public final Optional<E> last() {
    }

    public final FluentIterable<E> limit(int i) {
    }

    public final int size() {
    }

    public final FluentIterable<E> skip(int i) {
    }

    @GwtIncompatible
    public final E[] toArray(Class<E> cls) {
    }

    public final ImmutableList<E> toList() {
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> function) {
    }

    public final ImmutableMultiset<E> toMultiset() {
    }

    public final ImmutableSet<E> toSet() {
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
    }

    public String toString() {
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
    }

    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> function) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
    }

    @Beta
    public static <E> FluentIterable<E> of(@ParametricNullness E e, E... eArr) {
    }

    @Beta
    public final FluentIterable<E> append(E... eArr) {
    }

    @GwtIncompatible
    public final <T> FluentIterable<T> filter(Class<T> cls) {
    }

    FluentIterable(Iterable<E> iterable) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends T>... iterableArr) {
    }

    @Beta
    public static <E> FluentIterable<E> from(E[] eArr) {
    }

    @Beta
    public static <T> FluentIterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
    }

    @InlineMe(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> fluentIterable) {
    }
}
