package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = null;

    private static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {
        private static final FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = null;
        private static final FieldDescriptor COUNTRY_DESCRIPTOR = null;
        private static final FieldDescriptor DEVICE_DESCRIPTOR = null;
        private static final FieldDescriptor FINGERPRINT_DESCRIPTOR = null;
        private static final FieldDescriptor HARDWARE_DESCRIPTOR = null;
        static final AndroidClientInfoEncoder INSTANCE = null;
        private static final FieldDescriptor LOCALE_DESCRIPTOR = null;
        private static final FieldDescriptor MANUFACTURER_DESCRIPTOR = null;
        private static final FieldDescriptor MCCMNC_DESCRIPTOR = null;
        private static final FieldDescriptor MODEL_DESCRIPTOR = null;
        private static final FieldDescriptor OSBUILD_DESCRIPTOR = null;
        private static final FieldDescriptor PRODUCT_DESCRIPTOR = null;
        private static final FieldDescriptor SDKVERSION_DESCRIPTOR = null;

        private AndroidClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {
        static final BatchedLogRequestEncoder INSTANCE = null;
        private static final FieldDescriptor LOGREQUEST_DESCRIPTOR = null;

        private BatchedLogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {
        private static final FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = null;
        private static final FieldDescriptor CLIENTTYPE_DESCRIPTOR = null;
        static final ClientInfoEncoder INSTANCE = null;

        private ClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class LogEventEncoder implements ObjectEncoder<LogEvent> {
        private static final FieldDescriptor EVENTCODE_DESCRIPTOR = null;
        private static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR = null;
        private static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = null;
        static final LogEventEncoder INSTANCE = null;
        private static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = null;
        private static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = null;
        private static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = null;
        private static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = null;

        private LogEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {
        private static final FieldDescriptor CLIENTINFO_DESCRIPTOR = null;
        static final LogRequestEncoder INSTANCE = null;
        private static final FieldDescriptor LOGEVENT_DESCRIPTOR = null;
        private static final FieldDescriptor LOGSOURCENAME_DESCRIPTOR = null;
        private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = null;
        private static final FieldDescriptor QOSTIER_DESCRIPTOR = null;
        private static final FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = null;
        private static final FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = null;

        private LogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {
        static final NetworkConnectionInfoEncoder INSTANCE = null;
        private static final FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = null;
        private static final FieldDescriptor NETWORKTYPE_DESCRIPTOR = null;

        private NetworkConnectionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
    }
}
