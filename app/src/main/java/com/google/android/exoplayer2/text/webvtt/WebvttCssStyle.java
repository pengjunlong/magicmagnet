package com.google.android.exoplayer2.text.webvtt;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int bold;
    private boolean combineUpright;
    private int fontColor;
    private String fontFamily;
    private float fontSize;
    private int fontSizeUnit;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    private int italic;
    private int linethrough;
    private int rubyPosition;
    private Set<String> targetClasses;
    private String targetId;
    private String targetTag;
    private String targetVoice;
    private int underline;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    private static int updateScoreForMatch(int i, String str, String str2, int i2) {
    }

    public int getBackgroundColor() {
    }

    public boolean getCombineUpright() {
    }

    public int getFontColor() {
    }

    public String getFontFamily() {
    }

    public float getFontSize() {
    }

    public int getFontSizeUnit() {
    }

    public int getRubyPosition() {
    }

    public int getSpecificityScore(String str, String str2, Set<String> set, String str3) {
    }

    public int getStyle() {
    }

    public boolean hasBackgroundColor() {
    }

    public boolean hasFontColor() {
    }

    public boolean isLinethrough() {
    }

    public boolean isUnderline() {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setBackgroundColor(int i) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setBold(boolean z) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setCombineUpright(boolean z) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontColor(int i) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontFamily(String str) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontSize(float f) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setFontSizeUnit(int i) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setItalic(boolean z) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setLinethrough(boolean z) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setRubyPosition(int i) {
    }

    public void setTargetClasses(String[] strArr) {
    }

    public void setTargetId(String str) {
    }

    public void setTargetTagName(String str) {
    }

    public void setTargetVoice(String str) {
    }

    @CanIgnoreReturnValue
    public WebvttCssStyle setUnderline(boolean z) {
    }
}
