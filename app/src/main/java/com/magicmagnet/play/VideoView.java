package com.magicmagnet.play;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.magicmagnet.data.bean.FtnData;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.jv0;
import p000.k82;
import p000.mv1;
import p000.no1;
import p000.o51;
import p000.ppqqbdddbbizlrfgiZJHkZPglKES11l11111;
import p000.qh;
import p000.sh;
import p000.tw1;
import p000.v40;
import p000.xc0;
import p000.y40;
import p000.z80;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class VideoView extends StandardGSYVideoPlayer {
    private sh<? super Boolean, mv1> bbdbbpdOJSuInlll111l;
    private final String bdddqmITkkeGpsxVXHR1l1llll;
    private int bpdqqiQNVROMLC1ll1l1l11;
    public Map<Integer, View> bppbpdbCeZVhQNTixBml1lll11l;
    private FtnData dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final y40 dbbpdqqpdVUhpQ1ll11;
    private final int dbppbdqpeLmcbs11l11;
    private int ddbbbeXHXx111ll;
    private tw1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private IMediaPlayer dpbdpqRKAscW1lll1l;
    private final y40 dqdqbpQposEBDyDxIyyz1ll11;
    private final int dqpdbEevAufTOvPphbjykClll1l11;
    private int dqpqqqbqQyjyB11111l1;
    private no1 pbppbpqbamJRy11l1l1;
    private int ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private boolean qbddqbdJBkudFfhX1ll1l111;
    private long qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @xc0
    static final class bbdbbpdOJSuInlll111l extends v40 implements qh<Object> {
        public static final bbdbbpdOJSuInlll111l dpbdpqRKAscW1lll1l = null;

        bbdbbpdOJSuInlll111l() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements qh<Object> {
        public static final bdddqmITkkeGpsxVXHR1l1llll dpbdpqRKAscW1lll1l = null;

        bdddqmITkkeGpsxVXHR1l1llll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class bpbbpOxqjGWQAsycX11ll1l1 extends v40 implements sh<View, mv1> {
        public static final bpbbpOxqjGWQAsycX11ll1l1 dpbdpqRKAscW1lll1l = null;

        bpbbpOxqjGWQAsycX11ll1l1() {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @xc0
    static final class bppbpdbCeZVhQNTixBml1lll11l extends v40 implements qh<Object> {
        public static final bppbpdbCeZVhQNTixBml1lll11l dpbdpqRKAscW1lll1l = null;

        bppbpdbCeZVhQNTixBml1lll11l() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class bpppdpppqFAXRSTHUAmVJLvH11lllll1l extends v40 implements qh<Object> {
        public static final bpppdpppqFAXRSTHUAmVJLvH11lllll1l dpbdpqRKAscW1lll1l = null;

        bpppdpppqFAXRSTHUAmVJLvH11lllll1l() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class bpppqdQjfPiCT111111111 extends v40 implements sh<View, mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        bpppqdQjfPiCT111111111(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @xc0
    static final class bpqbbqTOKdRXac1ll1l1lll extends v40 implements qh<Object> {
        public static final bpqbbqTOKdRXac1ll1l1lll dpbdpqRKAscW1lll1l = null;

        bpqbbqTOKdRXac1ll1l1lll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class bpqdqbqpviKiORjqgp1l111l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        bpqdqbqpviKiORjqgp1l111l11(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @xc0
    static final class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends v40 implements qh<Object> {
        public static final dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dpbdpqRKAscW1lll1l = null;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class dbbpdqqpdVUhpQ1ll11 extends v40 implements qh<Object> {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ int dpbdpqRKAscW1lll1l;

        dbbpdqqpdVUhpQ1ll11(int i, int i2) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @Metadata
    static final class dbppbdqpeLmcbs11l11 extends v40 implements sh<SharedPreferences.Editor, mv1> {
        final /* synthetic */ VideoView bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ MenuItem dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(MenuItem menuItem, VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(SharedPreferences.Editor editor) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(SharedPreferences.Editor editor) {
        }
    }

    @xc0
    public /* synthetic */ class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    @xc0
    static final class ddbbbeXHXx111ll extends v40 implements qh<Object> {
        final /* synthetic */ boolean dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(boolean z) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dddbpbpNqzZZJmSG1111l extends v40 implements sh<View, mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        @xc0
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<Object> {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public final Object invoke() {
            }
        }

        dddbpbpNqzZZJmSG1111l(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @xc0
    static final class ddddbbdqIccDnEitQc1l1l1l extends v40 implements qh<Object> {
        public static final ddddbbdqIccDnEitQc1l1l1l dpbdpqRKAscW1lll1l = null;

        ddddbbdqIccDnEitQc1l1l1l() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements qh<Object> {
        final /* synthetic */ float dpbdpqRKAscW1lll1l;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(float f) {
        }

        @Override // p000.qh
        public final Object invoke() {
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

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements qh<Runnable> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(VideoView videoView) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(VideoView videoView) {
        }

        private static final void ddbbbeXHXx111ll(VideoView videoView) {
        }

        private static final void dqpdbEevAufTOvPphbjykClll1l11(VideoView videoView) {
        }

        public static /* synthetic */ void dqqppqiKzJi1l1lll1l(VideoView videoView) {
        }

        public final Runnable bpdqqiQNVROMLC1ll1l1l11() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ Runnable invoke() {
        }
    }

    @xc0
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends v40 implements qh<Object> {
        public static final dqdqbpQposEBDyDxIyyz1ll11 dpbdpqRKAscW1lll1l = null;

        dqdqbpQposEBDyDxIyyz1ll11() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements sh<View, mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @xc0
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<Object> {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ List<ITrackInfo> dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(List<? extends ITrackInfo> list, int i) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<ppqqbdddbbizlrfgiZJHkZPglKES11l11111> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(VideoView videoView) {
        }

        public final ppqqbdddbbizlrfgiZJHkZPglKES11l11111 dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ ppqqbdddbbizlrfgiZJHkZPglKES11l11111 invoke() {
        }
    }

    @Metadata
    static final class pbppbpqbamJRy11l1l1 extends v40 implements sh<View, mv1> {
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

        @Metadata
        static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements sh<SharedPreferences.Editor, mv1> {
            final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

            bpdqqiQNVROMLC1ll1l1l11(VideoView videoView) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(SharedPreferences.Editor editor) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(SharedPreferences.Editor editor) {
            }
        }

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements sh<SharedPreferences.Editor, mv1> {
            final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(VideoView videoView) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(SharedPreferences.Editor editor) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(SharedPreferences.Editor editor) {
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
        static final class dqqppqiKzJi1l1lll1l extends v40 implements sh<SharedPreferences.Editor, mv1> {
            final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;

            dqqppqiKzJi1l1lll1l(VideoView videoView) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1(SharedPreferences.Editor editor) {
            }

            @Override // p000.sh
            public /* bridge */ /* synthetic */ mv1 invoke(SharedPreferences.Editor editor) {
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

        pbppbpqbamJRy11l1l1(VideoView videoView) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    @xc0
    static final class pdpqbmApOBCmNMwnn1ll111 extends v40 implements qh<Object> {
        public static final pdpqbmApOBCmNMwnn1ll111 dpbdpqRKAscW1lll1l = null;

        pdpqbmApOBCmNMwnn1ll111() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<Object> {
        final /* synthetic */ boolean dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(boolean z) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class qbddqbdJBkudFfhX1ll1l111 extends v40 implements qh<Object> {
        public static final qbddqbdJBkudFfhX1ll1l111 dpbdpqRKAscW1lll1l = null;

        qbddqbdJBkudFfhX1ll1l111() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements qh<Object> {
        final /* synthetic */ List<ITrackInfo> bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;
        final /* synthetic */ int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(VideoView videoView, List<? extends ITrackInfo> list, int i) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l extends v40 implements qh<Object> {
        final /* synthetic */ boolean bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ int dpbdpqRKAscW1lll1l;

        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(int i, boolean z) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class qdqdpyALEmZFGGaahRTIU1ll11 extends v40 implements qh<Object> {
        final /* synthetic */ z80 dpbdpqRKAscW1lll1l;

        qdqdpyALEmZFGGaahRTIU1ll11(z80 z80Var) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class qppqdpppIauLKaAtRkB11111l extends v40 implements sh<View, mv1> {
        final /* synthetic */ boolean bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ VideoView dpbdpqRKAscW1lll1l;
        final /* synthetic */ MediaInfo dqpqqqbqQyjyB11111l1;
        final /* synthetic */ ITrackInfo[] ppbdpwWWljzmXXdHNabfWhgjl111l11;

        qppqdpppIauLKaAtRkB11111l(VideoView videoView, boolean z, ITrackInfo[] iTrackInfoArr, MediaInfo mediaInfo) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(View view) {
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ boolean bbdbbpdOJSuInlll111l(VideoView videoView, MenuItem menuItem) {
    }

    private final void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(jv0 jv0Var) {
    }

    public static /* synthetic */ boolean bdddqmITkkeGpsxVXHR1l1llll(VideoView videoView, z80 z80Var, MenuItem menuItem) {
    }

    public static final /* synthetic */ void bdpdqYMMfHmzHyUIbllllll1(VideoView videoView, boolean z) {
    }

    private final void bdqbblVddTYAmqrWwacZmi111ll1(MediaInfo mediaInfo, jv0 jv0Var) {
    }

    private static final void bdqpqbqbgFttbl1ll1l(VideoView videoView, IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
    }

    public static final /* synthetic */ ViewGroup bpbbpOxqjGWQAsycX11ll1l1(VideoView videoView) {
    }

    private static final boolean bpbbpbppqsLrtEPjeDMEnOv1l1l1(VideoView videoView, MenuItem menuItem) {
    }

    private final void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll() {
    }

    private final void bpdddqbpEtpkwNYukGjjNs1l111(ITrackInfo[] iTrackInfoArr, IjkMediaPlayer ijkMediaPlayer, jv0 jv0Var) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(VideoView videoView) {
    }

    public static final /* synthetic */ void bppbpdbCeZVhQNTixBml1lll11l(VideoView videoView) {
    }

    public static final /* synthetic */ ppqqbdddbbizlrfgiZJHkZPglKES11l11111 bpppdpppqFAXRSTHUAmVJLvH11lllll1l(VideoView videoView) {
    }

    public static final /* synthetic */ void bpppqdQjfPiCT111111111(VideoView videoView, jv0 jv0Var) {
    }

    private static final void bppqdpqbpvFfYvVMQwal1l1l1(VideoView videoView, List list, IjkMediaPlayer ijkMediaPlayer, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    private static final boolean bpqbbpqpqkDmeOUxxUylkHyYgWv11111(List list, o51 o51Var, VideoView videoView, IjkMediaPlayer ijkMediaPlayer, MenuItem menuItem) {
    }

    public static final /* synthetic */ void bpqbbqTOKdRXac1ll1l1lll(VideoView videoView, jv0 jv0Var) {
    }

    public static final /* synthetic */ String bpqdqbqpviKiORjqgp1l111l11(VideoView videoView) {
    }

    private static final boolean bpqpbicsQtfVpOtr11l1l(o51 o51Var, VideoView videoView, MenuItem menuItem) {
    }

    private final void bqdbpBvxFUC1lll11() {
    }

    private static final void bqdppdGFpODiqhzhhiaXKl11l1(VideoView videoView, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(List list, VideoView videoView, IjkMediaPlayer ijkMediaPlayer, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static final /* synthetic */ void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(VideoView videoView, ITrackInfo[] iTrackInfoArr, IjkMediaPlayer ijkMediaPlayer, jv0 jv0Var) {
    }

    public static /* synthetic */ void dbppbdqpeLmcbs11l11(View view, Animator animator) {
    }

    private static final void dbppbpzxVnfullll1(boolean z, View view, Animator animator) {
    }

    public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(VideoView videoView, o51 o51Var, String[] strArr, MenuItem menuItem) {
    }

    public static /* synthetic */ boolean ddbbbeXHXx111ll(List list, o51 o51Var, VideoView videoView, IjkMediaPlayer ijkMediaPlayer, MenuItem menuItem) {
    }

    public static final /* synthetic */ IMediaPlayer dddbpbpNqzZZJmSG1111l(VideoView videoView) {
    }

    public static final /* synthetic */ void ddddbbdqIccDnEitQc1l1l1l(VideoView videoView, MediaInfo mediaInfo, jv0 jv0Var) {
    }

    private static final void ddpbddGpKmMvSPZaXEkLg11l11(VideoView videoView, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    private static final boolean ddppqbqqbIhInevqvPYIBnGmBIE111lll(VideoView videoView, o51 o51Var, String[] strArr, MenuItem menuItem) {
    }

    public static /* synthetic */ void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(VideoView videoView, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(List list, o51 o51Var, VideoView videoView, IjkMediaPlayer ijkMediaPlayer, MenuItem menuItem) {
    }

    private final String dpbdppqbVlmCUMWETyfoYOI1l11l1l(String str) {
    }

    public static /* synthetic */ boolean dpbdpqRKAscW1lll1l(VideoView videoView, MenuItem menuItem) {
    }

    private static final void dpbdqAKWNZAIXLyehU1lll1lll1(VideoView videoView, View view, boolean z) {
    }

    private final void dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1(ITrackInfo[] iTrackInfoArr, IjkMediaPlayer ijkMediaPlayer, jv0 jv0Var) {
    }

    private final String dpdqqbdppwRMsRSyLKfcWKCxeblll11ll11(String str) {
    }

    private static final void dqbbdddqpLERmaRLiHiDpL1l1l1l(List list, VideoView videoView, IjkMediaPlayer ijkMediaPlayer, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void dqdqbpQposEBDyDxIyyz1ll11(VideoView videoView, List list, IjkMediaPlayer ijkMediaPlayer, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(VideoView videoView, View view, boolean z) {
    }

    public static /* synthetic */ void dqpqqqbqQyjyB11111l1(VideoView videoView, IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
    }

    public static final /* synthetic */ void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(VideoView videoView, ITrackInfo[] iTrackInfoArr, IjkMediaPlayer ijkMediaPlayer, jv0 jv0Var) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(VideoView videoView, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    private final ppqqbdddbbizlrfgiZJHkZPglKES11l11111 getDanmakuController() {
    }

    private final Runnable getDismissControlViewTask() {
    }

    private final void pbdbqZLBIrMLYk1l11l1ll1(jv0 jv0Var) {
    }

    private static final boolean pbddqdbpoVvTyZPOoYl1111(VideoView videoView, z80 z80Var, MenuItem menuItem) {
    }

    @SuppressLint({"NewApi"})
    private final void pbpbpmdJpqmdGNwEepmjpVlll11l1(boolean z) {
    }

    public static /* synthetic */ boolean pbppbpqbamJRy11l1l1(o51 o51Var, VideoView videoView, MenuItem menuItem) {
    }

    public static final /* synthetic */ void pdpqbmApOBCmNMwnn1ll111(VideoView videoView, MediaInfo mediaInfo, jv0 jv0Var) {
    }

    private static final void pdpqqbqbpFAaViLnU1l1ll11l1(VideoView videoView, IjkTimedText ijkTimedText) {
    }

    private final void pdqdddDNpMbeVT11ll11(jv0 jv0Var) {
    }

    public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(VideoView videoView, IjkTimedText ijkTimedText) {
    }

    public static final /* synthetic */ String ppdqqzXJzQiU11ll11(VideoView videoView, String str) {
    }

    private final void ppppqdfPOyVswFHMTylxLClll1l1111(MediaInfo mediaInfo, jv0 jv0Var) {
    }

    private final void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l() {
    }

    private final void pqqqddFCECdWHkSTrqHcll111111l() {
    }

    private final void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(ITrackInfo[] iTrackInfoArr) {
    }

    public static /* synthetic */ void qbddqbdJBkudFfhX1ll1l111(VideoView videoView, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void qbdpqpstJKhhKkXrsOGvbWw1l1llll(boolean z, View view, Animator animator) {
    }

    public static final /* synthetic */ Context qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(VideoView videoView) {
    }

    private static final void qbpbbZWTnlDkwOgZlllll(VideoView videoView, o51 o51Var, DialogInterface dialogInterface, int i) {
    }

    public static final /* synthetic */ void qbpbddbpyaPAbpThgWCvm11l11l1(VideoView videoView, jv0 jv0Var) {
    }

    private static final boolean qbqdqqqqdvTduGNll111l1(List list, o51 o51Var, VideoView videoView, IjkMediaPlayer ijkMediaPlayer, MenuItem menuItem) {
    }

    private static final boolean qddbbpxsbNjqxvn111ll(VideoView videoView, MenuItem menuItem) {
    }

    public static final /* synthetic */ int qdqdpyALEmZFGGaahRTIU1ll11(VideoView videoView) {
    }

    private final void qpbqqHZCUeoATyA11ll1l1() {
    }

    private static final void qpdbbbbbmKdyKHlllllll1(View view, Animator animator) {
    }

    public static final /* synthetic */ ImageView qppqdpppIauLKaAtRkB11111l(VideoView videoView) {
    }

    private final int qqbqbddiRRgLpniPxlUfQzP1l1l1l(Context context) {
    }

    private static final void qqdbbfmUWwoYYpfYHJZdaUO1111llll(VideoView videoView) {
    }

    public static final /* synthetic */ void qqpbppebHUxqEmlGoAJWl1lll(VideoView videoView, boolean z) {
    }

    @SuppressLint({"InlinedApi"})
    private final void setFullScreen(boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void cancelDismissControlViewTimer() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected void changeUiToPauseClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected void changeUiToPlayingBufferingClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToPlayingBufferingShow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected void changeUiToPlayingClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected void changeUiToPrepareingClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToPreparingShow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void clearCurrentCache() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void clickStartIcon() {
    }

    public View dbbpdqqpdVUhpQ1ll11(int i) {
    }

    public final void dbdpqdqbxaVJPXHgWAxfdYMEQF1111l(k82.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void dismissProgressDialog() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected int getBrightnessLayoutId() {
    }

    public final long getDanmakuStartSeekTime() {
    }

    public final FtnData getData() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public ImageView getFullscreenButton() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected int getProgressDialogLayoutId() {
    }

    public final sh<Boolean, mv1> getRotateOptionChange() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public int getShrinkImageRes() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected int getVolumeLayoutId() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void hideAllWidget() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void init(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void lockTouchLogic() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onAutoCompletion() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void onClickUiToggle(MotionEvent motionEvent) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onCompletion() {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onError(int i, int i2) {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onInfo(int i, int i2) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    @SuppressLint({"SetTextI18n"})
    public void onPrepared() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onSeekComplete() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onVideoPause() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onVideoResume() {
    }

    public final void pdqbbpCQzQWOl111l1(long j) {
    }

    public final void ppbddpbbYwysRtaAnAwzNYP11l11111l(int i) {
    }

    public final void setDanmakuStartSeekTime(long j) {
    }

    public final void setData(FtnData ftnData) {
    }

    public final void setRotateOptionChange(sh<? super Boolean, mv1> shVar) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void setViewShowState(View view, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showBrightnessDialog(float f) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    @SuppressLint({"SetTextI18n"})
    protected void showProgressDialog(float f, String str, long j, String str2, long j2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showVolumeDialog(float f, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void startDismissControlViewTimer() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected void updateStartImage() {
    }
}
