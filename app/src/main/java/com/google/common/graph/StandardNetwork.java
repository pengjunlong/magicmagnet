package com.google.common.graph;

import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final ElementOrder<E> edgeOrder;
    final MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    final MapIteratorCache<N, NetworkConnections<N, E>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n) {
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
    }

    final NetworkConnections<N, E> checkedConnections(N n) {
    }

    final N checkedReferenceNode(E e) {
    }

    final boolean containsEdge(E e) {
    }

    final boolean containsNode(N n) {
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n) {
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e) {
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n) {
    }

    StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder, Map<N, NetworkConnections<N, E>> map, Map<E, N> map2) {
    }
}
