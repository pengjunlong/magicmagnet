package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.content.res.dpbdbdpbLwkLpObyKsq1lll1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;
    public final String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    private ColorStateList textColor;
    public final ColorStateList textColorHint;
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    /* renamed from: com.google.android.material.resources.TextAppearance$1 */
    class C04181 extends dpbdbdpbLwkLpObyKsq1lll1.ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        final /* synthetic */ TextAppearance this$0;
        final /* synthetic */ TextAppearanceFontCallback val$callback;

        C04181(TextAppearance textAppearance, TextAppearanceFontCallback textAppearanceFontCallback) {
        }

        @Override // androidx.core.content.res.dpbdbdpbLwkLpObyKsq1lll1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void onFontRetrievalFailed(int i) {
        }

        @Override // androidx.core.content.res.dpbdbdpbLwkLpObyKsq1lll1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void onFontRetrieved(Typeface typeface) {
        }
    }

    /* renamed from: com.google.android.material.resources.TextAppearance$2 */
    class C04192 extends TextAppearanceFontCallback {
        final /* synthetic */ TextAppearance this$0;
        final /* synthetic */ TextAppearanceFontCallback val$callback;
        final /* synthetic */ Context val$context;
        final /* synthetic */ TextPaint val$textPaint;

        C04192(TextAppearance textAppearance, Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z) {
        }
    }

    public TextAppearance(Context context, int i) {
    }

    static /* synthetic */ Typeface access$000(TextAppearance textAppearance) {
    }

    static /* synthetic */ Typeface access$002(TextAppearance textAppearance, Typeface typeface) {
    }

    static /* synthetic */ boolean access$102(TextAppearance textAppearance, boolean z) {
    }

    private void createFallbackFont() {
    }

    private boolean shouldLoadFontSynchronously(Context context) {
    }

    public Typeface getFallbackFont() {
    }

    public Typeface getFont(Context context) {
    }

    public void getFontAsync(Context context, TextAppearanceFontCallback textAppearanceFontCallback) {
    }

    public ColorStateList getTextColor() {
    }

    public float getTextSize() {
    }

    public void setTextColor(ColorStateList colorStateList) {
    }

    public void setTextSize(float f) {
    }

    public void updateDrawState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
    }

    public void updateMeasureState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
    }

    public void updateTextPaintMeasureState(Context context, TextPaint textPaint, Typeface typeface) {
    }

    public void getFontAsync(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
    }
}
