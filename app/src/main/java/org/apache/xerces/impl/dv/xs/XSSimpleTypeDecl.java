package org.apache.xerces.impl.dv.xs;

import java.util.AbstractList;
import java.util.Locale;
import java.util.Vector;
import org.apache.xerces.impl.dv.DatatypeException;
import org.apache.xerces.impl.dv.InvalidDatatypeFacetException;
import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.impl.dv.XSFacets;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.xs.util.XSObjectListImpl;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSFacet;
import org.apache.xerces.xs.XSMultiValueFacet;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObject;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSTypeDefinition;
import org.apache.xerces.xs.datatypes.ObjectList;
import org.w3c.dom.TypeInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSSimpleTypeDecl implements XSSimpleType, TypeInfo {
    public static final short ANYATOMICTYPE_DT = 49;
    static final String ANY_TYPE = "anyType";
    public static final short DAYTIMEDURATION_DT = 47;
    static final int DERIVATION_ANY = 0;
    static final int DERIVATION_EXTENSION = 2;
    static final int DERIVATION_LIST = 8;
    static final int DERIVATION_RESTRICTION = 1;
    static final int DERIVATION_UNION = 4;
    protected static final short DV_ANYATOMICTYPE = 29;
    protected static final short DV_ANYSIMPLETYPE = 0;
    protected static final short DV_ANYURI = 17;
    protected static final short DV_BASE64BINARY = 16;
    protected static final short DV_BOOLEAN = 2;
    protected static final short DV_DATE = 9;
    protected static final short DV_DATETIME = 7;
    protected static final short DV_DAYTIMEDURATION = 28;
    protected static final short DV_DECIMAL = 3;
    protected static final short DV_DOUBLE = 5;
    protected static final short DV_DURATION = 6;
    protected static final short DV_ENTITY = 23;
    protected static final short DV_FLOAT = 4;
    protected static final short DV_GDAY = 13;
    protected static final short DV_GMONTH = 14;
    protected static final short DV_GMONTHDAY = 12;
    protected static final short DV_GYEAR = 11;
    protected static final short DV_GYEARMONTH = 10;
    protected static final short DV_HEXBINARY = 15;
    protected static final short DV_ID = 21;
    protected static final short DV_IDREF = 22;
    protected static final short DV_INTEGER = 24;
    protected static final short DV_LIST = 25;
    protected static final short DV_NOTATION = 20;
    protected static final short DV_PRECISIONDECIMAL = 19;
    protected static final short DV_QNAME = 18;
    protected static final short DV_STRING = 1;
    protected static final short DV_TIME = 8;
    protected static final short DV_UNION = 26;
    protected static final short DV_YEARMONTHDURATION = 27;
    static final short NORMALIZE_FULL = 2;
    static final short NORMALIZE_NONE = 0;
    static final short NORMALIZE_TRIM = 1;
    public static final short PRECISIONDECIMAL_DT = 48;
    static final short SPECIAL_PATTERN_NAME = 2;
    static final short SPECIAL_PATTERN_NCNAME = 3;
    static final short SPECIAL_PATTERN_NMTOKEN = 1;
    static final short SPECIAL_PATTERN_NONE = 0;
    static final String[] SPECIAL_PATTERN_STRING = null;
    static final String URI_SCHEMAFORSCHEMA = "http://www.w3.org/2001/XMLSchema";
    static final String[] WS_FACET_STRING = null;
    public static final short YEARMONTHDURATION_DT = 46;
    static final XSSimpleTypeDecl fAnyAtomicType = null;
    static final XSSimpleTypeDecl fAnySimpleType = null;
    static final short[] fDVNormalizeType = null;
    static final ValidationContext fDummyContext = null;
    static final ValidationContext fEmptyContext = null;
    private static final TypeValidator[] gDVs = null;
    public XSObjectList enumerationAnnotations;
    private ObjectList fActualEnumeration;
    private XSObjectList fAnnotations;
    private boolean fAnonymous;
    private XSSimpleTypeDecl fBase;
    private boolean fBounded;
    private short fBuiltInKind;
    private TypeValidator[] fDVs;
    private ValidatedInfo[] fEnumeration;
    private ObjectList fEnumerationItemTypeList;
    private int fEnumerationSize;
    private ShortList fEnumerationTypeList;
    private XSObjectListImpl fFacets;
    private short fFacetsDefined;
    private short fFinalSet;
    private boolean fFinite;
    private short fFixedFacet;
    private int fFractionDigits;
    private boolean fIsImmutable;
    private XSSimpleTypeDecl fItemType;
    private int fLength;
    private StringList fLexicalEnumeration;
    private StringList fLexicalPattern;
    private Object fMaxExclusive;
    private Object fMaxInclusive;
    private int fMaxLength;
    private XSSimpleTypeDecl[] fMemberTypes;
    private Object fMinExclusive;
    private Object fMinInclusive;
    private int fMinLength;
    private XSObjectListImpl fMultiValueFacets;
    private XSNamespaceItem fNamespaceItem;
    private boolean fNumeric;
    private short fOrdered;
    private Vector fPattern;
    private Vector fPatternStr;
    private short fPatternType;
    private String fTargetNamespace;
    private int fTotalDigits;
    private String fTypeName;
    private short fValidationDV;
    private short fVariety;
    private short fWhiteSpace;
    public XSAnnotation fractionDigitsAnnotation;
    public XSAnnotation lengthAnnotation;
    public XSAnnotation maxExclusiveAnnotation;
    public XSAnnotation maxInclusiveAnnotation;
    public XSAnnotation maxLengthAnnotation;
    public XSAnnotation minExclusiveAnnotation;
    public XSAnnotation minInclusiveAnnotation;
    public XSAnnotation minLengthAnnotation;
    public XSObjectListImpl patternAnnotations;
    public XSAnnotation totalDigitsAnnotation;
    public XSAnnotation whiteSpaceAnnotation;

    /* renamed from: org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$1 */
    static class C17921 implements ValidationContext {
        C17921() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public void addId(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public void addIdRef(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public Locale getLocale() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public String getSymbol(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public String getURI(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isEntityDeclared(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isEntityUnparsed(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isIdDeclared(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needExtraChecking() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needFacetChecking() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needToNormalize() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean useNamespaces() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$2 */
    class C17932 extends AbstractObjectList {
        final /* synthetic */ XSSimpleTypeDecl this$0;

        C17932(XSSimpleTypeDecl xSSimpleTypeDecl) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, org.apache.xerces.xs.datatypes.ObjectList
        public boolean contains(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.ObjectList
        public int getLength() {
        }

        @Override // org.apache.xerces.xs.datatypes.ObjectList
        public Object item(int i) {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$3 */
    class C17943 extends AbstractObjectList {
        final /* synthetic */ XSSimpleTypeDecl this$0;

        C17943(XSSimpleTypeDecl xSSimpleTypeDecl) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, org.apache.xerces.xs.datatypes.ObjectList
        public boolean contains(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.ObjectList
        public int getLength() {
        }

        @Override // org.apache.xerces.xs.datatypes.ObjectList
        public Object item(int i) {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$4 */
    static class C17954 implements ValidationContext {
        C17954() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public void addId(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public void addIdRef(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public Locale getLocale() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public String getSymbol(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public String getURI(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isEntityDeclared(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isEntityUnparsed(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isIdDeclared(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needExtraChecking() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needFacetChecking() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needToNormalize() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean useNamespaces() {
        }
    }

    private static abstract class AbstractObjectList extends AbstractList implements ObjectList {
        private AbstractObjectList() {
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ AbstractObjectList(C17921 c17921) {
        }
    }

    static final class ValidationContextImpl implements ValidationContext {
        final ValidationContext fExternal;
        NamespaceContext fNSContext;

        ValidationContextImpl(ValidationContext validationContext) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public void addId(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public void addIdRef(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public Locale getLocale() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public String getSymbol(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public String getURI(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isEntityDeclared(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isEntityUnparsed(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean isIdDeclared(String str) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needExtraChecking() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needFacetChecking() {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean needToNormalize() {
        }

        void setNSContext(NamespaceContext namespaceContext) {
        }

        @Override // org.apache.xerces.impl.dv.ValidationContext
        public boolean useNamespaces() {
        }
    }

    private static final class XSFacetImpl implements XSFacet {
        final XSObjectList annotations;
        Object avalue;
        final boolean fixed;
        final int ivalue;
        final short kind;
        final String svalue;

        public XSFacetImpl(short s, String str, int i, Object obj, boolean z, XSAnnotation xSAnnotation) {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public Object getActualFacetValue() {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public XSAnnotation getAnnotation() {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public XSObjectList getAnnotations() {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public short getFacetKind() {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public boolean getFixed() {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public int getIntFacetValue() {
        }

        @Override // org.apache.xerces.xs.XSFacet
        public String getLexicalFacetValue() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public String getName() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public String getNamespace() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public XSNamespaceItem getNamespaceItem() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public short getType() {
        }
    }

    private static final class XSMVFacetImpl implements XSMultiValueFacet {
        final XSObjectList annotations;
        final ObjectList avalues;
        final short kind;
        final StringList svalues;

        public XSMVFacetImpl(short s, StringList stringList, ObjectList objectList, XSObjectList xSObjectList) {
        }

        @Override // org.apache.xerces.xs.XSMultiValueFacet
        public XSObjectList getAnnotations() {
        }

        @Override // org.apache.xerces.xs.XSMultiValueFacet
        public ObjectList getEnumerationValues() {
        }

        @Override // org.apache.xerces.xs.XSMultiValueFacet
        public short getFacetKind() {
        }

        @Override // org.apache.xerces.xs.XSMultiValueFacet
        public StringList getLexicalFacetValues() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public String getName() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public String getNamespace() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public XSNamespaceItem getNamespaceItem() {
        }

        @Override // org.apache.xerces.xs.XSObject
        public short getType() {
        }
    }

    public XSSimpleTypeDecl() {
    }

    static /* synthetic */ ValidatedInfo[] access$100(XSSimpleTypeDecl xSSimpleTypeDecl) {
    }

    static /* synthetic */ int access$200(XSSimpleTypeDecl xSSimpleTypeDecl) {
    }

    private void appendEnumString(StringBuffer stringBuffer) {
    }

    private void calcFundamentalFacets() {
    }

    private void checkExtraRules(ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    private void checkFacets(ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    private short convertToPrimitiveKind(short s) {
    }

    private Object getActualValue(Object obj, ValidationContext validationContext, ValidatedInfo validatedInfo, boolean z) throws InvalidDatatypeValueException {
    }

    protected static TypeValidator[] getGDVs() {
    }

    private short getPrimitiveDV(short s) {
    }

    private boolean isDerivedByAny(String str, String str2, XSTypeDefinition xSTypeDefinition) {
    }

    private boolean isDerivedByList(String str, String str2, XSTypeDefinition xSTypeDefinition) {
    }

    private boolean isDerivedByRestriction(String str, String str2, XSTypeDefinition xSTypeDefinition) {
    }

    private boolean isDerivedByUnion(String str, String str2, XSTypeDefinition xSTypeDefinition) {
    }

    public static String normalize(String str, short s) {
    }

    private void setBounded() {
    }

    private void setCardinality() {
    }

    private void setNumeric() {
    }

    private void setOrdered() {
    }

    private boolean specialCardinalityCheck() {
    }

    private String whiteSpaceValue(short s) {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public void applyFacets(XSFacets xSFacets, short s, short s2, ValidationContext validationContext) throws InvalidDatatypeFacetException {
    }

    void applyFacets1(XSFacets xSFacets, short s, short s2) {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean derivedFrom(String str, String str2, short s) {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean derivedFromType(XSTypeDefinition xSTypeDefinition, short s) {
    }

    protected ValidatedInfo getActualEnumValue(String str, ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    public ObjectList getActualEnumeration() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean getAnonymous() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public XSTypeDefinition getBaseType() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public boolean getBounded() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public short getBuiltInKind() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public short getDefinedFacets() {
    }

    public ObjectList getEnumerationItemTypeList() {
    }

    public ShortList getEnumerationTypeList() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSObject getFacet(int i) {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSObjectList getFacets() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public short getFinal() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public boolean getFinite() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public short getFixedFacets() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSSimpleTypeDefinition getItemType() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public StringList getLexicalEnumeration() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public String getLexicalFacetValue(short s) {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public StringList getLexicalPattern() {
    }

    public Object getMaxExclusiveValue() {
    }

    public Object getMaxInclusiveValue() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSObjectList getMemberTypes() {
    }

    public Object getMinExclusiveValue() {
    }

    public Object getMinInclusiveValue() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSObjectList getMultiValueFacets() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getName() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getNamespace() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public XSNamespaceItem getNamespaceItem() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public boolean getNumeric() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public short getOrdered() {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public short getPrimitiveKind() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSSimpleTypeDefinition getPrimitiveType() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public short getTypeCategory() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeName() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeNamespace() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public short getVariety() {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public short getWhitespace() throws DatatypeException {
    }

    public boolean isDOMDerivedFrom(String str, String str2, int i) {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public boolean isDefinedFacet(short s) {
    }

    @Override // org.w3c.dom.TypeInfo
    public boolean isDerivedFrom(String str, String str2, int i) {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public boolean isEqual(Object obj, Object obj2) {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean isFinal(short s) {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public boolean isFixedFacet(short s) {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public boolean isIDType() {
    }

    public boolean isIdentical(Object obj, Object obj2) {
    }

    void reportError(String str, Object[] objArr) throws InvalidDatatypeFacetException {
    }

    public void reset() {
    }

    public void setAnonymous(boolean z) {
    }

    protected void setDVs(TypeValidator[] typeValidatorArr) {
    }

    protected XSSimpleTypeDecl setListValues(String str, String str2, short s, XSSimpleTypeDecl xSSimpleTypeDecl, XSObjectList xSObjectList) {
    }

    public void setNamespaceItem(XSNamespaceItem xSNamespaceItem) {
    }

    protected XSSimpleTypeDecl setRestrictionValues(XSSimpleTypeDecl xSSimpleTypeDecl, String str, String str2, short s, XSObjectList xSObjectList) {
    }

    protected XSSimpleTypeDecl setUnionValues(String str, String str2, short s, XSSimpleTypeDecl[] xSSimpleTypeDeclArr, XSObjectList xSObjectList) {
    }

    public String toString() {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public Object validate(String str, ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    public ValidatedInfo validateWithInfo(String str, ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    void applyFacets(XSFacets xSFacets, short s, short s2, short s3, ValidationContext validationContext) throws InvalidDatatypeFacetException {
    }

    void applyFacets1(XSFacets xSFacets, short s, short s2, short s3) {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public Object validate(Object obj, ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    protected String normalize(Object obj, short s) {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public void validate(ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    protected XSSimpleTypeDecl(XSSimpleTypeDecl xSSimpleTypeDecl, String str, short s, short s2, boolean z, boolean z2, boolean z3, boolean z4, short s3) {
    }

    protected XSSimpleTypeDecl(XSSimpleTypeDecl xSSimpleTypeDecl, String str, String str2, short s, boolean z, XSObjectList xSObjectList, short s2) {
    }

    protected XSSimpleTypeDecl(XSSimpleTypeDecl xSSimpleTypeDecl, String str, String str2, short s, boolean z, XSObjectList xSObjectList) {
    }

    protected XSSimpleTypeDecl(String str, String str2, short s, XSSimpleTypeDecl xSSimpleTypeDecl, boolean z, XSObjectList xSObjectList) {
    }

    protected XSSimpleTypeDecl(String str, String str2, short s, XSSimpleTypeDecl[] xSSimpleTypeDeclArr, XSObjectList xSObjectList) {
    }
}
