package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.TableOfContents;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DebugInfoItem extends TableOfContents.Section.Item<DebugInfoItem> {
    public static final byte DBG_ADVANCE_LINE = 2;
    public static final byte DBG_ADVANCE_PC = 1;
    public static final byte DBG_END_LOCAL = 5;
    public static final byte DBG_END_SEQUENCE = 0;
    public static final byte DBG_RESTART_LOCAL = 6;
    public static final byte DBG_SET_EPILOGUE_BEGIN = 8;
    public static final byte DBG_SET_FILE = 9;
    public static final byte DBG_SET_PROLOGUE_END = 7;
    public static final byte DBG_START_LOCAL = 3;
    public static final byte DBG_START_LOCAL_EXTENDED = 4;
    public byte[] infoSTM;
    public int lineStart;
    public int[] parameterNames;

    public DebugInfoItem(int i, int i2, int[] iArr, byte[] bArr) {
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

    public int compareTo(DebugInfoItem debugInfoItem) {
    }
}
