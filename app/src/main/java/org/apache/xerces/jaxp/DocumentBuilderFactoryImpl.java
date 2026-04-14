package org.apache.xerces.jaxp;

import java.util.Hashtable;
import org.javax.xml.parsers.DocumentBuilder;
import org.javax.xml.parsers.DocumentBuilderFactory;
import org.javax.xml.parsers.ParserConfigurationException;
import org.javax.xml.validation.Schema;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DocumentBuilderFactoryImpl extends DocumentBuilderFactory {
    private static final String CREATE_CDATA_NODES_FEATURE = "http://apache.org/xml/features/create-cdata-nodes";
    private static final String CREATE_ENTITY_REF_NODES_FEATURE = "http://apache.org/xml/features/dom/create-entity-ref-nodes";
    private static final String INCLUDE_COMMENTS_FEATURE = "http://apache.org/xml/features/include-comments";
    private static final String INCLUDE_IGNORABLE_WHITESPACE = "http://apache.org/xml/features/dom/include-ignorable-whitespace";
    private static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    private static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    private static final String XINCLUDE_FEATURE = "http://apache.org/xml/features/xinclude";
    private Hashtable attributes;
    private boolean fSecureProcess;
    private Hashtable features;
    private Schema grammar;
    private boolean isXIncludeAware;

    public Object getAttribute(String str) throws IllegalArgumentException {
    }

    public boolean getFeature(String str) throws ParserConfigurationException {
    }

    public Schema getSchema() {
    }

    public boolean isXIncludeAware() {
    }

    public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
    }

    public void setAttribute(String str, Object obj) throws IllegalArgumentException {
    }

    public void setFeature(String str, boolean z) throws ParserConfigurationException {
    }

    public void setSchema(Schema schema) {
    }

    public void setXIncludeAware(boolean z) {
    }
}
