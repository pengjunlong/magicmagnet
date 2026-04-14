package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.List;
import p000.fg1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final fg1<String, PropertyValuesHolder[]> propertyValues;
    private final fg1<String, MotionTiming> timings;

    private static void addInfoFromAnimator(MotionSpec motionSpec, Animator animator) {
    }

    private PropertyValuesHolder[] clonePropertyValuesHolder(PropertyValuesHolder[] propertyValuesHolderArr) {
    }

    public static MotionSpec createFromAttribute(Context context, TypedArray typedArray, int i) {
    }

    public static MotionSpec createFromResource(Context context, int i) {
    }

    private static MotionSpec createSpecFromAnimators(List<Animator> list) {
    }

    public boolean equals(Object obj) {
    }

    public <T> ObjectAnimator getAnimator(String str, T t, Property<T, ?> property) {
    }

    public PropertyValuesHolder[] getPropertyValues(String str) {
    }

    public MotionTiming getTiming(String str) {
    }

    public long getTotalDuration() {
    }

    public boolean hasPropertyValues(String str) {
    }

    public boolean hasTiming(String str) {
    }

    public int hashCode() {
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
    }

    public void setTiming(String str, MotionTiming motionTiming) {
    }

    public String toString() {
    }
}
