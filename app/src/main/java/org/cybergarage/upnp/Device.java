package org.cybergarage.upnp;

import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Calendar;
import java.util.HashMap;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.http.HTTPRequestListener;
import org.cybergarage.http.HTTPServerList;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.ActionRequest;
import org.cybergarage.upnp.control.ControlRequest;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.control.QueryRequest;
import org.cybergarage.upnp.device.Advertiser;
import org.cybergarage.upnp.device.InvalidDescriptionException;
import org.cybergarage.upnp.device.PresentationListener;
import org.cybergarage.upnp.device.SearchListener;
import org.cybergarage.upnp.event.SubscriptionRequest;
import org.cybergarage.upnp.ssdp.SSDPPacket;
import org.cybergarage.upnp.ssdp.SSDPSearchSocketList;
import org.cybergarage.upnp.xml.DeviceData;
import org.cybergarage.util.Mutex;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Device implements HTTPRequestListener, SearchListener {
    private static final String CONFIG_ID = "configId";
    public static final String DEFAULT_DESCRIPTION_URI = "/description.xml";
    public static final int DEFAULT_DISCOVERY_WAIT_TIME = 300;
    public static final int DEFAULT_LEASE_TIME = 1800;
    public static final String DEFAULT_PRESENTATION_URI = "/presentation";
    public static final int DEFAULT_STARTUP_WAIT_TIME = 1000;
    private static final String DEVICE_TYPE = "deviceType";
    public static final String ELEM_NAME = "device";
    private static final String FRIENDLY_NAME = "friendlyName";
    public static final int HTTP_DEFAULT_PORT = 4004;
    private static final String MANUFACTURE = "manufacturer";
    private static final String MANUFACTURE_URL = "manufacturerURL";
    private static final String MODEL_DESCRIPTION = "modelDescription";
    private static final String MODEL_NAME = "modelName";
    private static final String MODEL_NUMBER = "modelNumber";
    private static final String MODEL_URL = "modelURL";
    private static final String SERIAL_NUMBER = "serialNumber";
    private static final String UDN = "UDN";
    private static final String UPC = "UPC";
    public static final String UPNP_ROOTDEVICE = "upnp:rootdevice";
    private static final String URLBASE_NAME = "URLBase";
    private static Calendar cal = null;
    private static final String presentationURL = "presentationURL";
    private int bootId;
    private String devUUID;
    private Node deviceNode;
    private HashMap<String, byte[]> iconBytesMap;
    private Mutex mutex;
    private PresentationListener presentationListener;
    private Node rootNode;
    private Object userData;
    private boolean wirelessMode;

    public Device(Node node, Node node2) {
    }

    private void deviceActionControlRecieved(ActionRequest actionRequest, Service service) {
    }

    private void deviceControlRequestRecieved(ControlRequest controlRequest, Service service) {
    }

    private void deviceEventNewSubscriptionRecieved(Service service, SubscriptionRequest subscriptionRequest) {
    }

    private void deviceEventRenewSubscriptionRecieved(Service service, SubscriptionRequest subscriptionRequest) {
    }

    private void deviceEventSubscriptionRecieved(SubscriptionRequest subscriptionRequest) {
    }

    private void deviceEventUnsubscriptionRecieved(Service service, SubscriptionRequest subscriptionRequest) {
    }

    private void deviceQueryControlRecieved(QueryRequest queryRequest, Service service) {
    }

    private Advertiser getAdvertiser() {
    }

    private synchronized byte[] getDescriptionData(String str) {
    }

    private String getDescriptionURI() {
    }

    private DeviceData getDeviceData() {
    }

    private HTTPServerList getHTTPServerList() {
    }

    private String getNotifyDeviceNT() {
    }

    private String getNotifyDeviceTypeNT() {
    }

    private String getNotifyDeviceTypeUSN() {
    }

    private String getNotifyDeviceUSN() {
    }

    private SSDPSearchSocketList getSSDPSearchSocketList() {
    }

    private void httpGetRequestRecieved(HTTPRequest hTTPRequest) {
    }

    private void httpPostRequestRecieved(HTTPRequest hTTPRequest) {
    }

    private boolean initializeLoadedDescription() {
    }

    private void invalidActionControlRecieved(ControlRequest controlRequest) {
    }

    private void invalidArgumentsControlRecieved(ControlRequest controlRequest) {
    }

    private boolean isDescriptionURI(String str) {
    }

    public static boolean isDeviceNode(Node node) {
    }

    private boolean isPresentationRequest(HTTPRequest hTTPRequest) {
    }

    public static final void notifyWait() {
    }

    private void setAdvertiser(Advertiser advertiser) {
    }

    private void setDescriptionFile(File file) {
    }

    private void setDescriptionURI(String str) {
    }

    private void setURLBase(String str) {
    }

    private void setUUID(String str) {
    }

    private void soapActionRecieved(HTTPRequest hTTPRequest) {
    }

    private void soapBadActionRecieved(HTTPRequest hTTPRequest) {
    }

    private boolean stop(boolean z) {
    }

    private void updateBootId() {
    }

    private void updateConfigId(Device device) {
    }

    private void updateUDN() {
    }

    private void updateURLBase(String str) {
    }

    private void upnpBadSubscriptionRecieved(SubscriptionRequest subscriptionRequest, int i) {
    }

    public void addDevice(Device device) {
    }

    public boolean addIcon(Icon icon) {
    }

    public void addService(Service service) {
    }

    public void announce(String str) {
    }

    public void byebye(String str) {
    }

    @Override // org.cybergarage.upnp.device.SearchListener
    public void deviceSearchReceived(SSDPPacket sSDPPacket) {
    }

    public void deviceSearchResponse(SSDPPacket sSDPPacket) {
    }

    public String getAbsoluteURL(String str, String str2, String str3) {
    }

    public Action getAction(String str) {
    }

    public int getBootId() {
    }

    public int getConfigId() {
    }

    public File getDescriptionFile() {
    }

    public String getDescriptionFilePath() {
    }

    public Device getDevice(String str) {
    }

    public Device getDeviceByDescriptionURI(String str) {
    }

    public DeviceList getDeviceList() {
    }

    public Node getDeviceNode() {
    }

    public String getDeviceType() {
    }

    public long getElapsedTime() {
    }

    public String getFriendlyName() {
    }

    public InetAddress[] getHTTPBindAddress() {
    }

    public int getHTTPPort() {
    }

    public Icon getIcon(int i) {
    }

    public Icon getIconByURI(String str) {
    }

    public IconList getIconList() {
    }

    public String getInterfaceAddress() {
    }

    public int getLeaseTime() {
    }

    public String getLocation() {
    }

    public String getLocationURL(String str) {
    }

    public String getManufacture() {
    }

    public String getManufactureURL() {
    }

    public String getModelDescription() {
    }

    public String getModelName() {
    }

    public String getModelNumber() {
    }

    public String getModelURL() {
    }

    public String getMulticastIPv4Address() {
    }

    public String getMulticastIPv6Address() {
    }

    public Device getParentDevice() {
    }

    public PresentationListener getPresentationListener() {
    }

    public String getPresentationURL() {
    }

    public Device getRootDevice() {
    }

    public Node getRootNode() {
    }

    public int getSSDPAnnounceCount() {
    }

    public InetAddress[] getSSDPBindAddress() {
    }

    public String getSSDPIPv4MulticastAddress() {
    }

    public String getSSDPIPv6MulticastAddress() {
    }

    public SSDPPacket getSSDPPacket() {
    }

    public int getSSDPPort() {
    }

    public String getSerialNumber() {
    }

    public Service getService(String str) {
    }

    public Service getServiceByControlURL(String str) {
    }

    public Service getServiceByEventSubURL(String str) {
    }

    public Service getServiceBySCPDURL(String str) {
    }

    public ServiceList getServiceList() {
    }

    public Icon getSmallestIcon() {
    }

    public StateVariable getStateVariable(String str, String str2) {
    }

    public Service getSubscriberService(String str) {
    }

    public long getTimeStamp() {
    }

    public String getUDN() {
    }

    public String getUPC() {
    }

    public String getURLBase() {
    }

    public String getUUID() {
    }

    public Object getUserData() {
    }

    public boolean hasPresentationListener() {
    }

    public boolean hasUDN() {
    }

    @Override // org.cybergarage.http.HTTPRequestListener
    public void httpRequestRecieved(HTTPRequest hTTPRequest) {
    }

    public boolean isDevice(String str) {
    }

    public boolean isDeviceType(String str) {
    }

    public boolean isExpired() {
    }

    public boolean isIconBytesURI(String str) {
    }

    public boolean isNMPRMode() {
    }

    public boolean isRootDevice() {
    }

    public boolean isRunning() {
    }

    public boolean isWirelessMode() {
    }

    public boolean loadDescription(InputStream inputStream) throws InvalidDescriptionException {
    }

    public void lock() {
    }

    public boolean postSearchResponse(SSDPPacket sSDPPacket, String str, String str2) {
    }

    public boolean removePresentationURL() {
    }

    public void setActionListener(ActionListener actionListener) {
    }

    public void setDeviceNode(Node node) {
    }

    public void setDeviceType(String str) {
    }

    public void setFriendlyName(String str) {
    }

    public void setHTTPBindAddress(InetAddress[] inetAddressArr) {
    }

    public void setHTTPPort(int i) {
    }

    public void setLeaseTime(int i) {
    }

    public void setLocation(String str) {
    }

    public void setManufacture(String str) {
    }

    public void setManufactureURL(String str) {
    }

    public void setModelDescription(String str) {
    }

    public void setModelName(String str) {
    }

    public void setModelNumber(String str) {
    }

    public void setModelURL(String str) {
    }

    public void setMulticastIPv4Address(String str) {
    }

    public void setMulticastIPv6Address(String str) {
    }

    public void setNMPRMode(boolean z) {
    }

    public void setPresentationListener(PresentationListener presentationListener) {
    }

    public void setPresentationURL(String str) {
    }

    public void setQueryListener(QueryListener queryListener) {
    }

    public void setRootNode(Node node) {
    }

    public void setSSDPBindAddress(InetAddress[] inetAddressArr) {
    }

    public void setSSDPPacket(SSDPPacket sSDPPacket) {
    }

    public void setSSDPPort(int i) {
    }

    public void setSerialNumber(String str) {
    }

    public void setUDN(String str) {
    }

    public void setUPC(String str) {
    }

    public void setUserData(Object obj) {
    }

    public void setWirelessMode(boolean z) {
    }

    public boolean start() {
    }

    public void unlock() {
    }

    public void getSSDPIPv4MulticastAddress(String str) {
    }

    public void getSSDPIPv6MulticastAddress(String str) {
    }

    public void setActionListener(ActionListener actionListener, boolean z) {
    }

    public void setQueryListener(QueryListener queryListener, boolean z) {
    }

    public Device() {
    }

    public boolean loadDescription(String str) throws InvalidDescriptionException {
    }

    public Device(Node node) {
    }

    public StateVariable getStateVariable(String str) {
    }

    public Device(File file) throws InvalidDescriptionException {
    }

    public Device(InputStream inputStream) throws InvalidDescriptionException {
    }

    public boolean stop() {
    }

    public Device(String str) throws InvalidDescriptionException {
    }

    public void updateConfigId() {
    }

    public boolean loadDescription(File file) throws InvalidDescriptionException {
    }

    public void byebye() {
    }

    public void announce() {
    }

    public String getAbsoluteURL(String str) {
    }
}
