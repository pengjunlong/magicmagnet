package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = null;
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    public static final class Builder {
        private EdgeTreatment bottomEdge;
        private CornerTreatment bottomLeftCorner;
        private CornerSize bottomLeftCornerSize;
        private CornerTreatment bottomRightCorner;
        private CornerSize bottomRightCornerSize;
        private EdgeTreatment leftEdge;
        private EdgeTreatment rightEdge;
        private EdgeTreatment topEdge;
        private CornerTreatment topLeftCorner;
        private CornerSize topLeftCornerSize;
        private CornerTreatment topRightCorner;
        private CornerSize topRightCornerSize;

        public Builder() {
        }

        static /* synthetic */ CornerTreatment access$100(Builder builder) {
        }

        static /* synthetic */ EdgeTreatment access$1000(Builder builder) {
        }

        static /* synthetic */ EdgeTreatment access$1100(Builder builder) {
        }

        static /* synthetic */ EdgeTreatment access$1200(Builder builder) {
        }

        static /* synthetic */ CornerTreatment access$200(Builder builder) {
        }

        static /* synthetic */ CornerTreatment access$300(Builder builder) {
        }

        static /* synthetic */ CornerTreatment access$400(Builder builder) {
        }

        static /* synthetic */ CornerSize access$500(Builder builder) {
        }

        static /* synthetic */ CornerSize access$600(Builder builder) {
        }

        static /* synthetic */ CornerSize access$700(Builder builder) {
        }

        static /* synthetic */ CornerSize access$800(Builder builder) {
        }

        static /* synthetic */ EdgeTreatment access$900(Builder builder) {
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
        }

        public ShapeAppearanceModel build() {
        }

        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setAllCorners(int i, float f) {
        }

        @CanIgnoreReturnValue
        public Builder setAllEdges(EdgeTreatment edgeTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomEdge(EdgeTreatment edgeTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i, float f) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i, float f) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setLeftEdge(EdgeTreatment edgeTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setRightEdge(EdgeTreatment edgeTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setTopEdge(EdgeTreatment edgeTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i, float f) {
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i, float f) {
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setAllCorners(CornerTreatment cornerTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i, CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i, CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i, CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i, CornerSize cornerSize) {
        }

        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(CornerTreatment cornerTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(CornerTreatment cornerTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(CornerTreatment cornerTreatment) {
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCorner(CornerTreatment cornerTreatment) {
        }

        public Builder(ShapeAppearanceModel shapeAppearanceModel) {
        }
    }

    public interface CornerSizeUnaryOperator {
        CornerSize apply(CornerSize cornerSize);
    }

    /* synthetic */ ShapeAppearanceModel(Builder builder, C04391 c04391) {
    }

    public static Builder builder() {
    }

    private static CornerSize getCornerSize(TypedArray typedArray, int i, CornerSize cornerSize) {
    }

    public EdgeTreatment getBottomEdge() {
    }

    public CornerTreatment getBottomLeftCorner() {
    }

    public CornerSize getBottomLeftCornerSize() {
    }

    public CornerTreatment getBottomRightCorner() {
    }

    public CornerSize getBottomRightCornerSize() {
    }

    public EdgeTreatment getLeftEdge() {
    }

    public EdgeTreatment getRightEdge() {
    }

    public EdgeTreatment getTopEdge() {
    }

    public CornerTreatment getTopLeftCorner() {
    }

    public CornerSize getTopLeftCornerSize() {
    }

    public CornerTreatment getTopRightCorner() {
    }

    public CornerSize getTopRightCornerSize() {
    }

    public boolean isRoundRect(RectF rectF) {
    }

    public Builder toBuilder() {
    }

    public ShapeAppearanceModel withCornerSize(float f) {
    }

    public ShapeAppearanceModel withTransformedCornerSizes(CornerSizeUnaryOperator cornerSizeUnaryOperator) {
    }

    private ShapeAppearanceModel(Builder builder) {
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    public ShapeAppearanceModel withCornerSize(CornerSize cornerSize) {
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i, int i2, CornerSize cornerSize) {
    }

    public static Builder builder(Context context, int i, int i2) {
    }

    private static Builder builder(Context context, int i, int i2, int i3) {
    }

    private static Builder builder(Context context, int i, int i2, CornerSize cornerSize) {
    }

    public ShapeAppearanceModel() {
    }
}
