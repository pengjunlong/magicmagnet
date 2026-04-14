package com.google.type;

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
public final class PostalAddress extends GeneratedMessageLite<PostalAddress, Builder> implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE = null;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser<PostalAddress> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private Internal.ProtobufList<String> addressLines_;
    private String administrativeArea_;
    private String languageCode_;
    private String locality_;
    private String organization_;
    private String postalCode_;
    private Internal.ProtobufList<String> recipients_;
    private String regionCode_;
    private int revision_;
    private String sortingCode_;
    private String sublocality_;

    /* renamed from: com.google.type.PostalAddress$1 */
    static /* synthetic */ class C13741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f184xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PostalAddress, Builder> implements PostalAddressOrBuilder {
        /* synthetic */ Builder(C13741 c13741) {
        }

        public Builder addAddressLines(String str) {
        }

        public Builder addAddressLinesBytes(ByteString byteString) {
        }

        public Builder addAllAddressLines(Iterable<String> iterable) {
        }

        public Builder addAllRecipients(Iterable<String> iterable) {
        }

        public Builder addRecipients(String str) {
        }

        public Builder addRecipientsBytes(ByteString byteString) {
        }

        public Builder clearAddressLines() {
        }

        public Builder clearAdministrativeArea() {
        }

        public Builder clearLanguageCode() {
        }

        public Builder clearLocality() {
        }

        public Builder clearOrganization() {
        }

        public Builder clearPostalCode() {
        }

        public Builder clearRecipients() {
        }

        public Builder clearRegionCode() {
        }

        public Builder clearRevision() {
        }

        public Builder clearSortingCode() {
        }

        public Builder clearSublocality() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getAddressLines(int i) {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getAddressLinesBytes(int i) {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public int getAddressLinesCount() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public List<String> getAddressLinesList() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getAdministrativeArea() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getAdministrativeAreaBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getLanguageCode() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getLanguageCodeBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getLocality() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getLocalityBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getOrganization() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getOrganizationBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getPostalCode() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getPostalCodeBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getRecipients(int i) {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getRecipientsBytes(int i) {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public int getRecipientsCount() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public List<String> getRecipientsList() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getRegionCode() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getRegionCodeBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public int getRevision() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getSortingCode() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getSortingCodeBytes() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getSublocality() {
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getSublocalityBytes() {
        }

        public Builder setAddressLines(int i, String str) {
        }

        public Builder setAdministrativeArea(String str) {
        }

        public Builder setAdministrativeAreaBytes(ByteString byteString) {
        }

        public Builder setLanguageCode(String str) {
        }

        public Builder setLanguageCodeBytes(ByteString byteString) {
        }

        public Builder setLocality(String str) {
        }

        public Builder setLocalityBytes(ByteString byteString) {
        }

        public Builder setOrganization(String str) {
        }

        public Builder setOrganizationBytes(ByteString byteString) {
        }

        public Builder setPostalCode(String str) {
        }

        public Builder setPostalCodeBytes(ByteString byteString) {
        }

        public Builder setRecipients(int i, String str) {
        }

        public Builder setRegionCode(String str) {
        }

        public Builder setRegionCodeBytes(ByteString byteString) {
        }

        public Builder setRevision(int i) {
        }

        public Builder setSortingCode(String str) {
        }

        public Builder setSortingCodeBytes(ByteString byteString) {
        }

        public Builder setSublocality(String str) {
        }

        public Builder setSublocalityBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private PostalAddress() {
    }

    static /* synthetic */ PostalAddress access$000() {
    }

    static /* synthetic */ void access$100(PostalAddress postalAddress, int i) {
    }

    static /* synthetic */ void access$1000(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$1100(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$1200(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$1300(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$1400(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$1500(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$1600(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$1700(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$1800(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$1900(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$200(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$2000(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$2100(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$2200(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$2300(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$2400(PostalAddress postalAddress, int i, String str) {
    }

    static /* synthetic */ void access$2500(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$2600(PostalAddress postalAddress, Iterable iterable) {
    }

    static /* synthetic */ void access$2700(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$2800(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$2900(PostalAddress postalAddress, int i, String str) {
    }

    static /* synthetic */ void access$300(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$3000(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$3100(PostalAddress postalAddress, Iterable iterable) {
    }

    static /* synthetic */ void access$3200(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$3300(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$3400(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$3500(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$3600(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$400(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$500(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$600(PostalAddress postalAddress, String str) {
    }

    static /* synthetic */ void access$700(PostalAddress postalAddress) {
    }

    static /* synthetic */ void access$800(PostalAddress postalAddress, ByteString byteString) {
    }

    static /* synthetic */ void access$900(PostalAddress postalAddress, String str) {
    }

    private void addAddressLines(String str) {
    }

    private void addAddressLinesBytes(ByteString byteString) {
    }

    private void addAllAddressLines(Iterable<String> iterable) {
    }

    private void addAllRecipients(Iterable<String> iterable) {
    }

    private void addRecipients(String str) {
    }

    private void addRecipientsBytes(ByteString byteString) {
    }

    private void clearAddressLines() {
    }

    private void clearAdministrativeArea() {
    }

    private void clearLanguageCode() {
    }

    private void clearLocality() {
    }

    private void clearOrganization() {
    }

    private void clearPostalCode() {
    }

    private void clearRecipients() {
    }

    private void clearRegionCode() {
    }

    private void clearRevision() {
    }

    private void clearSortingCode() {
    }

    private void clearSublocality() {
    }

    private void ensureAddressLinesIsMutable() {
    }

    private void ensureRecipientsIsMutable() {
    }

    public static PostalAddress getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<PostalAddress> parser() {
    }

    private void setAddressLines(int i, String str) {
    }

    private void setAdministrativeArea(String str) {
    }

    private void setAdministrativeAreaBytes(ByteString byteString) {
    }

    private void setLanguageCode(String str) {
    }

    private void setLanguageCodeBytes(ByteString byteString) {
    }

    private void setLocality(String str) {
    }

    private void setLocalityBytes(ByteString byteString) {
    }

    private void setOrganization(String str) {
    }

    private void setOrganizationBytes(ByteString byteString) {
    }

    private void setPostalCode(String str) {
    }

    private void setPostalCodeBytes(ByteString byteString) {
    }

    private void setRecipients(int i, String str) {
    }

    private void setRegionCode(String str) {
    }

    private void setRegionCodeBytes(ByteString byteString) {
    }

    private void setRevision(int i) {
    }

    private void setSortingCode(String str) {
    }

    private void setSortingCodeBytes(ByteString byteString) {
    }

    private void setSublocality(String str) {
    }

    private void setSublocalityBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getAddressLines(int i) {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getAddressLinesBytes(int i) {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public int getAddressLinesCount() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public List<String> getAddressLinesList() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getAdministrativeArea() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getAdministrativeAreaBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getLanguageCode() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getLanguageCodeBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getLocality() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getLocalityBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getOrganization() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getOrganizationBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getPostalCode() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getPostalCodeBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getRecipients(int i) {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getRecipientsBytes(int i) {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public int getRecipientsCount() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public List<String> getRecipientsList() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getRegionCode() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getRegionCodeBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public int getRevision() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getSortingCode() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getSortingCodeBytes() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getSublocality() {
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getSublocalityBytes() {
    }

    public static Builder newBuilder(PostalAddress postalAddress) {
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PostalAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static PostalAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PostalAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static PostalAddress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
    }

    public static PostalAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
