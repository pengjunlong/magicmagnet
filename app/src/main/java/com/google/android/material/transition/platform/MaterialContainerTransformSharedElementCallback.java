package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    private static WeakReference<View> capturedSharedElement;
    private boolean entering;
    private Rect returnEndBounds;
    private ShapeProvider shapeProvider;
    private boolean sharedElementReenterTransitionEnabled;
    private boolean transparentWindowBackgroundEnabled;

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$1 */
    class C05381 extends TransitionListenerAdapter {
        final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
        final /* synthetic */ Window val$window;

        C05381(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Window window) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$2 */
    class C05392 extends TransitionListenerAdapter {
        final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
        final /* synthetic */ Activity val$activity;

        C05392(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Activity activity) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$3 */
    class C05403 extends TransitionListenerAdapter {
        final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
        final /* synthetic */ Window val$window;

        C05403(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Window window) {
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    public interface ShapeProvider {
        ShapeAppearanceModel provideShape(View view);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        public ShapeAppearanceModel provideShape(View view) {
        }
    }

    static /* synthetic */ void access$000(Window window) {
    }

    static /* synthetic */ void access$100(Window window) {
    }

    static /* synthetic */ WeakReference access$200() {
    }

    static /* synthetic */ WeakReference access$202(WeakReference weakReference) {
    }

    private static Drawable getWindowBackground(Window window) {
    }

    private static void removeWindowBackground(Window window) {
    }

    private static void restoreWindowBackground(Window window) {
    }

    private void setUpEnterTransform(Window window) {
    }

    private void setUpReturnTransform(Activity activity, Window window) {
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
    }

    public ShapeProvider getShapeProvider() {
    }

    public boolean isSharedElementReenterTransitionEnabled() {
    }

    public boolean isTransparentWindowBackgroundEnabled() {
    }

    @Override // android.app.SharedElementCallback
    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
    }

    @Override // android.app.SharedElementCallback
    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(List<String> list, Map<String, View> map) {
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
    }

    public void setShapeProvider(ShapeProvider shapeProvider) {
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
    }
}
