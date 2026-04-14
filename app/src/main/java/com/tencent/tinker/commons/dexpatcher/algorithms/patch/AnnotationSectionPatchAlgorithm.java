package com.tencent.tinker.commons.dexpatcher.algorithms.patch;

import com.tencent.tinker.android.dex.Annotation;
import com.tencent.tinker.android.dex.Dex;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import com.tencent.tinker.commons.dexpatcher.struct.DexPatchFile;
import com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap;
import com.tencent.tinker.commons.dexpatcher.util.SparseIndexMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AnnotationSectionPatchAlgorithm extends DexSectionPatchAlgorithm<Annotation> {
    private Dex.Section patchedAnnotationSec;
    private TableOfContents.Section patchedAnnotationTocSec;

    public AnnotationSectionPatchAlgorithm(DexPatchFile dexPatchFile, Dex dex, Dex dex2, SparseIndexMap sparseIndexMap) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ Annotation adjustItem(AbstractIndexMap abstractIndexMap, Annotation annotation) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int getItemSize(Annotation annotation) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected TableOfContents.Section getTocSection(Dex dex) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void markDeletedIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ Annotation nextItem(DexDataBuffer dexDataBuffer) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected void updateIndexOrOffset(SparseIndexMap sparseIndexMap, int i, int i2, int i3, int i4) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int writePatchedItem(Annotation annotation) {
    }

    /* renamed from: adjustItem, reason: avoid collision after fix types in other method */
    protected Annotation adjustItem2(AbstractIndexMap abstractIndexMap, Annotation annotation) {
    }

    /* renamed from: getItemSize, reason: avoid collision after fix types in other method */
    protected int getItemSize2(Annotation annotation) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected Annotation nextItem(DexDataBuffer dexDataBuffer) {
    }

    /* renamed from: writePatchedItem, reason: avoid collision after fix types in other method */
    protected int writePatchedItem2(Annotation annotation) {
    }
}
