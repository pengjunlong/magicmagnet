package org.apache.xerces.impl.dtd;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLContentSpec {
    public static final short CONTENTSPECNODE_ANY = 6;
    public static final short CONTENTSPECNODE_ANY_LAX = 22;
    public static final short CONTENTSPECNODE_ANY_LOCAL = 8;
    public static final short CONTENTSPECNODE_ANY_LOCAL_LAX = 24;
    public static final short CONTENTSPECNODE_ANY_LOCAL_SKIP = 40;
    public static final short CONTENTSPECNODE_ANY_OTHER = 7;
    public static final short CONTENTSPECNODE_ANY_OTHER_LAX = 23;
    public static final short CONTENTSPECNODE_ANY_OTHER_SKIP = 39;
    public static final short CONTENTSPECNODE_ANY_SKIP = 38;
    public static final short CONTENTSPECNODE_CHOICE = 4;
    public static final short CONTENTSPECNODE_LEAF = 0;
    public static final short CONTENTSPECNODE_ONE_OR_MORE = 3;
    public static final short CONTENTSPECNODE_SEQ = 5;
    public static final short CONTENTSPECNODE_ZERO_OR_MORE = 2;
    public static final short CONTENTSPECNODE_ZERO_OR_ONE = 1;
    public Object otherValue;
    public short type;
    public Object value;

    public interface Provider {
        boolean getContentSpec(int i, XMLContentSpec xMLContentSpec);
    }

    public XMLContentSpec() {
    }

    public void clear() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public void setValues(short s, Object obj, Object obj2) {
    }

    public XMLContentSpec(short s, Object obj, Object obj2) {
    }

    public void setValues(XMLContentSpec xMLContentSpec) {
    }

    public XMLContentSpec(XMLContentSpec xMLContentSpec) {
    }

    public XMLContentSpec(Provider provider, int i) {
    }

    public void setValues(Provider provider, int i) {
    }
}
