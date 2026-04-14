package org.cybergarage;

import org.cybergarage.upnp.Device;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MultiPointController implements IController {
    private static final String AVTransport1 = "urn:schemas-upnp-org:service:AVTransport:1";
    private static final String Play = "Play";
    private static final String RenderingControl = "urn:schemas-upnp-org:service:RenderingControl:1";
    private static final String SetAVTransportURI = "SetAVTransportURI";

    @Override // org.cybergarage.IController
    public String getCurrentPosition(Device device) {
    }

    @Override // org.cybergarage.IController
    public int getMaxVolumeValue(Device device) {
    }

    @Override // org.cybergarage.IController
    public String getMediaDuration(Device device) {
    }

    @Override // org.cybergarage.IController
    public int getMinVolumeValue(Device device) {
    }

    @Override // org.cybergarage.IController
    public String getTransportState(Device device) {
    }

    @Override // org.cybergarage.IController
    public int getVoice(Device device) {
    }

    public String getVolumeDbRange(Device device, String str) {
    }

    @Override // org.cybergarage.IController
    public boolean isMute(Device device) {
    }

    @Override // org.cybergarage.IController
    public boolean pause(Device device) {
    }

    @Override // org.cybergarage.IController
    public boolean play(Device device, String str) {
    }

    @Override // org.cybergarage.IController
    public boolean resume(Device device, String str) {
    }

    @Override // org.cybergarage.IController
    public boolean seek(Device device, String str) {
    }

    @Override // org.cybergarage.IController
    public boolean setMute(Device device, boolean z) {
    }

    @Override // org.cybergarage.IController
    public boolean setVoice(Device device, int i) {
    }

    @Override // org.cybergarage.IController
    public boolean stop(Device device) {
    }
}
