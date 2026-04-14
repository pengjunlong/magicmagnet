package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSAttributeDeclaration extends XSObject {
    Object getActualVC() throws XSException;

    short getActualVCType() throws XSException;

    XSAnnotation getAnnotation();

    XSObjectList getAnnotations();

    short getConstraintType();

    String getConstraintValue();

    XSComplexTypeDefinition getEnclosingCTDefinition();

    ShortList getItemValueTypes() throws XSException;

    short getScope();

    XSSimpleTypeDefinition getTypeDefinition();

    XSValue getValueConstraintValue();
}
