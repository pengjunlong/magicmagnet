package org.cybergarage.upnp.xml;

import java.io.File;
import java.net.InetAddress;
import org.cybergarage.http.HTTPServerList;
import org.cybergarage.upnp.device.Advertiser;
import org.cybergarage.upnp.ssdp.SSDPPacket;
import org.cybergarage.upnp.ssdp.SSDPSearchSocketList;
import org.cybergarage.util.ListenerList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeviceData extends NodeData {
    private Advertiser advertiser;
    private ListenerList controlActionListenerList;
    private File descriptionFile;
    private String descriptionURI;
    private InetAddress[] httpBinds;
    private int httpPort;
    private HTTPServerList httpServerList;
    private int leaseTime;
    private String location;
    private InetAddress[] ssdpBinds;
    private String ssdpMulticastIPv4;
    private String ssdpMulticastIPv6;
    private SSDPPacket ssdpPacket;
    private int ssdpPort;
    private SSDPSearchSocketList ssdpSearchSocketList;

    public Advertiser getAdvertiser() {
    }

    public ListenerList getControlActionListenerList() {
    }

    public File getDescriptionFile() {
    }

    public String getDescriptionURI() {
    }

    public InetAddress[] getHTTPBindAddress() {
    }

    public int getHTTPPort() {
    }

    public HTTPServerList getHTTPServerList() {
    }

    public int getLeaseTime() {
    }

    public String getLocation() {
    }

    public String getMulticastIPv4Address() {
    }

    public String getMulticastIPv6Address() {
    }

    public InetAddress[] getSSDPBindAddress() {
    }

    public SSDPPacket getSSDPPacket() {
    }

    public int getSSDPPort() {
    }

    public SSDPSearchSocketList getSSDPSearchSocketList() {
    }

    public void setAdvertiser(Advertiser advertiser) {
    }

    public void setDescriptionFile(File file) {
    }

    public void setDescriptionURI(String str) {
    }

    public void setHTTPBindAddress(InetAddress[] inetAddressArr) {
    }

    public void setHTTPPort(int i) {
    }

    public void setLeaseTime(int i) {
    }

    public void setLocation(String str) {
    }

    public void setMulticastIPv4Address(String str) {
    }

    public void setMulticastIPv6Address(String str) {
    }

    public void setSSDPBindAddress(InetAddress[] inetAddressArr) {
    }

    public void setSSDPPacket(SSDPPacket sSDPPacket) {
    }

    public void setSSDPPort(int i) {
    }
}
