package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = null;

    /* renamed from: com.google.android.exoplayer2.text.SubtitleDecoderFactory$1 */
    class C02011 implements SubtitleDecoderFactory {
        C02011() {
        }

        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
        }

        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
        }
    }

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
