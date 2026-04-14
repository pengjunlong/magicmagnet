package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class TypeResolver {
    private final TypeTable typeTable;

    /* renamed from: com.google.common.reflect.TypeResolver$1 */
    class C09681 extends TypeVisitor {
        final /* synthetic */ Map val$mappings;
        final /* synthetic */ Type val$to;

        C09681(Map map, Type type) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitClass(Class<?> cls) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitGenericArrayType(GenericArrayType genericArrayType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitParameterizedType(ParameterizedType parameterizedType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitTypeVariable(TypeVariable<?> typeVariable) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitWildcardType(WildcardType wildcardType) {
        }
    }

    private static final class TypeMappingIntrospector extends TypeVisitor {
        private final Map<TypeVariableKey, Type> mappings;

        private TypeMappingIntrospector() {
        }

        static ImmutableMap<TypeVariableKey, Type> getTypeMappings(Type type) {
        }

        private void map(TypeVariableKey typeVariableKey, Type type) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitClass(Class<?> cls) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitParameterizedType(ParameterizedType parameterizedType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitTypeVariable(TypeVariable<?> typeVariable) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitWildcardType(WildcardType wildcardType) {
        }
    }

    static final class TypeVariableKey {
        private final TypeVariable<?> var;

        TypeVariableKey(TypeVariable<?> typeVariable) {
        }

        private boolean equalsTypeVariable(TypeVariable<?> typeVariable) {
        }

        static TypeVariableKey forLookup(Type type) {
        }

        public boolean equals(Object obj) {
        }

        boolean equalsType(Type type) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static class WildcardCapturer {
        static final WildcardCapturer INSTANCE = null;
        private final AtomicInteger id;

        /* renamed from: com.google.common.reflect.TypeResolver$WildcardCapturer$1 */
        class C09701 extends WildcardCapturer {
            final /* synthetic */ TypeVariable val$typeParam;

            C09701(WildcardCapturer wildcardCapturer, AtomicInteger atomicInteger, TypeVariable typeVariable) {
            }

            @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
            TypeVariable<?> captureAsTypeVariable(Type[] typeArr) {
            }
        }

        /* synthetic */ WildcardCapturer(AtomicInteger atomicInteger, C09681 c09681) {
        }

        private Type captureNullable(Type type) {
        }

        private WildcardCapturer forTypeVariable(TypeVariable<?> typeVariable) {
        }

        private WildcardCapturer notForTypeVariable() {
        }

        final Type capture(Type type) {
        }

        TypeVariable<?> captureAsTypeVariable(Type[] typeArr) {
        }

        private WildcardCapturer() {
        }

        private WildcardCapturer(AtomicInteger atomicInteger) {
        }
    }

    /* synthetic */ TypeResolver(TypeTable typeTable, C09681 c09681) {
    }

    static /* synthetic */ void access$000(Map map, Type type, Type type2) {
    }

    static /* synthetic */ Object access$100(Class cls, Object obj) {
    }

    static /* synthetic */ Type[] access$300(TypeResolver typeResolver, Type[] typeArr) {
    }

    static TypeResolver covariantly(Type type) {
    }

    private static <T> T expectArgument(Class<T> cls, Object obj) {
    }

    static TypeResolver invariantly(Type type) {
    }

    private static void populateTypeMappings(Map<TypeVariableKey, Type> map, Type type, Type type2) {
    }

    private Type resolveGenericArrayType(GenericArrayType genericArrayType) {
    }

    private ParameterizedType resolveParameterizedType(ParameterizedType parameterizedType) {
    }

    private Type[] resolveTypes(Type[] typeArr) {
    }

    private WildcardType resolveWildcardType(WildcardType wildcardType) {
    }

    public Type resolveType(Type type) {
    }

    Type[] resolveTypesInPlace(Type[] typeArr) {
    }

    public TypeResolver where(Type type, Type type2) {
    }

    private static class TypeTable {
        private final ImmutableMap<TypeVariableKey, Type> map;

        /* renamed from: com.google.common.reflect.TypeResolver$TypeTable$1 */
        class C09691 extends TypeTable {
            final /* synthetic */ TypeTable val$unguarded;
            final /* synthetic */ TypeVariable val$var;

            C09691(TypeTable typeTable, TypeVariable typeVariable, TypeTable typeTable2) {
            }

            @Override // com.google.common.reflect.TypeResolver.TypeTable
            public Type resolveInternal(TypeVariable<?> typeVariable, TypeTable typeTable) {
            }
        }

        TypeTable() {
        }

        final Type resolve(TypeVariable<?> typeVariable) {
        }

        Type resolveInternal(TypeVariable<?> typeVariable, TypeTable typeTable) {
        }

        final TypeTable where(Map<TypeVariableKey, ? extends Type> map) {
        }

        private TypeTable(ImmutableMap<TypeVariableKey, Type> immutableMap) {
        }
    }

    public TypeResolver() {
    }

    private TypeResolver(TypeTable typeTable) {
    }

    TypeResolver where(Map<TypeVariableKey, ? extends Type> map) {
    }
}
