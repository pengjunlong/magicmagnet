package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {
    private final Map<E, ?> outEdgeToNode;
    private final Object targetNode;

    /* renamed from: com.google.common.graph.MultiEdgesConnecting$1 */
    class C08961 extends AbstractIterator<E> {
        final /* synthetic */ MultiEdgesConnecting this$0;
        final /* synthetic */ Iterator val$entries;

        C08961(MultiEdgesConnecting multiEdgesConnecting, Iterator it) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected E computeNext() {
        }
    }

    MultiEdgesConnecting(Map<E, ?> map, Object obj) {
    }

    static /* synthetic */ Object access$000(MultiEdgesConnecting multiEdgesConnecting) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
    }
}
