package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.TableOfContents;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Code extends TableOfContents.Section.Item<Code> {
    public CatchHandler[] catchHandlers;
    public int debugInfoOffset;
    public int insSize;
    public short[] instructions;
    public int outsSize;
    public int registersSize;
    public Try[] tries;

    public static class CatchHandler implements Comparable<CatchHandler> {
        public int[] addresses;
        public int catchAllAddress;
        public int offset;
        public int[] typeIndexes;

        public CatchHandler(int[] iArr, int[] iArr2, int i, int i2) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(CatchHandler catchHandler) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(CatchHandler catchHandler) {
        }
    }

    public static class Try implements Comparable<Try> {
        public int catchHandlerIndex;
        public int instructionCount;
        public int startAddress;

        public Try(int i, int i2, int i3) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Try r1) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Try r3) {
        }
    }

    public Code(int i, int i2, int i3, int i4, int i5, short[] sArr, Try[] tryArr, CatchHandler[] catchHandlerArr) {
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

    public int compareTo(Code code) {
    }
}
