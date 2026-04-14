package org.apache.xerces.impl;

import java.io.EOFException;
import java.io.IOException;
import org.apache.xerces.impl.XMLDocumentFragmentScannerImpl;
import org.apache.xerces.impl.dtd.XMLDTDDescription;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLDTDScanner;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLDocumentScannerImpl extends XMLDocumentFragmentScannerImpl {
    protected static final String DISALLOW_DOCTYPE_DECL_FEATURE = "http://apache.org/xml/features/disallow-doctype-decl";
    protected static final String DTD_SCANNER = "http://apache.org/xml/properties/internal/dtd-scanner";
    private static final Boolean[] FEATURE_DEFAULTS = null;
    protected static final String LOAD_EXTERNAL_DTD = "http://apache.org/xml/features/nonvalidating/load-external-dtd";
    protected static final String NAMESPACE_CONTEXT = "http://apache.org/xml/properties/internal/namespace-context";
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final int SCANNER_STATE_DTD_EXTERNAL = 18;
    protected static final int SCANNER_STATE_DTD_EXTERNAL_DECLS = 19;
    protected static final int SCANNER_STATE_DTD_INTERNAL_DECLS = 17;
    protected static final int SCANNER_STATE_PROLOG = 5;
    protected static final int SCANNER_STATE_TRAILING_MISC = 12;
    protected static final int SCANNER_STATE_XML_DECL = 0;
    protected static final String VALIDATION_MANAGER = "http://apache.org/xml/properties/internal/validation-manager";
    private final XMLDTDDescription fDTDDescription;
    protected final XMLDocumentFragmentScannerImpl.Dispatcher fDTDDispatcher;
    protected XMLDTDScanner fDTDScanner;
    protected boolean fDisallowDoctype;
    protected String fDoctypeName;
    protected String fDoctypePublicId;
    protected String fDoctypeSystemId;
    private XMLInputSource fExternalSubsetSource;
    protected boolean fLoadExternalDTD;
    protected NamespaceContext fNamespaceContext;
    protected final XMLDocumentFragmentScannerImpl.Dispatcher fPrologDispatcher;
    protected boolean fScanningDTD;
    protected boolean fSeenDoctypeDecl;
    private final XMLString fString;
    private final XMLStringBuffer fStringBuffer;
    private final String[] fStrings;
    protected final XMLDocumentFragmentScannerImpl.Dispatcher fTrailingMiscDispatcher;
    protected ValidationManager fValidationManager;
    protected final XMLDocumentFragmentScannerImpl.Dispatcher fXMLDeclDispatcher;

    protected class ContentDispatcher extends XMLDocumentFragmentScannerImpl.FragmentContentDispatcher {
        final /* synthetic */ XMLDocumentScannerImpl this$0;

        protected ContentDispatcher(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.FragmentContentDispatcher
        protected boolean elementDepthIsZeroHook() throws IOException, XNIException {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.FragmentContentDispatcher
        protected void endOfFileHook(EOFException eOFException) throws IOException, XNIException {
        }

        protected void resolveExternalSubsetAndRead() throws IOException, XNIException {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.FragmentContentDispatcher
        protected boolean scanForDoctypeHook() throws IOException, XNIException {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.FragmentContentDispatcher
        protected boolean scanRootElementHook() throws IOException, XNIException {
        }
    }

    protected final class DTDDispatcher implements XMLDocumentFragmentScannerImpl.Dispatcher {
        final /* synthetic */ XMLDocumentScannerImpl this$0;

        protected DTDDispatcher(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.Dispatcher
        public boolean dispatch(boolean z) throws IOException, XNIException {
        }
    }

    protected final class PrologDispatcher implements XMLDocumentFragmentScannerImpl.Dispatcher {
        final /* synthetic */ XMLDocumentScannerImpl this$0;

        protected PrologDispatcher(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.Dispatcher
        public boolean dispatch(boolean z) throws IOException, XNIException {
        }
    }

    protected final class TrailingMiscDispatcher implements XMLDocumentFragmentScannerImpl.Dispatcher {
        final /* synthetic */ XMLDocumentScannerImpl this$0;

        protected TrailingMiscDispatcher(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.Dispatcher
        public boolean dispatch(boolean z) throws IOException, XNIException {
        }
    }

    protected final class XMLDeclDispatcher implements XMLDocumentFragmentScannerImpl.Dispatcher {
        final /* synthetic */ XMLDocumentScannerImpl this$0;

        protected XMLDeclDispatcher(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.Dispatcher
        public boolean dispatch(boolean z) throws IOException, XNIException {
        }
    }

    static /* synthetic */ XMLStringBuffer access$000(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
    }

    static /* synthetic */ XMLString access$100(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
    }

    static /* synthetic */ XMLInputSource access$200(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
    }

    static /* synthetic */ XMLInputSource access$202(XMLDocumentScannerImpl xMLDocumentScannerImpl, XMLInputSource xMLInputSource) {
    }

    static /* synthetic */ XMLDTDDescription access$300(XMLDocumentScannerImpl xMLDocumentScannerImpl) {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected XMLDocumentFragmentScannerImpl.Dispatcher createContentDispatcher() {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.impl.XMLScanner, org.apache.xerces.impl.XMLEntityHandler
    public void endEntity(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.xni.parser.XMLComponent
    public Object getPropertyDefault(String str) {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected String getScannerStateName(int i) {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    protected boolean scanDoctypeDecl() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.xni.parser.XMLDocumentScanner
    public void setInputSource(XMLInputSource xMLInputSource) throws IOException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl, org.apache.xerces.impl.XMLScanner, org.apache.xerces.impl.XMLEntityHandler
    public void startEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }
}
