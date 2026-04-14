package com.tencent.tinker.commons.dexpatcher.algorithms.patch;

import com.tencent.tinker.android.dex.ClassData;
import com.tencent.tinker.android.dex.Dex;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import com.tencent.tinker.commons.dexpatcher.struct.DexPatchFile;
import com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap;
import com.tencent.tinker.commons.dexpatcher.util.SparseIndexMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ClassDataSectionPatchAlgorithm extends DexSectionPatchAlgorithm<ClassData> {
    private Dex.Section patchedClassDataSec;
    private TableOfContents.Section patchedClassDataTocSec;

    public ClassDataSectionPatchAlgorithm(DexPatchFile dexPatchFile, Dex dex, Dex dex2, SparseIndexMap sparseIndexMap) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ ClassData adjustItem(AbstractIndexMap abstractIndexMap, ClassData classData) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int getItemSize(ClassData classData) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected TableOfContents.Section getTocSection(Dex dex) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void markDeletedIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ ClassData nextItem(DexDataBuffer dexDataBuffer) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void updateIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2, int i3, int i4) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int writePatchedItem(ClassData classData) {
    }

    /* renamed from: adjustItem, reason: avoid collision after fix types in other method */
    protected ClassData adjustItem2(AbstractIndexMap abstractIndexMap, ClassData classData) {
    }

    /* renamed from: getItemSize, reason: avoid collision after fix types in other method */
    protected int getItemSize2(ClassData classData) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected ClassData nextItem(DexDataBuffer dexDataBuffer) {
    }

    /* renamed from: writePatchedItem, reason: avoid collision after fix types in other method */
    protected int writePatchedItem2(ClassData classData) {
    }
}
