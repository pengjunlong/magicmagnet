package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.List;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    private static final long EXPAND_DURATION_MS = 300;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    private final Set<AnimatorListenerAdapter> collapseAnimationListeners;
    private boolean collapsing;
    private Animator defaultCenterViewAnimator;
    private final Set<AnimatorListenerAdapter> expandAnimationListeners;
    private boolean expanding;
    private final Set<SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks;
    private boolean onLoadAnimationFadeInEnabled;
    private Animator runningExpandOrCollapseAnimator;
    private Animator secondaryViewAnimator;

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$1 */
    class C04231 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBarAnimationHelper this$0;

        C04231(SearchBarAnimationHelper searchBarAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$2 */
    class C04242 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBarAnimationHelper this$0;
        final /* synthetic */ View val$centerView;
        final /* synthetic */ Animator val$secondaryViewAnimator;

        C04242(SearchBarAnimationHelper searchBarAnimationHelper, View view, Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$3 */
    class C04253 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBarAnimationHelper this$0;

        C04253(SearchBarAnimationHelper searchBarAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$4 */
    class C04264 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBarAnimationHelper this$0;
        final /* synthetic */ SearchBar val$searchBar;

        C04264(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$5 */
    class C04275 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBarAnimationHelper this$0;

        C04275(SearchBarAnimationHelper searchBarAnimationHelper) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$6 */
    class C04286 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBarAnimationHelper this$0;
        final /* synthetic */ SearchBar val$searchBar;

        C04286(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface OnLoadAnimationInvocation {
        void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    SearchBarAnimationHelper() {
    }

    static /* synthetic */ void access$000(SearchBarAnimationHelper searchBarAnimationHelper, OnLoadAnimationInvocation onLoadAnimationInvocation) {
    }

    static /* synthetic */ boolean access$102(SearchBarAnimationHelper searchBarAnimationHelper, boolean z) {
    }

    static /* synthetic */ Animator access$202(SearchBarAnimationHelper searchBarAnimationHelper, Animator animator) {
    }

    static /* synthetic */ boolean access$302(SearchBarAnimationHelper searchBarAnimationHelper, boolean z) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(View view, ValueAnimator valueAnimator) {
    }

    private void dispatchOnLoadAnimation(OnLoadAnimationInvocation onLoadAnimationInvocation) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
    }

    private Animator getCollapseAnimator(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
    }

    private Animator getDefaultCenterViewAnimator(View view) {
    }

    private List<View> getEndAnchoredViews(View view) {
    }

    private Animator getExpandAnimator(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
    }

    private ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
    }

    private ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar searchBar, View view) {
    }

    private List<View> getFadeChildren(SearchBar searchBar) {
    }

    private Animator getFadeInChildrenAnimator(SearchBar searchBar) {
    }

    private Animator getFadeOutChildrenAnimator(SearchBar searchBar, View view) {
    }

    private Animator getSecondaryActionMenuItemAnimator(View view) {
    }

    private Animator getSecondaryViewAnimator(TextView textView, View view) {
    }

    private Animator getTextViewAnimator(TextView textView) {
    }

    private static /* synthetic */ void lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
    }

    private static /* synthetic */ void lambda$getFadeOutChildrenAnimator$2(View view, ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$startExpandAnimation$0(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
    }

    void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    void addOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
    }

    boolean isCollapsing() {
    }

    boolean isExpanding() {
    }

    boolean isOnLoadAnimationFadeInEnabled() {
    }

    boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
    }

    boolean removeOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
    }

    void setOnLoadAnimationFadeInEnabled(boolean z) {
    }

    void startCollapseAnimation(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
    }

    void startExpandAnimation(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
    }

    void startOnLoadAnimation(SearchBar searchBar) {
    }

    void stopOnLoadAnimation(SearchBar searchBar) {
    }
}
