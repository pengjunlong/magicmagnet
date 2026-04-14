package org.apache.xerces.util;

import java.io.IOException;
import org.apache.xerces.impl.ExternalSubsetResolver;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.XMLDTDDescription;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.xml.sax.InputSource;
import org.xml.sax.ext.EntityResolver2;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class EntityResolver2Wrapper implements ExternalSubsetResolver {
    protected EntityResolver2 fEntityResolver;

    public EntityResolver2Wrapper() {
    }

    private XMLInputSource createXMLInputSource(InputSource inputSource, String str) {
    }

    public EntityResolver2 getEntityResolver() {
    }

    @Override // org.apache.xerces.impl.ExternalSubsetResolver
    public XMLInputSource getExternalSubset(XMLDTDDescription xMLDTDDescription) throws XNIException, IOException {
    }

    @Override // org.apache.xerces.xni.parser.XMLEntityResolver
    public XMLInputSource resolveEntity(XMLResourceIdentifier xMLResourceIdentifier) throws XNIException, IOException {
    }

    public void setEntityResolver(EntityResolver2 entityResolver2) {
    }

    public EntityResolver2Wrapper(EntityResolver2 entityResolver2) {
    }
}
