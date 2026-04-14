package org.cybergarage.upnp;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.device.InvalidDescriptionException;
import org.cybergarage.upnp.event.Subscriber;
import org.cybergarage.upnp.event.SubscriberList;
import org.cybergarage.upnp.ssdp.SSDPPacket;
import org.cybergarage.upnp.xml.ServiceData;
import org.cybergarage.util.Mutex;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.ParserException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Service {
    private static final String CONFIG_ID = "configId";
    private static final String CONTROL_URL = "controlURL";
    public static final String ELEM_NAME = "service";
    private static final String EVENT_SUB_URL = "eventSubURL";
    public static final String MAJOR = "major";
    public static final String MAJOR_VALUE = "1";
    public static final String MINOR = "minor";
    public static final String MINOR_VALUE = "0";
    private static final String SCPDURL = "SCPDURL";
    public static final String SCPD_ROOTNODE = "scpd";
    public static final String SCPD_ROOTNODE_NS = "urn:schemas-upnp-org:service-1-0";
    private static final String SERVICE_ID = "serviceId";
    private static final String SERVICE_TYPE = "serviceType";
    public static final String SPEC_VERSION = "specVersion";
    private Mutex mutex;
    private Node serviceNode;
    private Object userData;

    public Service() {
    }

    private Node getDeviceNode() {
    }

    private String getNotifyServiceTypeNT() {
    }

    private String getNotifyServiceTypeUSN() {
    }

    private Node getRootNode() {
    }

    private Node getSCPDNode(URL url) throws ParserException {
    }

    private ServiceData getServiceData() {
    }

    public static boolean isServiceNode(Node node) {
    }

    private boolean isURL(String str, String str2) {
    }

    private boolean notify(Subscriber subscriber, StateVariable stateVariable) {
    }

    public void addAction(Action action) {
    }

    public void addStateVariable(StateVariable stateVariable) {
    }

    public void addSubscriber(Subscriber subscriber) {
    }

    public void announce(String str) {
    }

    public void byebye(String str) {
    }

    public void clearSID() {
    }

    public Action getAction(String str) {
    }

    public ActionList getActionList() {
    }

    public int getConfigId() {
    }

    public String getControlURL() {
    }

    public String getDescriptionURL() {
    }

    public Device getDevice() {
    }

    public String getEventSubURL() {
    }

    public Device getRootDevice() {
    }

    public byte[] getSCPDData() {
    }

    public String getSCPDURL() {
    }

    public String getSID() {
    }

    public String getServiceID() {
    }

    public Node getServiceNode() {
    }

    public ServiceStateTable getServiceStateTable() {
    }

    public String getServiceType() {
    }

    public StateVariable getStateVariable(String str) {
    }

    public Subscriber getSubscriber(String str) {
    }

    public SubscriberList getSubscriberList() {
    }

    public long getTimeout() {
    }

    public Object getUserData() {
    }

    public boolean hasSID() {
    }

    public boolean hasStateVariable(String str) {
    }

    public boolean isControlURL(String str) {
    }

    public boolean isEventSubURL(String str) {
    }

    public boolean isSCPDURL(String str) {
    }

    public boolean isService(String str) {
    }

    public boolean isSubscribed() {
    }

    public boolean loadSCPD(String str) throws InvalidDescriptionException {
    }

    public void lock() {
    }

    public void notifyAllStateVariables() {
    }

    public void removeSubscriber(Subscriber subscriber) {
    }

    public boolean serviceSearchResponse(SSDPPacket sSDPPacket) {
    }

    public void setActionListener(ActionListener actionListener) {
    }

    public void setControlURL(String str) {
    }

    public void setDescriptionURL(String str) {
    }

    public void setEventSubURL(String str) {
    }

    public void setQueryListener(QueryListener queryListener) {
    }

    public void setSCPDURL(String str) {
    }

    public void setSID(String str) {
    }

    public void setServiceID(String str) {
    }

    public void setServiceType(String str) {
    }

    public void setTimeout(long j) {
    }

    public void setUserData(Object obj) {
    }

    public void unlock() {
    }

    public void updateConfigId() {
    }

    private Node getSCPDNode(File file) throws ParserException {
    }

    private Node getSCPDNode() {
    }

    public boolean loadSCPD(File file) throws ParserException {
    }

    public boolean loadSCPD(InputStream inputStream) throws ParserException {
    }

    public void notify(StateVariable stateVariable) {
    }

    public Service(Node node) {
    }
}
