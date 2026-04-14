package org.apache.xerces.util;

import org.apache.xerces.xni.parser.XMLInputSource;
import org.javax.xml.stream.XMLEventReader;
import org.javax.xml.stream.XMLStreamReader;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class StAXInputSource extends XMLInputSource {
    private final boolean fConsumeRemainingContent;
    private final XMLEventReader fEventReader;
    private final XMLStreamReader fStreamReader;

    public StAXInputSource(XMLStreamReader xMLStreamReader) {
    }

    private static String getEventReaderSystemId(XMLEventReader xMLEventReader) {
    }

    public XMLEventReader getXMLEventReader() {
    }

    public XMLStreamReader getXMLStreamReader() {
    }

    @Override // org.apache.xerces.xni.parser.XMLInputSource
    public void setSystemId(String str) {
    }

    public boolean shouldConsumeRemainingContent() {
    }

    public StAXInputSource(XMLStreamReader xMLStreamReader, boolean z) {
    }

    public StAXInputSource(XMLEventReader xMLEventReader) {
    }

    public StAXInputSource(XMLEventReader xMLEventReader, boolean z) {
    }
}
