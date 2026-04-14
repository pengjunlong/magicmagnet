package org.cybergarage.upnp.std.av.server;

import org.cybergarage.http.HTTPRequest;
import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.device.InvalidDescriptionException;
import org.cybergarage.upnp.std.av.server.object.Format;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MediaServer extends Device {
    public static final int DEFAULT_HTTP_PORT = 38520;
    public static final String DESCRIPTION = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<root xmlns=\"urn:schemas-upnp-org:device-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n   </specVersion>\n   <device>\n      <deviceType>urn:schemas-upnp-org:device:MediaServer:1</deviceType>\n      <friendlyName>Cyber Garage Media Server</friendlyName>\n      <manufacturer>Cyber Garage</manufacturer>\n      <manufacturerURL>http://www.cybergarage.org</manufacturerURL>\n      <modelDescription>Provides content through UPnP ContentDirectory service</modelDescription>\n      <modelName>Cyber Garage Media Server</modelName>\n      <modelNumber>1.0</modelNumber>\n      <modelURL>http://www.cybergarage.org</modelURL>\n      <UDN>uuid:362d9414-31a0-48b6-b684-2b4bd38391d0</UDN>\n      <serviceList>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:ContentDirectory:1</serviceType>\n            <serviceId>urn:upnp-org:serviceId:urn:schemas-upnp-org:service:ContentDirectory</serviceId>\n            <SCPDURL>/service/ContentDirectory1.xml</SCPDURL>\n            <controlURL>/service/ContentDirectory_control</controlURL>\n            <eventSubURL>/service/ContentDirectory_event</eventSubURL>\n         </service>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:ConnectionManager:1</serviceType>\n            <serviceId>urn:upnp-org:serviceId:urn:schemas-upnp-org:service:ConnectionManager</serviceId>\n            <SCPDURL>/service/ConnectionManager1.xml</SCPDURL>\n            <controlURL>/service/ConnectionManager_control</controlURL>\n            <eventSubURL>/service/ConnectionManager_event</eventSubURL>\n         </service>\n      </serviceList>\n   </device>\n</root>";
    private static final String DESCRIPTION_FILE_NAME = "description/description.xml";
    public static final String DEVICE_TYPE = "urn:schemas-upnp-org:device:MediaServer:1";
    private ContentDirectory conDir;
    private ConnectionManager conMan;

    public MediaServer(String str) throws InvalidDescriptionException {
    }

    private void initialize(String str, String str2, String str3) throws InvalidDescriptionException {
    }

    public void addContentDirectory(Directory directory) {
    }

    public boolean addPlugIn(Format format) {
    }

    protected void finalize() {
    }

    public ConnectionManager getConnectionManager() {
    }

    public ContentDirectory getContentDirectory() {
    }

    @Override // org.cybergarage.upnp.Device
    public String getInterfaceAddress() {
    }

    public int getNContentDirectories() {
    }

    @Override // org.cybergarage.upnp.Device, org.cybergarage.http.HTTPRequestListener
    public void httpRequestRecieved(HTTPRequest hTTPRequest) {
    }

    public void removeAllContentDirectories() {
    }

    public void removeContentDirectory(String str) {
    }

    public void setInterfaceAddress(String str) {
    }

    @Override // org.cybergarage.upnp.Device
    public boolean start() {
    }

    @Override // org.cybergarage.upnp.Device
    public boolean stop() {
    }

    public void update() {
    }

    public Directory getContentDirectory(int i) {
    }

    public MediaServer() {
    }

    public MediaServer(String str, String str2, String str3) throws InvalidDescriptionException {
    }

    private void initialize() {
    }
}
