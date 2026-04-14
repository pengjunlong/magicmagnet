package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {
    private final transient ImmutableList<List<E>> axes;
    private final transient int[] axesSizeProduct;

    /* renamed from: com.google.common.collect.CartesianList$1 */
    class C06811 extends ImmutableList<E> {
        final /* synthetic */ CartesianList this$0;
        final /* synthetic */ int val$index;

        C06811(CartesianList cartesianList, int i) {
        }

        @Override // java.util.List
        public E get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    CartesianList(ImmutableList<List<E>> immutableList) {
    }

    static /* synthetic */ ImmutableList access$000(CartesianList cartesianList) {
    }

    static /* synthetic */ int access$100(CartesianList cartesianList, int i, int i2) {
    }

    static <E> List<List<E>> create(List<? extends List<? extends E>> list) {
    }

    private int getAxisIndexForProductIndex(int i, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ImmutableList<E> get(int i) {
    }
}
