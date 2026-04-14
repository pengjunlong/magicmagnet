package com.google.firebase.components;

import java.util.List;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CycleDetector {

    private static class ComponentNode {
        private final Component<?> component;
        private final Set<ComponentNode> dependencies;
        private final Set<ComponentNode> dependents;

        ComponentNode(Component<?> component) {
        }

        void addDependency(ComponentNode componentNode) {
        }

        void addDependent(ComponentNode componentNode) {
        }

        Component<?> getComponent() {
        }

        Set<ComponentNode> getDependencies() {
        }

        boolean isLeaf() {
        }

        boolean isRoot() {
        }

        void removeDependent(ComponentNode componentNode) {
        }
    }

    private static class Dep {
        private final Class<?> anInterface;
        private final boolean set;

        /* synthetic */ Dep(Class cls, boolean z, C10891 c10891) {
        }

        static /* synthetic */ boolean access$100(Dep dep) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private Dep(Class<?> cls, boolean z) {
        }
    }

    CycleDetector() {
    }

    static void detect(List<Component<?>> list) {
    }

    private static Set<ComponentNode> getRoots(Set<ComponentNode> set) {
    }

    private static Set<ComponentNode> toGraph(List<Component<?>> list) {
    }
}
