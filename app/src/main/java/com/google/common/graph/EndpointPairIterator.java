package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    private final BaseGraph<N> graph;
    N node;
    private final Iterator<N> nodeIterator;
    Iterator<N> successorIterator;

    private static final class Directed<N> extends EndpointPairIterator<N> {
        /* synthetic */ Directed(BaseGraph baseGraph, C08891 c08891) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ Object computeNext() {
        }

        private Directed(BaseGraph<N> baseGraph) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected EndpointPair<N> computeNext() {
        }
    }

    private static final class Undirected<N> extends EndpointPairIterator<N> {
        private Set<N> visitedNodes;

        /* synthetic */ Undirected(BaseGraph baseGraph, C08891 c08891) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ Object computeNext() {
        }

        private Undirected(BaseGraph<N> baseGraph) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected EndpointPair<N> computeNext() {
        }
    }

    /* synthetic */ EndpointPairIterator(BaseGraph baseGraph, C08891 c08891) {
    }

    static <N> EndpointPairIterator<N> of(BaseGraph<N> baseGraph) {
    }

    final boolean advance() {
    }

    private EndpointPairIterator(BaseGraph<N> baseGraph) {
    }
}
