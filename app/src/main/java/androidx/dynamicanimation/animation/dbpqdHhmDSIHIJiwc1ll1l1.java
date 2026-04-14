package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class dbpqdHhmDSIHIJiwc1ll1l1<T> {
    final String mPropertyName;

    /* renamed from: androidx.dynamicanimation.animation.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    static class C1951dbpqdHhmDSIHIJiwc1ll1l1 extends dbpqdHhmDSIHIJiwc1ll1l1<T> {
        final /* synthetic */ FloatProperty dbpqdHhmDSIHIJiwc1ll1l1;

        C1951dbpqdHhmDSIHIJiwc1ll1l1(String str, FloatProperty floatProperty) {
        }

        @Override // androidx.dynamicanimation.animation.dbpqdHhmDSIHIJiwc1ll1l1
        public float getValue(T t) {
        }

        @Override // androidx.dynamicanimation.animation.dbpqdHhmDSIHIJiwc1ll1l1
        public void setValue(T t, float f) {
        }
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    public static <T> dbpqdHhmDSIHIJiwc1ll1l1<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
