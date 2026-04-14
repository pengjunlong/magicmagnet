package org.cybergarage.upnp.std.av.controller;

import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.DeviceList;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MediaController extends ControlPoint {
    private DeviceList getDeviceList(String str) {
    }

    public static void main(String[] strArr) {
    }

    public Node browse(Device device, String str, String str2, String str3, int i, int i2, String str4) {
    }

    public Node browseDirectChildren(Device device, String str, String str2, int i, int i2, String str3) {
    }

    public Node browseMetaData(Device device, String str, String str2, int i, int i2, String str3) {
    }

    public ContentNode getContentDirectory(Device device) {
    }

    public Device getRendererDevice(String str) {
    }

    public DeviceList getRendererDeviceList() {
    }

    public Device getServerDevice(String str) {
    }

    public DeviceList getServerDeviceList() {
    }

    public boolean play(Device device) {
    }

    public void printContentDirectory(Device device) {
    }

    public void printContentNode(ContentNode contentNode, int i) {
    }

    public void printMediaServers() {
    }

    public boolean setAVTransportURI(Device device, ItemNode itemNode) {
    }

    public boolean stop(Device device) {
    }

    public Node browseDirectChildren(Device device, String str) {
    }

    public Node browseMetaData(Device device, String str) {
    }

    public ContentNode getContentDirectory(Device device, String str) {
    }

    public boolean play(Device device, ItemNode itemNode) {
    }

    public ContainerNode browse(Device device) {
    }

    public ContainerNode browse(Device device, String str) {
    }

    public ContainerNode browse(Device device, String str, boolean z, boolean z2) {
    }

    public ContainerNode browse(Device device, String str, boolean z) {
    }

    private int browse(ContainerNode containerNode, Device device, String str, boolean z) {
    }
}
