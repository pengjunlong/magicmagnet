package com.google.android.material.color.utilities;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Cam16 {
    static final double[][] CAM16RGB_TO_XYZ = null;
    static final double[][] XYZ_TO_CAM16RGB = null;
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* renamed from: j */
    private final double f32j;
    private final double jstar;

    /* renamed from: m */
    private final double f33m;

    /* renamed from: q */
    private final double f34q;

    /* renamed from: s */
    private final double f35s;

    private Cam16(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
    }

    public static Cam16 fromInt(int i) {
    }

    static Cam16 fromIntInViewingConditions(int i, ViewingConditions viewingConditions) {
    }

    static Cam16 fromJch(double d, double d2, double d3) {
    }

    private static Cam16 fromJchInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
    }

    public static Cam16 fromUcs(double d, double d2, double d3) {
    }

    public static Cam16 fromUcsInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
    }

    double distance(Cam16 cam16) {
    }

    public double getAstar() {
    }

    public double getBstar() {
    }

    public double getChroma() {
    }

    public double getHue() {
    }

    public double getJ() {
    }

    public double getJstar() {
    }

    public double getM() {
    }

    public double getQ() {
    }

    public double getS() {
    }

    public int toInt() {
    }

    int viewed(ViewingConditions viewingConditions) {
    }
}
