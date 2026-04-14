package org.cybergarage.http;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import org.cybergarage.util.ListenerList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HTTPServer implements Runnable {
    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_TIMEOUT = 80000;
    public static final String NAME = "CyberHTTP";
    public static final String VERSION = "1.0";
    private InetAddress bindAddr;
    private int bindPort;
    private ListenerList httpRequestListenerList;
    private Thread httpServerThread;
    private ServerSocket serverSock;
    protected int timeout;

    public static String getName() {
    }

    public Socket accept() {
    }

    public void addRequestListener(HTTPRequestListener hTTPRequestListener) {
    }

    public boolean close() {
    }

    public String getBindAddress() {
    }

    public int getBindPort() {
    }

    public ServerSocket getServerSock() {
    }

    public synchronized int getTimeout() {
    }

    public boolean isOpened() {
    }

    public boolean open(InetAddress inetAddress, int i) {
    }

    public void performRequestListener(HTTPRequest hTTPRequest) {
    }

    public void removeRequestListener(HTTPRequestListener hTTPRequestListener) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public synchronized void setTimeout(int i) {
    }

    public boolean start() {
    }

    public boolean stop() {
    }

    public boolean open(String str, int i) {
    }
}
