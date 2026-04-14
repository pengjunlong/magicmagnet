package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ShapeAppearancePathProvider {
    private final Path boundsPath;
    private final Path cornerPath;
    private final ShapePath[] cornerPaths;
    private final Matrix[] cornerTransforms;
    private boolean edgeIntersectionCheckEnabled;
    private final Path edgePath;
    private final Matrix[] edgeTransforms;
    private final Path overlappedEdgePath;
    private final PointF pointF;
    private final float[] scratch;
    private final float[] scratch2;
    private final ShapePath shapePath;

    private static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = null;

        private Lazy() {
        }
    }

    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i);
    }

    static final class ShapeAppearancePathSpec {
        public final RectF bounds;
        public final float interpolation;
        public final Path path;
        public final PathListener pathListener;
        public final ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, Path path) {
        }
    }

    private float angleOfEdge(int i) {
    }

    private void appendCornerPath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
    }

    private void appendEdgePath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
    }

    private void getCoordinatesOfCorner(int i, RectF rectF, PointF pointF) {
    }

    private CornerSize getCornerSizeForIndex(int i, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private CornerTreatment getCornerTreatmentForIndex(int i, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private float getEdgeCenterForIndex(RectF rectF, int i) {
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i, ShapeAppearanceModel shapeAppearanceModel) {
    }

    public static ShapeAppearancePathProvider getInstance() {
    }

    private boolean pathOverlapsCorner(Path path, int i) {
    }

    private void setCornerPathAndTransform(ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
    }

    private void setEdgePathAndTransform(int i) {
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, Path path) {
    }

    void setEdgeIntersectionCheckEnable(boolean z) {
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, Path path) {
    }
}
