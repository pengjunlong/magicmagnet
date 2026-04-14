package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
    }

    float getCradleVerticalOffset() {
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
    }

    public float getFabCornerRadius() {
    }

    float getFabCradleMargin() {
    }

    float getFabCradleRoundedCornerRadius() {
    }

    public float getFabDiameter() {
    }

    public float getHorizontalOffset() {
    }

    void setCradleVerticalOffset(float f) {
    }

    public void setFabCornerSize(float f) {
    }

    void setFabCradleMargin(float f) {
    }

    void setFabCradleRoundedCornerRadius(float f) {
    }

    public void setFabDiameter(float f) {
    }

    void setHorizontalOffset(float f) {
    }
}
