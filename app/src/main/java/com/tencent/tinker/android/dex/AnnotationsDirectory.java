package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.TableOfContents;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AnnotationsDirectory extends TableOfContents.Section.Item<AnnotationsDirectory> {
    public int classAnnotationsOffset;
    public int[][] fieldAnnotations;
    public int[][] methodAnnotations;
    public int[][] parameterAnnotations;

    public AnnotationsDirectory(int i, int i2, int[][] iArr, int[][] iArr2, int[][] iArr3) {
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

    public int compareTo(AnnotationsDirectory annotationsDirectory) {
    }
}
