package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
@DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Traverser<N> {
    private final SuccessorsFunction<N> successorFunction;

    /* renamed from: com.google.common.graph.Traverser$1 */
    class C08981 extends Traverser<N> {
        final /* synthetic */ SuccessorsFunction val$graph;

        C08981(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
        }

        @Override // com.google.common.graph.Traverser
        Traversal<N> newTraversal() {
        }
    }

    /* renamed from: com.google.common.graph.Traverser$2 */
    class C08992 extends Traverser<N> {
        final /* synthetic */ SuccessorsFunction val$tree;

        C08992(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
        }

        @Override // com.google.common.graph.Traverser
        Traversal<N> newTraversal() {
        }
    }

    /* renamed from: com.google.common.graph.Traverser$3 */
    class C09003 implements Iterable<N> {
        final /* synthetic */ Traverser this$0;
        final /* synthetic */ ImmutableSet val$validated;

        C09003(Traverser traverser, ImmutableSet immutableSet) {
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.Traverser$4 */
    class C09014 implements Iterable<N> {
        final /* synthetic */ Traverser this$0;
        final /* synthetic */ ImmutableSet val$validated;

        C09014(Traverser traverser, ImmutableSet immutableSet) {
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.Traverser$5 */
    class C09025 implements Iterable<N> {
        final /* synthetic */ Traverser this$0;
        final /* synthetic */ ImmutableSet val$validated;

        C09025(Traverser traverser, ImmutableSet immutableSet) {
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class InsertionOrder {
        private static final /* synthetic */ InsertionOrder[] $VALUES = null;
        public static final InsertionOrder BACK = null;
        public static final InsertionOrder FRONT = null;

        /* renamed from: com.google.common.graph.Traverser$InsertionOrder$1 */
        enum C09031 extends InsertionOrder {
            C09031(String str, int i) {
            }

            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(Deque<T> deque, T t) {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$InsertionOrder$2 */
        enum C09042 extends InsertionOrder {
            C09042(String str, int i) {
            }

            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(Deque<T> deque, T t) {
            }
        }

        private static /* synthetic */ InsertionOrder[] $values() {
        }

        private InsertionOrder(String str, int i) {
        }

        public static InsertionOrder valueOf(String str) {
        }

        public static InsertionOrder[] values() {
        }

        abstract <T> void insertInto(Deque<T> deque, T t);

        /* synthetic */ InsertionOrder(String str, int i, C08981 c08981) {
        }
    }

    private static abstract class Traversal<N> {
        final SuccessorsFunction<N> successorFunction;

        /* renamed from: com.google.common.graph.Traverser$Traversal$1 */
        class C09051 extends Traversal<N> {
            final /* synthetic */ Set val$visited;

            C09051(SuccessorsFunction successorsFunction, Set set) {
            }

            @Override // com.google.common.graph.Traverser.Traversal
            N visitNext(Deque<Iterator<? extends N>> deque) {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$Traversal$2 */
        class C09062 extends Traversal<N> {
            C09062(SuccessorsFunction successorsFunction) {
            }

            @Override // com.google.common.graph.Traverser.Traversal
            N visitNext(Deque<Iterator<? extends N>> deque) {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$Traversal$3 */
        class C09073 extends AbstractIterator<N> {
            final /* synthetic */ Traversal this$0;
            final /* synthetic */ Deque val$horizon;
            final /* synthetic */ InsertionOrder val$order;

            C09073(Traversal traversal, Deque deque, InsertionOrder insertionOrder) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$Traversal$4 */
        class C09084 extends AbstractIterator<N> {
            final /* synthetic */ Traversal this$0;
            final /* synthetic */ Deque val$ancestorStack;
            final /* synthetic */ Deque val$horizon;

            C09084(Traversal traversal, Deque deque, Deque deque2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
            }
        }

        Traversal(SuccessorsFunction<N> successorsFunction) {
        }

        static <N> Traversal<N> inGraph(SuccessorsFunction<N> successorsFunction) {
        }

        static <N> Traversal<N> inTree(SuccessorsFunction<N> successorsFunction) {
        }

        private Iterator<N> topDown(Iterator<? extends N> it, InsertionOrder insertionOrder) {
        }

        final Iterator<N> breadthFirst(Iterator<? extends N> it) {
        }

        final Iterator<N> postOrder(Iterator<? extends N> it) {
        }

        final Iterator<N> preOrder(Iterator<? extends N> it) {
        }

        abstract N visitNext(Deque<Iterator<? extends N>> deque);
    }

    /* synthetic */ Traverser(SuccessorsFunction successorsFunction, C08981 c08981) {
    }

    public static <N> Traverser<N> forGraph(SuccessorsFunction<N> successorsFunction) {
    }

    public static <N> Traverser<N> forTree(SuccessorsFunction<N> successorsFunction) {
    }

    private ImmutableSet<N> validate(Iterable<? extends N> iterable) {
    }

    public final Iterable<N> breadthFirst(N n) {
    }

    public final Iterable<N> depthFirstPostOrder(N n) {
    }

    public final Iterable<N> depthFirstPreOrder(N n) {
    }

    abstract Traversal<N> newTraversal();

    private Traverser(SuccessorsFunction<N> successorsFunction) {
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
    }
}
