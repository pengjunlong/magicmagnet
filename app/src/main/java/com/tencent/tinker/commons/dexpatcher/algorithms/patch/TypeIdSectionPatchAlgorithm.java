package com.tencent.tinker.commons.dexpatcher.algorithms.patch;

import com.tencent.tinker.android.dex.Dex;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import com.tencent.tinker.commons.dexpatcher.struct.DexPatchFile;
import com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap;
import com.tencent.tinker.commons.dexpatcher.util.SparseIndexMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TypeIdSectionPatchAlgorithm extends DexSectionPatchAlgorithm<Integer> {
    private Dex.Section patchedTypeIdSec;
    private TableOfContents.Section patchedTypeIdTocSec;

    public TypeIdSectionPatchAlgorithm(DexPatchFile dexPatchFile, Dex dex, Dex dex2, SparseIndexMap sparseIndexMap) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ Integer adjustItem(AbstractIndexMap abstractIndexMap, Integer num) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int getItemSize(Integer num) {
    }

    /* renamed from: getItemSize, reason: avoid collision after fix types in other method */
    protected int getItemSize2(Integer num) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected TableOfContents.Section getTocSection(Dex dex) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void markDeletedIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ Integer nextItem(DexDataBuffer dexDataBuffer) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void updateIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2, int i3, int i4) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int writePatchedItem(Integer num) {
    }

    /* renamed from: adjustItem, reason: avoid collision after fix types in other method */
    protected Integer adjustItem2(AbstractIndexMap abstractIndexMap, Integer num) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    /* renamed from: nextItem, reason: avoid collision after fix types in other method */
    protected Integer nextItem2(DexDataBuffer dexDataBuffer) {
    }

    /* renamed from: writePatchedItem, reason: avoid collision after fix types in other method */
    protected int writePatchedItem2(Integer num) {
    }
}
