package org.apache.xerces.dom;

import java.util.Vector;
import org.apache.xerces.dom3.as.ASAttributeDeclaration;
import org.apache.xerces.dom3.as.ASContentModel;
import org.apache.xerces.dom3.as.ASElementDeclaration;
import org.apache.xerces.dom3.as.ASEntityDeclaration;
import org.apache.xerces.dom3.as.ASModel;
import org.apache.xerces.dom3.as.ASNamedObjectMap;
import org.apache.xerces.dom3.as.ASNotationDeclaration;
import org.apache.xerces.dom3.as.ASObject;
import org.apache.xerces.dom3.as.ASObjectList;
import org.apache.xerces.dom3.as.DOMASException;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.w3c.dom.DOMException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ASModelImpl implements ASModel {
    protected Vector fASModels;
    protected SchemaGrammar fGrammar;
    boolean fNamespaceAware;

    public ASModelImpl() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public void addASModel(ASModel aSModel) {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public ASObject cloneASObject(boolean z) {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASAttributeDeclaration createASAttributeDeclaration(String str, String str2) throws DOMException {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASContentModel createASContentModel(int i, int i2, short s) throws DOMASException {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASElementDeclaration createASElementDeclaration(String str, String str2) throws DOMException {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASEntityDeclaration createASEntityDeclaration(String str) throws DOMException {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASNotationDeclaration createASNotationDeclaration(String str, String str2, String str3, String str4) throws DOMException {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASObjectList getASModels() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public String getAsHint() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public String getAsLocation() {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public short getAsNodeType() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASNamedObjectMap getAttributeDeclarations() {
    }

    public boolean getContainer() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASNamedObjectMap getContentModelDeclarations() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASNamedObjectMap getElementDeclarations() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASNamedObjectMap getEntityDeclarations() {
    }

    public SchemaGrammar getGrammar() {
    }

    public Vector getInternalASModels() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public boolean getIsNamespaceAware() {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public String getLocalName() {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public String getNamespaceURI() {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public String getNodeName() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public ASNamedObjectMap getNotationDeclarations() {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public ASModel getOwnerASModel() {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public String getPrefix() {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public short getUsageLocation() {
    }

    public void importASObject(ASObject aSObject) {
    }

    public void insertASObject(ASObject aSObject) {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public void removeAS(ASModel aSModel) {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public void setAsHint(String str) {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public void setAsLocation(String str) {
    }

    public void setGrammar(SchemaGrammar schemaGrammar) {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public void setLocalName(String str) {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public void setNamespaceURI(String str) {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public void setNodeName(String str) {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public void setOwnerASModel(ASModel aSModel) {
    }

    @Override // org.apache.xerces.dom3.as.ASObject
    public void setPrefix(String str) {
    }

    @Override // org.apache.xerces.dom3.as.ASModel
    public boolean validate() {
    }

    public ASModelImpl(boolean z) {
    }
}
