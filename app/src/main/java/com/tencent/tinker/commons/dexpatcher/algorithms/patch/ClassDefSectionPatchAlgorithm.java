package com.tencent.tinker.commons.dexpatcher.algorithms.patch;

import com.tencent.tinker.android.dex.ClassDef;
import com.tencent.tinker.android.dex.Dex;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import com.tencent.tinker.commons.dexpatcher.struct.DexPatchFile;
import com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap;
import com.tencent.tinker.commons.dexpatcher.util.SparseIndexMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ClassDefSectionPatchAlgorithm extends DexSectionPatchAlgorithm<ClassDef> {
    private Dex.Section patchedClassDefSec;
    private TableOfContents.Section patchedClassDefTocSec;

    public ClassDefSectionPatchAlgorithm(DexPatchFile dexPatchFile, Dex dex, Dex dex2, SparseIndexMap sparseIndexMap) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ ClassDef adjustItem(AbstractIndexMap abstractIndexMap, ClassDef classDef) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int getItemSize(ClassDef classDef) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected TableOfContents.Section getTocSection(Dex dex) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ ClassDef nextItem(DexDataBuffer dexDataBuffer) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected /* bridge */ /* synthetic */ int writePatchedItem(ClassDef classDef) {
    }

    /* renamed from: adjustItem, reason: avoid collision after fix types in other method */
    protected ClassDef adjustItem2(AbstractIndexMap abstractIndexMap, ClassDef classDef) {
    }

    /* renamed from: getItemSize, reason: avoid collision after fix types in other method */
    protected int getItemSize2(ClassDef classDef) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.commons.dexpatcher.algorithms.patch.DexSectionPatchAlgorithm
    protected ClassDef nextItem(DexDataBuffer dexDataBuffer) {
    }

    /* renamed from: writePatchedItem, reason: avoid collision after fix types in other method */
    protected int writePatchedItem2(ClassDef classDef) {
    }
}
