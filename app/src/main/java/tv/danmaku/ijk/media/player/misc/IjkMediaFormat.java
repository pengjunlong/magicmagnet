package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class IjkMediaFormat implements IMediaFormat {
    public static final String CODEC_NAME_H264 = "h264";
    public static final String KEY_IJK_BIT_RATE_UI = "ijk-bit-rate-ui";
    public static final String KEY_IJK_CHANNEL_UI = "ijk-channel-ui";
    public static final String KEY_IJK_CODEC_LONG_NAME_UI = "ijk-codec-long-name-ui";
    public static final String KEY_IJK_CODEC_NAME_UI = "ijk-codec-name-ui";
    public static final String KEY_IJK_CODEC_PIXEL_FORMAT_UI = "ijk-pixel-format-ui";
    public static final String KEY_IJK_CODEC_PROFILE_LEVEL_UI = "ijk-profile-level-ui";
    public static final String KEY_IJK_FRAME_RATE_UI = "ijk-frame-rate-ui";
    public static final String KEY_IJK_RESOLUTION_UI = "ijk-resolution-ui";
    public static final String KEY_IJK_SAMPLE_RATE_UI = "ijk-sample-rate-ui";
    private static final Map<String, Formatter> sFormatterMap = null;
    public final IjkMediaMeta.IjkStreamMeta mMediaFormat;

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$1 */
    class C18921 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18921(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$2 */
    class C18932 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18932(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$3 */
    class C18943 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18943(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$4 */
    class C18954 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18954(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$5 */
    class C18965 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18965(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$6 */
    class C18976 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18976(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$7 */
    class C18987 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18987(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$8 */
    class C18998 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C18998(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$9 */
    class C19009 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        C19009(IjkMediaFormat ijkMediaFormat) {
        }

        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
        }
    }

    private static abstract class Formatter {
        private Formatter() {
        }

        protected abstract String doFormat(IjkMediaFormat ijkMediaFormat);

        public String format(IjkMediaFormat ijkMediaFormat) {
        }

        protected String getDefaultString() {
        }

        /* synthetic */ Formatter(C18921 c18921) {
        }
    }

    public IjkMediaFormat(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public int getInteger(String str) {
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    public String getString(String str) {
    }
}
