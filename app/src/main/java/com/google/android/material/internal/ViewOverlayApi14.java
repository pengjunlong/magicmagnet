package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class ViewOverlayApi14 implements ViewOverlayImpl {
    protected OverlayViewGroup overlayViewGroup;

    ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
    }

    static ViewOverlayApi14 createFrom(View view) {
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
    }

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    static class OverlayViewGroup extends ViewGroup {
        static Method invalidateChildInParentFastMethod;
        private boolean disposed;
        ArrayList<Drawable> drawables;
        ViewGroup hostView;
        View requestingView;
        ViewOverlayApi14 viewOverlay;

        OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
        }

        private void assertNotDisposed() {
        }

        private void disposeIfEmpty() {
        }

        private void getOffset(int[] iArr) {
        }

        public void add(Drawable drawable) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        }

        protected ViewParent invalidateChildInParentFast(int i, int i2, Rect rect) {
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public void remove(Drawable drawable) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
        }

        public void remove(View view) {
        }

        public void add(View view) {
        }
    }
}
