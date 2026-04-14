package p000;

import com.magicmagnet.data.bean.OffYunFiles;
import com.magicmagnet.data.bean.OffYunResult;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface qm0 {

    @xc0
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static /* synthetic */ jl0 dbpqdHhmDSIHIJiwc1ll1l1(qm0 qm0Var, String str, String str2, int i, Object obj) {
        }

        public static /* synthetic */ jl0 dpbdbdpbLwkLpObyKsq1lll1(qm0 qm0Var, String str, int i, String str2, int i2, Object obj) {
        }
    }

    @ui("/app/public/index.php/index/api/exjx/hash/{hash}")
    jl0<OffYunFiles> dbpqdHhmDSIHIJiwc1ll1l1(@ms0("hash") String str, @pn("Cookie") String str2);

    @ui("/app/public/index.php/index/api/exjx/hash/{hash}/index/{index}")
    jl0<OffYunResult> dpbdbdpbLwkLpObyKsq1lll1(@ms0("hash") String str, @ms0("index") int i, @pn("Cookie") String str2);
}
