package p000;

import com.magicmagnet.data.bean.SoFanFileResult;
import com.magicmagnet.data.bean.SoFanParseResult;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface vk1 {

    @xc0
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static /* synthetic */ jl0 dbpqdHhmDSIHIJiwc1ll1l1(vk1 vk1Var, String str, String str2, int i, Object obj) {
        }

        public static /* synthetic */ jl0 dpbdbdpbLwkLpObyKsq1lll1(vk1 vk1Var, String str, String str2, int i, Object obj) {
        }
    }

    @ui("/edama/sofan/weiyun/ajx.php")
    jl0<SoFanFileResult> dbpqdHhmDSIHIJiwc1ll1l1(@dy0("_ajax") String str, @dy0("data") String str2);

    @ui("/edama/sofan/weiyun/ajx.php")
    jl0<SoFanParseResult> dpbdbdpbLwkLpObyKsq1lll1(@dy0("_ajax") String str, @dy0("data") String str2);
}
