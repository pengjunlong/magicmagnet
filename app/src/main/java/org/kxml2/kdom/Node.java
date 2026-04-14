package org.kxml2.kdom;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Node {
    public static final int CDSECT = 5;
    public static final int COMMENT = 9;
    public static final int DOCDECL = 10;
    public static final int DOCUMENT = 0;
    public static final int ELEMENT = 2;
    public static final int ENTITY_REF = 6;
    public static final int IGNORABLE_WHITESPACE = 7;
    public static final int PROCESSING_INSTRUCTION = 8;
    public static final int TEXT = 4;
    protected Vector children;
    protected StringBuffer types;

    public void addChild(int i, int i2, Object obj) {
    }

    public void addChild(int i, Object obj) {
    }

    public Element createElement(String str, String str2) {
    }

    public Object getChild(int i) {
    }

    public int getChildCount() {
    }

    public Element getElement(int i) {
    }

    public Element getElement(String str, String str2) {
    }

    public String getText(int i) {
    }

    public int getType(int i) {
    }

    public int indexOf(String str, String str2, int i) {
    }

    public boolean isText(int i) {
    }

    public void parse(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
    }

    public void removeChild(int i) {
    }

    public void write(XmlSerializer xmlSerializer) throws IOException {
    }

    public void writeChildren(XmlSerializer xmlSerializer) throws IOException {
    }
}
