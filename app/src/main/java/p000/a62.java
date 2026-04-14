package p000;

import com.magicmagnet.data.bean.xlFilmReview.FilmReviewResponse;
import com.magicmagnet.data.bean.xlFilmReview.index.IndexFilmReviewResponse;
import com.magicmagnet.data.bean.xlFilmReview.search.FilmReviewSearchResponse;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface a62 {

    @xc0
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static /* synthetic */ jl0 dbpqdHhmDSIHIJiwc1ll1l1(a62 a62Var, int i, int i2, int i3, String str, int i4, Object obj) {
        }

        public static /* synthetic */ jl0 dpbdbdpbLwkLpObyKsq1lll1(a62 a62Var, int i, String str, long j, int i2, Object obj) {
        }

        public static /* synthetic */ jl0 dqqppqiKzJi1l1lll1l(a62 a62Var, String str, String str2, int i, Object obj) {
        }
    }

    @ui("/sl/xlppc.cinecism.search.api/search")
    jl0<FilmReviewSearchResponse> dbpqdHhmDSIHIJiwc1ll1l1(@dy0("keyword") String str, @dy0("page") int i, @dy0("size") int i2);

    @ui("/sl/cinecism/list")
    jl0<FilmReviewResponse> dpbdbdpbLwkLpObyKsq1lll1(@dy0("size") int i, @dy0("sum") int i2, @dy0("pos") int i3, @dy0("category") String str);

    @ui("/sl/xlppc.cinecismfusion.api/v3/cinecism_rcmd")
    jl0<IndexFilmReviewResponse> dpbdpqRKAscW1lll1l(@dy0("_h") String str, @dy0("_h") String str2);

    @ui("/sl/cinecism/list")
    jl0<FilmReviewResponse> dqqppqiKzJi1l1lll1l(@dy0("size") int i, @dy0("category") String str, @dy0("cursor") long j);
}
