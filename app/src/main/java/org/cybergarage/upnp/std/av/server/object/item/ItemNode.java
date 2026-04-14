package org.cybergarage.upnp.std.av.server.object.item;

import java.io.InputStream;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.xml.AttributeList;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ItemNode extends ContentNode {
    public static final String COLOR_DEPTH = "colorDepth";
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String IMPORT_URI = "importUri";
    public static final String NAME = "item";
    public static final String PROTOCOL_INFO = "protocolInfo";
    public static final String RES = "res";
    public static final String RESOLUTION = "resolution";
    public static final String SIZE = "size";
    private ResourceNodeList resourceNodeList;

    public static final boolean isItemNode(Node node) {
    }

    public void addContentNode(ContentNode contentNode) {
    }

    public void addResourceNode(ResourceNode resourceNode) {
    }

    public String getAlbumArtURI() {
    }

    public InputStream getContentInputStream() {
    }

    public long getContentLength() {
    }

    public String getCreator() {
    }

    public String getDate() {
    }

    public long getDateTime() {
    }

    public ResourceNode getFirstResource() {
    }

    public String getMimeType() {
    }

    public int getNResourceNodeLists() {
    }

    public String getProtocolInfo() {
    }

    public String getResource() {
    }

    public ResourceNode getResourceNode(int i) {
    }

    public ResourceNodeList getResourceNodeList() {
    }

    public ResourceNode getSmallImageResource() {
    }

    public String getStorageMedium() {
    }

    public long getStorageUsed() {
    }

    public ResourceNode getThumbnailResource() {
    }

    public boolean isAudioClass() {
    }

    public boolean isImageClass() {
    }

    public boolean isMovieClass() {
    }

    public boolean isVideoClass() {
    }

    public boolean removeContentNode(ContentNode contentNode) {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.ContentNode, org.cybergarage.xml.Node
    public boolean set(Node node) {
    }

    public void setAlbumArtURI(String str) {
    }

    public void setCreator(String str) {
    }

    public void setDate(String str) {
    }

    public void setResource(String str, String str2, AttributeList attributeList) {
    }

    public void setStorageMedium(String str) {
    }

    public void setStorageUsed(long j) {
    }

    public void setDate(long j) {
    }

    public void setResource(String str, String str2) {
    }
}
