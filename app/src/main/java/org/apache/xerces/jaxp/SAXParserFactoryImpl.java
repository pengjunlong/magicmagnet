package org.apache.xerces.jaxp;

import java.util.Hashtable;
import org.javax.xml.parsers.ParserConfigurationException;
import org.javax.xml.parsers.SAXParser;
import org.javax.xml.parsers.SAXParserFactory;
import org.javax.xml.validation.Schema;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SAXParserFactoryImpl extends SAXParserFactory {
    private static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    private static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    private static final String XINCLUDE_FEATURE = "http://apache.org/xml/features/xinclude";
    private boolean fSecureProcess;
    private Hashtable features;
    private Schema grammar;
    private boolean isXIncludeAware;

    private SAXParserImpl newSAXParserImpl() throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
    }

    public boolean getFeature(String str) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
    }

    public Schema getSchema() {
    }

    public boolean isXIncludeAware() {
    }

    public SAXParser newSAXParser() throws ParserConfigurationException {
    }

    public void setFeature(String str, boolean z) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
    }

    public void setSchema(Schema schema) {
    }

    public void setXIncludeAware(boolean z) {
    }
}
