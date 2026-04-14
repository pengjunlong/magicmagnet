package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> inEdgeMap;
    final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    /* renamed from: com.google.common.graph.AbstractDirectedNetworkConnections$1 */
    class C08721 extends AbstractSet<E> {
        final /* synthetic */ AbstractDirectedNetworkConnections this$0;

        C08721(AbstractDirectedNetworkConnections abstractDirectedNetworkConnections) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i) {
    }

    static /* synthetic */ int access$000(AbstractDirectedNetworkConnections abstractDirectedNetworkConnections) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
    }
}
