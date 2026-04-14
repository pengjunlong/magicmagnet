package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;

@Immutable(containerOf = {"N"})
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class EndpointPair<N> implements Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    private static final class Ordered<N> extends EndpointPair<N> {
        /* synthetic */ Ordered(Object obj, Object obj2, C08881 c08881) {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
        }

        public String toString() {
        }

        private Ordered(N n, N n2) {
        }
    }

    private static final class Unordered<N> extends EndpointPair<N> {
        /* synthetic */ Unordered(Object obj, Object obj2, C08881 c08881) {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
        }

        public String toString() {
        }

        private Unordered(N n, N n2) {
        }
    }

    /* synthetic */ EndpointPair(Object obj, Object obj2, C08881 c08881) {
    }

    static <N> EndpointPair<N> of(Graph<?> graph, N n, N n2) {
    }

    public static <N> EndpointPair<N> ordered(N n, N n2) {
    }

    public static <N> EndpointPair<N> unordered(N n, N n2) {
    }

    public final N adjacentNode(N n) {
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    public final N nodeU() {
    }

    public final N nodeV() {
    }

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n, N n2) {
    }

    static <N> EndpointPair<N> of(Network<?, ?> network, N n, N n2) {
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
    }
}
