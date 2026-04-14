package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.dqdqbpQposEBDyDxIyyz1ll11;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.ls1;
import p000.ps1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements ls1, ps1, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1 {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = 0;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;
    private final ExpandableWidgetHelper expandableWidgetHelper;
    private final dqdqbpQposEBDyDxIyyz1ll11 imageHelper;
    private PorterDuff.Mode imageMode;
    private int imagePadding;
    private ColorStateList imageTint;
    private FloatingActionButtonImpl impl;
    private int maxImageSize;
    private ColorStateList rippleColor;
    final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1 */
    class C03611 implements FloatingActionButtonImpl.InternalVisibilityChangedListener {
        final /* synthetic */ FloatingActionButton this$0;
        final /* synthetic */ OnVisibilityChangedListener val$listener;

        C03611(FloatingActionButton floatingActionButton, OnVisibilityChangedListener onVisibilityChangedListener) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        public void onHidden() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        public void onShown() {
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<T> {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private OnVisibilityChangedListener internalAutoHideListener;
        private Rect tmpRect;

        public BaseBehavior() {
        }

        private static boolean isBottomSheet(View view) {
        }

        private void offsetIfNeeded(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
        }

        private boolean shouldUpdateVisibility(View view, FloatingActionButton floatingActionButton) {
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
        }

        private boolean updateFabVisibilityForBottomSheet(View view, FloatingActionButton floatingActionButton) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        }

        public boolean isAutoHideEnabled() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public void onAttachedToLayoutParams(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        }

        public void setAutoHideEnabled(boolean z) {
        }

        public void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }

    private class ShadowDelegateImpl implements ShadowViewDelegate {
        final /* synthetic */ FloatingActionButton this$0;

        ShadowDelegateImpl(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public float getRadius() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public boolean isCompatPaddingEnabled() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setBackgroundDrawable(Drawable drawable) {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setShadowPadding(int i, int i2, int i3, int i4) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {
        private final TransformationCallback<T> listener;
        final /* synthetic */ FloatingActionButton this$0;

        TransformationCallbackWrapper(FloatingActionButton floatingActionButton, TransformationCallback<T> transformationCallback) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onScaleChanged() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onTranslationChanged() {
        }
    }

    public FloatingActionButton(Context context) {
    }

    static /* synthetic */ int access$000(FloatingActionButton floatingActionButton) {
    }

    static /* synthetic */ void access$101(FloatingActionButton floatingActionButton, Drawable drawable) {
    }

    private FloatingActionButtonImpl createImpl() {
    }

    private FloatingActionButtonImpl getImpl() {
    }

    private void offsetRectWithShadow(Rect rect) {
    }

    private void onApplySupportImageTint() {
    }

    private FloatingActionButtonImpl.InternalVisibilityChangedListener wrapOnVisibilityChangedListener(OnVisibilityChangedListener onVisibilityChangedListener) {
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void addTransformationCallback(TransformationCallback<? extends FloatingActionButton> transformationCallback) {
    }

    public void clearCustomSize() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1
    public CoordinatorLayout.dqqppqiKzJi1l1lll1l<FloatingActionButton> getBehavior() {
    }

    public float getCompatElevation() {
    }

    public float getCompatHoveredFocusedTranslationZ() {
    }

    public float getCompatPressedTranslationZ() {
    }

    public Drawable getContentBackground() {
    }

    @Deprecated
    public boolean getContentRect(Rect rect) {
    }

    public int getCustomSize() {
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
    }

    public MotionSpec getHideMotionSpec() {
    }

    public void getMeasuredContentRect(Rect rect) {
    }

    @Deprecated
    public int getRippleColor() {
    }

    public ColorStateList getRippleColorStateList() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    public MotionSpec getShowMotionSpec() {
    }

    public int getSize() {
    }

    int getSizeDimension() {
    }

    @Override // p000.ls1
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // p000.ls1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    @Override // p000.ps1
    public ColorStateList getSupportImageTintList() {
    }

    @Override // p000.ps1
    public PorterDuff.Mode getSupportImageTintMode() {
    }

    public boolean getUseCompatPadding() {
    }

    public void hide() {
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
    }

    public boolean isOrWillBeHidden() {
    }

    public boolean isOrWillBeShown() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void removeTransformationCallback(TransformationCallback<? extends FloatingActionButton> transformationCallback) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCompatElevation(float f) {
    }

    public void setCompatElevationResource(int i) {
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
    }

    public void setCompatPressedTranslationZ(float f) {
    }

    public void setCompatPressedTranslationZResource(int i) {
    }

    public void setCustomSize(int i) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean z) {
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(int i) {
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
    }

    public void setHideMotionSpecResource(int i) {
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
    }

    public void setMaxImageSize(int i) {
    }

    public void setRippleColor(int i) {
    }

    @Override // android.view.View
    public void setScaleX(float f) {
    }

    @Override // android.view.View
    public void setScaleY(float f) {
    }

    public void setShadowPaddingEnabled(boolean z) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(int i) {
    }

    public void setSize(int i) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // p000.ps1
    public void setSupportImageTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ps1
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
    }

    public void setUseCompatPadding(boolean z) {
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
    }

    public boolean shouldEnsureMinTouchTargetSize() {
    }

    public void show() {
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
    }

    private int getSizeDimension(int i) {
    }

    public void hide(OnVisibilityChangedListener onVisibilityChangedListener) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void show(OnVisibilityChangedListener onVisibilityChangedListener) {
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
    }

    void hide(OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
    }

    void show(OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
    }
}
