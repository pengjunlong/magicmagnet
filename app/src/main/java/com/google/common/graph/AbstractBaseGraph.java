package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* renamed from: com.google.common.graph.AbstractBaseGraph$1 */
    class C08701 extends AbstractSet<EndpointPair<N>> {
        final /* synthetic */ AbstractBaseGraph this$0;

        C08701(AbstractBaseGraph abstractBaseGraph) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2 */
    class C08712 extends IncidentEdgeSet<N> {

        /* renamed from: com.google.common.graph.AbstractBaseGraph$2$1, reason: invalid class name */
        class AnonymousClass1 implements Function<N, EndpointPair<N>> {
            final /* synthetic */ C08712 this$1;

            AnonymousClass1(C08712 c08712) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            @Override // com.google.common.base.Function
            public EndpointPair<N> apply(N n) {
            }
        }

        /* renamed from: com.google.common.graph.AbstractBaseGraph$2$2, reason: invalid class name */
        class AnonymousClass2 implements Function<N, EndpointPair<N>> {
            final /* synthetic */ C08712 this$1;

            AnonymousClass2(C08712 c08712) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            @Override // com.google.common.base.Function
            public EndpointPair<N> apply(N n) {
            }
        }

        /* renamed from: com.google.common.graph.AbstractBaseGraph$2$3, reason: invalid class name */
        class AnonymousClass3 implements Function<N, EndpointPair<N>> {
            final /* synthetic */ C08712 this$1;

            AnonymousClass3(C08712 c08712) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            @Override // com.google.common.base.Function
            public EndpointPair<N> apply(N n) {
            }
        }

        C08712(AbstractBaseGraph abstractBaseGraph, BaseGraph baseGraph, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
        }
    }

    AbstractBaseGraph() {
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n) {
    }

    protected long edgeCount() {
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n) {
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n) {
    }

    protected final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n) {
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
    }

    protected final void validateEndpoints(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
    }
}
