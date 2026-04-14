package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class C$Gson$Types {
    static final Type[] EMPTY_TYPE_ARRAY = null;

    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
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

    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
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

    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    private static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
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

    private C$Gson$Types() {
    }

    public static GenericArrayType arrayOf(Type type) {
    }

    public static Type canonicalize(Type type) {
    }

    static void checkNotPrimitive(Type type) {
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
    }

    static boolean equal(Object obj, Object obj2) {
    }

    public static boolean equals(Type type, Type type2) {
    }

    public static Type getArrayComponentType(Type type) {
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
    }

    static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
    }

    public static Class<?> getRawType(Type type) {
    }

    static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
    }

    static int hashCodeOrZero(Object obj) {
    }

    private static int indexOf(Object[] objArr, Object obj) {
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
    }

    static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
    }

    public static WildcardType subtypeOf(Type type) {
    }

    public static WildcardType supertypeOf(Type type) {
    }

    public static String typeToString(Type type) {
    }

    private static Type resolve(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
    }
}
