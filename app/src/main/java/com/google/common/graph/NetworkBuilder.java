package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.graph.ImmutableNetwork;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class NetworkBuilder<N, E> extends AbstractGraphBuilder<N> {
    boolean allowsParallelEdges;
    ElementOrder<? super E> edgeOrder;
    Optional<Integer> expectedEdgeCount;

    private NetworkBuilder(boolean z) {
    }

    private <N1 extends N, E1 extends E> NetworkBuilder<N1, E1> cast() {
    }

    public static NetworkBuilder<Object, Object> directed() {
    }

    public static <N, E> NetworkBuilder<N, E> from(Network<N, E> network) {
    }

    public static NetworkBuilder<Object, Object> undirected() {
    }

    public NetworkBuilder<N, E> allowsParallelEdges(boolean z) {
    }

    public NetworkBuilder<N, E> allowsSelfLoops(boolean z) {
    }

    public <N1 extends N, E1 extends E> MutableNetwork<N1, E1> build() {
    }

    public <E1 extends E> NetworkBuilder<N, E1> edgeOrder(ElementOrder<E1> elementOrder) {
    }

    public NetworkBuilder<N, E> expectedEdgeCount(int i) {
    }

    public NetworkBuilder<N, E> expectedNodeCount(int i) {
    }

    public <N1 extends N, E1 extends E> ImmutableNetwork.Builder<N1, E1> immutable() {
    }

    public <N1 extends N> NetworkBuilder<N1, E> nodeOrder(ElementOrder<N1> elementOrder) {
    }
}
