package com.google.geo.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Viewport extends GeneratedMessageLite<Viewport, Builder> implements ViewportOrBuilder {
    private static final Viewport DEFAULT_INSTANCE = null;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile Parser<Viewport> PARSER;
    private LatLng high_;
    private LatLng low_;

    /* renamed from: com.google.geo.type.Viewport$1 */
    static /* synthetic */ class C12061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f128xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Viewport, Builder> implements ViewportOrBuilder {
        /* synthetic */ Builder(C12061 c12061) {
        }

        public Builder clearHigh() {
        }

        public Builder clearLow() {
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public LatLng getHigh() {
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public LatLng getLow() {
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public boolean hasHigh() {
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public boolean hasLow() {
        }

        public Builder mergeHigh(LatLng latLng) {
        }

        public Builder mergeLow(LatLng latLng) {
        }

        public Builder setHigh(LatLng latLng) {
        }

        public Builder setLow(LatLng latLng) {
        }

        private Builder() {
        }

        public Builder setHigh(LatLng.Builder builder) {
        }

        public Builder setLow(LatLng.Builder builder) {
        }
    }

    private Viewport() {
    }

    static /* synthetic */ Viewport access$000() {
    }

    static /* synthetic */ void access$100(Viewport viewport, LatLng latLng) {
    }

    static /* synthetic */ void access$200(Viewport viewport, LatLng latLng) {
    }

    static /* synthetic */ void access$300(Viewport viewport) {
    }

    static /* synthetic */ void access$400(Viewport viewport, LatLng latLng) {
    }

    static /* synthetic */ void access$500(Viewport viewport, LatLng latLng) {
    }

    static /* synthetic */ void access$600(Viewport viewport) {
    }

    private void clearHigh() {
    }

    private void clearLow() {
    }

    public static Viewport getDefaultInstance() {
    }

    private void mergeHigh(LatLng latLng) {
    }

    private void mergeLow(LatLng latLng) {
    }

    public static Builder newBuilder() {
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Viewport> parser() {
    }

    private void setHigh(LatLng latLng) {
    }

    private void setLow(LatLng latLng) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public LatLng getHigh() {
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public LatLng getLow() {
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public boolean hasHigh() {
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public boolean hasLow() {
    }

    public static Builder newBuilder(Viewport viewport) {
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Viewport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Viewport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Viewport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Viewport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Viewport parseFrom(InputStream inputStream) throws IOException {
    }

    public static Viewport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
