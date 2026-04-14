package com.google.common.graph;

import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {

    @LazyInit
    private transient Reference<Multiset<N>> adjacentNodesReference;

    /* renamed from: com.google.common.graph.UndirectedMultiNetworkConnections$1 */
    class C09111 extends MultiEdgesConnecting<E> {
        final /* synthetic */ UndirectedMultiNetworkConnections this$0;
        final /* synthetic */ Object val$node;

        C09111(UndirectedMultiNetworkConnections undirectedMultiNetworkConnections, Map map, Object obj, Object obj2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    private UndirectedMultiNetworkConnections(Map<E, N> map) {
    }

    static /* synthetic */ Multiset access$000(UndirectedMultiNetworkConnections undirectedMultiNetworkConnections) {
    }

    private Multiset<N> adjacentNodesMultiset() {
    }

    private static <T> T getReference(Reference<T> reference) {
    }

    static <N, E> UndirectedMultiNetworkConnections<N, E> of() {
    }

    static <N, E> UndirectedMultiNetworkConnections<N, E> ofImmutable(Map<E, N> map) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
    }
}
