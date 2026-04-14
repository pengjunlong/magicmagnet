package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.TableOfContents;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ClassDef extends TableOfContents.Section.Item<ClassDef> {
    public static final int NO_INDEX = -1;
    public static final int NO_OFFSET = 0;
    public int accessFlags;
    public int annotationsOffset;
    public int classDataOffset;
    public int interfacesOffset;
    public int sourceFileIndex;
    public int staticValuesOffset;
    public int supertypeIndex;
    public int typeIndex;

    public ClassDef(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // com.tencent.tinker.android.dex.TableOfContents.Section.Item
    public int byteCountInDex() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
    }

    @Override // com.tencent.tinker.android.dex.TableOfContents.Section.Item
    public boolean equals(Object obj) {
    }

    @Override // com.tencent.tinker.android.dex.TableOfContents.Section.Item
    public int hashCode() {
    }

    public int compareTo(ClassDef classDef) {
    }
}
