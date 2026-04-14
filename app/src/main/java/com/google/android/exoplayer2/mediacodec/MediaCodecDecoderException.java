package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final MediaCodecInfo codecInfo;
    public final String diagnosticInfo;

    public MediaCodecDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
    }

    private static String getDiagnosticInfoV21(Throwable th) {
    }
}
