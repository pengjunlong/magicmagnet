package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Color extends GeneratedMessageLite<Color, Builder> implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE = null;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser<Color> PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    /* renamed from: com.google.type.Color$1 */
    static /* synthetic */ class C13661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f177xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Color, Builder> implements ColorOrBuilder {
        /* synthetic */ Builder(C13661 c13661) {
        }

        public Builder clearAlpha() {
        }

        public Builder clearBlue() {
        }

        public Builder clearGreen() {
        }

        public Builder clearRed() {
        }

        @Override // com.google.type.ColorOrBuilder
        public FloatValue getAlpha() {
        }

        @Override // com.google.type.ColorOrBuilder
        public float getBlue() {
        }

        @Override // com.google.type.ColorOrBuilder
        public float getGreen() {
        }

        @Override // com.google.type.ColorOrBuilder
        public float getRed() {
        }

        @Override // com.google.type.ColorOrBuilder
        public boolean hasAlpha() {
        }

        public Builder mergeAlpha(FloatValue floatValue) {
        }

        public Builder setAlpha(FloatValue floatValue) {
        }

        public Builder setBlue(float f) {
        }

        public Builder setGreen(float f) {
        }

        public Builder setRed(float f) {
        }

        private Builder() {
        }

        public Builder setAlpha(FloatValue.Builder builder) {
        }
    }

    private Color() {
    }

    static /* synthetic */ Color access$000() {
    }

    static /* synthetic */ void access$100(Color color, float f) {
    }

    static /* synthetic */ void access$200(Color color) {
    }

    static /* synthetic */ void access$300(Color color, float f) {
    }

    static /* synthetic */ void access$400(Color color) {
    }

    static /* synthetic */ void access$500(Color color, float f) {
    }

    static /* synthetic */ void access$600(Color color) {
    }

    static /* synthetic */ void access$700(Color color, FloatValue floatValue) {
    }

    static /* synthetic */ void access$800(Color color, FloatValue floatValue) {
    }

    static /* synthetic */ void access$900(Color color) {
    }

    private void clearAlpha() {
    }

    private void clearBlue() {
    }

    private void clearGreen() {
    }

    private void clearRed() {
    }

    public static Color getDefaultInstance() {
    }

    private void mergeAlpha(FloatValue floatValue) {
    }

    public static Builder newBuilder() {
    }

    public static Color parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Color parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Color> parser() {
    }

    private void setAlpha(FloatValue floatValue) {
    }

    private void setBlue(float f) {
    }

    private void setGreen(float f) {
    }

    private void setRed(float f) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.ColorOrBuilder
    public FloatValue getAlpha() {
    }

    @Override // com.google.type.ColorOrBuilder
    public float getBlue() {
    }

    @Override // com.google.type.ColorOrBuilder
    public float getGreen() {
    }

    @Override // com.google.type.ColorOrBuilder
    public float getRed() {
    }

    @Override // com.google.type.ColorOrBuilder
    public boolean hasAlpha() {
    }

    public static Builder newBuilder(Color color) {
    }

    public static Color parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Color parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Color parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Color parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Color parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Color parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Color parseFrom(InputStream inputStream) throws IOException {
    }

    public static Color parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Color parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Color parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
