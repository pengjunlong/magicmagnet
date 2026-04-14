package org.cybergarage.upnp.event;

import org.cybergarage.http.HTTPRequest;
import org.cybergarage.upnp.Service;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SubscriptionRequest extends HTTPRequest {
    private static final String CALLBACK_END_WITH = ">";
    private static final String CALLBACK_START_WITH = "<";

    public SubscriptionRequest() {
    }

    private void setService(Service service) {
    }

    public String getCallback() {
    }

    public String getNT() {
    }

    public String getSID() {
    }

    public long getTimeout() {
    }

    public boolean hasCallback() {
    }

    public boolean hasNT() {
    }

    public boolean hasSID() {
    }

    public void post(SubscriptionResponse subscriptionResponse) {
    }

    public void setCallback(String str) {
    }

    public void setNT(String str) {
    }

    public void setRenewRequest(Service service, String str, long j) {
    }

    public void setSID(String str) {
    }

    public void setSubscribeRequest(Service service, String str, long j) {
    }

    public final void setTimeout(long j) {
    }

    public void setUnsubscribeRequest(Service service) {
    }

    public SubscriptionResponse post() {
    }

    public SubscriptionRequest(HTTPRequest hTTPRequest) {
    }
}
