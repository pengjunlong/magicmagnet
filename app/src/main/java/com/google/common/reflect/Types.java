package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Types {
    private static final Joiner COMMA_JOINER = null;
    private static final Function<Type, String> TYPE_NAME = null;

    /* renamed from: com.google.common.reflect.Types$1 */
    class C09821 implements Function<Type, String> {
        C09821() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(Type type) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public String apply2(Type type) {
        }
    }

    /* renamed from: com.google.common.reflect.Types$2 */
    class C09832 extends TypeVisitor {
        final /* synthetic */ AtomicReference val$result;

        C09832(AtomicReference atomicReference) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitClass(Class<?> cls) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitGenericArrayType(GenericArrayType genericArrayType) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitTypeVariable(TypeVariable<?> typeVariable) {
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitWildcardType(WildcardType wildcardType) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class ClassOwnership {
        private static final /* synthetic */ ClassOwnership[] $VALUES = null;
        static final ClassOwnership JVM_BEHAVIOR = null;
        public static final ClassOwnership LOCAL_CLASS_HAS_NO_OWNER = null;
        public static final ClassOwnership OWNED_BY_ENCLOSING_CLASS = null;

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1 */
        enum C09841 extends ClassOwnership {
            C09841(String str, int i) {
            }

            @Override // com.google.common.reflect.Types.ClassOwnership
            Class<?> getOwnerType(Class<?> cls) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1LocalClass, reason: invalid class name */
        class C1LocalClass<T> {
            C1LocalClass() {
            }
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$2 */
        enum C09852 extends ClassOwnership {
            C09852(String str, int i) {
            }

            @Override // com.google.common.reflect.Types.ClassOwnership
            Class<?> getOwnerType(Class<?> cls) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$3 */
        class C09863 extends C1LocalClass<String> {
            C09863() {
            }
        }

        private static /* synthetic */ ClassOwnership[] $values() {
        }

        private ClassOwnership(String str, int i) {
        }

        private static ClassOwnership detectJvmBehavior() {
        }

        public static ClassOwnership valueOf(String str) {
        }

        public static ClassOwnership[] values() {
        }

        abstract Class<?> getOwnerType(Class<?> cls);

        /* synthetic */ ClassOwnership(String str, int i, C09821 c09821) {
        }
    }

    private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        GenericArrayTypeImpl(Type type) {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static abstract class JavaVersion {
        private static final /* synthetic */ JavaVersion[] $VALUES = null;
        static final JavaVersion CURRENT = null;
        public static final JavaVersion JAVA6 = null;
        public static final JavaVersion JAVA7 = null;
        public static final JavaVersion JAVA8 = null;
        public static final JavaVersion JAVA9 = null;

        /* renamed from: com.google.common.reflect.Types$JavaVersion$1 */
        enum C09871 extends JavaVersion {
            C09871(String str, int i) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* bridge */ /* synthetic */ Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            GenericArrayType newArrayType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$2 */
        enum C09882 extends JavaVersion {
            C09882(String str, int i) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$3 */
        enum C09893 extends JavaVersion {
            C09893(String str, int i) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            String typeName(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$4 */
        enum C09904 extends JavaVersion {
            C09904(String str, int i) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            boolean jdkTypeDuplicatesOwnerName() {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            String typeName(Type type) {
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$5 */
        class C09915 extends TypeCapture<Map.Entry<String, int[][]>> {
            C09915() {
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$6 */
        class C09926 extends TypeCapture<int[]> {
            C09926() {
            }
        }

        private static /* synthetic */ JavaVersion[] $values() {
        }

        private JavaVersion(String str, int i) {
        }

        public static JavaVersion valueOf(String str) {
        }

        public static JavaVersion[] values() {
        }

        boolean jdkTypeDuplicatesOwnerName() {
        }

        abstract Type newArrayType(Type type);

        String typeName(Type type) {
        }

        final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
        }

        abstract Type usedInGenericType(Type type);

        /* synthetic */ JavaVersion(String str, int i, C09821 c09821) {
        }
    }

    static final class NativeTypeVariableEquals<X> {
        static final boolean NATIVE_TYPE_VARIABLE_ONLY = false;

        NativeTypeVariableEquals() {
        }
    }

    private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        private final Type ownerType;
        private final Class<?> rawType;

        ParameterizedTypeImpl(Type type, Class<?> cls, Type[] typeArr) {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static final class TypeVariableImpl<D extends GenericDeclaration> {
        private final ImmutableList<Type> bounds;
        private final D genericDeclaration;
        private final String name;

        TypeVariableImpl(D d, String str, Type[] typeArr) {
        }

        public boolean equals(Object obj) {
        }

        public Type[] getBounds() {
        }

        public D getGenericDeclaration() {
        }

        public String getName() {
        }

        public String getTypeName() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static final class TypeVariableInvocationHandler implements InvocationHandler {
        private static final ImmutableMap<String, Method> typeVariableMethods = null;
        private final TypeVariableImpl<?> typeVariableImpl;

        TypeVariableInvocationHandler(TypeVariableImpl<?> typeVariableImpl) {
        }

        static /* synthetic */ TypeVariableImpl access$600(TypeVariableInvocationHandler typeVariableInvocationHandler) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private Types() {
    }

    static /* synthetic */ Type access$100(Type[] typeArr) {
    }

    static /* synthetic */ void access$200(Type[] typeArr, String str) {
    }

    static /* synthetic */ Type[] access$300(Collection collection) {
    }

    static /* synthetic */ Function access$400() {
    }

    static /* synthetic */ Joiner access$500() {
    }

    static /* synthetic */ Iterable access$700(Iterable iterable) {
    }

    private static void disallowPrimitiveType(Type[] typeArr, String str) {
    }

    private static Iterable<Type> filterUpperBounds(Iterable<Type> iterable) {
    }

    static Class<?> getArrayClass(Class<?> cls) {
    }

    static Type getComponentType(Type type) {
    }

    static Type newArrayType(Type type) {
    }

    static <D extends GenericDeclaration> TypeVariable<D> newArtificialTypeVariable(D d, String str, Type... typeArr) {
    }

    static ParameterizedType newParameterizedType(Class<?> cls, Type... typeArr) {
    }

    static ParameterizedType newParameterizedTypeWithOwner(Type type, Class<?> cls, Type... typeArr) {
    }

    private static <D extends GenericDeclaration> TypeVariable<D> newTypeVariableImpl(D d, String str, Type[] typeArr) {
    }

    @VisibleForTesting
    static WildcardType subtypeOf(Type type) {
    }

    private static Type subtypeOfComponentType(Type[] typeArr) {
    }

    @VisibleForTesting
    static WildcardType supertypeOf(Type type) {
    }

    private static Type[] toArray(Collection<Type> collection) {
    }

    static String toString(Type type) {
    }
}
