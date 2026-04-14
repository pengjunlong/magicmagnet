package org.cybergarage.upnp.std.av.server.object;

import java.io.PrintWriter;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.cybergarage.upnp.std.av.server.MediaServer;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ContentNode extends Node {
    public static final String ID = "id";
    public static final String PARENT_ID = "parentID";
    public static final String RESTRICTED = "restricted";
    public static final String UNKNOWN = "UNKNOWN";
    private ContentDirectory contentDir;
    private ContentPropertyList propList;

    private void outputPropertyAttributes(PrintWriter printWriter, ContentProperty contentProperty) {
    }

    public void addProperty(ContentProperty contentProperty) {
    }

    public ContentDirectory getContentDirectory() {
    }

    public String getID() {
    }

    public MediaServer getMediaServer() {
    }

    public int getNProperties() {
    }

    public String getParentID() {
    }

    public ContentProperty getProperty(int i) {
    }

    public String getPropertyAttribureValue(String str, String str2) {
    }

    public int getPropertyIntegerValue(String str) {
    }

    public long getPropertyLongValue(String str) {
    }

    public String getPropertyValue(String str) {
    }

    public int getRestricted() {
    }

    public String getTitle() {
    }

    public String getUPnPClass() {
    }

    public String getWriteStatus() {
    }

    public boolean hasProperties() {
    }

    public void insertPropertyAt(ContentProperty contentProperty, int i) {
    }

    public boolean isContainerNode() {
    }

    public boolean isItemNode() {
    }

    public boolean isUPnPClassStartWith(String str) {
    }

    @Override // org.cybergarage.xml.Node
    public void output(PrintWriter printWriter, int i, boolean z) {
    }

    public boolean removeProperty(ContentProperty contentProperty) {
    }

    @Override // org.cybergarage.xml.Node
    public abstract boolean set(Node node);

    public void setContentDirectory(ContentDirectory contentDirectory) {
    }

    public void setID(int i) {
    }

    public void setParentID(int i) {
    }

    public void setProperty(String str, String str2) {
    }

    public void setPropertyAttribure(String str, String str2, String str3) {
    }

    public void setRestricted(int i) {
    }

    public void setTitle(String str) {
    }

    public void setUPnPClass(String str) {
    }

    public void setWriteStatus(String str) {
    }

    public void addProperty(String str, String str2) {
    }

    public ContentProperty getProperty(String str) {
    }

    public boolean removeProperty(String str) {
    }

    public void setID(String str) {
    }

    public void setParentID(String str) {
    }

    public void setProperty(String str, int i) {
    }

    public void setProperty(String str, long j) {
    }
}
