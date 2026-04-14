package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = null;

    private static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final CrashlyticsReportApplicationExitInfoEncoder INSTANCE = null;
        private static final FieldDescriptor PID_DESCRIPTOR = null;
        private static final FieldDescriptor PROCESSNAME_DESCRIPTOR = null;
        private static final FieldDescriptor PSS_DESCRIPTOR = null;
        private static final FieldDescriptor REASONCODE_DESCRIPTOR = null;
        private static final FieldDescriptor RSS_DESCRIPTOR = null;
        private static final FieldDescriptor TIMESTAMP_DESCRIPTOR = null;
        private static final FieldDescriptor TRACEFILE_DESCRIPTOR = null;

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = null;
        private static final FieldDescriptor KEY_DESCRIPTOR = null;
        private static final FieldDescriptor VALUE_DESCRIPTOR = null;

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {
        private static final FieldDescriptor BUILDVERSION_DESCRIPTOR = null;
        private static final FieldDescriptor DISPLAYVERSION_DESCRIPTOR = null;
        private static final FieldDescriptor GMPAPPID_DESCRIPTOR = null;
        private static final FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = null;
        static final CrashlyticsReportEncoder INSTANCE = null;
        private static final FieldDescriptor NDKPAYLOAD_DESCRIPTOR = null;
        private static final FieldDescriptor PLATFORM_DESCRIPTOR = null;
        private static final FieldDescriptor SDKVERSION_DESCRIPTOR = null;
        private static final FieldDescriptor SESSION_DESCRIPTOR = null;

        private CrashlyticsReportEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {
        private static final FieldDescriptor FILES_DESCRIPTOR = null;
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = null;
        private static final FieldDescriptor ORGID_DESCRIPTOR = null;

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {
        private static final FieldDescriptor CONTENTS_DESCRIPTOR = null;
        private static final FieldDescriptor FILENAME_DESCRIPTOR = null;
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = null;

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {
        private static final FieldDescriptor DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = null;
        private static final FieldDescriptor DEVELOPMENTPLATFORM_DESCRIPTOR = null;
        private static final FieldDescriptor DISPLAYVERSION_DESCRIPTOR = null;
        private static final FieldDescriptor IDENTIFIER_DESCRIPTOR = null;
        private static final FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = null;
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = null;
        private static final FieldDescriptor ORGANIZATION_DESCRIPTOR = null;
        private static final FieldDescriptor VERSION_DESCRIPTOR = null;

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {
        private static final FieldDescriptor CLSID_DESCRIPTOR = null;
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = null;

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {
        private static final FieldDescriptor ARCH_DESCRIPTOR = null;
        private static final FieldDescriptor CORES_DESCRIPTOR = null;
        private static final FieldDescriptor DISKSPACE_DESCRIPTOR = null;
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = null;
        private static final FieldDescriptor MANUFACTURER_DESCRIPTOR = null;
        private static final FieldDescriptor MODELCLASS_DESCRIPTOR = null;
        private static final FieldDescriptor MODEL_DESCRIPTOR = null;
        private static final FieldDescriptor RAM_DESCRIPTOR = null;
        private static final FieldDescriptor SIMULATOR_DESCRIPTOR = null;
        private static final FieldDescriptor STATE_DESCRIPTOR = null;

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {
        private static final FieldDescriptor APP_DESCRIPTOR = null;
        private static final FieldDescriptor CRASHED_DESCRIPTOR = null;
        private static final FieldDescriptor DEVICE_DESCRIPTOR = null;
        private static final FieldDescriptor ENDEDAT_DESCRIPTOR = null;
        private static final FieldDescriptor EVENTS_DESCRIPTOR = null;
        private static final FieldDescriptor GENERATORTYPE_DESCRIPTOR = null;
        private static final FieldDescriptor GENERATOR_DESCRIPTOR = null;
        private static final FieldDescriptor IDENTIFIER_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEncoder INSTANCE = null;
        private static final FieldDescriptor OS_DESCRIPTOR = null;
        private static final FieldDescriptor STARTEDAT_DESCRIPTOR = null;
        private static final FieldDescriptor USER_DESCRIPTOR = null;

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {
        private static final FieldDescriptor BACKGROUND_DESCRIPTOR = null;
        private static final FieldDescriptor CUSTOMATTRIBUTES_DESCRIPTOR = null;
        private static final FieldDescriptor EXECUTION_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = null;
        private static final FieldDescriptor INTERNALKEYS_DESCRIPTOR = null;
        private static final FieldDescriptor UIORIENTATION_DESCRIPTOR = null;

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder */
    private static final class C1120x99c932db implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        private static final FieldDescriptor BASEADDRESS_DESCRIPTOR = null;
        static final C1120x99c932db INSTANCE = null;
        private static final FieldDescriptor NAME_DESCRIPTOR = null;
        private static final FieldDescriptor SIZE_DESCRIPTOR = null;
        private static final FieldDescriptor UUID_DESCRIPTOR = null;

        private C1120x99c932db() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {
        private static final FieldDescriptor APPEXITINFO_DESCRIPTOR = null;
        private static final FieldDescriptor BINARIES_DESCRIPTOR = null;
        private static final FieldDescriptor EXCEPTION_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = null;
        private static final FieldDescriptor SIGNAL_DESCRIPTOR = null;
        private static final FieldDescriptor THREADS_DESCRIPTOR = null;

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder */
    private static final class C1121x55689506 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        private static final FieldDescriptor CAUSEDBY_DESCRIPTOR = null;
        private static final FieldDescriptor FRAMES_DESCRIPTOR = null;
        static final C1121x55689506 INSTANCE = null;
        private static final FieldDescriptor OVERFLOWCOUNT_DESCRIPTOR = null;
        private static final FieldDescriptor REASON_DESCRIPTOR = null;
        private static final FieldDescriptor TYPE_DESCRIPTOR = null;

        private C1121x55689506() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        private static final FieldDescriptor ADDRESS_DESCRIPTOR = null;
        private static final FieldDescriptor CODE_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = null;
        private static final FieldDescriptor NAME_DESCRIPTOR = null;

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        private static final FieldDescriptor FRAMES_DESCRIPTOR = null;
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = null;
        private static final FieldDescriptor NAME_DESCRIPTOR = null;

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder */
    private static final class C1122xc3999712 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        private static final FieldDescriptor FILE_DESCRIPTOR = null;
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = null;
        static final C1122xc3999712 INSTANCE = null;
        private static final FieldDescriptor OFFSET_DESCRIPTOR = null;
        private static final FieldDescriptor PC_DESCRIPTOR = null;
        private static final FieldDescriptor SYMBOL_DESCRIPTOR = null;

        private C1122xc3999712() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {
        private static final FieldDescriptor BATTERYLEVEL_DESCRIPTOR = null;
        private static final FieldDescriptor BATTERYVELOCITY_DESCRIPTOR = null;
        private static final FieldDescriptor DISKUSED_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = null;
        private static final FieldDescriptor ORIENTATION_DESCRIPTOR = null;
        private static final FieldDescriptor PROXIMITYON_DESCRIPTOR = null;
        private static final FieldDescriptor RAMUSED_DESCRIPTOR = null;

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {
        private static final FieldDescriptor APP_DESCRIPTOR = null;
        private static final FieldDescriptor DEVICE_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventEncoder INSTANCE = null;
        private static final FieldDescriptor LOG_DESCRIPTOR = null;
        private static final FieldDescriptor TIMESTAMP_DESCRIPTOR = null;
        private static final FieldDescriptor TYPE_DESCRIPTOR = null;

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {
        private static final FieldDescriptor CONTENT_DESCRIPTOR = null;
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = null;

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {
        private static final FieldDescriptor BUILDVERSION_DESCRIPTOR = null;
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = null;
        private static final FieldDescriptor JAILBROKEN_DESCRIPTOR = null;
        private static final FieldDescriptor PLATFORM_DESCRIPTOR = null;
        private static final FieldDescriptor VERSION_DESCRIPTOR = null;

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {
        private static final FieldDescriptor IDENTIFIER_DESCRIPTOR = null;
        static final CrashlyticsReportSessionUserEncoder INSTANCE = null;

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        }

        public void encode(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
    }
}
