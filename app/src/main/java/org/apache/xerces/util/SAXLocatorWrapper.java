package org.apache.xerces.util;

import org.apache.xerces.xni.XMLLocator;
import org.xml.sax.Locator;
import org.xml.sax.ext.Locator2;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class SAXLocatorWrapper implements XMLLocator {
    private Locator fLocator;
    private Locator2 fLocator2;

    @Override // org.apache.xerces.xni.XMLLocator
    public String getBaseSystemId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public int getCharacterOffset() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public int getColumnNumber() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public String getEncoding() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public String getExpandedSystemId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public int getLineNumber() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public String getLiteralSystemId() {
    }

    public Locator getLocator() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public String getPublicId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public String getXMLVersion() {
    }

    public void setLocator(Locator locator) {
    }
}
