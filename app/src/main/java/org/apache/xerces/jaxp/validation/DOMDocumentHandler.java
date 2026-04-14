package org.apache.xerces.jaxp.validation;

import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XNIException;
import org.javax.xml.transform.dom.DOMResult;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
interface DOMDocumentHandler extends XMLDocumentHandler {
    void cdata(CDATASection cDATASection) throws XNIException;

    void characters(Text text) throws XNIException;

    void comment(Comment comment) throws XNIException;

    void doctypeDecl(DocumentType documentType) throws XNIException;

    void processingInstruction(ProcessingInstruction processingInstruction) throws XNIException;

    void setDOMResult(DOMResult dOMResult);

    void setIgnoringCharacters(boolean z);
}
