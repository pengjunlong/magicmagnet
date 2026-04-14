package org.cybergarage.upnp.device;

import org.cybergarage.upnp.Device;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface DeviceChangeListener {
    void deviceAdded(Device device);

    void deviceRemoved(Device device);
}
