package org.cybergarage.upnp.ssdp;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.cybergarage.upnp.device.SearchListener;
import org.cybergarage.util.ListenerList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SSDPSearchSocket extends HTTPMUSocket implements Runnable {
    private ListenerList deviceSearchListenerList;
    private Thread deviceSearchThread;
    private boolean useIPv6Address;

    public SSDPSearchSocket(String str, int i, String str2) {
    }

    public void addSearchListener(SearchListener searchListener) {
    }

    public boolean open(Inet4Address inet4Address) {
    }

    public void performSearchListener(SSDPPacket sSDPPacket) {
    }

    public void removeSearchListener(SearchListener searchListener) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void start() {
    }

    public void stop() {
    }

    public boolean open(Inet6Address inet6Address) {
    }

    public SSDPSearchSocket(InetAddress inetAddress) {
    }

    public boolean open(String str, String str2) {
    }

    public boolean open(String str) {
    }
}
