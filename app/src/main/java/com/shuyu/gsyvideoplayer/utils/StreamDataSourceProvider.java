package com.shuyu.gsyvideoplayer.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class StreamDataSourceProvider implements IMediaDataSource {
    private final BufferedInputStream bufferedInputStream;

    public StreamDataSourceProvider(BufferedInputStream bufferedInputStream) {
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() throws IOException {
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
    }
}
