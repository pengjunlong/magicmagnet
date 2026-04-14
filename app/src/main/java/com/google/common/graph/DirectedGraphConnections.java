package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private static final Object PRED = null;
    private final Map<N, Object> adjacentNodeValues;
    private final List<NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    /* renamed from: com.google.common.graph.DirectedGraphConnections$1 */
    class C08781 extends AbstractSet<N> {
        final /* synthetic */ DirectedGraphConnections this$0;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;
            final /* synthetic */ Set val$seenNodes;

            AnonymousClass1(C08781 c08781, Iterator it, Set set) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        C08781(DirectedGraphConnections directedGraphConnections) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$2 */
    class C08792 extends AbstractSet<N> {
        final /* synthetic */ DirectedGraphConnections this$0;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$entries;

            AnonymousClass1(C08792 c08792, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;

            AnonymousClass2(C08792 c08792, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        C08792(DirectedGraphConnections directedGraphConnections) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$3 */
    class C08803 extends AbstractSet<N> {
        final /* synthetic */ DirectedGraphConnections this$0;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$entries;

            AnonymousClass1(C08803 c08803, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;

            AnonymousClass2(C08803 c08803, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        C08803(DirectedGraphConnections directedGraphConnections) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$4 */
    class C08814 implements Function<N, EndpointPair<N>> {
        final /* synthetic */ Object val$thisNode;

        C08814(DirectedGraphConnections directedGraphConnections, Object obj) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // com.google.common.base.Function
        public EndpointPair<N> apply(N n) {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    class C08825 implements Function<N, EndpointPair<N>> {
        final /* synthetic */ Object val$thisNode;

        C08825(DirectedGraphConnections directedGraphConnections, Object obj) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // com.google.common.base.Function
        public EndpointPair<N> apply(N n) {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$6 */
    class C08836 implements Function<NodeConnection<N>, EndpointPair<N>> {
        final /* synthetic */ Object val$thisNode;

        C08836(DirectedGraphConnections directedGraphConnections, Object obj) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public EndpointPair<N> apply(NodeConnection<N> nodeConnection) {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$7 */
    class C08847 extends AbstractIterator<EndpointPair<N>> {
        final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
        final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

        C08847(DirectedGraphConnections directedGraphConnections, Iterator it, AtomicBoolean atomicBoolean) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ Object computeNext() {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected EndpointPair<N> computeNext() {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$8 */
    static /* synthetic */ class C08858 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;
    }

    private static abstract class NodeConnection<N> {
        final N node;

        static final class Pred<N> extends NodeConnection<N> {
            Pred(N n) {
            }

            public boolean equals(Object obj) {
            }

            public int hashCode() {
            }
        }

        static final class Succ<N> extends NodeConnection<N> {
            Succ(N n) {
            }

            public boolean equals(Object obj) {
            }

            public int hashCode() {
            }
        }

        NodeConnection(N n) {
        }
    }

    private static final class PredAndSucc {
        private final Object successorValue;

        PredAndSucc(Object obj) {
        }

        static /* synthetic */ Object access$600(PredAndSucc predAndSucc) {
        }
    }

    private DirectedGraphConnections(Map<N, Object> map, List<NodeConnection<N>> list, int i, int i2) {
    }

    static /* synthetic */ List access$000(DirectedGraphConnections directedGraphConnections) {
    }

    static /* synthetic */ Map access$100(DirectedGraphConnections directedGraphConnections) {
    }

    static /* synthetic */ boolean access$200(Object obj) {
    }

    static /* synthetic */ int access$300(DirectedGraphConnections directedGraphConnections) {
    }

    static /* synthetic */ boolean access$400(Object obj) {
    }

    static /* synthetic */ int access$500(DirectedGraphConnections directedGraphConnections) {
    }

    private static boolean isPredecessor(Object obj) {
    }

    private static boolean isSuccessor(Object obj) {
    }

    static <N, V> DirectedGraphConnections<N, V> of(ElementOrder<N> elementOrder) {
    }

    static <N, V> DirectedGraphConnections<N, V> ofImmutable(N n, Iterable<EndpointPair<N>> iterable, Function<N, V> function) {
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(N n) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(Object obj) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n) {
    }
}
