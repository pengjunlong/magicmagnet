package org.cybergarage.upnp;

import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.ActionRequest;
import org.cybergarage.upnp.control.ControlResponse;
import org.cybergarage.upnp.xml.ActionData;
import org.cybergarage.util.Mutex;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Action {
    public static final String ELEM_NAME = "action";
    private static final String NAME = "name";
    private Node actionNode;
    private Mutex mutex;
    private Node serviceNode;
    private UPnPStatus upnpStatus;
    private Object userData;

    public Action(Node node) {
    }

    private void clearOutputAgumentValues() {
    }

    private ActionData getActionData() {
    }

    private ControlResponse getControlResponse() {
    }

    private Node getServiceNode() {
    }

    public static boolean isActionNode(Node node) {
    }

    private void setControlResponse(ControlResponse controlResponse) {
    }

    public ActionListener getActionListener() {
    }

    public Node getActionNode() {
    }

    public Argument getArgument(String str) {
    }

    public int getArgumentIntegerValue(String str) {
    }

    public ArgumentList getArgumentList() {
    }

    public String getArgumentValue(String str) {
    }

    public UPnPStatus getControlStatus() {
    }

    public ArgumentList getInputArgumentList() {
    }

    public String getName() {
    }

    public ArgumentList getOutputArgumentList() {
    }

    public Service getService() {
    }

    public UPnPStatus getStatus() {
    }

    public Object getUserData() {
    }

    public void lock() {
    }

    public boolean performActionListener(ActionRequest actionRequest) {
    }

    public boolean postControlAction() {
    }

    public void print() {
    }

    public void setActionListener(ActionListener actionListener) {
    }

    public void setArgumentList(ArgumentList argumentList) {
    }

    public void setArgumentValue(String str, String str2) {
    }

    public void setArgumentValues(ArgumentList argumentList) {
    }

    public void setInArgumentValues(ArgumentList argumentList) {
    }

    public void setName(String str) {
    }

    public void setOutArgumentValues(ArgumentList argumentList) {
    }

    void setService(Service service) {
    }

    public void setStatus(int i, String str) {
    }

    public void setUserData(Object obj) {
    }

    public void unlock() {
    }

    public void setArgumentValue(String str, int i) {
    }

    public void setStatus(int i) {
    }

    public Action(Node node, Node node2) {
    }

    public Action(Action action) {
    }
}
