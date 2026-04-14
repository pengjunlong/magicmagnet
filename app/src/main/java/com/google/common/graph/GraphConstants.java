package com.google.common.graph;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class GraphConstants {
    static final int DEFAULT_EDGE_COUNT = 20;
    static final int DEFAULT_NODE_COUNT = 10;
    static final String EDGE_ALREADY_EXISTS = "Edge %s already exists in the graph.";
    static final String EDGE_NOT_IN_GRAPH = "Edge %s is not an element of this graph.";
    static final String ENDPOINTS_MISMATCH = "Mismatch: unordered endpoints cannot be used with directed graphs";
    static final int EXPECTED_DEGREE = 2;
    static final int INNER_CAPACITY = 2;
    static final float INNER_LOAD_FACTOR = 1.0f;
    static final String MULTIPLE_EDGES_CONNECTING = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";
    static final String NODE_NOT_IN_GRAPH = "Node %s is not an element of this graph.";
    static final String NOT_AVAILABLE_ON_UNDIRECTED = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";
    static final String PARALLEL_EDGES_NOT_ALLOWED = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";
    static final String REUSING_EDGE = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";
    static final String SELF_LOOPS_NOT_ALLOWED = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class Presence {
        private static final /* synthetic */ Presence[] $VALUES = null;
        public static final Presence EDGE_EXISTS = null;

        private static /* synthetic */ Presence[] $values() {
        }

        private Presence(String str, int i) {
        }

        public static Presence valueOf(String str) {
        }

        public static Presence[] values() {
        }
    }

    private GraphConstants() {
    }
}
