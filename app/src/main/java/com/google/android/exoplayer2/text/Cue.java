package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import com.google.android.exoplayer2.Bundleable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Cue implements Bundleable {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final Bundleable.Creator<Cue> CREATOR = null;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    public static final Cue EMPTY = null;
    private static final String FIELD_BITMAP = null;
    private static final String FIELD_BITMAP_HEIGHT = null;
    private static final String FIELD_LINE = null;
    private static final String FIELD_LINE_ANCHOR = null;
    private static final String FIELD_LINE_TYPE = null;
    private static final String FIELD_MULTI_ROW_ALIGNMENT = null;
    private static final String FIELD_POSITION = null;
    private static final String FIELD_POSITION_ANCHOR = null;
    private static final String FIELD_SHEAR_DEGREES = null;
    private static final String FIELD_SIZE = null;
    private static final String FIELD_TEXT = null;
    private static final String FIELD_TEXT_ALIGNMENT = null;
    private static final String FIELD_TEXT_SIZE = null;
    private static final String FIELD_TEXT_SIZE_TYPE = null;
    private static final String FIELD_VERTICAL_TYPE = null;
    private static final String FIELD_WINDOW_COLOR = null;
    private static final String FIELD_WINDOW_COLOR_SET = null;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    public static final class Builder {
        private Bitmap bitmap;
        private float bitmapHeight;
        private float line;
        private int lineAnchor;
        private int lineType;
        private Layout.Alignment multiRowAlignment;
        private float position;
        private int positionAnchor;
        private float shearDegrees;
        private float size;
        private CharSequence text;
        private Layout.Alignment textAlignment;
        private float textSize;
        private int textSizeType;
        private int verticalType;
        private int windowColor;
        private boolean windowColorSet;

        /* synthetic */ Builder(Cue cue, C01981 c01981) {
        }

        public Cue build() {
        }

        @CanIgnoreReturnValue
        public Builder clearWindowColor() {
        }

        @Pure
        public Bitmap getBitmap() {
        }

        @Pure
        public float getBitmapHeight() {
        }

        @Pure
        public float getLine() {
        }

        @Pure
        public int getLineAnchor() {
        }

        @Pure
        public int getLineType() {
        }

        @Pure
        public float getPosition() {
        }

        @Pure
        public int getPositionAnchor() {
        }

        @Pure
        public float getSize() {
        }

        @Pure
        public CharSequence getText() {
        }

        @Pure
        public Layout.Alignment getTextAlignment() {
        }

        @Pure
        public float getTextSize() {
        }

        @Pure
        public int getTextSizeType() {
        }

        @Pure
        public int getVerticalType() {
        }

        @Pure
        public int getWindowColor() {
        }

        public boolean isWindowColorSet() {
        }

        @CanIgnoreReturnValue
        public Builder setBitmap(Bitmap bitmap) {
        }

        @CanIgnoreReturnValue
        public Builder setBitmapHeight(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setLine(float f, int i) {
        }

        @CanIgnoreReturnValue
        public Builder setLineAnchor(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMultiRowAlignment(Layout.Alignment alignment) {
        }

        @CanIgnoreReturnValue
        public Builder setPosition(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setPositionAnchor(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setShearDegrees(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setSize(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setText(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setTextAlignment(Layout.Alignment alignment) {
        }

        @CanIgnoreReturnValue
        public Builder setTextSize(float f, int i) {
        }

        @CanIgnoreReturnValue
        public Builder setVerticalType(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setWindowColor(int i) {
        }

        public Builder() {
        }

        private Builder(Cue cue) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    /* synthetic */ Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, C01981 c01981) {
    }

    public static /* synthetic */ Cue dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static final Cue fromBundle(Bundle bundle) {
    }

    public Builder buildUpon() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    @Deprecated
    public Cue(CharSequence charSequence) {
    }

    @Deprecated
    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
    }

    @Deprecated
    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
    }

    @Deprecated
    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
    }

    private Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
    }
}
