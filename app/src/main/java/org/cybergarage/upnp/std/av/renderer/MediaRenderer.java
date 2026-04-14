package org.cybergarage.upnp.std.av.renderer;

import org.cybergarage.http.HTTPRequest;
import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.device.InvalidDescriptionException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MediaRenderer extends Device {
    public static final int DEFAULT_HTTP_PORT = 39520;
    public static final String DESCRIPTION = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<root xmlns=\"urn:schemas-upnp-org:device-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n   </specVersion>\n   <device>\n      <deviceType>urn:schemas-upnp-org:device:MediaRender:1</deviceType>\n      <friendlyName>Cyber Garage Media Render</friendlyName>\n      <manufacturer>Cyber Garage</manufacturer>\n      <manufacturerURL>http://www.cybergarage.org</manufacturerURL>\n      <modelDescription>Provides content through UPnP ContentDirectory service</modelDescription>\n      <modelName>Cyber Garage Media Render</modelName>\n      <modelNumber>1.0</modelNumber>\n      <modelURL>http://www.cybergarage.org</modelURL>\n      <UDN>uuid:362d9414-31a0-48b6-b684-2b4bd38391d0</UDN>\n      <serviceList>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:RenderingControl:1</serviceType>\n            <serviceId>RenderingControl</serviceId>\n         </service>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:ConnectionManager:1</serviceType>\n            <serviceId>ConnectionManager</serviceId>\n         </service>\n         <service>\n            <serviceType>urn:schemas-upnp-org:service:AVTransport:1</serviceType>\n            <serviceId>AVTransport</serviceId>\n         </service>\n      </serviceList>\n   </device>\n</root>";
    private static final String DESCRIPTION_FILE_NAME = "description/description.xml";
    public static final String DEVICE_TYPE = "urn:schemas-upnp-org:device:MediaRenderer:1";
    private ActionListener actionListener;
    private AVTransport avTrans;
    private ConnectionManager conMan;
    private RenderingControl renCon;

    public MediaRenderer(String str) throws InvalidDescriptionException {
    }

    private void initialize(String str, String str2, String str3, String str4) throws InvalidDescriptionException {
    }

    protected void finalize() {
    }

    public AVTransport getAVTransport() {
    }

    public ActionListener getActionListener() {
    }

    public ConnectionManager getConnectionManager() {
    }

    @Override // org.cybergarage.upnp.Device
    public String getInterfaceAddress() {
    }

    public RenderingControl getRenderingControl() {
    }

    @Override // org.cybergarage.upnp.Device, org.cybergarage.http.HTTPRequestListener
    public void httpRequestRecieved(HTTPRequest hTTPRequest) {
    }

    @Override // org.cybergarage.upnp.Device
    public void setActionListener(ActionListener actionListener) {
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

    public MediaRenderer() {
    }

    public MediaRenderer(String str, String str2, String str3, String str4) throws InvalidDescriptionException {
    }

    private void initialize() {
    }
}
