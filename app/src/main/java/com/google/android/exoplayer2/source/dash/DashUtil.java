package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DashUtil {
    private DashUtil() {
    }

    public static DataSpec buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i) {
    }

    private static Representation getFirstRepresentation(Period period, int i) {
    }

    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i, Representation representation, int i2) throws IOException {
    }

    public static Format loadFormatWithDrmInitData(DataSource dataSource, Period period) throws IOException {
    }

    private static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, int i, boolean z) throws IOException {
    }

    public static DashManifest loadManifest(DataSource dataSource, Uri uri) throws IOException {
    }

    public static Format loadSampleFormat(DataSource dataSource, int i, Representation representation, int i2) throws IOException {
    }

    private static ChunkExtractor newChunkExtractor(int i, Format format) {
    }

    public static String resolveCacheKey(Representation representation, RangedUri rangedUri) {
    }

    public static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, boolean z) throws IOException {
    }

    public static DataSpec buildDataSpec(Representation representation, RangedUri rangedUri, int i) {
    }

    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i, Representation representation) throws IOException {
    }

    private static void loadInitializationData(DataSource dataSource, Representation representation, int i, ChunkExtractor chunkExtractor, RangedUri rangedUri) throws IOException {
    }

    public static Format loadSampleFormat(DataSource dataSource, int i, Representation representation) throws IOException {
    }
}
