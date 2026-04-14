package org.apache.xerces.impl.dtd;

import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class BalancedDTDGrammar extends DTDGrammar {
    private int fDepth;
    private int[][] fGroupIndexStack;
    private int[] fGroupIndexStackSizes;
    private boolean fMixed;
    private short[] fOpStack;

    public BalancedDTDGrammar(SymbolTable symbolTable, XMLDTDDescription xMLDTDDescription) {
    }

    private int addContentSpecNodes(int i, int i2) {
    }

    private void addToCurrentGroup(int i) {
    }

    private void initializeContentModelStacks() {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar
    protected final void addContentSpecToElement(XMLElementDecl xMLElementDecl) {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void element(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDHandler
    public final void endDTD(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void endGroup(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void occurrence(short s, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void pcdata(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void separator(short s, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void startContentModel(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.DTDGrammar, org.apache.xerces.xni.XMLDTDContentModelHandler
    public final void startGroup(Augmentations augmentations) throws XNIException {
    }
}
