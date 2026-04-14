package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.util.ByteInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class EncodedValue extends TableOfContents.Section.Item<EncodedValue> {
    public byte[] data;

    /* renamed from: com.tencent.tinker.android.dex.EncodedValue$1 */
    class C16331 implements ByteInput {
        private int position;
        final /* synthetic */ EncodedValue this$0;

        C16331(EncodedValue encodedValue) {
        }

        @Override // com.tencent.tinker.android.dex.util.ByteInput
        public byte readByte() {
        }
    }

    public EncodedValue(int i, byte[] bArr) {
    }

    public ByteInput asByteInput() {
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

    public int compareTo(EncodedValue encodedValue) {
    }
}
