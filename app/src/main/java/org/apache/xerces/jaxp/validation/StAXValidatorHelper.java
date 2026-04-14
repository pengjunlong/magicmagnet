package org.apache.xerces.jaxp.validation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.validation.EntityState;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.impl.xs.XMLSchemaValidator;
import org.apache.xerces.util.JAXPNamespaceContextWrapper;
import org.apache.xerces.util.StAXLocationWrapper;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLAttributesImpl;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLString;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.XMLEventReader;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.XMLStreamReader;
import org.javax.xml.stream.events.EndElement;
import org.javax.xml.stream.events.EntityDeclaration;
import org.javax.xml.stream.events.StartElement;
import org.javax.xml.stream.events.XMLEvent;
import org.javax.xml.transform.Result;
import org.javax.xml.transform.Source;
import org.javax.xml.transform.stax.StAXResult;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class StAXValidatorHelper implements ValidatorHelper, EntityState {
    private static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final String SCHEMA_VALIDATOR = "http://apache.org/xml/properties/internal/validator/schema";
    private static final String STRING_INTERNING = "org.javax.xml.stream.isInterning";
    private static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    private static final String VALIDATION_MANAGER = "http://apache.org/xml/properties/internal/validation-manager";
    final QName fAttributeQName;
    final XMLAttributesImpl fAttributes;
    private final XMLSchemaValidatorComponentManager fComponentManager;
    private XMLEvent fCurrentEvent;
    final ArrayList fDeclaredPrefixes;
    private int fDepth;
    final QName fElementQName;
    private HashMap fEntities;
    private final XMLErrorReporter fErrorReporter;
    private EventHelper fEventHelper;
    private final JAXPNamespaceContextWrapper fNamespaceContext;
    private final XMLSchemaValidator fSchemaValidator;
    private StAXEventResultBuilder fStAXEventResultBuilder;
    private final StAXLocationWrapper fStAXLocationWrapper;
    private StAXStreamResultBuilder fStAXStreamResultBuilder;
    private StAXDocumentHandler fStAXValidatorHandler;
    private StreamHelper fStreamHelper;
    final XMLStringBuffer fStringBuffer;
    private boolean fStringsInternalized;
    private final SymbolTable fSymbolTable;
    final XMLString fTempString;
    private final ValidationManager fValidationManager;
    private final XMLStreamReaderLocation fXMLStreamReaderLocation;

    final class EventHelper {
        private static final int CHUNK_MASK = 1023;
        private static final int CHUNK_SIZE = 1024;
        private final char[] fCharBuffer;
        final /* synthetic */ StAXValidatorHelper this$0;

        EventHelper(StAXValidatorHelper stAXValidatorHelper) {
        }

        private void fillDeclaredPrefixes(StartElement startElement) {
        }

        private void fillQName(QName qName, org.javax.xml.namespace.QName qName2) {
        }

        private void fillXMLAttributes(StartElement startElement) {
        }

        private void sendCharactersToValidator(String str) {
        }

        final void validate(XMLEventReader xMLEventReader, StAXResult stAXResult) throws SAXException, XMLStreamException {
        }

        private void fillDeclaredPrefixes(EndElement endElement) {
        }

        private void fillDeclaredPrefixes(Iterator it) {
        }
    }

    final class StreamHelper {
        final /* synthetic */ StAXValidatorHelper this$0;

        StreamHelper(StAXValidatorHelper stAXValidatorHelper) {
        }

        private void fillDeclaredPrefixes(XMLStreamReader xMLStreamReader) {
        }

        private void fillXMLAttributes(XMLStreamReader xMLStreamReader) {
        }

        final void validate(XMLStreamReader xMLStreamReader, StAXResult stAXResult) throws SAXException, XMLStreamException {
        }
    }

    static final class XMLStreamReaderLocation implements Location {
        private XMLStreamReader reader;

        private Location getLocation() {
        }

        public int getCharacterOffset() {
        }

        public int getColumnNumber() {
        }

        public int getLineNumber() {
        }

        public String getPublicId() {
        }

        public String getSystemId() {
        }

        public void setXMLStreamReader(XMLStreamReader xMLStreamReader) {
        }
    }

    public StAXValidatorHelper(XMLSchemaValidatorComponentManager xMLSchemaValidatorComponentManager) {
    }

    static /* synthetic */ XMLSchemaValidatorComponentManager access$000(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ XMLStreamReaderLocation access$100(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ StAXLocationWrapper access$200(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ JAXPNamespaceContextWrapper access$300(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ XMLSchemaValidator access$400(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ int access$500(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ int access$504(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ int access$506(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ StAXDocumentHandler access$600(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ XMLEvent access$700(StAXValidatorHelper stAXValidatorHelper) {
    }

    static /* synthetic */ XMLEvent access$702(StAXValidatorHelper stAXValidatorHelper, XMLEvent xMLEvent) {
    }

    private void setupStAXResultHandler(StAXResult stAXResult) {
    }

    final void fillQName(QName qName, String str, String str2, String str3) {
    }

    final XMLEvent getCurrentEvent() {
    }

    final EntityDeclaration getEntityDeclaration(String str) {
    }

    @Override // org.apache.xerces.impl.validation.EntityState
    public boolean isEntityDeclared(String str) {
    }

    @Override // org.apache.xerces.impl.validation.EntityState
    public boolean isEntityUnparsed(String str) {
    }

    final void processEntityDeclarations(List list) {
    }

    final void setup(Location location, StAXResult stAXResult, boolean z) {
    }

    @Override // org.apache.xerces.jaxp.validation.ValidatorHelper
    public void validate(Source source, Result result) throws SAXException, IOException {
    }
}
