package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class MultimapBuilder<K0, V0> {
    private static final int DEFAULT_EXPECTED_KEYS = 8;

    /* renamed from: com.google.common.collect.MultimapBuilder$1 */
    class C07701 extends MultimapBuilderWithKeys<Object> {
        final /* synthetic */ int val$expectedKeys;

        C07701(int i) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        <K, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$2 */
    class C07712 extends MultimapBuilderWithKeys<Object> {
        final /* synthetic */ int val$expectedKeys;

        C07712(int i) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        <K, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$3 */
    class C07723 extends MultimapBuilderWithKeys<K0> {
        final /* synthetic */ Comparator val$comparator;

        C07723(Comparator comparator) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        <K extends K0, V> Map<K, Collection<V>> createMap() {
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$4 */
    class C07734 extends MultimapBuilderWithKeys<K0> {
        final /* synthetic */ Class val$keyClass;

        C07734(Class cls) {
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        <K extends K0, V> Map<K, Collection<V>> createMap() {
        }
    }

    private static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        ArrayListSupplier(int i) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public List<V> get() {
        }
    }

    private static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {
        private final Class<V> clazz;

        EnumSetSupplier(Class<V> cls) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
        }
    }

    private static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        HashSetSupplier(int i) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
        }
    }

    private static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        LinkedHashSetSupplier(int i) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LinkedListSupplier implements Supplier<List<?>> {
        private static final /* synthetic */ LinkedListSupplier[] $VALUES = null;
        public static final LinkedListSupplier INSTANCE = null;

        private static /* synthetic */ LinkedListSupplier[] $values() {
        }

        private LinkedListSupplier(String str, int i) {
        }

        public static <V> Supplier<List<V>> instance() {
        }

        public static LinkedListSupplier valueOf(String str) {
        }

        public static LinkedListSupplier[] values() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ List<?> get() {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public List<?> get2() {
        }
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        ListMultimapBuilder() {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    public static abstract class MultimapBuilderWithKeys<K0> {
        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1 */
        class C07741 extends ListMultimapBuilder<K0, Object> {
            final /* synthetic */ MultimapBuilderWithKeys this$0;
            final /* synthetic */ int val$expectedValuesPerKey;

            C07741(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> ListMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2 */
        class C07752 extends ListMultimapBuilder<K0, Object> {
            final /* synthetic */ MultimapBuilderWithKeys this$0;

            C07752(MultimapBuilderWithKeys multimapBuilderWithKeys) {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> ListMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3 */
        class C07763 extends SetMultimapBuilder<K0, Object> {
            final /* synthetic */ MultimapBuilderWithKeys this$0;
            final /* synthetic */ int val$expectedValuesPerKey;

            C07763(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> SetMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4 */
        class C07774 extends SetMultimapBuilder<K0, Object> {
            final /* synthetic */ MultimapBuilderWithKeys this$0;
            final /* synthetic */ int val$expectedValuesPerKey;

            C07774(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V> SetMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5 */
        class C07785 extends SortedSetMultimapBuilder<K0, V0> {
            final /* synthetic */ MultimapBuilderWithKeys this$0;
            final /* synthetic */ Comparator val$comparator;

            C07785(MultimapBuilderWithKeys multimapBuilderWithKeys, Comparator comparator) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ SetMultimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6 */
        class C07796 extends SetMultimapBuilder<K0, V0> {
            final /* synthetic */ MultimapBuilderWithKeys this$0;
            final /* synthetic */ Class val$valueClass;

            C07796(MultimapBuilderWithKeys multimapBuilderWithKeys, Class cls) {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public /* bridge */ /* synthetic */ Multimap build() {
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public <K extends K0, V extends V0> SetMultimap<K, V> build() {
            }
        }

        MultimapBuilderWithKeys() {
        }

        public ListMultimapBuilder<K0, Object> arrayListValues() {
        }

        abstract <K extends K0, V> Map<K, Collection<V>> createMap();

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(Class<V0> cls) {
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(int i) {
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(int i) {
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(int i) {
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(Comparator<V0> comparator) {
        }
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        SetMultimapBuilder() {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        SortedSetMultimapBuilder() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ Multimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ SetMultimap build() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public /* bridge */ /* synthetic */ SetMultimap build(Multimap multimap) {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    private static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        TreeSetSupplier(Comparator<? super V> comparator) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
        }

        @Override // com.google.common.base.Supplier
        public SortedSet<V> get() {
        }
    }

    /* synthetic */ MultimapBuilder(C07701 c07701) {
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(Class<K0> cls) {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
    }

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
    }

    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(int i) {
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(int i) {
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(Comparator<K0> comparator) {
    }
}
