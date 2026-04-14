package com.oasisfeng.condom.kit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.oasisfeng.condom.CondomKit;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class NullDeviceIdKit implements CondomKit, CondomKit.SystemServiceSupplier {

    @SuppressLint({"MissingPermission"})
    class CondomTelephonyManager extends TelephonyManager {
        final /* synthetic */ NullDeviceIdKit dbpqdHhmDSIHIJiwc1ll1l1;

        CondomTelephonyManager(NullDeviceIdKit nullDeviceIdKit, Context context) {
        }

        @Override // android.telephony.TelephonyManager
        public String getDeviceId() {
        }

        @Override // android.telephony.TelephonyManager
        public String getDeviceId(int i) {
        }

        @Override // android.telephony.TelephonyManager
        public String getImei() {
        }

        @Override // android.telephony.TelephonyManager
        public String getImei(int i) {
        }

        @Override // android.telephony.TelephonyManager
        public String getLine1Number() {
        }

        @Override // android.telephony.TelephonyManager
        public String getMeid() {
        }

        @Override // android.telephony.TelephonyManager
        public String getMeid(int i) {
        }

        @Override // android.telephony.TelephonyManager
        public String getSimSerialNumber() {
        }

        @Override // android.telephony.TelephonyManager
        public String getSubscriberId() {
        }

        @Override // android.telephony.TelephonyManager
        public void listen(PhoneStateListener phoneStateListener, int i) {
        }
    }

    @Override // com.oasisfeng.condom.CondomKit.SystemServiceSupplier
    public Object dbpqdHhmDSIHIJiwc1ll1l1(Context context, String str) {
    }

    @Override // com.oasisfeng.condom.CondomKit
    public void dpbdbdpbLwkLpObyKsq1lll1(CondomKit.CondomKitRegistry condomKitRegistry) {
    }
}
