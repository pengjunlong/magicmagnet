package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.xs.ElementPSVI;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSElementDeclaration;
import org.apache.xerces.xs.XSModel;
import org.apache.xerces.xs.XSNotationDeclaration;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSTypeDefinition;
import org.apache.xerces.xs.XSValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ElementPSVImpl implements ElementPSVI {
    protected XSElementDeclaration fDeclaration;
    protected String[] fErrors;
    protected SchemaGrammar[] fGrammars;
    protected boolean fNil;
    protected XSNotationDeclaration fNotation;
    protected XSModel fSchemaInformation;
    protected boolean fSpecified;
    protected XSTypeDefinition fTypeDecl;
    protected short fValidationAttempted;
    protected String fValidationContext;
    protected short fValidity;
    protected ValidatedInfo fValue;

    public void copySchemaInformationTo(ElementPSVImpl elementPSVImpl) {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public Object getActualNormalizedValue() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public short getActualNormalizedValueType() {
    }

    @Override // org.apache.xerces.xs.ElementPSVI
    public XSElementDeclaration getElementDeclaration() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public StringList getErrorCodes() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public StringList getErrorMessages() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public boolean getIsSchemaSpecified() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public ShortList getItemValueTypes() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public XSSimpleTypeDefinition getMemberTypeDefinition() {
    }

    @Override // org.apache.xerces.xs.ElementPSVI
    public boolean getNil() {
    }

    @Override // org.apache.xerces.xs.ElementPSVI
    public XSNotationDeclaration getNotation() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public String getSchemaDefault() {
    }

    @Override // org.apache.xerces.xs.ElementPSVI
    public synchronized XSModel getSchemaInformation() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public String getSchemaNormalizedValue() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public XSValue getSchemaValue() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public XSTypeDefinition getTypeDefinition() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public short getValidationAttempted() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public String getValidationContext() {
    }

    @Override // org.apache.xerces.xs.ItemPSVI
    public short getValidity() {
    }

    public void reset() {
    }
}
