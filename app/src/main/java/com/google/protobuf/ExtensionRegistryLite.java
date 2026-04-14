package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    private static class ExtensionClassHolder {
        static final Class<?> INSTANCE = null;

        private ExtensionClassHolder() {
        }

        static Class<?> resolveExtensionClass() {
        }
    }

    private static final class ObjectIntPair {
        private final int number;
        private final Object object;

        ObjectIntPair(Object obj, int i) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    ExtensionRegistryLite() {
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
    }

    public static boolean isEagerlyParseMessageSets() {
    }

    public static ExtensionRegistryLite newInstance() {
    }

    public static void setEagerlyParseMessageSets(boolean z) {
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
    }

    public ExtensionRegistryLite getUnmodifiable() {
    }

    ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
    }

    ExtensionRegistryLite(boolean z) {
    }
}
