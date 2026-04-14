package org.apache.xerces.stax.events;

import java.io.Writer;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.events.StartDocument;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class StartDocumentImpl extends XMLEventImpl implements StartDocument {
    private final String fCharEncoding;
    private final boolean fEncodingSet;
    private final boolean fIsStandalone;
    private final boolean fStandaloneSet;
    private final String fVersion;

    public StartDocumentImpl(String str, boolean z, boolean z2, boolean z3, String str2, Location location) {
    }

    public boolean encodingSet() {
    }

    public String getCharacterEncodingScheme() {
    }

    public String getSystemId() {
    }

    public String getVersion() {
    }

    public boolean isStandalone() {
    }

    public boolean standaloneSet() {
    }

    public void writeAsEncodedUnicode(Writer writer) throws XMLStreamException {
    }
}
