package org.cybergarage.upnp.std.av.server.object.format;

import java.io.File;
import java.io.InputStream;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.xml.AttributeList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ID3Format extends Header implements Format, FormatObject {
    public static final int FRAME_HEADER_SIZE = 10;
    public static final String HEADER_ID = "ID3";
    public static final int HEADER_SIZE = 10;
    private byte[] extHeader;
    private byte[] frameHeader;
    private ID3FrameList frameList;
    private byte[] header;
    private File mp3File;

    public ID3Format() {
    }

    private int getFrameFlag(byte[] bArr) {
    }

    private String getFrameID(byte[] bArr) {
    }

    private int getFrameSize(byte[] bArr) {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public AttributeList getAttributeList() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getCreator() {
    }

    public int getExtHeaderSize() {
    }

    public int getFlag() {
    }

    public byte[] getFrameData(String str) {
    }

    public String getFrameStringData(String str) {
    }

    public String getHeaderID() {
    }

    public int getHeaderSize() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMediaClass() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getTitle() {
    }

    public boolean hasExtendedHeader() {
    }

    public boolean hasFooter() {
    }

    public boolean hasHeader() {
    }

    public boolean isExperimental() {
    }

    public boolean isUnsynchronisation() {
    }

    public boolean loadHeader(InputStream inputStream) {
    }

    public void print() {
    }

    public ID3Format(File file) {
    }

    public boolean loadHeader(File file) {
    }
}
