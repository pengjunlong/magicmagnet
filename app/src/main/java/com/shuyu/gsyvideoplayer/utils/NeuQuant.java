package com.shuyu.gsyvideoplayer.utils;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class NeuQuant {
    protected static final int alphabiasshift = 10;
    protected static final int alpharadbias = 262144;
    protected static final int alpharadbshift = 18;
    protected static final int beta = 64;
    protected static final int betagamma = 65536;
    protected static final int betashift = 10;
    protected static final int gamma = 1024;
    protected static final int gammashift = 10;
    protected static final int initalpha = 1024;
    protected static final int initrad = 32;
    protected static final int initradius = 2048;
    protected static final int intbias = 65536;
    protected static final int intbiasshift = 16;
    protected static final int maxnetpos = 255;
    protected static final int minpicturebytes = 1509;
    protected static final int ncycles = 100;
    protected static final int netbiasshift = 4;
    protected static final int netsize = 256;
    protected static final int prime1 = 499;
    protected static final int prime2 = 491;
    protected static final int prime3 = 487;
    protected static final int prime4 = 503;
    protected static final int radbias = 256;
    protected static final int radbiasshift = 8;
    protected static final int radiusbias = 64;
    protected static final int radiusbiasshift = 6;
    protected static final int radiusdec = 30;
    protected int alphadec;
    protected int[] bias;
    protected int[] freq;
    protected int lengthcount;
    protected int[] netindex;
    protected int[][] network;
    protected int[] radpower;
    protected int samplefac;
    protected byte[] thepicture;

    public NeuQuant(byte[] bArr, int i, int i2) {
    }

    protected void alterneigh(int i, int i2, int i3, int i4, int i5) {
    }

    protected void altersingle(int i, int i2, int i3, int i4, int i5) {
    }

    public byte[] colorMap() {
    }

    protected int contest(int i, int i2, int i3) {
    }

    public void inxbuild() {
    }

    public void learn() {
    }

    public int map(int i, int i2, int i3) {
    }

    public byte[] process() {
    }

    public void unbiasnet() {
    }
}
