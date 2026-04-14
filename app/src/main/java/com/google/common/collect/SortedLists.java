package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.Comparator;
import java.util.List;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SortedLists {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static abstract class KeyAbsentBehavior {
        private static final /* synthetic */ KeyAbsentBehavior[] $VALUES = null;
        public static final KeyAbsentBehavior INVERTED_INSERTION_INDEX = null;
        public static final KeyAbsentBehavior NEXT_HIGHER = null;
        public static final KeyAbsentBehavior NEXT_LOWER = null;

        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$1 */
        enum C08101 extends KeyAbsentBehavior {
            C08101(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            int resultIndex(int i) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$2 */
        enum C08112 extends KeyAbsentBehavior {
            C08112(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$3 */
        enum C08123 extends KeyAbsentBehavior {
            C08123(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i) {
            }
        }

        private static /* synthetic */ KeyAbsentBehavior[] $values() {
        }

        private KeyAbsentBehavior(String str, int i) {
        }

        public static KeyAbsentBehavior valueOf(String str) {
        }

        public static KeyAbsentBehavior[] values() {
        }

        abstract int resultIndex(int i);

        /* synthetic */ KeyAbsentBehavior(String str, int i, C08091 c08091) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static abstract class KeyPresentBehavior {
        private static final /* synthetic */ KeyPresentBehavior[] $VALUES = null;
        public static final KeyPresentBehavior ANY_PRESENT = null;
        public static final KeyPresentBehavior FIRST_AFTER = null;
        public static final KeyPresentBehavior FIRST_PRESENT = null;
        public static final KeyPresentBehavior LAST_BEFORE = null;
        public static final KeyPresentBehavior LAST_PRESENT = null;

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$1 */
        enum C08131 extends KeyPresentBehavior {
            C08131(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$2 */
        enum C08142 extends KeyPresentBehavior {
            C08142(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$3 */
        enum C08153 extends KeyPresentBehavior {
            C08153(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$4 */
        enum C08164 extends KeyPresentBehavior {
            C08164(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$5 */
        enum C08175 extends KeyPresentBehavior {
            C08175(String str, int i) {
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
            }
        }

        private static /* synthetic */ KeyPresentBehavior[] $values() {
        }

        private KeyPresentBehavior(String str, int i) {
        }

        public static KeyPresentBehavior valueOf(String str) {
        }

        public static KeyPresentBehavior[] values() {
        }

        abstract <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i);

        /* synthetic */ KeyPresentBehavior(String str, int i, C08091 c08091) {
        }
    }

    private SortedLists() {
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, Function<? super E, K> function, K k, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }

    public static <E, K> int binarySearch(List<E> list, Function<? super E, K> function, @ParametricNullness K k, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }

    public static <E> int binarySearch(List<? extends E> list, @ParametricNullness E e, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
    }
}
