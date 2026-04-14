package org.apache.xerces.parsers;

import java.io.IOException;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParserConfiguration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class XMLParser {
    protected static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected final XMLParserConfiguration fConfiguration;

    protected XMLParser(XMLParserConfiguration xMLParserConfiguration) {
    }

    public void parse(XMLInputSource xMLInputSource) throws XNIException, IOException {
    }

    protected void reset() throws XNIException {
    }
}
