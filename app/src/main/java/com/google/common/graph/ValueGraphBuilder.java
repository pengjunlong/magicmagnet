package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.graph.ImmutableValueGraph;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ValueGraphBuilder<N, V> extends AbstractGraphBuilder<N> {
    private ValueGraphBuilder(boolean z) {
    }

    private <N1 extends N, V1 extends V> ValueGraphBuilder<N1, V1> cast() {
    }

    public static ValueGraphBuilder<Object, Object> directed() {
    }

    public static <N, V> ValueGraphBuilder<N, V> from(ValueGraph<N, V> valueGraph) {
    }

    public static ValueGraphBuilder<Object, Object> undirected() {
    }

    public ValueGraphBuilder<N, V> allowsSelfLoops(boolean z) {
    }

    public <N1 extends N, V1 extends V> MutableValueGraph<N1, V1> build() {
    }

    ValueGraphBuilder<N, V> copy() {
    }

    public ValueGraphBuilder<N, V> expectedNodeCount(int i) {
    }

    public <N1 extends N, V1 extends V> ImmutableValueGraph.Builder<N1, V1> immutable() {
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> nodeOrder(ElementOrder<N1> elementOrder) {
    }
}
