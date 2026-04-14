package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSAttributeUse extends XSObject {
    Object getActualVC() throws XSException;

    short getActualVCType() throws XSException;

    XSObjectList getAnnotations();

    XSAttributeDeclaration getAttrDeclaration();

    short getConstraintType();

    String getConstraintValue();

    ShortList getItemValueTypes() throws XSException;

    boolean getRequired();

    XSValue getValueConstraintValue();
}
