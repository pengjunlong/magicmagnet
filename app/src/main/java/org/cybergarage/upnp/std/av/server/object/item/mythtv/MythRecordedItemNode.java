package org.cybergarage.upnp.std.av.server.object.item.mythtv;

import java.io.InputStream;
import org.cybergarage.upnp.std.av.server.directory.mythtv.MythRecordedInfo;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MythRecordedItemNode extends ItemNode {
    private static final String MIME_TYPE = "video/mpeg";
    private MythRecordedInfo recInfo;

    public boolean equals(MythRecordedInfo mythRecordedInfo) {
    }

    public byte[] getContent() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public InputStream getContentInputStream() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public long getContentLength() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public String getMimeType() {
    }

    public MythRecordedInfo getRecordedInfo() {
    }

    public void setRecordedInfo(MythRecordedInfo mythRecordedInfo) {
    }
}
