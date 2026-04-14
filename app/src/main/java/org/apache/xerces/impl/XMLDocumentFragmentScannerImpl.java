package org.apache.xerces.impl;

import java.io.EOFException;
import java.io.IOException;
import org.apache.xerces.util.XMLAttributesImpl;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLDocumentScanner;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLDocumentFragmentScannerImpl extends XMLScanner implements XMLDocumentScanner, XMLEntityHandler {
    protected static final boolean DEBUG_CONTENT_SCANNING = false;
    private static final boolean DEBUG_DISPATCHER = false;
    private static final boolean DEBUG_SCANNER_STATE = false;
    protected static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    private static final Boolean[] FEATURE_DEFAULTS = null;
    protected static final String NAMESPACES = "http://xml.org/sax/features/namespaces";
    protected static final String NOTIFY_BUILTIN_REFS = "http://apache.org/xml/features/scanner/notify-builtin-refs";
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final int SCANNER_STATE_CDATA = 15;
    protected static final int SCANNER_STATE_COMMENT = 2;
    protected static final int SCANNER_STATE_CONTENT = 7;
    protected static final int SCANNER_STATE_DOCTYPE = 4;
    protected static final int SCANNER_STATE_END_OF_INPUT = 13;
    protected static final int SCANNER_STATE_PI = 3;
    protected static final int SCANNER_STATE_REFERENCE = 8;
    protected static final int SCANNER_STATE_ROOT_ELEMENT = 6;
    protected static final int SCANNER_STATE_START_OF_MARKUP = 1;
    protected static final int SCANNER_STATE_TERMINATED = 14;
    protected static final int SCANNER_STATE_TEXT_DECL = 16;
    protected final QName fAttributeQName;
    protected final XMLAttributesImpl fAttributes;
    protected final Dispatcher fContentDispatcher;
    protected QName fCurrentElement;
    protected Dispatcher fDispatcher;
    protected XMLDocumentHandler fDocumentHandler;
    protected final QName fElementQName;
    protected final ElementStack fElementStack;
    protected int[] fEntityStack;
    protected ExternalSubsetResolver fExternalSubsetResolver;
    protected boolean fHasExternalDTD;
    protected boolean fInScanContent;
    protected boolean fIsEntityDeclaredVC;
    protected int fMarkupDepth;
    protected boolean fNotifyBuiltInRefs;
    private final QName fQName;
    private boolean fSawSpace;
    protected int fScannerState;
    private final char[] fSingleChar;
    protected boolean fStandalone;
    private final XMLStringBuffer fStringBuffer;
    private final XMLStringBuffer fStringBuffer2;
    private final String[] fStrings;
    private Augmentations fTempAugmentations;
    protected final XMLString fTempString;
    protected final XMLString fTempString2;

    protected interface Dispatcher {
        boolean dispatch(boolean z) throws IOException, XNIException;
    }

    protected static class ElementStack {
        protected QName[] fElements;
        protected int fSize;

        public void clear() {
        }

        public void popElement(QName qName) {
        }

        public QName pushElement(QName qName) {
        }
    }

    protected class FragmentContentDispatcher implements Dispatcher {
        final /* synthetic */ XMLDocumentFragmentScannerImpl this$0;

        protected FragmentContentDispatcher(XMLDocumentFragmentScannerImpl xMLDocumentFragmentScannerImpl) {
        }

        @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.Dispatcher
        public boolean dispatch(boolean z) throws IOException, XNIException {
        }

        protected boolean elementDepthIsZeroHook() throws IOException, XNIException {
        }

        protected void endOfFileHook(EOFException eOFException) throws IOException, XNIException {
        }

        protected boolean scanForDoctypeHook() throws IOException, XNIException {
        }

        protected boolean scanRootElementHook() throws IOException, XNIException {
        }
    }

    static /* synthetic */ XMLStringBuffer access$000(XMLDocumentFragmentScannerImpl xMLDocumentFragmentScannerImpl) {
    }

    private void handleCharacter(char c, String str) throws XNIException {
    }

    protected Dispatcher createContentDispatcher() {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.impl.XMLEntityHandler
    public void endEntity(String str, Augmentations augmentations) throws XNIException {
    }

    public String getDispatcherName(Dispatcher dispatcher) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentSource
    public XMLDocumentHandler getDocumentHandler() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Object getPropertyDefault(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    protected String getScannerStateName(int i) {
    }

    protected int handleEndElement(QName qName, boolean z) throws XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    protected void scanAttribute(XMLAttributes xMLAttributes) throws IOException, XNIException {
    }

    protected boolean scanCDATASection(boolean z) throws IOException, XNIException {
    }

    protected void scanCharReference() throws IOException, XNIException {
    }

    protected void scanComment() throws IOException, XNIException {
    }

    protected int scanContent() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentScanner
    public boolean scanDocument(boolean z) throws IOException, XNIException {
    }

    protected int scanEndElement() throws IOException, XNIException {
    }

    protected void scanEntityReference() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected void scanPIData(String str, XMLString xMLString) throws IOException, XNIException {
    }

    protected boolean scanStartElement() throws IOException, XNIException {
    }

    protected boolean scanStartElementAfterName() throws IOException, XNIException {
    }

    protected void scanStartElementName() throws IOException, XNIException {
    }

    protected void scanXMLDeclOrTextDecl(boolean z) throws IOException, XNIException {
    }

    protected final void setDispatcher(Dispatcher dispatcher) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentSource
    public void setDocumentHandler(XMLDocumentHandler xMLDocumentHandler) {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentScanner
    public void setInputSource(XMLInputSource xMLInputSource) throws IOException {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    protected final void setScannerState(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.impl.XMLEntityHandler
    public void startEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }
}
