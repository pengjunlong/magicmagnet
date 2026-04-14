package org.apache.xerces.stax.events;

import java.io.Writer;
import org.javax.xml.namespace.QName;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.events.Attribute;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AttributeImpl extends XMLEventImpl implements Attribute {
    private final String fDtdType;
    private final boolean fIsSpecified;
    private final QName fName;
    private final String fValue;

    public AttributeImpl(QName qName, String str, String str2, boolean z, Location location) {
    }

    public final String getDTDType() {
    }

    public final QName getName() {
    }

    public final String getValue() {
    }

    public final boolean isSpecified() {
    }

    public final void writeAsEncodedUnicode(Writer writer) throws XMLStreamException {
    }

    protected AttributeImpl(int i, QName qName, String str, String str2, boolean z, Location location) {
    }
}
