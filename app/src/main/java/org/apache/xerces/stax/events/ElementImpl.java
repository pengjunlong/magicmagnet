package org.apache.xerces.stax.events;

import java.util.Iterator;
import java.util.List;
import org.javax.xml.namespace.QName;
import org.javax.xml.stream.Location;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class ElementImpl extends XMLEventImpl {
    private final QName fName;
    private final List fNamespaces;

    private static final class NoRemoveIterator implements Iterator {
        private final Iterator fWrapped;

        public NoRemoveIterator(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    ElementImpl(QName qName, boolean z, Iterator it, Location location) {
    }

    static Iterator createImmutableIterator(Iterator it) {
    }

    public final QName getName() {
    }

    public final Iterator getNamespaces() {
    }
}
