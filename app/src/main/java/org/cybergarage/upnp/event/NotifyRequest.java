package org.cybergarage.upnp.event;

import org.cybergarage.http.HTTPRequest;
import org.cybergarage.soap.SOAPRequest;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NotifyRequest extends SOAPRequest {
    private static final String PROPERTY = "property";
    private static final String PROPERTYSET = "propertyset";
    private static final String XMLNS = "e";

    public NotifyRequest() {
    }

    private Node createPropertySetNode(String str, String str2) {
    }

    private Property getProperty(Node node) {
    }

    private Node getVariableNode() {
    }

    public PropertyList getPropertyList() {
    }

    public long getSEQ() {
    }

    public String getSID() {
    }

    public void setNT(String str) {
    }

    public void setNTS(String str) {
    }

    public boolean setRequest(Subscriber subscriber, String str, String str2) {
    }

    public void setSEQ(long j) {
    }

    public void setSID(String str) {
    }

    public NotifyRequest(HTTPRequest hTTPRequest) {
    }
}
