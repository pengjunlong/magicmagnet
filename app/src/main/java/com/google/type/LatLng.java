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
public final class LatLng extends GeneratedMessageLite<LatLng, Builder> implements LatLngOrBuilder {
    private static final LatLng DEFAULT_INSTANCE = null;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser<LatLng> PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: com.google.type.LatLng$1 */
    static /* synthetic */ class C13721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f182xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LatLng, Builder> implements LatLngOrBuilder {
        /* synthetic */ Builder(C13721 c13721) {
        }

        public Builder clearLatitude() {
        }

        public Builder clearLongitude() {
        }

        @Override // com.google.type.LatLngOrBuilder
        public double getLatitude() {
        }

        @Override // com.google.type.LatLngOrBuilder
        public double getLongitude() {
        }

        public Builder setLatitude(double d) {
        }

        public Builder setLongitude(double d) {
        }

        private Builder() {
        }
    }

    private LatLng() {
    }

    static /* synthetic */ LatLng access$000() {
    }

    static /* synthetic */ void access$100(LatLng latLng, double d) {
    }

    static /* synthetic */ void access$200(LatLng latLng) {
    }

    static /* synthetic */ void access$300(LatLng latLng, double d) {
    }

    static /* synthetic */ void access$400(LatLng latLng) {
    }

    private void clearLatitude() {
    }

    private void clearLongitude() {
    }

    public static LatLng getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<LatLng> parser() {
    }

    private void setLatitude(double d) {
    }

    private void setLongitude(double d) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.LatLngOrBuilder
    public double getLatitude() {
    }

    @Override // com.google.type.LatLngOrBuilder
    public double getLongitude() {
    }

    public static Builder newBuilder(LatLng latLng) {
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LatLng parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static LatLng parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LatLng parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static LatLng parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LatLng parseFrom(InputStream inputStream) throws IOException {
    }

    public static LatLng parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
