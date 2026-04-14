package com.google.common.graph;

import com.google.common.base.Function;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private final Map<N, V> adjacentNodeValues;

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$1 */
    class C09091 implements Function<N, EndpointPair<N>> {
        final /* synthetic */ Object val$thisNode;

        C09091(UndirectedGraphConnections undirectedGraphConnections, Object obj) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // com.google.common.base.Function
        public EndpointPair<N> apply(N n) {
        }
    }

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$2 */
    static /* synthetic */ class C09102 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;
    }

    private UndirectedGraphConnections(Map<N, V> map) {
    }

    static <N, V> UndirectedGraphConnections<N, V> of(ElementOrder<N> elementOrder) {
    }

    static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> map) {
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(N n) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(N n) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n) {
    }
}
