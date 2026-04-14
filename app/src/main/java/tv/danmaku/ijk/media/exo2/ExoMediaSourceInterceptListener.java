package tv.danmaku.ijk.media.exo2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.File;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ExoMediaSourceInterceptListener {
    DataSource.Factory getHttpDataSourceFactory(String str, TransferListener transferListener, int i, int i2, Map<String, String> map, boolean z);

    MediaSource getMediaSource(String str, boolean z, boolean z2, boolean z3, File file);
}
