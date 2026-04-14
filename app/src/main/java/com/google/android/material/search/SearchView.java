package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1 {
    private static final int DEF_STYLE_RES = 0;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    /* renamed from: com.google.android.material.search.SearchView$1 */
    class C04291 implements TextWatcher {
        final /* synthetic */ SearchView this$0;

        C04291(SearchView searchView) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static class Behavior extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: onDependentViewChanged, reason: avoid collision after fix types in other method */
        public boolean onDependentViewChanged2(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
        }
    }

    static class SavedState extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        String text;
        int visibility;

        /* renamed from: com.google.android.material.search.SearchView$SavedState$1 */
        class C04301 implements Parcelable.ClassLoaderCreator<SavedState> {
            C04301() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcel parcel) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        public SavedState(Parcelable parcelable) {
        }
    }

    public interface TransitionListener {
        void onStateChanged(SearchView searchView, TransitionState transitionState, TransitionState transitionState2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class TransitionState {
        private static final /* synthetic */ TransitionState[] $VALUES = null;
        public static final TransitionState HIDDEN = null;
        public static final TransitionState HIDING = null;
        public static final TransitionState SHOWING = null;
        public static final TransitionState SHOWN = null;

        private TransitionState(String str, int i) {
        }

        public static TransitionState valueOf(String str) {
        }

        public static TransitionState[] values() {
        }
    }

    public SearchView(Context context) {
    }

    public static /* synthetic */ bdddqmITkkeGpsxVXHR1l1llll bpdqqiQNVROMLC1ll1l1l11(SearchView searchView, View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public static /* synthetic */ bdddqmITkkeGpsxVXHR1l1llll dbppbdqpeLmcbs11l11(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public static /* synthetic */ bdddqmITkkeGpsxVXHR1l1llll dbpqdHhmDSIHIJiwc1ll1l1(SearchView searchView, View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, ViewUtils.RelativePadding relativePadding) {
    }

    public static /* synthetic */ void ddbbbeXHXx111ll(SearchView searchView) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SearchView searchView, View view) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(SearchView searchView) {
    }

    public static /* synthetic */ boolean dqpdbEevAufTOvPphbjykClll1l11(View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void dqpqqqbqQyjyB11111l1(SearchView searchView, View view) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(SearchView searchView, View view) {
    }

    private Window getActivityWindow() {
    }

    private float getOverlayElevation() {
    }

    private int getStatusBarHeight() {
    }

    private boolean isNavigationIconDrawerArrowDrawable(Toolbar toolbar) {
    }

    private /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
    }

    private /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
    }

    private /* synthetic */ void lambda$setUpBackButton$1(View view) {
    }

    private /* synthetic */ void lambda$setUpClearButton$2(View view) {
    }

    private /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
    }

    private static /* synthetic */ bdddqmITkkeGpsxVXHR1l1llll lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    private static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
    }

    private /* synthetic */ bdddqmITkkeGpsxVXHR1l1llll lambda$setUpStatusBarSpacerInsetListener$5(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    private /* synthetic */ bdddqmITkkeGpsxVXHR1l1llll lambda$setUpToolbarInsetListener$4(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, ViewUtils.RelativePadding relativePadding) {
    }

    private /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
    }

    public static /* synthetic */ boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(SearchView searchView, View view, MotionEvent motionEvent) {
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
    }

    private void setUpBackButton(boolean z, boolean z2) {
    }

    private void setUpBackgroundViewElevationOverlay() {
    }

    private void setUpClearButton() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
    }

    private void setUpDividerInsetListener() {
    }

    private void setUpEditText(int i, String str, String str2) {
    }

    private void setUpHeaderLayout(int i) {
    }

    private void setUpInsetListeners() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
    }

    private void setUpStatusBarSpacer(int i) {
    }

    private void setUpStatusBarSpacerInsetListener() {
    }

    private void setUpToolbarInsetListener() {
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z) {
    }

    private void updateNavigationIconIfNeeded() {
    }

    private void updateNavigationIconProgressIfNeeded() {
    }

    public void addHeaderView(View view) {
    }

    public void addTransitionListener(TransitionListener transitionListener) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    public void clearFocusAndHideKeyboard() {
    }

    public void clearText() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1
    public CoordinatorLayout.dqqppqiKzJi1l1lll1l<SearchView> getBehavior() {
    }

    public TransitionState getCurrentTransitionState() {
    }

    public EditText getEditText() {
    }

    public CharSequence getHint() {
    }

    public TextView getSearchPrefix() {
    }

    public CharSequence getSearchPrefixText() {
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
    }

    public Toolbar getToolbar() {
    }

    public void hide() {
    }

    public void inflateMenu(int i) {
    }

    boolean isAdjustNothingSoftInputMode() {
    }

    public boolean isAnimatedNavigationIcon() {
    }

    public boolean isAutoShowKeyboard() {
    }

    public boolean isMenuItemsAnimated() {
    }

    public boolean isSetupWithSearchBar() {
    }

    public boolean isShowing() {
    }

    public boolean isUseWindowInsetsController() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    public void removeAllHeaderViews() {
    }

    public void removeHeaderView(View view) {
    }

    public void removeTransitionListener(TransitionListener transitionListener) {
    }

    public void requestFocusAndShowKeyboard() {
    }

    void requestFocusAndShowKeyboardIfNeeded() {
    }

    public void setAnimatedNavigationIcon(boolean z) {
    }

    public void setAutoShowKeyboard(boolean z) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setHint(CharSequence charSequence) {
    }

    public void setMenuItemsAnimated(boolean z) {
    }

    public void setModalForAccessibility(boolean z) {
    }

    public void setOnMenuItemClickListener(Toolbar.ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    public void setSearchPrefixText(CharSequence charSequence) {
    }

    public void setStatusBarSpacerEnabled(boolean z) {
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
    }

    void setTransitionState(TransitionState transitionState) {
    }

    public void setUseWindowInsetsController(boolean z) {
    }

    public void setVisible(boolean z) {
    }

    public void setupWithSearchBar(SearchBar searchBar) {
    }

    public void show() {
    }

    public void updateSoftInputMode() {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
    }

    public void setHint(int i) {
    }

    public void setText(int i) {
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
    }
}
