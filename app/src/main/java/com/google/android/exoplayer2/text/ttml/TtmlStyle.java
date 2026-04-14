package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    private int backgroundColor;
    private int bold;
    private int fontColor;
    private String fontFamily;
    private float fontSize;
    private int fontSizeUnit;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    private String id;
    private int italic;
    private int linethrough;
    private Layout.Alignment multiRowAlign;
    private int rubyPosition;
    private int rubyType;
    private float shearPercentage;
    private Layout.Alignment textAlign;
    private int textCombine;
    private TextEmphasis textEmphasis;
    private int underline;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    @CanIgnoreReturnValue
    public TtmlStyle chain(TtmlStyle ttmlStyle) {
    }

    public int getBackgroundColor() {
    }

    public int getFontColor() {
    }

    public String getFontFamily() {
    }

    public float getFontSize() {
    }

    public int getFontSizeUnit() {
    }

    public String getId() {
    }

    public Layout.Alignment getMultiRowAlign() {
    }

    public int getRubyPosition() {
    }

    public int getRubyType() {
    }

    public float getShearPercentage() {
    }

    public int getStyle() {
    }

    public Layout.Alignment getTextAlign() {
    }

    public boolean getTextCombine() {
    }

    public TextEmphasis getTextEmphasis() {
    }

    public boolean hasBackgroundColor() {
    }

    public boolean hasFontColor() {
    }

    @CanIgnoreReturnValue
    public TtmlStyle inherit(TtmlStyle ttmlStyle) {
    }

    public boolean isLinethrough() {
    }

    public boolean isUnderline() {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setBackgroundColor(int i) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setBold(boolean z) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontColor(int i) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontFamily(String str) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontSize(float f) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setFontSizeUnit(int i) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setId(String str) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setItalic(boolean z) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setLinethrough(boolean z) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setMultiRowAlign(Layout.Alignment alignment) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setRubyPosition(int i) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setRubyType(int i) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setShearPercentage(float f) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setTextAlign(Layout.Alignment alignment) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setTextCombine(boolean z) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setTextEmphasis(TextEmphasis textEmphasis) {
    }

    @CanIgnoreReturnValue
    public TtmlStyle setUnderline(boolean z) {
    }

    @CanIgnoreReturnValue
    private TtmlStyle inherit(TtmlStyle ttmlStyle, boolean z) {
    }
}
