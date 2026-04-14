package p000;

import android.os.Handler;
import com.magicmagnet.data.bean.FtnData;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.SearchResult;
import com.xunlei.downloadlib.parameter.BtSubTaskDetail;
import com.xunlei.downloadlib.parameter.XLTaskInfo;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class b72 extends pbqbppqpRWpTdZXl1l1ll<ms> implements ls {
    private static long bbdbbpdOJSuInlll111l;
    private static String dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private static int dbbpdqqpdVUhpQ1ll11;
    public static final dbpqdHhmDSIHIJiwc1ll1l1 dqdqbpQposEBDyDxIyyz1ll11 = null;
    private static long qbddqbdJBkudFfhX1ll1l111;
    private Timer bdddqmITkkeGpsxVXHR1l1llll;
    private boolean bpdqqiQNVROMLC1ll1l1l11;
    private iz dbppbdqpeLmcbs11l11;
    private Runnable ddbbbeXHXx111ll;
    private final y40 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private no1 dpbdpqRKAscW1lll1l;
    private final y40 dqpdbEevAufTOvPphbjykClll1l11;
    private final Handler dqpqqqbqQyjyB11111l1;
    private final y40 dqqppqiKzJi1l1lll1l;
    private iz pbppbpqbamJRy11l1l1;
    private long ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private Timer qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.model.XLMagnetLinkModel$requireFileList$1", m1f = "XLMagnetLinkModel.kt", m2l = {131, 152}, m3m = "invokeSuspend")
    @Metadata
    static final class bdddqmITkkeGpsxVXHR1l1llll extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
        final /* synthetic */ sh<List<? extends IData>, mv1> bdddqmITkkeGpsxVXHR1l1llll;
        private /* synthetic */ Object dbppbdqpeLmcbs11l11;
        Object ddbbbeXHXx111ll;
        final /* synthetic */ b72 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        final /* synthetic */ sh<String, mv1> dqdqbpQposEBDyDxIyyz1ll11;
        int dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ String pbppbpqbamJRy11l1l1;
        final /* synthetic */ SearchResult qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.model.XLMagnetLinkModel$requireFileList$1$1", m1f = "XLMagnetLinkModel.kt", m2l = {}, m3m = "invokeSuspend")
        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
            int ddbbbeXHXx111ll;
            final /* synthetic */ sh<String, mv1> dqpdbEevAufTOvPphbjykClll1l11;

            dbpqdHhmDSIHIJiwc1ll1l1(sh<? super String, mv1> shVar, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dbpqdHhmDSIHIJiwc1ll1l1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
            }
        }

        @xc0
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
            public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;

            dpbdbdpbLwkLpObyKsq1lll1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.model.XLMagnetLinkModel$requireFileList$1$4", m1f = "XLMagnetLinkModel.kt", m2l = {}, m3m = "invokeSuspend")
        @Metadata
        static final class dpbdpqRKAscW1lll1l extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
            final /* synthetic */ b72 dbppbdqpeLmcbs11l11;
            int ddbbbeXHXx111ll;
            final /* synthetic */ sh<String, mv1> dqpdbEevAufTOvPphbjykClll1l11;

            dpbdpqRKAscW1lll1l(sh<? super String, mv1> shVar, b72 b72Var, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dpbdpqRKAscW1lll1l> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
            }
        }

        @xc0
        static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<Object> {
            final /* synthetic */ n51 dpbdpqRKAscW1lll1l;

            dqqppqiKzJi1l1lll1l(n51 n51Var) {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        bdddqmITkkeGpsxVXHR1l1llll(String str, b72 b72Var, SearchResult searchResult, sh<? super List<? extends IData>, mv1> shVar, sh<? super String, mv1> shVar2, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super bdddqmITkkeGpsxVXHR1l1llll> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
        public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
        public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ sh<FtnData, mv1> dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(sh<? super FtnData, mv1> shVar, FtnData ftnData) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends v40 implements qh<qqbqbpbFgzQbllll1ll> {
        public static final dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dpbdpqRKAscW1lll1l = null;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
        }

        public final qqbqbpbFgzQbllll1ll dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ qqbqbpbFgzQbllll1ll invoke() {
        }
    }

    @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.model.XLMagnetLinkModel$parse$1$1", m1f = "XLMagnetLinkModel.kt", m2l = {307, 325}, m3m = "invokeSuspend")
    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
        final /* synthetic */ sh<String, mv1> bdddqmITkkeGpsxVXHR1l1llll;
        final /* synthetic */ k72 dbppbdqpeLmcbs11l11;
        int ddbbbeXHXx111ll;
        final /* synthetic */ int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        private /* synthetic */ Object dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ b72 pbppbpqbamJRy11l1l1;
        final /* synthetic */ sh<FtnData, mv1> qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.model.XLMagnetLinkModel$parse$1$1$2", m1f = "XLMagnetLinkModel.kt", m2l = {}, m3m = "invokeSuspend")
        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
            int ddbbbeXHXx111ll;
            final /* synthetic */ sh<String, mv1> dqpdbEevAufTOvPphbjykClll1l11;

            dpbdbdpbLwkLpObyKsq1lll1(sh<? super String, mv1> shVar, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dpbdbdpbLwkLpObyKsq1lll1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
            }
        }

        @bqbpqpbdbJKmwXJCVFIIpXqwGcll1111(m0c = "com.magicmagnet.main.model.XLMagnetLinkModel$parse$1$1$3", m1f = "XLMagnetLinkModel.kt", m2l = {}, m3m = "invokeSuspend")
        @Metadata
        static final class dqqppqiKzJi1l1lll1l extends bp1 implements gi<qqbqbpbFgzQbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1>, Object> {
            final /* synthetic */ b72 dbppbdqpeLmcbs11l11;
            int ddbbbeXHXx111ll;
            final /* synthetic */ Throwable dqpdbEevAufTOvPphbjykClll1l11;
            final /* synthetic */ sh<String, mv1> pbppbpqbamJRy11l1l1;

            dqqppqiKzJi1l1lll1l(Throwable th, b72 b72Var, sh<? super String, mv1> shVar, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dqqppqiKzJi1l1lll1l> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
            }

            @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
            public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
            }
        }

        dbppbdqpeLmcbs11l11(k72 k72Var, b72 b72Var, int i, sh<? super FtnData, mv1> shVar, sh<? super String, mv1> shVar2, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super dbppbdqpeLmcbs11l11> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
        public final qpdqpbkgVDbrePuTwWYxml1ll1111l1<mv1> bdddqmITkkeGpsxVXHR1l1llll(Object obj, qpdqpbkgVDbrePuTwWYxml1ll1111l1<?> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        public final Object dbbpdqqpdVUhpQ1ll11(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(qqbqbpbFgzQbllll1ll qqbqbpbfgzqbllll1ll, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super mv1> qpdqpbkgvdbreputwwyxml1ll1111l1) {
        }

        @Override // p000.bdddpqqFMztFnPuTGZhbpNN1ll11
        public final Object qbddqbdJBkudFfhX1ll1l111(Object obj) {
        }
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final void bpdqqiQNVROMLC1ll1l1l11(String str) {
        }

        public final String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final void ddbbbeXHXx111ll(long j) {
        }

        public final int dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final long dpbdpqRKAscW1lll1l() {
        }

        public final void dqpqqqbqQyjyB11111l1(long j) {
        }

        public final long dqqppqiKzJi1l1lll1l() {
        }

        public final void ppbdpwWWljzmXXdHNabfWhgjl111l11(int i) {
        }
    }

    @xc0
    static final class ddbbbeXHXx111ll extends v40 implements qh<Object> {
        final /* synthetic */ FtnData dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(FtnData ftnData) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    public static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends TimerTask {
        final /* synthetic */ m51 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ sh<FtnData, mv1> dbppbdqpeLmcbs11l11;
        final /* synthetic */ long ddbbbeXHXx111ll;
        final /* synthetic */ b72 dpbdpqRKAscW1lll1l;
        final /* synthetic */ int dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ k72 dqpqqqbqQyjyB11111l1;
        final /* synthetic */ sh<String, mv1> pbppbpqbamJRy11l1l1;
        final /* synthetic */ o51<BtSubTaskDetail> ppbdpwWWljzmXXdHNabfWhgjl111l11;

        @xc0
        static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<Object> {
            final /* synthetic */ o51<BtSubTaskDetail> dpbdpqRKAscW1lll1l;

            bpdqqiQNVROMLC1ll1l1l11(o51<BtSubTaskDetail> o51Var) {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<mv1> {
            final /* synthetic */ b72 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ sh<String, mv1> dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(sh<? super String, mv1> shVar, b72 b72Var) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ b72 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ sh<FtnData, mv1> dbppbdqpeLmcbs11l11;
            final /* synthetic */ long ddbbbeXHXx111ll;
            final /* synthetic */ k72 dpbdpqRKAscW1lll1l;
            final /* synthetic */ int dqpdbEevAufTOvPphbjykClll1l11;
            final /* synthetic */ sh<String, mv1> dqpqqqbqQyjyB11111l1;
            final /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ppbdpwWWljzmXXdHNabfWhgjl111l11;

            @xc0
            static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
                public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

                dbpqdHhmDSIHIJiwc1ll1l1() {
                }

                @Override // p000.qh
                public final Object invoke() {
                }
            }

            @xc0
            /* renamed from: b72$ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll$dpbdbdpbLwkLpObyKsq1lll1$dpbdbdpbLwkLpObyKsq1lll1, reason: collision with other inner class name */
            static final class C1982dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
                public static final C1982dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;

                C1982dpbdbdpbLwkLpObyKsq1lll1() {
                }

                @Override // p000.qh
                public final Object invoke() {
                }
            }

            dpbdbdpbLwkLpObyKsq1lll1(k72 k72Var, b72 b72Var, ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, sh<? super String, mv1> shVar, long j, int i, sh<? super FtnData, mv1> shVar2) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        @xc0
        static final class dpbdpqRKAscW1lll1l extends v40 implements qh<Object> {
            final /* synthetic */ o51<BtSubTaskDetail> dpbdpqRKAscW1lll1l;

            dpbdpqRKAscW1lll1l(o51<BtSubTaskDetail> o51Var) {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @xc0
        static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<Object> {
            public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;

            dqqppqiKzJi1l1lll1l() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(b72 b72Var, m51 m51Var, o51<BtSubTaskDetail> o51Var, k72 k72Var, long j, int i, sh<? super FtnData, mv1> shVar, sh<? super String, mv1> shVar2) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    @Metadata
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<t51> {
        public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;

        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final t51 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ t51 invoke() {
        }
    }

    @xc0
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<Object> {
        final /* synthetic */ String dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(String str) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends v40 implements sh<Throwable, mv1> {
        final /* synthetic */ b72 dpbdpqRKAscW1lll1l;

        dqdqbpQposEBDyDxIyyz1ll11(b72 b72Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(Throwable th) {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements qh<mv1> {
        final /* synthetic */ FtnData bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ k72 ddbbbeXHXx111ll;
        final /* synthetic */ sh<FtnData, mv1> dpbdpqRKAscW1lll1l;
        final /* synthetic */ String dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ long dqpqqqbqQyjyB11111l1;
        final /* synthetic */ b72 ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqpdbEevAufTOvPphbjykClll1l11(sh<? super FtnData, mv1> shVar, FtnData ftnData, b72 b72Var, long j, k72 k72Var, String str) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<mv1> {
        final /* synthetic */ b72 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ sh<String, mv1> dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(sh<? super String, mv1> shVar, b72 b72Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @xc0
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<Object> {
        final /* synthetic */ k72 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(k72 k72Var) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements sh<Throwable, mv1> {
        final /* synthetic */ b72 dpbdpqRKAscW1lll1l;

        pbppbpqbamJRy11l1l1(b72 b72Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(Throwable th) {
        }
    }

    @xc0
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<Object> {
        public static final ppbdpwWWljzmXXdHNabfWhgjl111l11 dpbdpqRKAscW1lll1l = null;

        ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class qbddqbdJBkudFfhX1ll1l111 extends v40 implements qh<String> {
        public static final qbddqbdJBkudFfhX1ll1l111 dpbdpqRKAscW1lll1l = null;

        qbddqbdJBkudFfhX1ll1l111() {
        }

        public final String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    @Metadata
    public static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends TimerTask {
        final /* synthetic */ m51 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ sh<String, mv1> dbppbdqpeLmcbs11l11;
        final /* synthetic */ SearchResult ddbbbeXHXx111ll;
        final /* synthetic */ sh<List<? extends IData>, mv1> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        final /* synthetic */ b72 dpbdpqRKAscW1lll1l;
        final /* synthetic */ long dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ String dqpqqqbqQyjyB11111l1;
        final /* synthetic */ String pbppbpqbamJRy11l1l1;
        final /* synthetic */ o51<XLTaskInfo> ppbdpwWWljzmXXdHNabfWhgjl111l11;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<mv1> {
            final /* synthetic */ b72 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ sh<String, mv1> dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(sh<? super String, mv1> shVar, b72 b72Var) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        @xc0
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
            public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;

            dpbdbdpbLwkLpObyKsq1lll1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @xc0
        static final class dpbdpqRKAscW1lll1l extends v40 implements qh<Object> {
            public static final dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l = null;

            dpbdpqRKAscW1lll1l() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        @Metadata
        static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<mv1> {
            final /* synthetic */ List<k72> bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ b72 dpbdpqRKAscW1lll1l;
            final /* synthetic */ sh<List<? extends IData>, mv1> ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dqqppqiKzJi1l1lll1l(b72 b72Var, List<k72> list, sh<? super List<? extends IData>, mv1> shVar) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(b72 b72Var, m51 m51Var, o51<XLTaskInfo> o51Var, String str, SearchResult searchResult, long j, sh<? super String, mv1> shVar, String str2, sh<? super List<? extends IData>, mv1> shVar2) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    private final void bbdbbNgXIvtfDESTvydOl11lll(long j, k72 k72Var) {
    }

    private final List<k72> bddqqdpgLnHt1ll1l1l(List<k72> list) {
    }

    private final String bdpqbqqdpVtpTLhDYl11ll1l() {
    }

    public static final /* synthetic */ void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(b72 b72Var, long j, k72 k72Var) {
    }

    private final void bqbpbxbDWbYusagGEGEkKZ1ll1l1(k72 k72Var, long j, int i, boolean z, sh<? super FtnData, mv1> shVar, sh<? super String, mv1> shVar2) {
    }

    public static final /* synthetic */ void bqppqdRbgUpzcKwrjaSh1lll1l11(b72 b72Var, k72 k72Var, long j, int i, boolean z, sh shVar, sh shVar2) {
    }

    private final t51 bqpqpbCjWyZxLLtQbYeCDl1l11() {
    }

    private final void bqqqqKuUKQfBoZwqWsGJYYlll111(k72 k72Var, long j, sh<? super FtnData, mv1> shVar, sh<? super String, mv1> shVar2) {
    }

    public static final /* synthetic */ void dbbddpAOiFIsWEXHFvDl11ll1(b72 b72Var, long j) {
    }

    public static final /* synthetic */ boolean dbdpqdqbxaVJPXHgWAxfdYMEQF1111l(b72 b72Var, int i) {
    }

    public static final /* synthetic */ String dbppbpzxVnfullll1() {
    }

    public static final /* synthetic */ void dbqbbqpdqHtvJXil111l1ll(b72 b72Var, long j, String str, SearchResult searchResult, String str2, sh shVar, sh shVar2) {
    }

    private final void dddqbpqXicmakzZohTSxll11l(long j, String str, SearchResult searchResult, String str2, sh<? super List<? extends IData>, mv1> shVar, sh<? super String, mv1> shVar2) {
    }

    public static final /* synthetic */ long ddpbddGpKmMvSPZaXEkLg11l11() {
    }

    public static final /* synthetic */ boolean dpbdppqbVlmCUMWETyfoYOI1l11l1l(b72 b72Var, int i) {
    }

    public static final /* synthetic */ void dpdqpXgfqpODrtwusppe1l1l1l1ll(String str) {
    }

    public static final /* synthetic */ long dpdqqbdppwRMsRSyLKfcWKCxeblll11ll11(b72 b72Var) {
    }

    private final qqbqbpbFgzQbllll1ll dpppqdppqSnABbIYdrll1lll11ll() {
    }

    public static final /* synthetic */ void dqbdbtYbcXnOwavgobEX1111l(b72 b72Var, k72 k72Var, long j, int i, sh shVar, sh shVar2) {
    }

    private final boolean dqdppbTIDavqwXzOuQmLoejlll1l(int i) {
    }

    private static final void dqpqddqpbvPVlymdpLsl11l1ll1(long j, k72 k72Var, b72 b72Var) {
    }

    public static final /* synthetic */ void pbbpbqqbKSyiLKXJmkvAl11lll1ll(long j) {
    }

    public static final /* synthetic */ void pbdpdbqqdJtdUmQAgX1llll1(long j) {
    }

    public static final /* synthetic */ long pbpbpmdJpqmdGNwEepmjpVlll11l1() {
    }

    private static final int pbpdbpqdpIXNqwSGhm111ll1(k72 k72Var, k72 k72Var2) {
    }

    public static final /* synthetic */ void pbpqpdqpDkfTMiEll11l11l(int i) {
    }

    public static final /* synthetic */ void pdpppduUgcghSRP11l11l(b72 b72Var, k72 k72Var, long j, sh shVar, sh shVar2) {
    }

    private final void pdpqbuMsiTd1ll1l1(k72 k72Var, long j) {
    }

    public static final /* synthetic */ String pdqbbpCQzQWOl111l1(b72 b72Var) {
    }

    public static /* synthetic */ int ppbddpbbYwysRtaAnAwzNYP11l11111l(k72 k72Var, k72 k72Var2) {
    }

    private final void ppdqdfATjLvOVDRgppcqyifll1l1lll(k72 k72Var, long j, int i, sh<? super FtnData, mv1> shVar, sh<? super String, mv1> shVar2) {
    }

    private final boolean pppqdppdpWhurwZr1l1111l1(int i) {
    }

    public static final /* synthetic */ int pqqqddFCECdWHkSTrqHcll111111l() {
    }

    public static final /* synthetic */ void qbbqpzukjahUWUWfxIll11lll1(b72 b72Var, k72 k72Var, long j) {
    }

    private final boolean qddqdbuvJUsrNuNes11111lll1(int i) {
    }

    public static /* synthetic */ void qpbqqHZCUeoATyA11ll1l1(long j, k72 k72Var, b72 b72Var) {
    }

    public static final /* synthetic */ List qpdbbbbbmKdyKHlllllll1(b72 b72Var, List list) {
    }

    public static final /* synthetic */ void qqqpbbqdUOEcdwaGGHQOKYwGi1l1l1l1l1(b72 b72Var, boolean z) {
    }

    @Override // p000.ls
    public void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(String str, int i, sh<? super List<? extends IData>, mv1> shVar, sh<? super String, mv1> shVar2) {
    }

    @Override // p000.pbqbppqpRWpTdZXl1l1ll, p000.tp
    public void onDestroy() {
    }

    @eo1
    public final void onUIExit(bdddqqCkEqMQlUMrdYwPuti11l1l1ll1 bdddqqckeqmqlumrdywputi11l1l1ll1) {
    }

    @Override // p000.ls
    public void pdqdddDNpMbeVT11ll11(IData iData, int i, sh<? super FtnData, mv1> shVar, sh<? super String, mv1> shVar2) {
    }

    @Override // p000.pbqbppqpRWpTdZXl1l1ll, p000.tp
    public void ppdqqzXJzQiU11ll11(up upVar) {
    }

    @Override // p000.ls
    public void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(SearchResult searchResult, int i, sh<? super List<? extends IData>, mv1> shVar, sh<? super String, mv1> shVar2) {
    }
}
