package org.apache.xerces.stax.events;

import java.io.Writer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.javax.xml.namespace.NamespaceContext;
import org.javax.xml.namespace.QName;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.events.Attribute;
import org.javax.xml.stream.events.StartElement;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class StartElementImpl extends ElementImpl implements StartElement {
    private static final Comparator QNAME_COMPARATOR = null;
    private final Map fAttributes;
    private final NamespaceContext fNamespaceContext;

    /* renamed from: org.apache.xerces.stax.events.StartElementImpl$1 */
    static class C18181 implements Comparator {
        C18181() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
        }
    }

    public StartElementImpl(QName qName, Iterator it, Iterator it2, NamespaceContext namespaceContext, Location location) {
    }

    public Attribute getAttributeByName(QName qName) {
    }

    public Iterator getAttributes() {
    }

    public NamespaceContext getNamespaceContext() {
    }

    public String getNamespaceURI(String str) {
    }

    public void writeAsEncodedUnicode(Writer writer) throws XMLStreamException {
    }
}
