package org.apache.xerces.stax.events;

import org.javax.xml.namespace.QName;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.events.Characters;
import org.javax.xml.stream.events.EndElement;
import org.javax.xml.stream.events.StartElement;
import org.javax.xml.stream.events.XMLEvent;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class XMLEventImpl implements XMLEvent {
    private int fEventType;
    private Location fLocation;

    XMLEventImpl(int i, Location location) {
    }

    public final Characters asCharacters() {
    }

    public final EndElement asEndElement() {
    }

    public final StartElement asStartElement() {
    }

    public final int getEventType() {
    }

    public final Location getLocation() {
    }

    public final QName getSchemaType() {
    }

    public final boolean isAttribute() {
    }

    public final boolean isCharacters() {
    }

    public final boolean isEndDocument() {
    }

    public final boolean isEndElement() {
    }

    public final boolean isEntityReference() {
    }

    public final boolean isNamespace() {
    }

    public final boolean isProcessingInstruction() {
    }

    public final boolean isStartDocument() {
    }

    public final boolean isStartElement() {
    }

    public final String toString() {
    }
}
