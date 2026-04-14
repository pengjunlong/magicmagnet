package org.cybergarage.upnp.ssdp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import org.cybergarage.http.HTTPRequest;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HTTPMUSocket {
    private InetSocketAddress ssdpMultiGroup;
    private NetworkInterface ssdpMultiIf;
    private MulticastSocket ssdpMultiSock;

    public HTTPMUSocket() {
    }

    public boolean close() {
    }

    protected void finalize() {
    }

    public String getLocalAddress() {
    }

    public int getLocalPort() {
    }

    public String getMulticastAddress() {
    }

    public InetAddress getMulticastInetAddress() {
    }

    public int getMulticastPort() {
    }

    public MulticastSocket getSocket() {
    }

    public boolean open(String str, int i, InetAddress inetAddress) {
    }

    public boolean post(HTTPRequest hTTPRequest, String str, int i) {
    }

    public SSDPPacket receive() throws IOException {
    }

    public boolean send(String str, String str2, int i) {
    }

    public boolean post(HTTPRequest hTTPRequest) {
    }

    public HTTPMUSocket(String str, int i, String str2) {
    }

    public boolean open(String str, int i, String str2) {
    }

    public boolean send(String str) {
    }
}
