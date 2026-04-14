package org.apache.xerces.jaxp.validation;

import org.apache.xerces.xni.XMLDocumentHandler;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.XMLStreamReader;
import org.javax.xml.stream.events.Characters;
import org.javax.xml.stream.events.Comment;
import org.javax.xml.stream.events.DTD;
import org.javax.xml.stream.events.EndDocument;
import org.javax.xml.stream.events.EntityReference;
import org.javax.xml.stream.events.ProcessingInstruction;
import org.javax.xml.stream.events.StartDocument;
import org.javax.xml.transform.stax.StAXResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
interface StAXDocumentHandler extends XMLDocumentHandler {
    void cdata(Characters characters) throws XMLStreamException;

    void characters(Characters characters) throws XMLStreamException;

    void comment(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    void comment(Comment comment) throws XMLStreamException;

    void doctypeDecl(DTD dtd) throws XMLStreamException;

    void endDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    void endDocument(EndDocument endDocument) throws XMLStreamException;

    void entityReference(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    void entityReference(EntityReference entityReference) throws XMLStreamException;

    void processingInstruction(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    void processingInstruction(ProcessingInstruction processingInstruction) throws XMLStreamException;

    void setIgnoringCharacters(boolean z);

    void setStAXResult(StAXResult stAXResult);

    void startDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    void startDocument(StartDocument startDocument) throws XMLStreamException;
}
