package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class FuturesGetChecked {
    private static final Ordering<Constructor<?>> WITH_STRING_PARAM_FIRST = null;

    /* renamed from: com.google.common.util.concurrent.FuturesGetChecked$1 */
    class C10521 implements Function<Constructor<?>, Boolean> {
        C10521() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Boolean apply(Constructor<?> constructor) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public Boolean apply2(Constructor<?> constructor) {
        }
    }

    @VisibleForTesting
    interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    @VisibleForTesting
    static class GetCheckedTypeValidatorHolder {
        static final GetCheckedTypeValidator BEST_VALIDATOR = null;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        static final class WeakSetValidator implements GetCheckedTypeValidator {
            private static final /* synthetic */ WeakSetValidator[] $VALUES = null;
            public static final WeakSetValidator INSTANCE = null;
            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = null;

            private static /* synthetic */ WeakSetValidator[] $values() {
            }

            private WeakSetValidator(String str, int i) {
            }

            public static WeakSetValidator valueOf(String str) {
            }

            public static WeakSetValidator[] values() {
            }

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
            }
        }

        GetCheckedTypeValidatorHolder() {
        }

        static GetCheckedTypeValidator getBestValidator() {
        }
    }

    private FuturesGetChecked() {
    }

    private static GetCheckedTypeValidator bestGetCheckedTypeValidator() {
    }

    @VisibleForTesting
    static void checkExceptionClassValidity(Class<? extends Exception> cls) {
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
    }

    private static boolean hasConstructorUsableByGetChecked(Class<? extends Exception> cls) {
    }

    @VisibleForTesting
    static boolean isCheckedException(Class<? extends Exception> cls) {
    }

    private static <X> X newFromConstructor(Constructor<X> constructor, Throwable th) {
    }

    private static <X extends Exception> X newWithCause(Class<X> cls, Throwable th) {
    }

    private static <X extends Exception> List<Constructor<X>> preferringStrings(List<Constructor<X>> list) {
    }

    @VisibleForTesting
    static GetCheckedTypeValidator weakSetValidator() {
    }

    private static <X extends Exception> void wrapAndThrowExceptionOrError(Throwable th, Class<X> cls) throws Exception {
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    @ParametricNullness
    static <V, X extends Exception> V getChecked(GetCheckedTypeValidator getCheckedTypeValidator, Future<V> future, Class<X> cls) throws Exception {
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
    }
}
