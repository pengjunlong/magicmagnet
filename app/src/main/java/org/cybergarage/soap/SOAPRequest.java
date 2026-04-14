package org.cybergarage.soap;

import org.cybergarage.http.HTTPRequest;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SOAPRequest extends HTTPRequest {
    private static final String SOAPACTION = "SOAPACTION";
    private Node rootNode;

    public SOAPRequest() {
    }

    private synchronized Node getRootNode() {
    }

    private void setRootNode(Node node) {
    }

    public Node getBodyNode() {
    }

    public Node getEnvelopeNode() {
    }

    public String getSOAPAction() {
    }

    public boolean isSOAPAction(String str) {
    }

    public SOAPResponse postMessage(String str, int i) {
    }

    @Override // org.cybergarage.http.HTTPRequest
    public void print() {
    }

    public void setContent(Node node) {
    }

    public void setEnvelopeNode(Node node) {
    }

    public void setSOAPAction(String str) {
    }

    public SOAPRequest(HTTPRequest hTTPRequest) {
    }
}
