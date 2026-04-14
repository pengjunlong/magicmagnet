package p000;

import com.magicmagnet.data.bean.KaiyanResponse;
import com.magicmagnet.data.bean.KaiyanTabResponse;
import com.magicmagnet.data.bean.KaiyanWorksResponse;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface c00 {

    @xc0
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static /* synthetic */ jl0 bpdqqiQNVROMLC1ll1l1l11(c00 c00Var, int i, int i2, int i3, String str, String str2, int i4, float f, String str3, String str4, String str5, String str6, int i5, int i6, Object obj) {
        }

        public static /* synthetic */ jl0 dbpqdHhmDSIHIJiwc1ll1l1(c00 c00Var, int i, int i2, int i3, String str, int i4, float f, String str2, String str3, String str4, String str5, int i5, int i6, Object obj) {
        }

        public static /* synthetic */ jl0 dpbdbdpbLwkLpObyKsq1lll1(c00 c00Var, int i, int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5, String str6, int i5, int i6, Object obj) {
        }

        public static /* synthetic */ jl0 dpbdpqRKAscW1lll1l(c00 c00Var, int i, int i2, int i3, String str, int i4, String str2, String str3, String str4, String str5, int i5, int i6, Object obj) {
        }

        public static /* synthetic */ jl0 dqqppqiKzJi1l1lll1l(c00 c00Var, int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, int i3, int i4, Object obj) {
        }
    }

    @ui("/api/v4/categories/videoList")
    jl0<KaiyanResponse> bpdqqiQNVROMLC1ll1l1l11(@dy0("start") int i, @dy0("num") int i2, @dy0("id") int i3, @dy0("strategy") String str, @dy0("udid") String str2, @dy0("vc") int i4, @dy0("vn") String str3, @dy0("deviceModel") String str4, @dy0("first_channel") String str5, @dy0("last_channel") String str6, @dy0("system_version_code") int i5);

    @ui("/api/v1/tag/videos")
    jl0<KaiyanResponse> dbpqdHhmDSIHIJiwc1ll1l1(@dy0("start") int i, @dy0("num") int i2, @dy0("id") int i3, @dy0("strategy") String str, @dy0("udid") String str2, @dy0("vc") int i4, @dy0("vn") float f, @dy0("size") String str3, @dy0("deviceModel") String str4, @dy0("first_channel") String str5, @dy0("last_channel") String str6, @dy0("system_version_code") int i5);

    @ui("/api/v5/userInfo/tab")
    jl0<KaiyanTabResponse> dpbdbdpbLwkLpObyKsq1lll1(@dy0("id") int i, @dy0("userType") String str, @dy0("udid") String str2, @dy0("vc") int i2, @dy0("vn") String str3, @dy0("deviceModel") String str4, @dy0("first_channel") String str5, @dy0("last_channel") String str6, @dy0("system_version_code") int i3);

    @ui("/api/v1/tag/videos")
    jl0<KaiyanResponse> dpbdpqRKAscW1lll1l(@dy0("start") int i, @dy0("num") int i2, @dy0("id") int i3, @dy0("udid") String str, @dy0("vc") int i4, @dy0("vn") float f, @dy0("size") String str2, @dy0("deviceModel") String str3, @dy0("first_channel") String str4, @dy0("last_channel") String str5, @dy0("system_version_code") int i5);

    @ui("/api/v5/userInfo/tab/works")
    jl0<KaiyanWorksResponse> dqqppqiKzJi1l1lll1l(@dy0("uid") int i, @dy0("start") int i2, @dy0("num") int i3, @dy0("udid") String str, @dy0("vc") int i4, @dy0("vn") String str2, @dy0("deviceModel") String str3, @dy0("first_channel") String str4, @dy0("last_channel") String str5, @dy0("system_version_code") int i5);
}
