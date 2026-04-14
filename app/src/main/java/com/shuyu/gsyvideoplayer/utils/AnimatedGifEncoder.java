package com.shuyu.gsyvideoplayer.utils;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AnimatedGifEncoder {
    protected boolean closeStream;
    protected int colorDepth;
    protected byte[] colorTab;
    protected int delay;
    protected int dispose;
    protected boolean firstFrame;
    protected int height;
    protected Bitmap image;
    protected byte[] indexedPixels;
    protected OutputStream out;
    protected int palSize;
    protected byte[] pixels;
    protected int repeat;
    protected int sample;
    protected boolean sizeSet;
    protected boolean started;
    protected int transIndex;
    protected int transparent;
    protected boolean[] usedEntry;
    protected int width;

    /* renamed from: x */
    protected int f208x;

    /* renamed from: y */
    protected int f209y;

    public boolean addFrame(Bitmap bitmap) {
    }

    protected void analyzePixels() {
    }

    protected int findClosest(int i) {
    }

    public boolean finish() {
    }

    protected int[] getImageData(Bitmap bitmap) {
    }

    protected void getImagePixels() {
    }

    public void setDelay(int i) {
    }

    public void setDispose(int i) {
    }

    public void setFrameRate(float f) {
    }

    public void setPosition(int i, int i2) {
    }

    public void setQuality(int i) {
    }

    public void setRepeat(int i) {
    }

    public void setSize(int i, int i2) {
    }

    public void setTransparent(int i) {
    }

    public boolean start(OutputStream outputStream) {
    }

    protected void writeGraphicCtrlExt() throws IOException {
    }

    protected void writeImageDesc() throws IOException {
    }

    protected void writeLSD() throws IOException {
    }

    protected void writeNetscapeExt() throws IOException {
    }

    protected void writePalette() throws IOException {
    }

    protected void writePixels() throws IOException {
    }

    protected void writeShort(int i) throws IOException {
    }

    protected void writeString(String str) throws IOException {
    }
}
