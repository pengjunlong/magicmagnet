package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Invokable<T, R> implements AnnotatedElement, Member {
    private final AccessibleObject accessibleObject;
    private final Member member;

    static class ConstructorInvokable<T> extends Invokable<T, T> {
        final Constructor<?> constructor;

        ConstructorInvokable(Constructor<?> constructor) {
        }

        private boolean mayNeedHiddenThis() {
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericExceptionTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericParameterTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        Type getGenericReturnType() {
        }

        @Override // com.google.common.reflect.Invokable
        final Annotation[][] getParameterAnnotations() {
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
        }

        @Override // com.google.common.reflect.Invokable
        final Object invokeInternal(Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
        }
    }

    static class MethodInvokable<T> extends Invokable<T, Object> {
        final Method method;

        MethodInvokable(Method method) {
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericExceptionTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericParameterTypes() {
        }

        @Override // com.google.common.reflect.Invokable
        Type getGenericReturnType() {
        }

        @Override // com.google.common.reflect.Invokable
        final Annotation[][] getParameterAnnotations() {
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
        }

        @Override // com.google.common.reflect.Invokable
        final Object invokeInternal(Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
        }
    }

    <M extends AccessibleObject & Member> Invokable(M m) {
    }

    public static Invokable<?, Object> from(Method method) {
    }

    public boolean equals(Object obj) {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
    }

    abstract Type[] getGenericExceptionTypes();

    abstract Type[] getGenericParameterTypes();

    abstract Type getGenericReturnType();

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
    }

    public TypeToken<T> getOwnerType() {
    }

    abstract Annotation[][] getParameterAnnotations();

    public final ImmutableList<Parameter> getParameters() {
    }

    public final TypeToken<? extends R> getReturnType() {
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public int hashCode() {
    }

    @CanIgnoreReturnValue
    public final R invoke(T t, Object... objArr) throws InvocationTargetException, IllegalAccessException {
    }

    abstract Object invokeInternal(Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException;

    public final boolean isAbstract() {
    }

    public final boolean isAccessible() {
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
    }

    public final boolean isFinal() {
    }

    public final boolean isNative() {
    }

    public abstract boolean isOverridable();

    public final boolean isPackagePrivate() {
    }

    public final boolean isPrivate() {
    }

    public final boolean isProtected() {
    }

    public final boolean isPublic() {
    }

    public final boolean isStatic() {
    }

    public final boolean isSynchronized() {
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
    }

    final boolean isTransient() {
    }

    public abstract boolean isVarArgs();

    final boolean isVolatile() {
    }

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
    }

    public final void setAccessible(boolean z) {
    }

    public String toString() {
    }

    public final boolean trySetAccessible() {
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
    }

    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
    }
}
