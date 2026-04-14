package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.graph.ImmutableGraph;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class GraphBuilder<N> extends AbstractGraphBuilder<N> {
    private GraphBuilder(boolean z) {
    }

    private <N1 extends N> GraphBuilder<N1> cast() {
    }

    public static GraphBuilder<Object> directed() {
    }

    public static <N> GraphBuilder<N> from(Graph<N> graph) {
    }

    public static GraphBuilder<Object> undirected() {
    }

    public GraphBuilder<N> allowsSelfLoops(boolean z) {
    }

    public <N1 extends N> MutableGraph<N1> build() {
    }

    GraphBuilder<N> copy() {
    }

    public GraphBuilder<N> expectedNodeCount(int i) {
    }

    public <N1 extends N> ImmutableGraph.Builder<N1> immutable() {
    }

    public <N1 extends N> GraphBuilder<N1> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
    }

    public <N1 extends N> GraphBuilder<N1> nodeOrder(ElementOrder<N1> elementOrder) {
    }
}
