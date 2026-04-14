package com.google.android.exoplayer2.util;

import com.google.common.collect.ImmutableSet;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = null;
    private static final char[] LF = null;
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = null;
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    private int findNextLineTerminator(Charset charset) {
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
    }

    private void skipLineTerminator(Charset charset) {
    }

    public int bytesLeft() {
    }

    public int capacity() {
    }

    public void ensureCapacity(int i) {
    }

    public byte[] getData() {
    }

    public int getPosition() {
    }

    public int limit() {
    }

    public char peekChar() {
    }

    public int peekUnsignedByte() {
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
    }

    public String readDelimiterTerminatedString(char c) {
    }

    public double readDouble() {
    }

    public float readFloat() {
    }

    public int readInt() {
    }

    public int readInt24() {
    }

    public String readLine() {
    }

    public int readLittleEndianInt() {
    }

    public int readLittleEndianInt24() {
    }

    public long readLittleEndianLong() {
    }

    public short readLittleEndianShort() {
    }

    public long readLittleEndianUnsignedInt() {
    }

    public int readLittleEndianUnsignedInt24() {
    }

    public int readLittleEndianUnsignedIntToInt() {
    }

    public int readLittleEndianUnsignedShort() {
    }

    public long readLong() {
    }

    public String readNullTerminatedString(int i) {
    }

    public short readShort() {
    }

    public String readString(int i) {
    }

    public int readSynchSafeInt() {
    }

    public int readUnsignedByte() {
    }

    public int readUnsignedFixedPoint1616() {
    }

    public long readUnsignedInt() {
    }

    public int readUnsignedInt24() {
    }

    public int readUnsignedIntToInt() {
    }

    public long readUnsignedLongToLong() {
    }

    public int readUnsignedShort() {
    }

    public long readUtf8EncodedLong() {
    }

    public Charset readUtfCharsetFromBom() {
    }

    public void reset(int i) {
    }

    public void setLimit(int i) {
    }

    public void setPosition(int i) {
    }

    public void skipBytes(int i) {
    }

    public String readLine(Charset charset) {
    }

    public String readString(int i, Charset charset) {
    }

    public void reset(byte[] bArr) {
    }

    public ParsableByteArray(int i) {
    }

    public void readBytes(byte[] bArr, int i, int i2) {
    }

    public void reset(byte[] bArr, int i) {
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
    }

    public String readNullTerminatedString() {
    }

    public ParsableByteArray(byte[] bArr) {
    }

    public ParsableByteArray(byte[] bArr, int i) {
    }
}
