package com.tencent.tinker.ziputils.ziputil;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerZipEntry implements ZipConstants, Cloneable {
    public static final int DEFLATED = 8;
    public static final int STORED = 0;
    String comment;
    long compressedSize;
    int compressionMethod;
    long crc;
    long dataOffset;
    byte[] extra;
    long localHeaderRelOffset;
    int modDate;
    String name;
    long size;
    int time;

    public TinkerZipEntry(String str, String str2, long j, long j2, long j3, int i, int i2, int i3, byte[] bArr, long j4, long j5) {
    }

    private static boolean containsNulByte(byte[] bArr) {
    }

    private static void validateStringLength(String str, String str2) {
    }

    public Object clone() {
    }

    public boolean equals(Object obj) {
    }

    public String getComment() {
    }

    public long getCompressedSize() {
    }

    public long getCrc() {
    }

    public long getDataOffset() {
    }

    public byte[] getExtra() {
    }

    public int getMethod() {
    }

    public String getName() {
    }

    public long getSize() {
    }

    public long getTime() {
    }

    public int hashCode() {
    }

    public boolean isDirectory() {
    }

    public void setComment(String str) {
    }

    public void setCompressedSize(long j) {
    }

    public void setCrc(long j) {
    }

    public void setDataOffset(long j) {
    }

    public void setExtra(byte[] bArr) {
    }

    public void setMethod(int i) {
    }

    public void setSize(long j) {
    }

    public void setTime(long j) {
    }

    public String toString() {
    }

    public TinkerZipEntry(String str) {
    }

    public TinkerZipEntry(TinkerZipEntry tinkerZipEntry) {
    }

    public TinkerZipEntry(TinkerZipEntry tinkerZipEntry, String str) {
    }

    TinkerZipEntry(byte[] bArr, InputStream inputStream, Charset charset, boolean z) throws IOException {
    }
}
