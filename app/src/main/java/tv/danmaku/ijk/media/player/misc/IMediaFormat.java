package tv.danmaku.ijk.media.player.misc;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface IMediaFormat {
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_MIME = "mime";
    public static final String KEY_WIDTH = "width";

    int getInteger(String str);

    String getString(String str);
}
