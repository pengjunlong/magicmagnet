package com.google.common.graph;

import com.google.common.base.Optional;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractGraphBuilder<N> {
    boolean allowsSelfLoops;
    final boolean directed;
    Optional<Integer> expectedNodeCount;
    ElementOrder<N> incidentEdgeOrder;
    ElementOrder<N> nodeOrder;

    AbstractGraphBuilder(boolean z) {
    }
}
