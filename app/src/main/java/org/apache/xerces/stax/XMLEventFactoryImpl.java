package org.apache.xerces.stax;

import java.util.Iterator;
import org.javax.xml.namespace.NamespaceContext;
import org.javax.xml.namespace.QName;
import org.javax.xml.stream.Location;
import org.javax.xml.stream.XMLEventFactory;
import org.javax.xml.stream.events.Attribute;
import org.javax.xml.stream.events.Characters;
import org.javax.xml.stream.events.Comment;
import org.javax.xml.stream.events.DTD;
import org.javax.xml.stream.events.EndDocument;
import org.javax.xml.stream.events.EndElement;
import org.javax.xml.stream.events.EntityDeclaration;
import org.javax.xml.stream.events.EntityReference;
import org.javax.xml.stream.events.Namespace;
import org.javax.xml.stream.events.ProcessingInstruction;
import org.javax.xml.stream.events.StartDocument;
import org.javax.xml.stream.events.StartElement;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class XMLEventFactoryImpl extends XMLEventFactory {
    private Location fLocation;

    public Attribute createAttribute(String str, String str2, String str3, String str4) {
    }

    public Characters createCData(String str) {
    }

    public Characters createCharacters(String str) {
    }

    public Comment createComment(String str) {
    }

    public DTD createDTD(String str) {
    }

    public EndDocument createEndDocument() {
    }

    public EndElement createEndElement(QName qName, Iterator it) {
    }

    public EntityReference createEntityReference(String str, EntityDeclaration entityDeclaration) {
    }

    public Characters createIgnorableSpace(String str) {
    }

    public Namespace createNamespace(String str) {
    }

    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
    }

    public Characters createSpace(String str) {
    }

    public StartDocument createStartDocument() {
    }

    public StartElement createStartElement(QName qName, Iterator it, Iterator it2) {
    }

    public void setLocation(Location location) {
    }

    public Attribute createAttribute(String str, String str2) {
    }

    public EndElement createEndElement(String str, String str2, String str3) {
    }

    public Namespace createNamespace(String str, String str2) {
    }

    public StartDocument createStartDocument(String str, String str2, boolean z) {
    }

    public StartElement createStartElement(String str, String str2, String str3) {
    }

    public Attribute createAttribute(QName qName, String str) {
    }

    public EndElement createEndElement(String str, String str2, String str3, Iterator it) {
    }

    public StartDocument createStartDocument(String str, String str2) {
    }

    public StartElement createStartElement(String str, String str2, String str3, Iterator it, Iterator it2) {
    }

    public StartDocument createStartDocument(String str) {
    }

    public StartElement createStartElement(String str, String str2, String str3, Iterator it, Iterator it2, NamespaceContext namespaceContext) {
    }

    private StartElement createStartElement(QName qName, Iterator it, Iterator it2, NamespaceContext namespaceContext) {
    }
}
