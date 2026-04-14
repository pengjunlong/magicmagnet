package org.xmlpull.v1;

import java.util.Hashtable;
import java.util.Vector;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XmlPullParserFactory {
    public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
    private static final String RESOURCE_NAME = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory";
    static final Class referenceContextClass = null;
    protected String classNamesLocation;
    protected Hashtable features;
    protected Vector parserClasses;
    protected Vector serializerClasses;

    protected XmlPullParserFactory() {
    }

    public static XmlPullParserFactory newInstance() throws XmlPullParserException {
    }

    public boolean getFeature(String str) {
    }

    public boolean isNamespaceAware() {
    }

    public boolean isValidating() {
    }

    public XmlPullParser newPullParser() throws XmlPullParserException {
    }

    public XmlSerializer newSerializer() throws XmlPullParserException {
    }

    public void setFeature(String str, boolean z) throws XmlPullParserException {
    }

    public void setNamespaceAware(boolean z) {
    }

    public void setValidating(boolean z) {
    }

    public static XmlPullParserFactory newInstance(String str, Class cls) throws XmlPullParserException {
    }
}
