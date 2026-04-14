package com.magicmagnet.common.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.magicmagnet.data.bean.DLNADevice;
import com.magicmagnet.data.bean.FtnData;
import kotlin.Metadata;
import p000.qh;
import p000.v40;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DLNAService extends Service {
    private final int bpdqqiQNVROMLC1ll1l1l11;
    private final int ddbbbeXHXx111ll;
    private final int dpbdpqRKAscW1lll1l;
    private final int dqpqqqbqQyjyB11111l1;
    private final int ppbdpwWWljzmXXdHNabfWhgjl111l11;

    @Metadata
    public static final class CancelDLNAReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    @Metadata
    public final class dbpqdHhmDSIHIJiwc1ll1l1 extends Binder {
        final /* synthetic */ DLNAService dbpqdHhmDSIHIJiwc1ll1l1;

        public dbpqdHhmDSIHIJiwc1ll1l1(DLNAService dLNAService) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(String str, DLNADevice dLNADevice, FtnData ftnData) {
        }

        public final void dpbdbdpbLwkLpObyKsq1lll1(String str) {
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
    static final class dqqppqiKzJi1l1lll1l extends v40 implements qh<Object> {
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;

        dqqppqiKzJi1l1lll1l() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    public static final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11(DLNAService dLNAService) {
    }

    public static final /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(DLNAService dLNAService) {
    }

    public static final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1(DLNAService dLNAService) {
    }

    public static final /* synthetic */ int dpbdpqRKAscW1lll1l(DLNAService dLNAService) {
    }

    public static final /* synthetic */ int dqqppqiKzJi1l1lll1l(DLNAService dLNAService) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
    }
}
