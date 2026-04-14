package org.apache.xerces.jaxp.datatype;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SerializedDuration implements Serializable {
    private static final long serialVersionUID = 3897193592341225793L;
    private final String lexicalValue;

    public SerializedDuration(String str) {
    }

    private Object readResolve() throws ObjectStreamException {
    }
}
