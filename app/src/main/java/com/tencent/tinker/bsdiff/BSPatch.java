package com.tencent.tinker.bsdiff;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BSPatch {
    public static final int RETURN_DIFF_FILE_ERR = 2;
    public static final int RETURN_NEW_FILE_ERR = 4;
    public static final int RETURN_OLD_FILE_ERR = 3;
    public static final int RETURN_SUCCESS = 1;

    public static int patchFast(File file, File file2, File file3, int i) throws IOException {
    }

    public static int patchLessMemory(RandomAccessFile randomAccessFile, File file, File file2, int i) throws IOException {
    }

    public static int patchLessMemory(RandomAccessFile randomAccessFile, int i, byte[] bArr, int i2, File file, int i3) throws IOException {
    }

    public static int patchFast(InputStream inputStream, InputStream inputStream2, File file) throws IOException {
    }

    public static byte[] patchFast(InputStream inputStream, InputStream inputStream2) throws IOException {
    }

    public static byte[] patchFast(InputStream inputStream, int i, byte[] bArr, int i2) throws IOException {
    }

    public static byte[] patchFast(byte[] bArr, int i, byte[] bArr2, int i2, int i3) throws IOException {
    }
}
