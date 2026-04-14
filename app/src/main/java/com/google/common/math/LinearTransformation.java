package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {
        private final double x1;
        private final double y1;

        /* synthetic */ LinearTransformationBuilder(double d, double d2, C09511 c09511) {
        }

        public LinearTransformation and(double d, double d2) {
        }

        public LinearTransformation withSlope(double d) {
        }

        private LinearTransformationBuilder(double d, double d2) {
        }
    }

    private static final class NaNLinearTransformation extends LinearTransformation {
        static final NaNLinearTransformation INSTANCE = null;

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
        }

        public String toString() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
        }
    }

    public static LinearTransformation forNaN() {
    }

    public static LinearTransformation horizontal(double d) {
    }

    public static LinearTransformationBuilder mapping(double d, double d2) {
    }

    public static LinearTransformation vertical(double d) {
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d);

    private static final class VerticalLinearTransformation extends LinearTransformation {

        @LazyInit
        LinearTransformation inverse;

        /* renamed from: x */
        final double f113x;

        VerticalLinearTransformation(double d) {
        }

        private LinearTransformation createInverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
        }

        public String toString() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
        }

        VerticalLinearTransformation(double d, LinearTransformation linearTransformation) {
        }
    }

    private static final class RegularLinearTransformation extends LinearTransformation {

        @LazyInit
        LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        RegularLinearTransformation(double d, double d2) {
        }

        private LinearTransformation createInverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
        }

        public String toString() {
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
        }

        RegularLinearTransformation(double d, double d2, LinearTransformation linearTransformation) {
        }
    }
}
