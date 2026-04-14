package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.Future;
import p000.ls1;
import p000.mv0;
import p000.os1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class AppCompatTextView extends TextView implements ls1, os1 {
    private final bpdqqiQNVROMLC1ll1l1l11 mBackgroundTintHelper;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<mv0> mPrecomputedTextFuture;
    private dbpqdHhmDSIHIJiwc1ll1l1 mSuperCaller;
    private final bppbpdbCeZVhQNTixBml1lll11l mTextClassifierHelper;
    private final qbdqqpbqpCWRpIKEKtzoceYOll1ll1l mTextHelper;

    private interface dbpqdHhmDSIHIJiwc1ll1l1 {
        int[] bpdqqiQNVROMLC1ll1l1l11();

        void dbppbdqpeLmcbs11l11(int i);

        void dbpqdHhmDSIHIJiwc1ll1l1(int[] iArr, int i);

        void ddbbbeXHXx111ll(TextClassifier textClassifier);

        void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i);

        void dpbdbdpbLwkLpObyKsq1lll1(int i);

        int dpbdpqRKAscW1lll1l();

        void dqpdbEevAufTOvPphbjykClll1l11(int i, int i2, int i3, int i4);

        int dqpqqqbqQyjyB11111l1();

        int dqqppqiKzJi1l1lll1l();

        int pbppbpqbamJRy11l1l1();

        TextClassifier ppbdpwWWljzmXXdHNabfWhgjl111l11();
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ AppCompatTextView dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1(AppCompatTextView appCompatTextView) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public int[] bpdqqiQNVROMLC1ll1l1l11() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void dbppbdqpeLmcbs11l11(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void dbpqdHhmDSIHIJiwc1ll1l1(int[] iArr, int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void ddbbbeXHXx111ll(TextClassifier textClassifier) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public int dpbdpqRKAscW1lll1l() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void dqpdbEevAufTOvPphbjykClll1l11(int i, int i2, int i3, int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public int dqpqqqbqQyjyB11111l1() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public int dqqppqiKzJi1l1lll1l() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public int pbppbpqbamJRy11l1l1() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public TextClassifier ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }
    }

    class dqqppqiKzJi1l1lll1l extends dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ AppCompatTextView dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(AppCompatTextView appCompatTextView) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dpbdbdpbLwkLpObyKsq1lll1, androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void dbppbdqpeLmcbs11l11(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.dpbdbdpbLwkLpObyKsq1lll1, androidx.appcompat.widget.AppCompatTextView.dbpqdHhmDSIHIJiwc1ll1l1
        public void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }
    }

    public AppCompatTextView(Context context) {
    }

    static /* synthetic */ int access$001(AppCompatTextView appCompatTextView) {
    }

    static /* synthetic */ void access$1001(AppCompatTextView appCompatTextView, int i) {
    }

    static /* synthetic */ int access$101(AppCompatTextView appCompatTextView) {
    }

    static /* synthetic */ void access$1101(AppCompatTextView appCompatTextView, int i) {
    }

    static /* synthetic */ int access$201(AppCompatTextView appCompatTextView) {
    }

    static /* synthetic */ int[] access$301(AppCompatTextView appCompatTextView) {
    }

    static /* synthetic */ int access$401(AppCompatTextView appCompatTextView) {
    }

    static /* synthetic */ TextClassifier access$501(AppCompatTextView appCompatTextView) {
    }

    static /* synthetic */ void access$601(AppCompatTextView appCompatTextView, int i, int i2, int i3, int i4) {
    }

    static /* synthetic */ void access$701(AppCompatTextView appCompatTextView, int[] iArr, int i) {
    }

    static /* synthetic */ void access$801(AppCompatTextView appCompatTextView, int i) {
    }

    static /* synthetic */ void access$901(AppCompatTextView appCompatTextView, TextClassifier textClassifier) {
    }

    private void consumeTextFutureAndSetBlocking() {
    }

    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll getEmojiTextViewHelper() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
    }

    dbpqdHhmDSIHIJiwc1ll1l1 getSuperCaller() {
    }

    @Override // p000.ls1
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // p000.ls1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
    }

    public mv0.dbpqdHhmDSIHIJiwc1ll1l1 getTextMetricsParamsCompat() {
    }

    public boolean isEmojiCompatEnabled() {
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    public void setEmojiCompatEnabled(boolean z) {
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
    }

    public void setPrecomputedText(mv0 mv0Var) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // p000.os1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
    }

    @Override // p000.os1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
    }

    public void setTextFuture(Future<mv0> future) {
    }

    public void setTextMetricsParamsCompat(mv0.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
    }
}
