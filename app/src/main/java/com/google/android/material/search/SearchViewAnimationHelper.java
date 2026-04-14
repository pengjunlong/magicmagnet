package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.TouchObserverFrameLayout;
import p000.d4;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final ImageButton clearButton;
    private final TouchObserverFrameLayout contentContainer;
    private final View divider;
    private final Toolbar dummyToolbar;
    private final EditText editText;
    private final FrameLayout headerContainer;
    private final ClippableRoundedCornerLayout rootView;
    private final View scrim;
    private SearchBar searchBar;
    private final TextView searchPrefix;
    private final SearchView searchView;
    private final Toolbar toolbar;
    private final FrameLayout toolbarContainer;

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$1 */
    class C04311 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchViewAnimationHelper this$0;

        C04311(SearchViewAnimationHelper searchViewAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$2 */
    class C04322 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchViewAnimationHelper this$0;

        C04322(SearchViewAnimationHelper searchViewAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$3 */
    class C04333 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchViewAnimationHelper this$0;

        C04333(SearchViewAnimationHelper searchViewAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$4 */
    class C04344 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchViewAnimationHelper this$0;

        C04344(SearchViewAnimationHelper searchViewAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$5 */
    class C04355 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchViewAnimationHelper this$0;
        final /* synthetic */ boolean val$show;

        C04355(SearchViewAnimationHelper searchViewAnimationHelper, boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    SearchViewAnimationHelper(SearchView searchView) {
    }

    static /* synthetic */ SearchView access$000(SearchViewAnimationHelper searchViewAnimationHelper) {
    }

    static /* synthetic */ ClippableRoundedCornerLayout access$100(SearchViewAnimationHelper searchViewAnimationHelper) {
    }

    static /* synthetic */ void access$200(SearchViewAnimationHelper searchViewAnimationHelper, float f) {
    }

    static /* synthetic */ SearchBar access$300(SearchViewAnimationHelper searchViewAnimationHelper) {
    }

    private void addActionMenuViewAnimatorIfNeeded(AnimatorSet animatorSet) {
    }

    private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
    }

    private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet animatorSet) {
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(SearchViewAnimationHelper searchViewAnimationHelper) {
    }

    private Rect calculateFromClipBounds() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(d4 d4Var, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SearchViewAnimationHelper searchViewAnimationHelper, float f, Rect rect, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(SearchViewAnimationHelper searchViewAnimationHelper) {
    }

    private Animator getActionMenuViewsAlphaAnimator(boolean z) {
    }

    private Animator getButtonsAnimator(boolean z) {
    }

    private Animator getClearButtonAnimator(boolean z) {
    }

    private Animator getContentAlphaAnimator(boolean z) {
    }

    private Animator getContentAnimator(boolean z) {
    }

    private Animator getContentScaleAnimator(boolean z) {
    }

    private Animator getDividerAnimator(boolean z) {
    }

    private Animator getDummyToolbarAnimator(boolean z) {
    }

    private Animator getEditTextAnimator(boolean z) {
    }

    private AnimatorSet getExpandCollapseAnimatorSet(boolean z) {
    }

    private int getFromTranslationXEnd(View view) {
    }

    private int getFromTranslationXStart(View view) {
    }

    private int getFromTranslationY() {
    }

    private Animator getHeaderContainerAnimator(boolean z) {
    }

    private Animator getRootViewAnimator(boolean z) {
    }

    private Animator getScrimAlphaAnimator(boolean z) {
    }

    private Animator getSearchPrefixAnimator(boolean z) {
    }

    private AnimatorSet getTranslateAnimatorSet(boolean z) {
    }

    private Animator getTranslationAnimator(boolean z, boolean z2, View view) {
    }

    private Animator getTranslationYAnimator() {
    }

    private static /* synthetic */ void lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(d4 d4Var, ValueAnimator valueAnimator) {
    }

    private static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$4(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$getRootViewAnimator$2(float f, Rect rect, ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$startShowAnimationExpand$0() {
    }

    private /* synthetic */ void lambda$startShowAnimationTranslate$1() {
    }

    private void setActionMenuViewAlphaIfNeeded(float f) {
    }

    private void setContentViewsAlpha(float f) {
    }

    private void setFullDrawableProgressIfNeeded(Drawable drawable) {
    }

    private void setMenuItemsNotClickable(Toolbar toolbar) {
    }

    private void setUpDummyToolbarIfNeeded() {
    }

    private void startHideAnimationCollapse() {
    }

    private void startHideAnimationTranslate() {
    }

    private void startShowAnimationExpand() {
    }

    private void startShowAnimationTranslate() {
    }

    void hide() {
    }

    void setSearchBar(SearchBar searchBar) {
    }

    void show() {
    }
}
