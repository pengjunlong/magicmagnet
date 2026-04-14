package org.apache.xerces.util;

import java.io.IOException;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xml.resolver.Catalog;
import org.apache.xml.resolver.CatalogManager;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.ext.EntityResolver2;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLCatalogResolver implements XMLEntityResolver, EntityResolver2, LSResourceResolver {
    private Catalog fCatalog;
    private boolean fCatalogsChanged;
    private String[] fCatalogsList;
    private boolean fPreferPublic;
    private CatalogManager fResolverCatalogManager;
    private boolean fUseLiteralSystemId;

    public XMLCatalogResolver() {
    }

    private void attachReaderToCatalog(Catalog catalog) {
    }

    private void init(String[] strArr, boolean z) {
    }

    private void parseCatalogs() throws IOException {
    }

    public final synchronized void clear() {
    }

    public final synchronized String[] getCatalogList() {
    }

    @Override // org.xml.sax.ext.EntityResolver2
    public InputSource getExternalSubset(String str, String str2) throws SAXException, IOException {
    }

    public final boolean getPreferPublic() {
    }

    public final boolean getUseLiteralSystemId() {
    }

    @Override // org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
    }

    public String resolveIdentifier(XMLResourceIdentifier xMLResourceIdentifier) throws IOException, XNIException {
    }

    public final synchronized String resolvePublic(String str, String str2) throws IOException {
    }

    @Override // org.w3c.dom.ls.LSResourceResolver
    public LSInput resolveResource(String str, String str2, String str3, String str4, String str5) {
    }

    public final synchronized String resolveSystem(String str) throws IOException {
    }

    public final synchronized String resolveURI(String str) throws IOException {
    }

    public final synchronized void setCatalogList(String[] strArr) {
    }

    public final void setPreferPublic(boolean z) {
    }

    public final void setUseLiteralSystemId(boolean z) {
    }

    public XMLCatalogResolver(String[] strArr) {
    }

    public XMLCatalogResolver(String[] strArr, boolean z) {
    }

    @Override // org.xml.sax.ext.EntityResolver2
    public InputSource resolveEntity(String str, String str2, String str3, String str4) throws SAXException, IOException {
    }

    @Override // org.apache.xerces.xni.parser.XMLEntityResolver
    public XMLInputSource resolveEntity(XMLResourceIdentifier xMLResourceIdentifier) throws XNIException, IOException {
    }
}
