package org.apache.xerces.dom.events;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventTarget;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class EventImpl implements Event {
    public boolean bubbles;
    public boolean cancelable;
    public EventTarget currentTarget;
    public short eventPhase;
    public boolean initialized;
    public boolean preventDefault;
    public boolean stopPropagation;
    public EventTarget target;
    protected long timeStamp;
    public String type;

    public boolean getBubbles() {
    }

    public boolean getCancelable() {
    }

    public EventTarget getCurrentTarget() {
    }

    public short getEventPhase() {
    }

    public EventTarget getTarget() {
    }

    public long getTimeStamp() {
    }

    public String getType() {
    }

    public void initEvent(String str, boolean z, boolean z2) {
    }

    public void preventDefault() {
    }

    public void stopPropagation() {
    }
}
