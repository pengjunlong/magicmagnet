package org.apache.xerces.jaxp.validation;

import java.io.IOException;
import java.lang.ref.SoftReference;
import org.apache.xerces.impl.xs.XMLSchemaValidator;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.apache.xml.serialize.SerializerFactory;
import org.javax.xml.transform.Result;
import org.javax.xml.transform.Source;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class StreamValidatorHelper implements ValidatorHelper {
    private static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    private static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    private static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    private static final String SCHEMA_VALIDATOR = "http://apache.org/xml/properties/internal/validator/schema";
    private static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    private static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    private static final String VALIDATION_MANAGER = "http://apache.org/xml/properties/internal/validation-manager";
    private final XMLSchemaValidatorComponentManager fComponentManager;
    private SoftReference fConfiguration;
    private SoftReference fParser;
    private final XMLSchemaValidator fSchemaValidator;
    private SerializerFactory fSerializerFactory;

    public StreamValidatorHelper(XMLSchemaValidatorComponentManager xMLSchemaValidatorComponentManager) {
    }

    private XMLParserConfiguration initialize() {
    }

    @Override // org.apache.xerces.jaxp.validation.ValidatorHelper
    public void validate(Source source, Result result) throws SAXException, IOException {
    }
}
