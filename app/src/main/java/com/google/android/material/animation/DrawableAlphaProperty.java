package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DrawableAlphaProperty extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA_COMPAT = null;
    private final WeakHashMap<Drawable, Integer> alphaCache;

    private DrawableAlphaProperty() {
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Integer get(Drawable drawable) {
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Drawable drawable, Integer num) {
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public Integer get2(Drawable drawable) {
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(Drawable drawable, Integer num) {
    }
}
