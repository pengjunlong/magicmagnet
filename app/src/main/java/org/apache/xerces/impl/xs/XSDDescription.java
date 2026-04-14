package org.apache.xerces.impl.xs;

import org.apache.xerces.util.XMLResourceIdentifierImpl;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.grammars.XMLSchemaDescription;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSDDescription extends XMLResourceIdentifierImpl implements XMLSchemaDescription {
    public static final short CONTEXT_ATTRIBUTE = 6;
    public static final short CONTEXT_ELEMENT = 5;
    public static final short CONTEXT_IMPORT = 2;
    public static final short CONTEXT_INCLUDE = 0;
    public static final short CONTEXT_INITIALIZE = -1;
    public static final short CONTEXT_INSTANCE = 4;
    public static final short CONTEXT_PREPARSE = 3;
    public static final short CONTEXT_REDEFINE = 1;
    public static final short CONTEXT_XSITYPE = 7;
    protected XMLAttributes fAttributes;
    protected short fContextType;
    protected QName fEnclosedElementName;
    protected String[] fLocationHints;
    protected QName fTriggeringComponent;

    public boolean equals(Object obj) {
    }

    public boolean fromInstance() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLSchemaDescription
    public XMLAttributes getAttributes() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLSchemaDescription
    public short getContextType() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLSchemaDescription
    public QName getEnclosingElementName() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarDescription
    public String getGrammarType() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLSchemaDescription
    public String[] getLocationHints() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLSchemaDescription
    public String getTargetNamespace() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLSchemaDescription
    public QName getTriggeringComponent() {
    }

    @Override // org.apache.xerces.util.XMLResourceIdentifierImpl
    public int hashCode() {
    }

    public XSDDescription makeClone() {
    }

    public void reset() {
    }

    public void setAttributes(XMLAttributes xMLAttributes) {
    }

    public void setContextType(short s) {
    }

    public void setEnclosingElementName(QName qName) {
    }

    public void setLocationHints(String[] strArr) {
    }

    public void setTargetNamespace(String str) {
    }

    public void setTriggeringComponent(QName qName) {
    }
}
