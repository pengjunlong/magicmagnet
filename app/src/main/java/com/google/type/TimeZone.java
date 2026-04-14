package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class TimeZone extends GeneratedMessageLite<TimeZone, Builder> implements TimeZoneOrBuilder {
    private static final TimeZone DEFAULT_INSTANCE = null;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<TimeZone> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_;
    private String version_;

    /* renamed from: com.google.type.TimeZone$1 */
    static /* synthetic */ class C13771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f187xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TimeZone, Builder> implements TimeZoneOrBuilder {
        /* synthetic */ Builder(C13771 c13771) {
        }

        public Builder clearId() {
        }

        public Builder clearVersion() {
        }

        @Override // com.google.type.TimeZoneOrBuilder
        public String getId() {
        }

        @Override // com.google.type.TimeZoneOrBuilder
        public ByteString getIdBytes() {
        }

        @Override // com.google.type.TimeZoneOrBuilder
        public String getVersion() {
        }

        @Override // com.google.type.TimeZoneOrBuilder
        public ByteString getVersionBytes() {
        }

        public Builder setId(String str) {
        }

        public Builder setIdBytes(ByteString byteString) {
        }

        public Builder setVersion(String str) {
        }

        public Builder setVersionBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private TimeZone() {
    }

    static /* synthetic */ TimeZone access$000() {
    }

    static /* synthetic */ void access$100(TimeZone timeZone, String str) {
    }

    static /* synthetic */ void access$200(TimeZone timeZone) {
    }

    static /* synthetic */ void access$300(TimeZone timeZone, ByteString byteString) {
    }

    static /* synthetic */ void access$400(TimeZone timeZone, String str) {
    }

    static /* synthetic */ void access$500(TimeZone timeZone) {
    }

    static /* synthetic */ void access$600(TimeZone timeZone, ByteString byteString) {
    }

    private void clearId() {
    }

    private void clearVersion() {
    }

    public static TimeZone getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<TimeZone> parser() {
    }

    private void setId(String str) {
    }

    private void setIdBytes(ByteString byteString) {
    }

    private void setVersion(String str) {
    }

    private void setVersionBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.TimeZoneOrBuilder
    public String getId() {
    }

    @Override // com.google.type.TimeZoneOrBuilder
    public ByteString getIdBytes() {
    }

    @Override // com.google.type.TimeZoneOrBuilder
    public String getVersion() {
    }

    @Override // com.google.type.TimeZoneOrBuilder
    public ByteString getVersionBytes() {
    }

    public static Builder newBuilder(TimeZone timeZone) {
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TimeZone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static TimeZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TimeZone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static TimeZone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TimeZone parseFrom(InputStream inputStream) throws IOException {
    }

    public static TimeZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TimeZone parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static TimeZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
