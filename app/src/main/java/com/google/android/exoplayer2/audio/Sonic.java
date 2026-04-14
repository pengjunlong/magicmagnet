package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public Sonic(int i, int i2, float f, float f2, int i3) {
    }

    private void adjustRate(float f, int i) {
    }

    private void changeSpeed(float f) {
    }

    private int copyInputToOutput(int i) {
    }

    private void copyToOutput(short[] sArr, int i, int i2) {
    }

    private void downSampleInput(short[] sArr, int i, int i2) {
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i2) {
    }

    private int findPitchPeriod(short[] sArr, int i) {
    }

    private int findPitchPeriodInRange(short[] sArr, int i, int i2, int i3) {
    }

    private int insertPitchPeriod(short[] sArr, int i, float f, int i2) {
    }

    private short interpolate(short[] sArr, int i, int i2, int i3) {
    }

    private void moveNewSamplesToPitchBuffer(int i) {
    }

    private static void overlapAdd(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
    }

    private boolean previousPeriodBetter(int i, int i2) {
    }

    private void processStreamInput() {
    }

    private void removePitchFrames(int i) {
    }

    private void removeProcessedInputFrames(int i) {
    }

    private int skipPitchPeriod(short[] sArr, int i, float f, int i2) {
    }

    public void flush() {
    }

    public void getOutput(ShortBuffer shortBuffer) {
    }

    public int getOutputSize() {
    }

    public int getPendingInputBytes() {
    }

    public void queueEndOfStream() {
    }

    public void queueInput(ShortBuffer shortBuffer) {
    }
}
