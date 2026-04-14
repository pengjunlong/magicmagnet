package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TextDrawableHelper {
    private WeakReference<TextDrawableDelegate> delegate;
    private final TextAppearanceFontCallback fontCallback;
    private TextAppearance textAppearance;
    private final TextPaint textPaint;
    private float textWidth;
    private boolean textWidthDirty;

    /* renamed from: com.google.android.material.internal.TextDrawableHelper$1 */
    class C03831 extends TextAppearanceFontCallback {
        final /* synthetic */ TextDrawableHelper this$0;

        C03831(TextDrawableHelper textDrawableHelper) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z) {
        }
    }

    public interface TextDrawableDelegate {
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(TextDrawableDelegate textDrawableDelegate) {
    }

    static /* synthetic */ boolean access$002(TextDrawableHelper textDrawableHelper, boolean z) {
    }

    static /* synthetic */ WeakReference access$100(TextDrawableHelper textDrawableHelper) {
    }

    private float calculateTextWidth(CharSequence charSequence) {
    }

    public TextAppearance getTextAppearance() {
    }

    public TextPaint getTextPaint() {
    }

    public float getTextWidth(String str) {
    }

    public boolean isTextWidthDirty() {
    }

    public void setDelegate(TextDrawableDelegate textDrawableDelegate) {
    }

    public void setTextAppearance(TextAppearance textAppearance, Context context) {
    }

    public void setTextWidthDirty(boolean z) {
    }

    public void updateTextPaintDrawState(Context context) {
    }
}
