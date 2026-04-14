package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class GaplessInfoHolder {
    private static final Pattern GAPLESS_COMMENT_PATTERN = null;
    private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay;
    public int encoderPadding;

    private boolean setFromComment(String str) {
    }

    public boolean hasGaplessInfo() {
    }

    public boolean setFromMetadata(Metadata metadata) {
    }

    public boolean setFromXingHeaderValue(int i) {
    }
}
