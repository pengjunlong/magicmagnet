package com.tencent.tinker.commons.dexpatcher.algorithms.patch;

import com.tencent.tinker.android.dex.Dex;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import com.tencent.tinker.commons.dexpatcher.struct.DexPatchFile;
import com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap;
import com.tencent.tinker.commons.dexpatcher.util.SparseIndexMap;
import java.lang.Comparable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class DexSectionPatchAlgorithm<T extends Comparable<T>> {
    protected final Dex oldDex;
    private final SparseIndexMap oldToPatchedIndexMap;
    protected final DexPatchFile patchFile;

    public DexSectionPatchAlgorithm(DexPatchFile dexPatchFile, Dex dex, SparseIndexMap sparseIndexMap) {
    }

    private void doFullPatch(Dex.Section section, int i, int[] iArr, int[] iArr2, int[] iArr3) {
    }

    private int getItemOffsetOrIndex(int i, T t) {
    }

    private int[] readDeltaIndiciesOrOffsets(int i) {
    }

    protected T adjustItem(AbstractIndexMap abstractIndexMap, T t) {
    }

    public void execute() {
    }

    protected abstract int getItemSize(T t);

    protected abstract TableOfContents.Section getTocSection(Dex dex);

    protected void markDeletedIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2) {
    }

    protected abstract T nextItem(DexDataBuffer dexDataBuffer);

    protected void updateIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2, int i3, int i4) {
    }

    protected abstract int writePatchedItem(T t);
}
