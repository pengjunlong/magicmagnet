package org.apache.xerces.dom;

import java.lang.ref.SoftReference;
import org.apache.xerces.impl.RevalidationHandler;
import org.apache.xerces.impl.dtd.XMLDTDLoader;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSParser;
import org.w3c.dom.ls.LSSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CoreDOMImplementationImpl implements DOMImplementation, DOMImplementationLS {
    private static final int SIZE = 2;
    static final CoreDOMImplementationImpl singleton = null;
    private int docAndDoctypeCounter;
    private int freeSchemaValidatorIndex;
    private int freeXML10DTDLoaderIndex;
    private int freeXML10DTDValidatorIndex;
    private int freeXML11DTDLoaderIndex;
    private int freeXML11DTDValidatorIndex;
    private SoftReference[] schemaValidators;
    private int schemaValidatorsCurrentSize;
    private int xml10DTDLoaderCurrentSize;
    private SoftReference[] xml10DTDLoaders;
    private SoftReference[] xml10DTDValidators;
    private int xml10DTDValidatorsCurrentSize;
    private int xml11DTDLoaderCurrentSize;
    private SoftReference[] xml11DTDLoaders;
    private SoftReference[] xml11DTDValidators;
    private int xml11DTDValidatorsCurrentSize;

    static final class RevalidationHandlerHolder {
        RevalidationHandler handler;

        RevalidationHandlerHolder(RevalidationHandler revalidationHandler) {
        }
    }

    static final class XMLDTDLoaderHolder {
        XMLDTDLoader loader;

        XMLDTDLoaderHolder(XMLDTDLoader xMLDTDLoader) {
        }
    }

    public static DOMImplementation getDOMImplementation() {
    }

    protected synchronized int assignDocTypeNumber() {
    }

    protected synchronized int assignDocumentNumber() {
    }

    final void checkQName(String str) {
    }

    @Override // org.w3c.dom.DOMImplementation
    public Document createDocument(String str, String str2, DocumentType documentType) throws DOMException {
    }

    @Override // org.w3c.dom.DOMImplementation
    public DocumentType createDocumentType(String str, String str2, String str3) {
    }

    @Override // org.w3c.dom.ls.DOMImplementationLS
    public LSInput createLSInput() {
    }

    @Override // org.w3c.dom.ls.DOMImplementationLS
    public LSOutput createLSOutput() {
    }

    @Override // org.w3c.dom.ls.DOMImplementationLS
    public LSParser createLSParser(short s, String str) throws DOMException {
    }

    @Override // org.w3c.dom.ls.DOMImplementationLS
    public LSSerializer createLSSerializer() {
    }

    final synchronized XMLDTDLoader getDTDLoader(String str) {
    }

    @Override // org.w3c.dom.DOMImplementation
    public Object getFeature(String str, String str2) {
    }

    synchronized RevalidationHandler getValidator(String str, String str2) {
    }

    @Override // org.w3c.dom.DOMImplementation
    public boolean hasFeature(String str, String str2) {
    }

    final synchronized void releaseDTDLoader(String str, XMLDTDLoader xMLDTDLoader) {
    }

    synchronized void releaseValidator(String str, String str2, RevalidationHandler revalidationHandler) {
    }

    protected CoreDocumentImpl createDocument(DocumentType documentType) {
    }
}
