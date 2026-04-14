package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations;
    private final List<ShadowCompatOperation> shadowCompatOperations;

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    /* renamed from: com.google.android.material.shape.ShapePath$1 */
    class C04401 extends ShadowCompatOperation {
        final /* synthetic */ ShapePath this$0;
        final /* synthetic */ List val$operations;
        final /* synthetic */ Matrix val$transformCopy;

        C04401(ShapePath shapePath, List list, Matrix matrix) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        }
    }

    static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        }
    }

    static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        }

        float getEndAngle() {
        }

        float getStartAngle() {
        }

        float getSweepAngle() {
        }
    }

    static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        }

        float getAngle() {
        }
    }

    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = null;

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f, float f2, float f3, float f4) {
        }

        static /* synthetic */ float access$1000(PathArcOperation pathArcOperation) {
        }

        static /* synthetic */ float access$1100(PathArcOperation pathArcOperation) {
        }

        static /* synthetic */ float access$1200(PathArcOperation pathArcOperation) {
        }

        static /* synthetic */ float access$1300(PathArcOperation pathArcOperation) {
        }

        static /* synthetic */ void access$600(PathArcOperation pathArcOperation, float f) {
        }

        static /* synthetic */ void access$700(PathArcOperation pathArcOperation, float f) {
        }

        static /* synthetic */ float access$800(PathArcOperation pathArcOperation) {
        }

        static /* synthetic */ float access$900(PathArcOperation pathArcOperation) {
        }

        private float getBottom() {
        }

        private float getLeft() {
        }

        private float getRight() {
        }

        private float getStartAngle() {
        }

        private float getSweepAngle() {
        }

        private float getTop() {
        }

        private void setBottom(float f) {
        }

        private void setLeft(float f) {
        }

        private void setRight(float f) {
        }

        private void setStartAngle(float f) {
        }

        private void setSweepAngle(float f) {
        }

        private void setTop(float f) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
        }
    }

    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f, float f2, float f3, float f4, float f5, float f6) {
        }

        private float getControlX1() {
        }

        private float getControlX2() {
        }

        private float getControlY1() {
        }

        private float getControlY2() {
        }

        private float getEndX() {
        }

        private float getEndY() {
        }

        private void setControlX1(float f) {
        }

        private void setControlX2(float f) {
        }

        private void setControlY1(float f) {
        }

        private void setControlY2(float f) {
        }

        private void setEndX(float f) {
        }

        private void setEndY(float f) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* renamed from: x */
        private float f40x;

        /* renamed from: y */
        private float f41y;

        static /* synthetic */ float access$000(PathLineOperation pathLineOperation) {
        }

        static /* synthetic */ float access$002(PathLineOperation pathLineOperation, float f) {
        }

        static /* synthetic */ float access$100(PathLineOperation pathLineOperation) {
        }

        static /* synthetic */ float access$102(PathLineOperation pathLineOperation, float f) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix;

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        static /* synthetic */ void access$200(PathQuadOperation pathQuadOperation, float f) {
        }

        static /* synthetic */ void access$300(PathQuadOperation pathQuadOperation, float f) {
        }

        static /* synthetic */ void access$400(PathQuadOperation pathQuadOperation, float f) {
        }

        static /* synthetic */ void access$500(PathQuadOperation pathQuadOperation, float f) {
        }

        private float getControlX() {
        }

        private float getControlY() {
        }

        private float getEndX() {
        }

        private float getEndY() {
        }

        private void setControlX(float f) {
        }

        private void setControlY(float f) {
        }

        private void setEndX(float f) {
        }

        private void setEndY(float f) {
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
        }
    }

    static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = null;
        final Matrix renderMatrix;

        ShadowCompatOperation() {
        }

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        }
    }

    public ShapePath() {
    }

    private void addConnectingShadowIfNecessary(float f) {
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f, float f2) {
    }

    private float getCurrentShadowAngle() {
    }

    private float getEndShadowAngle() {
    }

    private void setCurrentShadowAngle(float f) {
    }

    private void setEndShadowAngle(float f) {
    }

    private void setEndX(float f) {
    }

    private void setEndY(float f) {
    }

    private void setStartX(float f) {
    }

    private void setStartY(float f) {
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public void applyToPath(Matrix matrix, Path path) {
    }

    boolean containsIncompatibleShadowOp() {
    }

    ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
    }

    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
    }

    float getEndX() {
    }

    float getEndY() {
    }

    float getStartX() {
    }

    float getStartY() {
    }

    public void lineTo(float f, float f2) {
    }

    public void quadToPoint(float f, float f2, float f3, float f4) {
    }

    public void reset(float f, float f2) {
    }

    public void reset(float f, float f2, float f3, float f4) {
    }

    public ShapePath(float f, float f2) {
    }

    public void lineTo(float f, float f2, float f3, float f4) {
    }
}
