package org.apache.xerces.impl;

import java.io.IOException;
import org.apache.xerces.impl.XMLDocumentFragmentScannerImpl;
import org.apache.xerces.impl.XMLDocumentScannerImpl;
import org.apache.xerces.impl.dtd.XMLDTDValidatorFilter;
import org.apache.xerces.util.XMLAttributesImpl;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XML11NSDocumentScannerImpl extends XML11DocumentScannerImpl {
    protected boolean fBindNamespaces;
    private XMLDTDValidatorFilter fDTDValidator;
    protected boolean fPerformValidation;
    private boolean fSawSpace;

    protected final class NS11ContentDispatcher extends XMLDocumentScannerImpl.ContentDispatcher {
        final /* synthetic */ XML11NSDocumentScannerImpl this$0;

        protected NS11ContentDispatcher(XML11NSDocumentScannerImpl xML11NSDocumentScannerImpl) {
        }

        private void reconfigurePipeline() {
        }

        @Override // org.apache.xerces.impl.XMLDocumentScannerImpl.ContentDispatcher, org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.FragmentContentDispatcher
        protected boolean scanRootElementHook() throws IOException, XNIException {
        }
    }

    static /* synthetic */ XMLDTDValidatorFilter access$000(XML11NSDocumentScannerImpl xML11NSDocumentScannerImpl) {
    }

    @Override // org.apache.xerces.impl.XMLDocumentScannerImpl, org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected XMLDocumentFragmentScannerImpl.Dispatcher createContentDispatcher() {
    }

    @Override // org.apache.xerces.impl.XMLDocumentScannerImpl, org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    protected void scanAttribute(XMLAttributesImpl xMLAttributesImpl) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected int scanEndElement() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected boolean scanStartElement() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected boolean scanStartElementAfterName() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected void scanStartElementName() throws IOException, XNIException {
    }

    public void setDTDValidator(XMLDTDValidatorFilter xMLDTDValidatorFilter) {
    }
}
