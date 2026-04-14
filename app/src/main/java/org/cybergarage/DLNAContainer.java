package org.cybergarage;

import java.util.List;
import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.upnp.Device;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DLNAContainer {
    private static final String TAG = "DLNAContainer";
    private static final DLNAContainer mDLNAContainer = null;
    private ControlPoint controlPoint;
    private DeviceChangeListener mDeviceChangeListener;
    private List<Device> mDevices;
    private Device mSelectedDevice;

    public interface DeviceChangeListener {
        void onDeviceChange(Device device);
    }

    private DLNAContainer() {
    }

    public static DLNAContainer getInstance() {
    }

    public synchronized void addDevice(Device device) {
    }

    public synchronized void clear() {
    }

    public synchronized void clearSelectedDevice() {
    }

    public ControlPoint getControlPoint() {
    }

    public List<Device> getDevices() {
    }

    public Device getSelectedDevice() {
    }

    public synchronized void removeDevice(Device device) {
    }

    public void setControlPoint(ControlPoint controlPoint) {
    }

    public void setDeviceChangeListener(DeviceChangeListener deviceChangeListener) {
    }

    public void setSelectedDevice(Device device) {
    }
}
