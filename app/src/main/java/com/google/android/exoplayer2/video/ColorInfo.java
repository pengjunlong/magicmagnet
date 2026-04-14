package com.google.android.exoplayer2.video;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ColorInfo implements Bundleable {
    public static final Bundleable.Creator<ColorInfo> CREATOR = null;
    private static final String FIELD_COLOR_RANGE = null;
    private static final String FIELD_COLOR_SPACE = null;
    private static final String FIELD_COLOR_TRANSFER = null;
    private static final String FIELD_HDR_STATIC_INFO = null;
    public static final ColorInfo SDR_BT709_LIMITED = null;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
    }

    public static /* synthetic */ ColorInfo dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    public static boolean isTransferHdr(ColorInfo colorInfo) {
    }

    @Pure
    public static int isoColorPrimariesToColorSpace(int i) {
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
    }

    private static /* synthetic */ ColorInfo lambda$static$0(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public String toString() {
    }
}
