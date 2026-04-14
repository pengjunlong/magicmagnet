package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class OggPacket {
    private int currentSegmentIndex;
    private final ParsableByteArray packetArray;
    private final OggPageHeader pageHeader;
    private boolean populated;
    private int segmentCount;

    OggPacket() {
    }

    private int calculatePacketSize(int i) {
    }

    public OggPageHeader getPageHeader() {
    }

    public ParsableByteArray getPayload() {
    }

    public boolean populate(ExtractorInput extractorInput) throws IOException {
    }

    public void reset() {
    }

    public void trimPayload() {
    }
}
