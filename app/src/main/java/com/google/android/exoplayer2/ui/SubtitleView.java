package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.Cue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SubtitleView extends FrameLayout {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private View innerSubtitleView;
    private Output output;
    private CaptionStyleCompat style;
    private int viewType;

    interface Output {
        void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context) {
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
    }

    private float getUserCaptionFontScale() {
    }

    private CaptionStyleCompat getUserCaptionStyle() {
    }

    private Cue removeEmbeddedStyling(Cue cue) {
    }

    private void setTextSize(int i, float f) {
    }

    private <T extends View & Output> void setView(T t) {
    }

    private void updateOutput() {
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
    }

    public void setApplyEmbeddedStyles(boolean z) {
    }

    public void setBottomPaddingFraction(float f) {
    }

    public void setCues(List<Cue> list) {
    }

    public void setFixedTextSize(int i, float f) {
    }

    public void setFractionalTextSize(float f) {
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
    }

    public void setUserDefaultStyle() {
    }

    public void setUserDefaultTextSize() {
    }

    public void setViewType(int i) {
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
    }

    public void setFractionalTextSize(float f, boolean z) {
    }
}
