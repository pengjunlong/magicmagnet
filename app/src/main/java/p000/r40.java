package p000;

import com.magicmagnet.data.bean.LXFileList;
import com.magicmagnet.data.bean.LXResult;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface r40 {

    @xc0
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static /* synthetic */ jl0 dbpqdHhmDSIHIJiwc1ll1l1(r40 r40Var, String str, String str2, String str3, String str4, int i, Object obj) {
        }

        public static /* synthetic */ jl0 dpbdbdpbLwkLpObyKsq1lll1(r40 r40Var, String str, String str2, String str3, String str4, int i, Object obj) {
        }
    }

    @hg
    @nq0("download.hash")
    @un({"X-Requested-With: XMLHttpRequest"})
    jl0<LXResult> dbpqdHhmDSIHIJiwc1ll1l1(@rc("hash_key") String str, @pn("Cookie") String str2, @pn("User-Agent") String str3, @pn("Y-Requested-With") String str4);

    @hg
    @nq0("hash_list.hash")
    @un({"X-Requested-With: XMLHttpRequest"})
    jl0<LXFileList> dpbdbdpbLwkLpObyKsq1lll1(@rc("hash_value") String str, @pn("Cookie") String str2, @pn("User-Agent") String str3, @pn("Y-Requested-With") String str4);
}
