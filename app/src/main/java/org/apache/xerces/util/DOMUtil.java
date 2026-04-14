package org.apache.xerces.util;

import java.lang.reflect.Method;
import java.util.Hashtable;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.LSException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMUtil {

    static class ThrowableMethods {
        private static Method fgThrowableInitCauseMethod = null;
        private static boolean fgThrowableMethodsAvailable = false;

        private ThrowableMethods() {
        }

        static /* synthetic */ boolean access$000() {
        }

        static /* synthetic */ Method access$100() {
        }
    }

    protected DOMUtil() {
    }

    public static void copyInto(Node node, Node node2) throws DOMException {
    }

    public static DOMException createDOMException(short s, Throwable th) {
    }

    public static LSException createLSException(short s, Throwable th) {
    }

    public static String getAnnotation(Node node) {
    }

    public static Attr getAttr(Element element, String str) {
    }

    public static Attr getAttrNS(Element element, String str, String str2) {
    }

    public static String getAttrValue(Element element, String str) {
    }

    public static String getAttrValueNS(Element element, String str, String str2) {
    }

    public static Attr[] getAttrs(Element element) {
    }

    public static String getChildText(Node node) {
    }

    public static Document getDocument(Node node) {
    }

    public static Element getFirstChildElement(Node node) {
    }

    public static Element getFirstChildElementNS(Node node, String str, String str2) {
    }

    public static Element getFirstVisibleChildElement(Node node) {
    }

    public static Element getLastChildElement(Node node) {
    }

    public static Element getLastChildElementNS(Node node, String str, String str2) {
    }

    public static Element getLastVisibleChildElement(Node node) {
    }

    public static String getLocalName(Node node) {
    }

    public static String getName(Node node) {
    }

    public static String getNamespaceURI(Node node) {
    }

    public static Element getNextSiblingElement(Node node) {
    }

    public static Element getNextSiblingElementNS(Node node, String str, String str2) {
    }

    public static Element getNextVisibleSiblingElement(Node node) {
    }

    public static Element getParent(Element element) {
    }

    public static String getPrefix(Node node) {
    }

    public static Element getRoot(Document document) {
    }

    public static String getSyntheticAnnotation(Node node) {
    }

    public static String getValue(Attr attr) {
    }

    public static boolean isHidden(Node node) {
    }

    public static void setHidden(Node node) {
    }

    public static void setVisible(Node node) {
    }

    public static Element getFirstChildElement(Node node, String str) {
    }

    public static Element getFirstVisibleChildElement(Node node, Hashtable hashtable) {
    }

    public static Element getLastChildElement(Node node, String str) {
    }

    public static Element getLastVisibleChildElement(Node node, Hashtable hashtable) {
    }

    public static Element getNextSiblingElement(Node node, String str) {
    }

    public static Element getNextVisibleSiblingElement(Node node, Hashtable hashtable) {
    }

    public static boolean isHidden(Node node, Hashtable hashtable) {
    }

    public static void setHidden(Node node, Hashtable hashtable) {
    }

    public static void setVisible(Node node, Hashtable hashtable) {
    }

    public static Element getFirstChildElementNS(Node node, String[][] strArr) {
    }

    public static Element getLastChildElementNS(Node node, String[][] strArr) {
    }

    public static Element getNextSiblingElementNS(Node node, String[][] strArr) {
    }

    public static Element getFirstChildElement(Node node, String[] strArr) {
    }

    public static Element getLastChildElement(Node node, String[] strArr) {
    }

    public static Element getNextSiblingElement(Node node, String[] strArr) {
    }

    public static Element getFirstChildElement(Node node, String str, String str2, String str3) {
    }

    public static Element getLastChildElement(Node node, String str, String str2, String str3) {
    }

    public static Element getNextSiblingElement(Node node, String str, String str2, String str3) {
    }
}
