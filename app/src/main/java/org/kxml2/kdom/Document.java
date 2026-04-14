package org.kxml2.kdom;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Document extends Node {
    String encoding;
    protected int rootIndex;
    Boolean standalone;

    @Override // org.kxml2.kdom.Node
    public void addChild(int i, int i2, Object obj) {
    }

    public String getEncoding() {
    }

    public String getName() {
    }

    public Element getRootElement() {
    }

    public Boolean getStandalone() {
    }

    @Override // org.kxml2.kdom.Node
    public void parse(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
    }

    @Override // org.kxml2.kdom.Node
    public void removeChild(int i) {
    }

    public void setEncoding(String str) {
    }

    public void setStandalone(Boolean bool) {
    }

    @Override // org.kxml2.kdom.Node
    public void write(XmlSerializer xmlSerializer) throws IOException {
    }
}
