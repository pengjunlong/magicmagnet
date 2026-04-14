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
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PerfSession extends GeneratedMessageLite<PerfSession, Builder> implements PerfSessionOrBuilder {
    private static final PerfSession DEFAULT_INSTANCE = null;
    private static volatile Parser<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, SessionVerbosity> sessionVerbosity_converter_ = null;
    private int bitField0_;
    private String sessionId_;
    private Internal.IntList sessionVerbosity_;

    /* renamed from: com.google.firebase.perf.v1.PerfSession$1 */
    class C11951 implements Internal.ListAdapter.Converter<Integer, SessionVerbosity> {
        C11951() {
        }

        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public /* bridge */ /* synthetic */ SessionVerbosity convert(Integer num) {
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public SessionVerbosity convert2(Integer num) {
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfSession$2 */
    static /* synthetic */ class C11962 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f125xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PerfSession, Builder> implements PerfSessionOrBuilder {
        /* synthetic */ Builder(C11951 c11951) {
        }

        public Builder addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
        }

        public Builder addSessionVerbosity(SessionVerbosity sessionVerbosity) {
        }

        public Builder clearSessionId() {
        }

        public Builder clearSessionVerbosity() {
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public String getSessionId() {
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public ByteString getSessionIdBytes() {
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public SessionVerbosity getSessionVerbosity(int i) {
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public int getSessionVerbosityCount() {
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public List<SessionVerbosity> getSessionVerbosityList() {
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public boolean hasSessionId() {
        }

        public Builder setSessionId(String str) {
        }

        public Builder setSessionIdBytes(ByteString byteString) {
        }

        public Builder setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
        }

        private Builder() {
        }
    }

    private PerfSession() {
    }

    static /* synthetic */ PerfSession access$000() {
    }

    static /* synthetic */ void access$100(PerfSession perfSession, String str) {
    }

    static /* synthetic */ void access$200(PerfSession perfSession) {
    }

    static /* synthetic */ void access$300(PerfSession perfSession, ByteString byteString) {
    }

    static /* synthetic */ void access$400(PerfSession perfSession, int i, SessionVerbosity sessionVerbosity) {
    }

    static /* synthetic */ void access$500(PerfSession perfSession, SessionVerbosity sessionVerbosity) {
    }

    static /* synthetic */ void access$600(PerfSession perfSession, Iterable iterable) {
    }

    static /* synthetic */ void access$700(PerfSession perfSession) {
    }

    private void addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
    }

    private void addSessionVerbosity(SessionVerbosity sessionVerbosity) {
    }

    private void clearSessionId() {
    }

    private void clearSessionVerbosity() {
    }

    private void ensureSessionVerbosityIsMutable() {
    }

    public static PerfSession getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<PerfSession> parser() {
    }

    private void setSessionId(String str) {
    }

    private void setSessionIdBytes(ByteString byteString) {
    }

    private void setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public String getSessionId() {
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public ByteString getSessionIdBytes() {
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public SessionVerbosity getSessionVerbosity(int i) {
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public int getSessionVerbosityCount() {
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public List<SessionVerbosity> getSessionVerbosityList() {
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public boolean hasSessionId() {
    }

    public static Builder newBuilder(PerfSession perfSession) {
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PerfSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static PerfSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PerfSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static PerfSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PerfSession parseFrom(InputStream inputStream) throws IOException {
    }

    public static PerfSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
