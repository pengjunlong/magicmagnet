package com.google.common.graph;

import com.google.common.graph.GraphConstants;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class StandardMutableGraph<N> extends ForwardingGraph<N> implements MutableGraph<N> {
    private final MutableValueGraph<N, GraphConstants.Presence> backingValueGraph;

    StandardMutableGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N n) {
    }

    @Override // com.google.common.graph.ForwardingGraph
    BaseGraph<N> delegate() {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N n, N n2) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N n, N n2) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N n) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(EndpointPair<N> endpointPair) {
    }
}
