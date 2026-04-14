package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5, long j6) {
        }

        static /* synthetic */ long access$1000(BinarySearchSeekMap binarySearchSeekMap) {
        }

        static /* synthetic */ long access$1100(BinarySearchSeekMap binarySearchSeekMap) {
        }

        static /* synthetic */ long access$1200(BinarySearchSeekMap binarySearchSeekMap) {
        }

        static /* synthetic */ long access$1300(BinarySearchSeekMap binarySearchSeekMap) {
        }

        static /* synthetic */ long access$1400(BinarySearchSeekMap binarySearchSeekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
        }

        public long timeUsToTargetTime(long j) {
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j) {
        }
    }

    protected static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        protected SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        }

        static /* synthetic */ long access$000(SeekOperationParams seekOperationParams) {
        }

        static /* synthetic */ long access$100(SeekOperationParams seekOperationParams) {
        }

        static /* synthetic */ long access$200(SeekOperationParams seekOperationParams) {
        }

        static /* synthetic */ long access$300(SeekOperationParams seekOperationParams) {
        }

        static /* synthetic */ long access$400(SeekOperationParams seekOperationParams) {
        }

        static /* synthetic */ void access$800(SeekOperationParams seekOperationParams, long j, long j2) {
        }

        static /* synthetic */ void access$900(SeekOperationParams seekOperationParams, long j, long j2) {
        }

        protected static long calculateNextSearchBytePosition(long j, long j2, long j3, long j4, long j5, long j6) {
        }

        private long getCeilingBytePosition() {
        }

        private long getFloorBytePosition() {
        }

        private long getNextSearchBytePosition() {
        }

        private long getSeekTimeUs() {
        }

        private long getTargetTimePosition() {
        }

        private void updateNextSearchBytePosition() {
        }

        private void updateSeekCeiling(long j, long j2) {
        }

        private void updateSeekFloor(long j, long j2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j);
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = null;
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i, long j, long j2) {
        }

        static /* synthetic */ int access$500(TimestampSearchResult timestampSearchResult) {
        }

        static /* synthetic */ long access$600(TimestampSearchResult timestampSearchResult) {
        }

        static /* synthetic */ long access$700(TimestampSearchResult timestampSearchResult) {
        }

        public static TimestampSearchResult overestimatedResult(long j, long j2) {
        }

        public static TimestampSearchResult targetFoundResult(long j) {
        }

        public static TimestampSearchResult underestimatedResult(long j, long j2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface TimestampSeeker {
        void onSeekFinished();

        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException;
    }

    protected BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, long j6, int i) {
    }

    protected SeekOperationParams createSeekParamsForTargetTimeUs(long j) {
    }

    public final SeekMap getSeekMap() {
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
    }

    public final boolean isSeeking() {
    }

    protected final void markSeekOperationFinished(boolean z, long j) {
    }

    protected void onSeekOperationFinished(boolean z, long j) {
    }

    protected final int seekToPosition(ExtractorInput extractorInput, long j, PositionHolder positionHolder) {
    }

    public final void setSeekTargetUs(long j) {
    }

    protected final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j) throws IOException {
    }
}
