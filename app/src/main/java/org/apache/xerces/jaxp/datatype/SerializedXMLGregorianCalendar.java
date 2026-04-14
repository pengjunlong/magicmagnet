package org.apache.xerces.jaxp.datatype;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SerializedXMLGregorianCalendar implements Serializable {
    private static final long serialVersionUID = -7752272381890705397L;
    private final String lexicalValue;

    public SerializedXMLGregorianCalendar(String str) {
    }

    private Object readResolve() throws ObjectStreamException {
    }
}
