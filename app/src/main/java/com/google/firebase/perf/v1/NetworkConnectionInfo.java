package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class NetworkConnectionInfo extends GeneratedMessageLite<NetworkConnectionInfo, Builder> implements NetworkConnectionInfoOrBuilder {
    private static final NetworkConnectionInfo DEFAULT_INSTANCE = null;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<NetworkConnectionInfo> PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_;

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$1 */
    static /* synthetic */ class C11881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f122xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NetworkConnectionInfo, Builder> implements NetworkConnectionInfoOrBuilder {
        /* synthetic */ Builder(C11881 c11881) {
        }

        public Builder clearMobileSubtype() {
        }

        public Builder clearNetworkType() {
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public MobileSubtype getMobileSubtype() {
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public NetworkType getNetworkType() {
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public boolean hasMobileSubtype() {
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public boolean hasNetworkType() {
        }

        public Builder setMobileSubtype(MobileSubtype mobileSubtype) {
        }

        public Builder setNetworkType(NetworkType networkType) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class MobileSubtype implements Internal.EnumLite {
        private static final /* synthetic */ MobileSubtype[] $VALUES = null;
        public static final MobileSubtype CDMA = null;
        public static final int CDMA_VALUE = 4;
        public static final MobileSubtype COMBINED = null;
        public static final int COMBINED_VALUE = 100;
        public static final MobileSubtype EDGE = null;
        public static final int EDGE_VALUE = 2;
        public static final MobileSubtype EHRPD = null;
        public static final int EHRPD_VALUE = 14;
        public static final MobileSubtype EVDO_0 = null;
        public static final int EVDO_0_VALUE = 5;
        public static final MobileSubtype EVDO_A = null;
        public static final int EVDO_A_VALUE = 6;
        public static final MobileSubtype EVDO_B = null;
        public static final int EVDO_B_VALUE = 12;
        public static final MobileSubtype GPRS = null;
        public static final int GPRS_VALUE = 1;
        public static final MobileSubtype GSM = null;
        public static final int GSM_VALUE = 16;
        public static final MobileSubtype HSDPA = null;
        public static final int HSDPA_VALUE = 8;
        public static final MobileSubtype HSPA = null;
        public static final MobileSubtype HSPAP = null;
        public static final int HSPAP_VALUE = 15;
        public static final int HSPA_VALUE = 10;
        public static final MobileSubtype HSUPA = null;
        public static final int HSUPA_VALUE = 9;
        public static final MobileSubtype IDEN = null;
        public static final int IDEN_VALUE = 11;
        public static final MobileSubtype IWLAN = null;
        public static final int IWLAN_VALUE = 18;
        public static final MobileSubtype LTE = null;
        public static final MobileSubtype LTE_CA = null;
        public static final int LTE_CA_VALUE = 19;
        public static final int LTE_VALUE = 13;
        public static final MobileSubtype RTT = null;
        public static final int RTT_VALUE = 7;
        public static final MobileSubtype TD_SCDMA = null;
        public static final int TD_SCDMA_VALUE = 17;
        public static final MobileSubtype UMTS = null;
        public static final int UMTS_VALUE = 3;
        public static final MobileSubtype UNKNOWN_MOBILE_SUBTYPE = null;
        public static final int UNKNOWN_MOBILE_SUBTYPE_VALUE = 0;
        private static final Internal.EnumLiteMap<MobileSubtype> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$1 */
        class C11891 implements Internal.EnumLiteMap<MobileSubtype> {
            C11891() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ MobileSubtype findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MobileSubtype findValueByNumber(int i) {
            }
        }

        private static final class MobileSubtypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private MobileSubtypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private MobileSubtype(String str, int i, int i2) {
        }

        public static MobileSubtype forNumber(int i) {
        }

        public static Internal.EnumLiteMap<MobileSubtype> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static MobileSubtype valueOf(String str) {
        }

        public static MobileSubtype[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static MobileSubtype valueOf(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class NetworkType implements Internal.EnumLite {
        private static final /* synthetic */ NetworkType[] $VALUES = null;
        public static final NetworkType BLUETOOTH = null;
        public static final int BLUETOOTH_VALUE = 7;
        public static final NetworkType DUMMY = null;
        public static final int DUMMY_VALUE = 8;
        public static final NetworkType ETHERNET = null;
        public static final int ETHERNET_VALUE = 9;
        public static final NetworkType MOBILE = null;
        public static final NetworkType MOBILE_CBS = null;
        public static final int MOBILE_CBS_VALUE = 12;
        public static final NetworkType MOBILE_DUN = null;
        public static final int MOBILE_DUN_VALUE = 4;
        public static final NetworkType MOBILE_EMERGENCY = null;
        public static final int MOBILE_EMERGENCY_VALUE = 15;
        public static final NetworkType MOBILE_FOTA = null;
        public static final int MOBILE_FOTA_VALUE = 10;
        public static final NetworkType MOBILE_HIPRI = null;
        public static final int MOBILE_HIPRI_VALUE = 5;
        public static final NetworkType MOBILE_IA = null;
        public static final int MOBILE_IA_VALUE = 14;
        public static final NetworkType MOBILE_IMS = null;
        public static final int MOBILE_IMS_VALUE = 11;
        public static final NetworkType MOBILE_MMS = null;
        public static final int MOBILE_MMS_VALUE = 2;
        public static final NetworkType MOBILE_SUPL = null;
        public static final int MOBILE_SUPL_VALUE = 3;
        public static final int MOBILE_VALUE = 0;
        public static final NetworkType NONE = null;
        public static final int NONE_VALUE = -1;
        public static final NetworkType PROXY = null;
        public static final int PROXY_VALUE = 16;
        public static final NetworkType VPN = null;
        public static final int VPN_VALUE = 17;
        public static final NetworkType WIFI = null;
        public static final NetworkType WIFI_P2P = null;
        public static final int WIFI_P2P_VALUE = 13;
        public static final int WIFI_VALUE = 1;
        public static final NetworkType WIMAX = null;
        public static final int WIMAX_VALUE = 6;
        private static final Internal.EnumLiteMap<NetworkType> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$1 */
        class C11901 implements Internal.EnumLiteMap<NetworkType> {
            C11901() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ NetworkType findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NetworkType findValueByNumber(int i) {
            }
        }

        private static final class NetworkTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private NetworkTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private NetworkType(String str, int i, int i2) {
        }

        public static NetworkType forNumber(int i) {
        }

        public static Internal.EnumLiteMap<NetworkType> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static NetworkType valueOf(String str) {
        }

        public static NetworkType[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static NetworkType valueOf(int i) {
        }
    }

    private NetworkConnectionInfo() {
    }

    static /* synthetic */ NetworkConnectionInfo access$000() {
    }

    static /* synthetic */ void access$100(NetworkConnectionInfo networkConnectionInfo, NetworkType networkType) {
    }

    static /* synthetic */ void access$200(NetworkConnectionInfo networkConnectionInfo) {
    }

    static /* synthetic */ void access$300(NetworkConnectionInfo networkConnectionInfo, MobileSubtype mobileSubtype) {
    }

    static /* synthetic */ void access$400(NetworkConnectionInfo networkConnectionInfo) {
    }

    private void clearMobileSubtype() {
    }

    private void clearNetworkType() {
    }

    public static NetworkConnectionInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<NetworkConnectionInfo> parser() {
    }

    private void setMobileSubtype(MobileSubtype mobileSubtype) {
    }

    private void setNetworkType(NetworkType networkType) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public MobileSubtype getMobileSubtype() {
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public NetworkType getNetworkType() {
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public boolean hasMobileSubtype() {
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public boolean hasNetworkType() {
    }

    public static Builder newBuilder(NetworkConnectionInfo networkConnectionInfo) {
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static NetworkConnectionInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static NetworkConnectionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static NetworkConnectionInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static NetworkConnectionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
