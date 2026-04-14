package org.apache.xerces.jaxp.validation;

import java.io.IOException;
import org.apache.xerces.xs.AttributePSVI;
import org.apache.xerces.xs.ElementPSVI;
import org.apache.xerces.xs.PSVIProvider;
import org.javax.xml.transform.Result;
import org.javax.xml.transform.Source;
import org.javax.xml.validation.Validator;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ValidatorImpl extends Validator implements PSVIProvider {
    private static final String CURRENT_ELEMENT_NODE = "http://apache.org/xml/properties/dom/current-element-node";
    private static final String JAXP_SOURCE_RESULT_FEATURE_PREFIX = "http://javax.xml.transform";
    private final XMLSchemaValidatorComponentManager fComponentManager;
    private boolean fConfigurationChanged;
    private DOMValidatorHelper fDOMValidatorHelper;
    private boolean fErrorHandlerChanged;
    private boolean fResourceResolverChanged;
    private ValidatorHandlerImpl fSAXValidatorHelper;
    private StAXValidatorHelper fStAXValidatorHelper;
    private StreamValidatorHelper fStreamValidatorHelper;

    public ValidatorImpl(XSGrammarPoolContainer xSGrammarPoolContainer) {
    }

    @Override // org.apache.xerces.xs.PSVIProvider
    public AttributePSVI getAttributePSVI(int i) {
    }

    @Override // org.apache.xerces.xs.PSVIProvider
    public AttributePSVI getAttributePSVIByName(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.PSVIProvider
    public ElementPSVI getElementPSVI() {
    }

    public ErrorHandler getErrorHandler() {
    }

    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public LSResourceResolver getResourceResolver() {
    }

    public void reset() {
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
    }

    public void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public void setResourceResolver(LSResourceResolver lSResourceResolver) {
    }

    public void validate(Source source, Result result) throws SAXException, IOException {
    }
}
