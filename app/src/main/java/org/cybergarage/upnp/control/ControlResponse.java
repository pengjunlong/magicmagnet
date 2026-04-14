package org.cybergarage.upnp.control;

import org.cybergarage.soap.SOAPResponse;
import org.cybergarage.upnp.UPnPStatus;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ControlResponse extends SOAPResponse {
    public static final String FAULT_CODE = "Client";
    public static final String FAULT_STRING = "UPnPError";
    private UPnPStatus upnpErr;

    public ControlResponse() {
    }

    private Node createFaultResponseNode(int i, String str) {
    }

    private Node getUPnPErrorCodeNode() {
    }

    private Node getUPnPErrorDescriptionNode() {
    }

    private Node getUPnPErrorNode() {
    }

    public UPnPStatus getUPnPError() {
    }

    public int getUPnPErrorCode() {
    }

    public String getUPnPErrorDescription() {
    }

    public void setFaultResponse(int i, String str) {
    }

    public ControlResponse(SOAPResponse sOAPResponse) {
    }

    public void setFaultResponse(int i) {
    }

    private Node createFaultResponseNode(int i) {
    }
}
