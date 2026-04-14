package com.magicmagnet.mserver.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.magicmagnet.data.bean.BackUp;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.db.Bookmark;
import com.magicmagnet.data.db.History;
import com.magicmagnet.data.user.AnnouncementResponse;
import com.magicmagnet.data.user.BaseResponse;
import com.magicmagnet.data.user.SyncRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.C1729n;
import p000.au;
import p000.bg1;
import p000.bt;
import p000.ct;
import p000.dy1;
import p000.eo1;
import p000.ey1;
import p000.ez1;
import p000.fr;
import p000.fu;
import p000.gi;
import p000.gt;
import p000.gx1;
import p000.hr;
import p000.ht;
import p000.ir;
import p000.ix1;
import p000.jp;
import p000.ko;
import p000.kp;
import p000.mv1;
import p000.np1;
import p000.nr;
import p000.nt;
import p000.nw1;
import p000.oq;
import p000.or;
import p000.oy1;
import p000.pdpppduUgcghSRP11l11l;
import p000.pq;
import p000.pqppppegKDAsRqZIkSmKphiLl1l111l1;
import p000.qh;
import p000.qqqqdpdZawTcmNbkDCA11ll11l1;
import p000.sh;
import p000.tt;
import p000.up;
import p000.v40;
import p000.v51;
import p000.v60;
import p000.xc0;
import p000.y40;
import p000.yd;
import p000.yt;
import p000.yx1;
import p000.zs;
import p000.zt;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UserFragment extends qqqqdpdZawTcmNbkDCA11ll11l1<tt> implements fu, ht, au, yt, or, kp, pq, ct, nt, ir, zs, fr {
    private final y40 bbdbbpdOJSuInlll111l;
    private final y40 bdddqmITkkeGpsxVXHR1l1llll;
    private yx1 bppbpdbCeZVhQNTixBml1lll11l;
    private ix1 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final y40 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final y40 dbbpdqqpdVUhpQ1ll11;
    private final y40 dbppbdqpeLmcbs11l11;
    private final y40 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final y40 dqdqbpQposEBDyDxIyyz1ll11;
    private final y40 pbppbpqbamJRy11l1l1;
    private final y40 qbddqbdJBkudFfhX1ll1l111;
    private final y40 qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private gx1 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private BottomSheetLayout qdqdpyALEmZFGGaahRTIU1ll11;
    public Map<Integer, View> qppqdpppIauLKaAtRkB11111l;

    @Metadata
    static final class bbdbbpdOJSuInlll111l extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bbdbbpdOJSuInlll111l(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements qh<mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bdddqmITkkeGpsxVXHR1l1llll(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class bpbbpOxqjGWQAsycX11ll1l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bpbbpOxqjGWQAsycX11ll1l1(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ v60 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(UserFragment userFragment, v60 v60Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class bppbpdbCeZVhQNTixBml1lll11l extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bppbpdbCeZVhQNTixBml1lll11l(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class bpppdpppqFAXRSTHUAmVJLvH11lllll1l extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<v60, mv1> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(v60 v60Var) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(v60 v60Var) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        bpppdpppqFAXRSTHUAmVJLvH11lllll1l(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class bpppqdQjfPiCT111111111 extends v40 implements gi<String, BackUp, mv1> {
        final /* synthetic */ SyncRequest.Type bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;
        final /* synthetic */ v60 ppbdpwWWljzmXXdHNabfWhgjl111l11;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
            final /* synthetic */ SyncRequest.Type bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;
            final /* synthetic */ String dqpqqqbqQyjyB11111l1;
            final /* synthetic */ v60 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment, SyncRequest.Type type, v60 v60Var, String str) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
            }
        }

        bpppqdQjfPiCT111111111(UserFragment userFragment, SyncRequest.Type type, v60 v60Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(String str, BackUp backUp) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(String str, BackUp backUp) {
        }
    }

    @Metadata
    static final class bpqbbqTOKdRXac1ll1l1lll extends v40 implements qh<np1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bpqbbqTOKdRXac1ll1l1lll(UserFragment userFragment) {
        }

        public final np1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ np1 invoke() {
        }
    }

    @Metadata
    static final class bpqdqbqpviKiORjqgp1l111l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        bpqdqbqpviKiORjqgp1l111l11(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dbbpdqqpdVUhpQ1ll11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dbbpdqqpdVUhpQ1ll11(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 extends v40 implements qh<ez1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(UserFragment userFragment) {
        }

        public final ez1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ez1 invoke() {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @xc0
    public /* synthetic */ class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    @Metadata
    static final class ddbbbeXHXx111ll extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ BackUp bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(UserFragment userFragment, BackUp backUp) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dddbpbpNqzZZJmSG1111l extends v40 implements qh<oy1> {
        public static final dddbpbpNqzZZJmSG1111l dpbdpqRKAscW1lll1l = null;

        dddbpbpNqzZZJmSG1111l() {
        }

        public final oy1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ oy1 invoke() {
        }
    }

    @Metadata
    static final class ddddbbdqIccDnEitQc1l1l1l extends v40 implements qh<bg1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        ddddbbdqIccDnEitQc1l1l1l(UserFragment userFragment) {
        }

        public final bg1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ bg1 invoke() {
        }
    }

    @Metadata
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements qh<ko> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(UserFragment userFragment) {
        }

        public final ko dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ko invoke() {
        }
    }

    @Metadata
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<pdpppduUgcghSRP11l11l> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
        }

        public final pdpppduUgcghSRP11l11l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ pdpppduUgcghSRP11l11l invoke() {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<pqppppegKDAsRqZIkSmKphiLl1l111l1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(UserFragment userFragment) {
        }

        public final pqppppegKDAsRqZIkSmKphiLl1l111l1 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ pqppppegKDAsRqZIkSmKphiLl1l111l1 invoke() {
        }
    }

    @Metadata
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<v60, mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(v60 v60Var) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(v60 v60Var) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            @Metadata
            static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
                final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

                dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment) {
                }

                public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
                }

                @Override // p000.gi
                public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
                }
            }

            dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        dqdqbpQposEBDyDxIyyz1ll11(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ BackUp bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(UserFragment userFragment, BackUp backUp) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @Metadata
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<yd> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(UserFragment userFragment) {
        }

        public final yd dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ yd invoke() {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements gi<AnnouncementResponse.Announcement, Integer, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements gi<DialogInterface, Integer, mv1> {
            final /* synthetic */ AnnouncementResponse.Announcement bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment, AnnouncementResponse.Announcement announcement) {
            }

            private static final void bpdqqiQNVROMLC1ll1l1l11(UserFragment userFragment, AnnouncementResponse.Announcement announcement, Activity activity, Uri uri) {
            }

            public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment, AnnouncementResponse.Announcement announcement, Activity activity, Uri uri) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
            }

            public final void dqqppqiKzJi1l1lll1l(DialogInterface dialogInterface, int i) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        @Metadata
        /* renamed from: com.magicmagnet.mserver.view.UserFragment$dqqppqiKzJi1l1lll1l$dqqppqiKzJi1l1lll1l, reason: collision with other inner class name */
        static final class C2023dqqppqiKzJi1l1lll1l extends v40 implements gi<DialogInterface, Integer, mv1> {
            final /* synthetic */ UserFragment bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ AnnouncementResponse.Announcement dpbdpqRKAscW1lll1l;

            C2023dqqppqiKzJi1l1lll1l(AnnouncementResponse.Announcement announcement, UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
            }

            @Override // p000.gi
            public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
            }
        }

        dqqppqiKzJi1l1lll1l(UserFragment userFragment) {
        }

        private static final void bpdqqiQNVROMLC1ll1l1l11(UserFragment userFragment, AnnouncementResponse.Announcement announcement, Activity activity, Uri uri) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment, AnnouncementResponse.Announcement announcement, Activity activity, Uri uri) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(AnnouncementResponse.Announcement announcement, Integer num) {
        }

        public final void dqqppqiKzJi1l1lll1l(AnnouncementResponse.Announcement announcement, int i) {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements qh<mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        pbppbpqbamJRy11l1l1(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @Metadata
    static final class pdpqbmApOBCmNMwnn1ll111 extends v40 implements qh<yd> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        pdpqbmApOBCmNMwnn1ll111(UserFragment userFragment) {
        }

        public final yd dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ yd invoke() {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<C1729n> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(UserFragment userFragment) {
        }

        public final C1729n dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ C1729n invoke() {
        }
    }

    @Metadata
    static final class qbddqbdJBkudFfhX1ll1l111 extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        qbddqbdJBkudFfhX1ll1l111(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements sh<v60, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(v60 v60Var) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(v60 v60Var) {
        }
    }

    @Metadata
    static final class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<v60, mv1> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(v60 v60Var) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(v60 v60Var) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class qbpbddbpyaPAbpThgWCvm11l11l1 extends v40 implements sh<Exception, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        qbpbddbpyaPAbpThgWCvm11l11l1(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(Exception exc) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(Exception exc) {
        }
    }

    @Metadata
    static final class qdqdpyALEmZFGGaahRTIU1ll11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<v60, mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(v60 v60Var) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(v60 v60Var) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        qdqdpyALEmZFGGaahRTIU1ll11(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class qppqdpppIauLKaAtRkB11111l extends v40 implements sh<View, mv1> {
        final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<v60, mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(v60 v60Var) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(v60 v60Var) {
            }
        }

        @Metadata
        static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<mv1> {
            final /* synthetic */ UserFragment dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(UserFragment userFragment) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        qppqdpppIauLKaAtRkB11111l(UserFragment userFragment) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    private final nr bbbbqbqdppWJqwUrzOvzCyynHqslll1l() {
    }

    public static /* synthetic */ void bbbddbppbHkZyStOxwRl1lll1(UserFragment userFragment, Activity activity, Uri uri) {
    }

    private final void bbbpbdqpbcaiJFLILHVgrofkL1l1l1l(boolean z) {
    }

    private final void bbpbppdbyWAgVaIRmPOgsLl1ll1111l(v60 v60Var) {
    }

    public static /* synthetic */ boolean bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(UserFragment userFragment, v60 v60Var, MenuItem menuItem) {
    }

    private final zt bbqpqppQWI1llllll1l() {
    }

    public static /* synthetic */ void bdpbpsDcyJTPrj1lll11(DialogInterface dialogInterface, int i) {
    }

    private final oy1 bdqddpbdHdAXdLWTdGIMpzClllll11() {
    }

    private static final boolean bdqqdqDqtua11l11l1(UserFragment userFragment, boolean z, MenuItem menuItem) {
    }

    private final void bpbpqbqdpJnMXABHXnGl1ll11lll(v60 v60Var) {
    }

    private static final void bpdbdpbdbSgOKZVkhOgPfvUtl11l1l11(UserFragment userFragment, v60 v60Var, DialogInterface dialogInterface, int i) {
    }

    private final void bpdbpdqbSDCYKyFxRFDrXOojll111(v60 v60Var) {
    }

    private static final void bpdddqdbdIHjDsl1ll1ll(UserFragment userFragment, Activity activity, Uri uri) {
    }

    private final void bppqppdMchpThwHisjikcod1ll11() {
    }

    private static final void bppqpqdImdXYlgl111l11l(UserFragment userFragment, String str, Activity activity, Uri uri) {
    }

    public static final /* synthetic */ tt bqdbqqAlarZsSbAl1ll1l(UserFragment userFragment) {
    }

    private final void bqdbqqpbqTPejjypqgplll1ll1l1(boolean z) {
    }

    public static /* synthetic */ void bqppbbbqLsCdM1llll(DialogInterface dialogInterface, int i) {
    }

    public static final /* synthetic */ zt bqpqpdRGoNS1ll1111l1(UserFragment userFragment) {
    }

    private final pqppppegKDAsRqZIkSmKphiLl1l111l1 bqqqdboFHPLTwaMWMSXnDNNlll11l1() {
    }

    private final gt dbqpqqqDeeyyCuJnUmGLGcbvl11l11() {
    }

    public static final /* synthetic */ gt dpddppbpssQkdaWsxnuFll1l1(UserFragment userFragment) {
    }

    private final hr dpqqpqonhvzMuzONUGiUa111l11l11() {
    }

    public static /* synthetic */ void dqbbbarhSjFxjxEEl1ll11(UserFragment userFragment, Throwable th) {
    }

    public static /* synthetic */ boolean dqbbdbpqbvChgeruisCbWCnl11lllll(UserFragment userFragment, boolean z, MenuItem menuItem) {
    }

    private final bt dqbqdqdpdDjmBPUzEkoOlll1l1llll() {
    }

    public static final /* synthetic */ void dqdbdbddbsXTuiebVrav1l11111l1(UserFragment userFragment) {
    }

    private final void dqqdbdpbqDDIkmksEKxFufZKgZ1l1l11lll() {
    }

    private static final void pbdqqlSueJKUgejs11lllll1l(DialogInterface dialogInterface, int i) {
    }

    private static final void pbpbbdbDgqWVllll11l(androidx.appcompat.app.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, UserFragment userFragment, v60 v60Var, View view) {
    }

    public static final /* synthetic */ View pbpqqqqFBwYCJOfRsCpOLdMl11l11l11(UserFragment userFragment) {
    }

    public static /* synthetic */ void pbqbdpDzmUH1l1ll(UserFragment userFragment, v60 v60Var) {
    }

    public static final /* synthetic */ void pbqdbbLIoUwreKSxbxAll11ll(UserFragment userFragment) {
    }

    public static final /* synthetic */ oy1 pbqddddDusqnIBFOMWnENLpll1111(UserFragment userFragment) {
    }

    private final void pdddbdppbXDXrwiTFfril111ll1() {
    }

    private static final void pddqdpdfpNEYjzViyCS111ll(UserFragment userFragment, v60 v60Var) {
    }

    private final void pdpdqqdusMOjculBX1111l11(v60 v60Var) {
    }

    private final void pdqpdddqVdiDmDB1ll1ll(v60 v60Var) {
    }

    private final void pqdpbdbMIFQJSTVxZl11ll111l(v60 v60Var) {
    }

    private final yd qbbpqRDtzbBqlll1l() {
    }

    private final oq qbbqppqqFyNGaQFr1l1l11() {
    }

    public static /* synthetic */ void qbqddbqpnPHFHyPasib1l1ll11ll(androidx.appcompat.app.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, UserFragment userFragment, v60 v60Var, View view) {
    }

    public static final /* synthetic */ void qbqqdoZvfpl1l111ll(UserFragment userFragment, v60 v60Var) {
    }

    public static final /* synthetic */ void qbqqdqdboCzbEGhywRrZi1lll1l1l(UserFragment userFragment) {
    }

    public static final /* synthetic */ void qdbbdhsmdYJSqeHT1111ll1l(UserFragment userFragment, boolean z) {
    }

    private static final void qdpqqddfnOtUxPENkGSNa1111ll1l1(DialogInterface dialogInterface, int i) {
    }

    private final jp qdqddftZvRmltIahaEHKjU1l11ll1l1() {
    }

    private static final boolean qpbbdddeJUjFZrllll11ll(UserFragment userFragment, v60 v60Var, MenuItem menuItem) {
    }

    private static final void qpbdqjmuGiXlll1lll11(UserFragment userFragment, Throwable th) {
    }

    public static /* synthetic */ void qpdpdszwYFiQbkll1ll(UserFragment userFragment, String str, Activity activity, Uri uri) {
    }

    public static final /* synthetic */ void qqpbbbpElrBCTDfMihU11111(UserFragment userFragment, v60 v60Var) {
    }

    private final void qqqbbqRaDWEaifHrXcEBrw1ll1l1() {
    }

    public static /* synthetic */ void qqqdbddwLHHSrqKnVcHujUhU1llll(UserFragment userFragment, v60 v60Var, DialogInterface dialogInterface, int i) {
    }

    @Override // p000.yt
    public void bbdbbNgXIvtfDESTvydOl11lll(BaseResponse.Msg msg) {
    }

    @Override // p000.nt
    public void bddqqdpgLnHt1ll1l1l() {
    }

    public void bdpqbmWvwOSl1111() {
    }

    @Override // p000.ot
    public void bdpqbqqdpVtpTLhDYl11ll1l(BaseResponse.Msg msg) {
    }

    @Override // p000.fr
    public void bpbbpOxqjGWQAsycX11ll1l1() {
    }

    @Override // p000.ot
    public void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(String str) {
    }

    @Override // p000.zs
    public void bpppqdQjfPiCT111111111(List<? extends IData> list) {
    }

    @Override // p000.zs
    public void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(String str) {
    }

    @Override // p000.ht
    public void bqdbpBvxFUC1lll11(BackUp backUp) {
    }

    @Override // p000.ht
    public void bqppqddoVGlDvfgOKHTJ1ll11111() {
    }

    public View bqpqdNBFMzNEiipaXQPl11l11ll(int i) {
    }

    @Override // p000.zs
    public void dbppbdqpeLmcbs11l11() {
    }

    @Override // p000.rp
    public void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    protected tt ddbppbpdbjhGMwFHhQLuACGxTll1ll11l() {
    }

    @Override // p000.zs
    public String dddbpbpNqzZZJmSG1111l() {
    }

    @Override // p000.ot
    public void dddqbpqXicmakzZohTSxll11l(Throwable th) {
    }

    @Override // p000.zs
    public void ddpbddGpKmMvSPZaXEkLg11l11(List<? extends IData> list) {
    }

    @Override // p000.au
    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(BaseResponse.Msg msg) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp, p000.ds
    public void dpbdpqRKAscW1lll1l() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    public /* bridge */ /* synthetic */ tt dpbqpXiNmkuFJMoGemM1llll1ll1() {
    }

    @Override // p000.au
    public void dpdqqbdppwRMsRSyLKfcWKCxeblll11ll11(BaseResponse.Msg msg) {
    }

    @Override // p000.or
    public void dpppqdppqSnABbIYdrll1lll11ll(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void dqbpbqXLoKDkRdCKHlKfl11llll1l() {
    }

    @Override // p000.fu
    public void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected up[] dqpqbdWhIsNIidXUell11l111() {
    }

    @Override // p000.ct
    public void dqpqddqpbvPVlymdpLsl11l1ll1(List<? extends Bookmark> list) {
    }

    @Override // p000.fu
    public void dqpqqqbqQyjyB11111l1(v60 v60Var) {
    }

    @Override // p000.kp
    public void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(Bookmark bookmark) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, p000.sp, p000.ds
    public void loading() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @eo1
    public final void onUpdateHistorySwitch(nw1 nw1Var) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void pbbbqppqTbuPhHQEDqbrOKDl11ll1(View view) {
    }

    @Override // p000.yt
    public void pbbpbqqbKSyiLKXJmkvAl11lll1ll(BaseResponse.Msg msg) {
    }

    @Override // p000.ht
    public void pbdbqZLBIrMLYk1l11l1ll1(BackUp backUp) {
    }

    @Override // p000.or
    public void pbddqdbpoVvTyZPOoYl1111(List<? extends History> list) {
    }

    @Override // p000.zs
    public void pbdpdbqqdJtdUmQAgX1llll1() {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected int pddpddbdIotonl1ll1l11() {
    }

    @Override // p000.zs
    public void pdpppduUgcghSRP11l11l(String str) {
    }

    @Override // p000.ht
    public void ppbdpwWWljzmXXdHNabfWhgjl111l11(String str, Throwable th) {
    }

    @Override // p000.ht
    public void ppdpqqqqoCzMAbMiXAsuI1l1lll() {
    }

    @Override // p000.pq
    public void pppqdppdpWhurwZr1l1111l1() {
    }

    @Override // p000.nt
    public void pqqqddFCECdWHkSTrqHcll111111l(List<AnnouncementResponse.Announcement> list) {
    }

    @Override // p000.or
    public void qbbqpzukjahUWUWfxIll11lll1(String str) {
    }

    @Override // p000.zs
    public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(String str) {
    }

    @Override // p000.qqqqdpdZawTcmNbkDCA11ll11l1
    protected void qbdpbdotUKqbANmgeJETNyAM1l111() {
    }

    @Override // p000.au
    public void qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }

    @Override // p000.ht
    public void qbpbddbpyaPAbpThgWCvm11l11l1(String str, Throwable th) {
    }

    @Override // p000.fu
    public void qddqdbuvJUsrNuNes11111lll1(String str) {
    }

    @Override // p000.ht
    public void qpbqqHZCUeoATyA11ll1l1(BaseResponse.Msg msg) {
    }

    @Override // p000.ht
    public void qppqdpppIauLKaAtRkB11111l(BaseResponse.Msg msg) {
    }

    @eo1
    public final void registerPro(v51 v51Var) {
    }

    @eo1
    public final void userLoginIn(dy1 dy1Var) {
    }

    @eo1
    public final void userLogout(ey1 ey1Var) {
    }
}
