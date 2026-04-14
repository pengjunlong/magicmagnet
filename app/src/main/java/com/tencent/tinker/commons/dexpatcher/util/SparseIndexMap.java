package com.tencent.tinker.commons.dexpatcher.util;

import com.tencent.tinker.android.utils.SparseBoolArray;
import com.tencent.tinker.android.utils.SparseIntArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SparseIndexMap extends AbstractIndexMap {
    private final SparseIntArray annotationOffsetsMap;
    private final SparseIntArray annotationSetOffsetsMap;
    private final SparseIntArray annotationSetRefListOffsetsMap;
    private final SparseIntArray annotationsDirectoryOffsetsMap;
    private final SparseIntArray classDataOffsetsMap;
    private final SparseIntArray codeOffsetsMap;
    private final SparseIntArray debugInfoItemOffsetsMap;
    private final SparseBoolArray deletedAnnotationOffsets;
    private final SparseBoolArray deletedAnnotationSetOffsets;
    private final SparseBoolArray deletedAnnotationSetRefListOffsets;
    private final SparseBoolArray deletedAnnotationsDirectoryOffsets;
    private final SparseBoolArray deletedClassDataOffsets;
    private final SparseBoolArray deletedCodeOffsets;
    private final SparseBoolArray deletedDebugInfoItemOffsets;
    private final SparseBoolArray deletedFieldIds;
    private final SparseBoolArray deletedMethodIds;
    private final SparseBoolArray deletedProtoIds;
    private final SparseBoolArray deletedStaticValuesOffsets;
    private final SparseBoolArray deletedStringIds;
    private final SparseBoolArray deletedTypeIds;
    private final SparseBoolArray deletedTypeListOffsets;
    private final SparseIntArray fieldIdsMap;
    private final SparseIntArray methodIdsMap;
    private final SparseIntArray protoIdsMap;
    private final SparseIntArray staticValuesOffsetsMap;
    private final SparseIntArray stringIdsMap;
    private final SparseIntArray typeIdsMap;
    private final SparseIntArray typeListOffsetsMap;

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustAnnotationOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustAnnotationSetOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustAnnotationSetRefListOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustAnnotationsDirectoryOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustClassDataOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustCodeOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustDebugInfoItemOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustFieldIdIndex(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustMethodIdIndex(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustProtoIdIndex(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustStaticValuesOffset(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustStringIndex(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustTypeIdIndex(int i) {
    }

    @Override // com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap
    public int adjustTypeListOffset(int i) {
    }

    public void mapAnnotationOffset(int i, int i2) {
    }

    public void mapAnnotationSetOffset(int i, int i2) {
    }

    public void mapAnnotationSetRefListOffset(int i, int i2) {
    }

    public void mapAnnotationsDirectoryOffset(int i, int i2) {
    }

    public void mapClassDataOffset(int i, int i2) {
    }

    public void mapCodeOffset(int i, int i2) {
    }

    public void mapDebugInfoItemOffset(int i, int i2) {
    }

    public void mapFieldIds(int i, int i2) {
    }

    public void mapMethodIds(int i, int i2) {
    }

    public void mapProtoIds(int i, int i2) {
    }

    public void mapStaticValuesOffset(int i, int i2) {
    }

    public void mapStringIds(int i, int i2) {
    }

    public void mapTypeIds(int i, int i2) {
    }

    public void mapTypeListOffset(int i, int i2) {
    }

    public void markAnnotationDeleted(int i) {
    }

    public void markAnnotationSetDeleted(int i) {
    }

    public void markAnnotationSetRefListDeleted(int i) {
    }

    public void markAnnotationsDirectoryDeleted(int i) {
    }

    public void markClassDataDeleted(int i) {
    }

    public void markCodeDeleted(int i) {
    }

    public void markDebugInfoItemDeleted(int i) {
    }

    public void markFieldIdDeleted(int i) {
    }

    public void markMethodIdDeleted(int i) {
    }

    public void markProtoIdDeleted(int i) {
    }

    public void markStaticValuesDeleted(int i) {
    }

    public void markStringIdDeleted(int i) {
    }

    public void markTypeIdDeleted(int i) {
    }

    public void markTypeListDeleted(int i) {
    }
}
