package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        /* synthetic */ Results(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, C01101 c01101) {
        }

        private Results(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i, long[] jArr, int[] iArr, long j) {
    }
}
