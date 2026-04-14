package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = null;

    /* renamed from: com.google.android.exoplayer2.metadata.MetadataDecoderFactory$1 */
    class C01201 implements MetadataDecoderFactory {
        C01201() {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
        }
    }

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
