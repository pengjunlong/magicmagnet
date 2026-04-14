package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@Beta
@GwtCompatible
@Deprecated
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class TreeTraverser<T> {

    /* renamed from: com.google.common.collect.TreeTraverser$1 */
    class C08551 extends TreeTraverser<T> {
        final /* synthetic */ Function val$nodeToChildrenFunction;

        C08551(Function function) {
        }

        @Override // com.google.common.collect.TreeTraverser
        public Iterable<T> children(T t) {
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$2 */
    class C08562 extends FluentIterable<T> {
        final /* synthetic */ TreeTraverser this$0;
        final /* synthetic */ Object val$root;

        C08562(TreeTraverser treeTraverser, Object obj) {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.lang.Iterable
        public UnmodifiableIterator<T> iterator() {
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$3 */
    class C08573 extends FluentIterable<T> {
        final /* synthetic */ TreeTraverser this$0;
        final /* synthetic */ Object val$root;

        C08573(TreeTraverser treeTraverser, Object obj) {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.lang.Iterable
        public UnmodifiableIterator<T> iterator() {
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$4 */
    class C08584 extends FluentIterable<T> {
        final /* synthetic */ TreeTraverser this$0;
        final /* synthetic */ Object val$root;

        C08584(TreeTraverser treeTraverser, Object obj) {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.lang.Iterable
        public UnmodifiableIterator<T> iterator() {
        }
    }

    private final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {
        private final Queue<T> queue;
        final /* synthetic */ TreeTraverser this$0;

        BreadthFirstIterator(TreeTraverser treeTraverser, T t) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
        }
    }

    private final class PostOrderIterator extends AbstractIterator<T> {
        private final ArrayDeque<PostOrderNode<T>> stack;
        final /* synthetic */ TreeTraverser this$0;

        PostOrderIterator(TreeTraverser treeTraverser, T t) {
        }

        private PostOrderNode<T> expand(T t) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected T computeNext() {
        }
    }

    private static final class PostOrderNode<T> {
        final Iterator<T> childIterator;
        final T root;

        PostOrderNode(T t, Iterator<T> it) {
        }
    }

    private final class PreOrderIterator extends UnmodifiableIterator<T> {
        private final Deque<Iterator<T>> stack;
        final /* synthetic */ TreeTraverser this$0;

        PreOrderIterator(TreeTraverser treeTraverser, T t) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(Function<T, ? extends Iterable<T>> function) {
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(T t) {
    }

    public abstract Iterable<T> children(T t);

    UnmodifiableIterator<T> postOrderIterator(T t) {
    }

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(T t) {
    }

    UnmodifiableIterator<T> preOrderIterator(T t) {
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(T t) {
    }
}
