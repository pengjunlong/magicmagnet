package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import p000.qh;
import p000.v40;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class RealConnection$connectTls$1 extends v40 implements qh<List<? extends Certificate>> {
    final /* synthetic */ Address $address;
    final /* synthetic */ CertificatePinner $certificatePinner;
    final /* synthetic */ Handshake $unverifiedHandshake;

    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
    }

    @Override // p000.qh
    public /* bridge */ /* synthetic */ List<? extends Certificate> invoke() {
    }

    @Override // p000.qh
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<? extends Certificate> invoke2() {
    }
}
