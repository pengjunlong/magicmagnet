package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1 */
    class C08731 extends AbstractGraph<N> {
        final /* synthetic */ AbstractNetwork this$0;

        /* renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractSet<EndpointPair<N>> {
            final /* synthetic */ C08731 this$1;

            /* renamed from: com.google.common.graph.AbstractNetwork$1$1$1, reason: invalid class name and collision with other inner class name */
            class C20071 implements Function<E, EndpointPair<N>> {
                final /* synthetic */ AnonymousClass1 this$2;

                C20071(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public EndpointPair<N> apply(E e) {
                }
            }

            AnonymousClass1(C08731 c08731) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        C08731(AbstractNetwork abstractNetwork) {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n) {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public ElementOrder<N> incidentEdgeOrder() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n) {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n) {
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$2 */
    class C08742 implements Predicate<E> {
        final /* synthetic */ AbstractNetwork this$0;
        final /* synthetic */ Object val$nodePresent;
        final /* synthetic */ Object val$nodeToCheck;

        C08742(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(E e) {
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$3 */
    class C08753 implements Function<E, EndpointPair<N>> {
        final /* synthetic */ Network val$network;

        C08753(Network network) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // com.google.common.base.Function
        public EndpointPair<N> apply(E e) {
        }
    }

    private Predicate<E> connectedPredicate(N n, N n2) {
    }

    private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(Network<N, E> network) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e) {
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
    }

    @Override // com.google.common.graph.Network
    public int degree(N n) {
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(N n, N n2) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(Object obj) {
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n) {
    }

    protected final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n) {
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
    }

    public String toString() {
    }

    protected final void validateEndpoints(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
    }
}
