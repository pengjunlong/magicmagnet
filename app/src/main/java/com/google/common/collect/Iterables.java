package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Iterables {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$1 */
    class C07231<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;

        C07231(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$10, reason: invalid class name */
    class AnonymousClass10<T> implements Function<Iterable<? extends T>, Iterator<? extends T>> {
        AnonymousClass10() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$2 */
    class C07242<T> extends FluentIterable<List<T>> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$size;

        C07242(Iterable iterable, int i) {
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$3 */
    class C07253<T> extends FluentIterable<List<T>> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$size;

        C07253(Iterable iterable, int i) {
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$4 */
    class C07264<T> extends FluentIterable<T> {
        final /* synthetic */ Predicate val$retainIfTrue;
        final /* synthetic */ Iterable val$unfiltered;

        C07264(Iterable iterable, Predicate predicate) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$5 */
    class C07275<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$fromIterable;
        final /* synthetic */ Function val$function;

        C07275(Iterable iterable, Function function) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$6 */
    class C07286<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$numberToSkip;

        /* renamed from: com.google.common.collect.Iterables$6$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<T> {
            boolean atStart;
            final /* synthetic */ Iterator val$iterator;

            AnonymousClass1(C07286 c07286, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        C07286(Iterable iterable, int i) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$7 */
    class C07297<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;
        final /* synthetic */ int val$limitSize;

        C07297(Iterable iterable, int i) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$8 */
    class C07308<T> extends FluentIterable<T> {
        final /* synthetic */ Iterable val$iterable;

        C07308(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$9 */
    class C07319<T> extends FluentIterable<T> {
        final /* synthetic */ Comparator val$comparator;
        final /* synthetic */ Iterable val$iterables;

        C07319(Iterable iterable, Comparator comparator) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    private static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        private final Iterable<? extends T> iterable;

        /* synthetic */ UnmodifiableIterable(Iterable iterable, C07231 c07231) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
        }

        private UnmodifiableIterable(Iterable<? extends T> iterable) {
        }
    }

    private Iterables() {
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    private static <E> Collection<E> castOrCopyToCollection(Iterable<E> iterable) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
    }

    public static <T> Iterable<T> consumingIterable(Iterable<T> iterable) {
    }

    public static boolean contains(Iterable<? extends Object> iterable, Object obj) {
    }

    public static <T> Iterable<T> cycle(Iterable<T> iterable) {
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    @ParametricNullness
    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
    }

    @ParametricNullness
    public static <T> T get(Iterable<T> iterable, int i) {
    }

    @ParametricNullness
    public static <T> T getFirst(Iterable<? extends T> iterable, @ParametricNullness T t) {
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<T> iterable) {
    }

    @ParametricNullness
    private static <T> T getLastInNonemptyList(List<T> list) {
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<T> iterable) {
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static boolean isEmpty(Iterable<?> iterable) {
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i) {
    }

    @Beta
    public static <T> Iterable<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
    }

    public static <T> Iterable<List<T>> paddedPartition(Iterable<T> iterable, int i) {
    }

    public static <T> Iterable<List<T>> partition(Iterable<T> iterable, int i) {
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
    }

    static <T> T removeFirstMatching(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    private static <T> boolean removeIfFromRandomAccessList(List<T> list, Predicate<? super T> predicate) {
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
    }

    public static int size(Iterable<?> iterable) {
    }

    public static <T> Iterable<T> skip(Iterable<T> iterable, int i) {
    }

    private static <T> void slowRemoveIfForRemainingElements(List<T> list, Predicate<? super T> predicate, int i, int i2) {
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
    }

    static <T> Function<Iterable<? extends T>, Iterator<? extends T>> toIterator() {
    }

    public static String toString(Iterable<?> iterable) {
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, Function<? super F, ? extends T> function) {
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
    }

    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
    }

    public static <T> T find(Iterable<? extends T> iterable, Predicate<? super T> predicate, T t) {
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<? extends T> iterable, @ParametricNullness T t) {
    }

    static <T> T[] toArray(Iterable<? extends T> iterable, T[] tArr) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
    }

    @GwtIncompatible
    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
    }

    static Object[] toArray(Iterable<?> iterable) {
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> immutableCollection) {
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
    }

    @ParametricNullness
    public static <T> T get(Iterable<? extends T> iterable, int i, @ParametricNullness T t) {
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<? extends T> iterable, @ParametricNullness T t) {
    }
}
