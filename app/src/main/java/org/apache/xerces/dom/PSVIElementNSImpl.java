package org.apache.xerces.dom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class PSVIElementNSImpl extends ElementNSImpl implements ElementPSVI {
    static final long serialVersionUID = 6815489624636016068L;
    protected XSElementDeclaration fDeclaration;
    protected StringList fErrorCodes;
    protected StringList fErrorMessages;
    protected boolean fNil;
    protected XSNotationDeclaration fNotation;
    protected XSModel fSchemaInformation;
    protected boolean fSpecified;
    protected XSTypeDefinition fTypeDecl;
    protected short fValidationAttempted;
    protected String fValidationContext;
    protected short fValidity;
    protected ValidatedInfo fValue;

    public PSVIElementNSImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2, String str3) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
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
    public XSModel getSchemaInformation() {
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

    public void setPSVI(ElementPSVI elementPSVI) {
    }

    public PSVIElementNSImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2) {
    }
}
