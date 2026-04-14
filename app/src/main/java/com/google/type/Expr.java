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
public final class Expr extends GeneratedMessageLite<Expr, Builder> implements ExprOrBuilder {
    private static final Expr DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile Parser<Expr> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_;
    private String expression_;
    private String location_;
    private String title_;

    /* renamed from: com.google.type.Expr$1 */
    static /* synthetic */ class C13701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f180xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Expr, Builder> implements ExprOrBuilder {
        /* synthetic */ Builder(C13701 c13701) {
        }

        public Builder clearDescription() {
        }

        public Builder clearExpression() {
        }

        public Builder clearLocation() {
        }

        public Builder clearTitle() {
        }

        @Override // com.google.type.ExprOrBuilder
        public String getDescription() {
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.type.ExprOrBuilder
        public String getExpression() {
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getExpressionBytes() {
        }

        @Override // com.google.type.ExprOrBuilder
        public String getLocation() {
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getLocationBytes() {
        }

        @Override // com.google.type.ExprOrBuilder
        public String getTitle() {
        }

        @Override // com.google.type.ExprOrBuilder
        public ByteString getTitleBytes() {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setExpression(String str) {
        }

        public Builder setExpressionBytes(ByteString byteString) {
        }

        public Builder setLocation(String str) {
        }

        public Builder setLocationBytes(ByteString byteString) {
        }

        public Builder setTitle(String str) {
        }

        public Builder setTitleBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private Expr() {
    }

    static /* synthetic */ Expr access$000() {
    }

    static /* synthetic */ void access$100(Expr expr, String str) {
    }

    static /* synthetic */ void access$1000(Expr expr, String str) {
    }

    static /* synthetic */ void access$1100(Expr expr) {
    }

    static /* synthetic */ void access$1200(Expr expr, ByteString byteString) {
    }

    static /* synthetic */ void access$200(Expr expr) {
    }

    static /* synthetic */ void access$300(Expr expr, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Expr expr, String str) {
    }

    static /* synthetic */ void access$500(Expr expr) {
    }

    static /* synthetic */ void access$600(Expr expr, ByteString byteString) {
    }

    static /* synthetic */ void access$700(Expr expr, String str) {
    }

    static /* synthetic */ void access$800(Expr expr) {
    }

    static /* synthetic */ void access$900(Expr expr, ByteString byteString) {
    }

    private void clearDescription() {
    }

    private void clearExpression() {
    }

    private void clearLocation() {
    }

    private void clearTitle() {
    }

    public static Expr getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Expr> parser() {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setExpression(String str) {
    }

    private void setExpressionBytes(ByteString byteString) {
    }

    private void setLocation(String str) {
    }

    private void setLocationBytes(ByteString byteString) {
    }

    private void setTitle(String str) {
    }

    private void setTitleBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.ExprOrBuilder
    public String getDescription() {
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.type.ExprOrBuilder
    public String getExpression() {
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getExpressionBytes() {
    }

    @Override // com.google.type.ExprOrBuilder
    public String getLocation() {
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getLocationBytes() {
    }

    @Override // com.google.type.ExprOrBuilder
    public String getTitle() {
    }

    @Override // com.google.type.ExprOrBuilder
    public ByteString getTitleBytes() {
    }

    public static Builder newBuilder(Expr expr) {
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Expr parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Expr parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Expr parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Expr parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Expr parseFrom(InputStream inputStream) throws IOException {
    }

    public static Expr parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Expr parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Expr parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
