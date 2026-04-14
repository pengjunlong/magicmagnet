package org.apache.xerces.stax.events;

import java.io.Writer;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.events.EntityDeclaration;
import org.javax.xml.stream.events.EntityReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class EntityReferenceImpl extends XMLEventImpl implements EntityReference {
    private final EntityDeclaration fDecl;
    private final String fName;

    public EntityReferenceImpl(EntityDeclaration entityDeclaration, Location location) {
    }

    public EntityDeclaration getDeclaration() {
    }

    public String getName() {
    }

    public void writeAsEncodedUnicode(Writer writer) throws XMLStreamException {
    }

    public EntityReferenceImpl(String str, EntityDeclaration entityDeclaration, Location location) {
    }
}
