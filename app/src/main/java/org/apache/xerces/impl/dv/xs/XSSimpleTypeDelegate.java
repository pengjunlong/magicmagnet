package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.DatatypeException;
import org.apache.xerces.impl.dv.InvalidDatatypeFacetException;
import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.impl.dv.XSFacets;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObject;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSTypeDefinition;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSSimpleTypeDelegate implements XSSimpleType {
    protected final XSSimpleType type;

    public XSSimpleTypeDelegate(XSSimpleType xSSimpleType) {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public void applyFacets(XSFacets xSFacets, short s, short s2, ValidationContext validationContext) throws InvalidDatatypeFacetException {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean derivedFrom(String str, String str2, short s) {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean derivedFromType(XSTypeDefinition xSTypeDefinition, short s) {
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

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public XSObjectList getMemberTypes() {
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

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public short getVariety() {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public short getWhitespace() throws DatatypeException {
    }

    public XSSimpleType getWrappedXSSimpleType() {
    }

    @Override // org.apache.xerces.xs.XSSimpleTypeDefinition
    public boolean isDefinedFacet(short s) {
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

    public String toString() {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public void validate(ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public Object validate(String str, ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }

    @Override // org.apache.xerces.impl.dv.XSSimpleType
    public Object validate(Object obj, ValidationContext validationContext, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {
    }
}
