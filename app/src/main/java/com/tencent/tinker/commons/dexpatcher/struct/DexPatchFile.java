package com.tencent.tinker.commons.dexpatcher.struct;

import com.tencent.tinker.android.dex.io.DexDataBuffer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class DexPatchFile {
    public static final short CURRENT_VERSION = 2;
    public static final byte[] MAGIC = null;
    private final DexDataBuffer buffer;
    private int firstChunkOffset;
    private byte[] oldDexSignature;
    private int patchedAnnotationSectionOffset;
    private int patchedAnnotationSetRefListSectionOffset;
    private int patchedAnnotationSetSectionOffset;
    private int patchedAnnotationsDirectorySectionOffset;
    private int patchedClassDataSectionOffset;
    private int patchedClassDefSectionOffset;
    private int patchedCodeSectionOffset;
    private int patchedDebugInfoSectionOffset;
    private int patchedDexSize;
    private int patchedEncodedArraySectionOffset;
    private int patchedFieldIdSectionOffset;
    private int patchedMapListSectionOffset;
    private int patchedMethodIdSectionOffset;
    private int patchedProtoIdSectionOffset;
    private int patchedStringDataSectionOffset;
    private int patchedStringIdSectionOffset;
    private int patchedTypeIdSectionOffset;
    private int patchedTypeListSectionOffset;
    private short version;

    public DexPatchFile(File file) throws IOException {
    }

    private void init() {
    }

    public DexDataBuffer getBuffer() {
    }

    public byte[] getOldDexSignature() {
    }

    public int getPatchedAnnotationSectionOffset() {
    }

    public int getPatchedAnnotationSetRefListSectionOffset() {
    }

    public int getPatchedAnnotationSetSectionOffset() {
    }

    public int getPatchedAnnotationsDirectorySectionOffset() {
    }

    public int getPatchedClassDataSectionOffset() {
    }

    public int getPatchedClassDefSectionOffset() {
    }

    public int getPatchedCodeSectionOffset() {
    }

    public int getPatchedDebugInfoSectionOffset() {
    }

    public int getPatchedDexSize() {
    }

    public int getPatchedEncodedArraySectionOffset() {
    }

    public int getPatchedFieldIdSectionOffset() {
    }

    public int getPatchedMapListSectionOffset() {
    }

    public int getPatchedMethodIdSectionOffset() {
    }

    public int getPatchedProtoIdSectionOffset() {
    }

    public int getPatchedStringDataSectionOffset() {
    }

    public int getPatchedStringIdSectionOffset() {
    }

    public int getPatchedTypeIdSectionOffset() {
    }

    public int getPatchedTypeListSectionOffset() {
    }

    public short getVersion() {
    }

    public DexPatchFile(InputStream inputStream) throws IOException {
    }
}
