package com.google.common.graph;

import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DirectedNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    DirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i) {
    }

    static <N, E> DirectedNetworkConnections<N, E> of() {
    }

    static <N, E> DirectedNetworkConnections<N, E> ofImmutable(Map<E, N> map, Map<E, N> map2, int i) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
    }
}
