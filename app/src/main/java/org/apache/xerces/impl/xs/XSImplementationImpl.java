package org.apache.xerces.impl.xs;

import org.apache.xerces.dom.PSVIDOMImplementationImpl;
import org.apache.xerces.xs.LSInputList;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSException;
import org.apache.xerces.xs.XSImplementation;
import org.apache.xerces.xs.XSLoader;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.ls.LSInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSImplementationImpl extends PSVIDOMImplementationImpl implements XSImplementation {
    static final XSImplementationImpl singleton = null;

    public static DOMImplementation getDOMImplementation() {
    }

    @Override // org.apache.xerces.xs.XSImplementation
    public LSInputList createLSInputList(LSInput[] lSInputArr) {
    }

    @Override // org.apache.xerces.xs.XSImplementation
    public StringList createStringList(String[] strArr) {
    }

    @Override // org.apache.xerces.xs.XSImplementation
    public XSLoader createXSLoader(StringList stringList) throws XSException {
    }

    @Override // org.apache.xerces.xs.XSImplementation
    public StringList getRecognizedVersions() {
    }

    @Override // org.apache.xerces.dom.PSVIDOMImplementationImpl, org.apache.xerces.dom.DOMImplementationImpl, org.apache.xerces.dom.CoreDOMImplementationImpl, org.w3c.dom.DOMImplementation
    public boolean hasFeature(String str, String str2) {
    }
}
