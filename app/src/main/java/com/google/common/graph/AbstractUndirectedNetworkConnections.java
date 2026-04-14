package com.google.common.graph;

import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> incidentEdgeMap;

    AbstractUndirectedNetworkConnections(Map<E, N> map) {
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
    public Set<E> inEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
    }
}
