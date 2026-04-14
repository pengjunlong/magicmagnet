package org.cybergarage;

import org.cybergarage.upnp.Device;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface IController {
    String getCurrentPosition(Device device);

    int getMaxVolumeValue(Device device);

    String getMediaDuration(Device device);

    int getMinVolumeValue(Device device);

    String getTransportState(Device device);

    int getVoice(Device device);

    boolean isMute(Device device);

    boolean pause(Device device);

    boolean play(Device device, String str);

    boolean resume(Device device, String str);

    boolean seek(Device device, String str);

    boolean setMute(Device device, boolean z);

    boolean setVoice(Device device, int i);

    boolean stop(Device device);
}
