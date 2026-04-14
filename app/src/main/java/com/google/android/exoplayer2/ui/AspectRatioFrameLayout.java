package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    private AspectRatioListener aspectRatioListener;
    private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    private final class AspectRatioUpdateDispatcher implements Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;
        final /* synthetic */ AspectRatioFrameLayout this$0;

        private AspectRatioUpdateDispatcher(AspectRatioFrameLayout aspectRatioFrameLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void scheduleUpdate(float f, float f2, boolean z) {
        }

        /* synthetic */ AspectRatioUpdateDispatcher(AspectRatioFrameLayout aspectRatioFrameLayout, C02061 c02061) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
    }

    static /* synthetic */ AspectRatioListener access$100(AspectRatioFrameLayout aspectRatioFrameLayout) {
    }

    public int getResizeMode() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void setAspectRatio(float f) {
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
    }

    public void setResizeMode(int i) {
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
    }
}
