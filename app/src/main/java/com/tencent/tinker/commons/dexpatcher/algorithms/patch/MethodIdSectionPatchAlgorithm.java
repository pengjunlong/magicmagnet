package com.tencent.tinker.commons.dexpatcher.algorithms.patch;

import com.tencent.tinker.android.dex.Dex;
import com.tencent.tinker.android.dex.MethodId;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import com.tencent.tinker.commons.dexpatcher.struct.DexPatchFile;
import com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap;
import com.tencent.tinker.commons.dexpatcher.util.SparseIndexMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MethodIdSectionPatchAlgorithm extends DexSectionPatchAlgorithm<MethodId> {
    private Dex.Section patchedMethodIdSec;
    private TableOfContents.Section patchedMethodIdTocSec;

    public MethodIdSectionPatchAlgorithm(DexPatchFile dexPatchFile, Dex dex, Dex dex2, SparseIndexMap sparseIndexMap) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ MethodId adjustItem(AbstractIndexMap abstractIndexMap, MethodId methodId) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int getItemSize(MethodId methodId) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected TableOfContents.Section getTocSection(Dex dex) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void markDeletedIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ MethodId nextItem(DexDataBuffer dexDataBuffer) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void updateIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2, int i3, int i4) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int writePatchedItem(MethodId methodId) {
    }

    /* renamed from: adjustItem, reason: avoid collision after fix types in other method */
    protected MethodId adjustItem2(AbstractIndexMap abstractIndexMap, MethodId methodId) {
    }

    /* renamed from: getItemSize, reason: avoid collision after fix types in other method */
    protected int getItemSize2(MethodId methodId) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected MethodId nextItem(DexDataBuffer dexDataBuffer) {
    }

    /* renamed from: writePatchedItem, reason: avoid collision after fix types in other method */
    protected int writePatchedItem2(MethodId methodId) {
    }
}
