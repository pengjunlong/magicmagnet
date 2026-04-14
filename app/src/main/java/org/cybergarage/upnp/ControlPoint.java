package org.cybergarage.upnp;

import java.net.InetAddress;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.http.HTTPRequestListener;
import org.cybergarage.http.HTTPServerList;
import org.cybergarage.upnp.control.RenewSubscriber;
import org.cybergarage.upnp.device.DeviceChangeListener;
import org.cybergarage.upnp.device.Disposer;
import org.cybergarage.upnp.device.NotifyListener;
import org.cybergarage.upnp.device.SearchResponseListener;
import org.cybergarage.upnp.event.EventListener;
import org.cybergarage.upnp.ssdp.SSDPNotifySocketList;
import org.cybergarage.upnp.ssdp.SSDPPacket;
import org.cybergarage.upnp.ssdp.SSDPSearchResponseSocketList;
import org.cybergarage.util.ListenerList;
import org.cybergarage.util.Mutex;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.NodeList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ControlPoint implements HTTPRequestListener {
    private static final int DEFAULT_EVENTSUB_PORT = 8058;
    private static final String DEFAULT_EVENTSUB_URI = "/evetSub";
    private static final int DEFAULT_EXPIRED_DEVICE_MONITORING_INTERVAL = 60;
    private static final int DEFAULT_SSDP_PORT = 8008;
    private final NodeList devNodeList;
    private final ReentrantReadWriteLock devNodeListLock;
    ListenerList deviceChangeListenerList;
    private Disposer deviceDisposer;
    private ListenerList deviceNotifyListenerList;
    private ListenerList deviceSearchResponseListenerList;
    private ListenerList eventListenerList;
    private String eventSubURI;
    private long expiredDeviceMonitoringInterval;
    private int httpPort;
    private HTTPServerList httpServerList;
    private Mutex mutex;
    private boolean nmprMode;
    private RenewSubscriber renewSubscriber;
    private int searchMx;
    private SSDPNotifySocketList ssdpNotifySocketList;
    private int ssdpPort;
    private SSDPSearchResponseSocketList ssdpSearchResponseSocketList;
    private Object userData;

    public ControlPoint(int i, int i2, InetAddress[] inetAddressArr) {
    }

    private void addDevice(Node node) {
    }

    private Device getDevice(Node node) {
    }

    private String getEventSubCallbackURL(String str) {
    }

    private HTTPServerList getHTTPServerList() {
    }

    private SSDPNotifySocketList getSSDPNotifySocketList() {
    }

    private SSDPSearchResponseSocketList getSSDPSearchResponseSocketList() {
    }

    private void removeDevice(Node node) {
    }

    public void addDeviceChangeListener(DeviceChangeListener deviceChangeListener) {
    }

    public void addEventListener(EventListener eventListener) {
    }

    public void addNotifyListener(NotifyListener notifyListener) {
    }

    public void addSearchResponseListener(SearchResponseListener searchResponseListener) {
    }

    public void finalize() {
    }

    public Disposer getDeviceDisposer() {
    }

    public DeviceList getDeviceList() {
    }

    public String getEventSubURI() {
    }

    public long getExpiredDeviceMonitoringInterval() {
    }

    public int getHTTPPort() {
    }

    public RenewSubscriber getRenewSubscriber() {
    }

    public int getSSDPPort() {
    }

    public int getSearchMx() {
    }

    public Service getSubscriberService(String str) {
    }

    public Object getUserData() {
    }

    public boolean hasDevice(String str) {
    }

    @Override // org.cybergarage.http.HTTPRequestListener
    public void httpRequestRecieved(HTTPRequest hTTPRequest) {
    }

    public boolean isNMPRMode() {
    }

    public boolean isSubscribed(Service service) {
    }

    public void lock() {
    }

    public void notifyReceived(SSDPPacket sSDPPacket) {
    }

    public void performAddDeviceListener(Device device) {
    }

    public void performEventListener(String str, long j, String str2, String str3) {
    }

    public void performNotifyListener(SSDPPacket sSDPPacket) {
    }

    public void performRemoveDeviceListener(Device device) {
    }

    public void performSearchResponseListener(SSDPPacket sSDPPacket) {
    }

    public void print() {
    }

    public void removeDeviceChangeListener(DeviceChangeListener deviceChangeListener) {
    }

    public void removeEventListener(EventListener eventListener) {
    }

    public void removeExpiredDevices() {
    }

    public void removeNotifyListener(NotifyListener notifyListener) {
    }

    public void removeSearchResponseListener(SearchResponseListener searchResponseListener) {
    }

    public void renewSubscriberService(Device device, long j) {
    }

    public void search(String str, int i) {
    }

    public void searchResponseReceived(SSDPPacket sSDPPacket) {
    }

    public void setDeviceDisposer(Disposer disposer) {
    }

    public void setEventSubURI(String str) {
    }

    public void setExpiredDeviceMonitoringInterval(long j) {
    }

    public void setHTTPPort(int i) {
    }

    public void setNMPRMode(boolean z) {
    }

    public void setRenewSubscriber(RenewSubscriber renewSubscriber) {
    }

    public void setSSDPPort(int i) {
    }

    public void setSearchMx(int i) {
    }

    public void setUserData(Object obj) {
    }

    public boolean start(String str, int i) {
    }

    public boolean stop() {
    }

    public boolean subscribe(Service service, long j) {
    }

    public void unlock() {
    }

    public boolean unsubscribe(Service service) {
    }

    public Device getDevice(String str) {
    }

    public void search(String str) {
    }

    private synchronized void addDevice(SSDPPacket sSDPPacket) {
    }

    public void search() {
    }

    public void unsubscribe(Device device) {
    }

    protected void removeDevice(Device device) {
    }

    protected void removeDevice(String str) {
    }

    private void removeDevice(SSDPPacket sSDPPacket) {
    }

    public void renewSubscriberService(long j) {
    }

    public boolean subscribe(Service service) {
    }

    public boolean subscribe(Service service, String str, long j) {
    }

    public void unsubscribe() {
    }

    public void renewSubscriberService() {
    }

    public ControlPoint(int i, int i2) {
    }

    public ControlPoint() {
    }

    public boolean subscribe(Service service, String str) {
    }

    public boolean start(String str) {
    }

    public boolean start() {
    }
}
