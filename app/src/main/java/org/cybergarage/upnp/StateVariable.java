package org.cybergarage.upnp;

import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.control.QueryRequest;
import org.cybergarage.upnp.control.QueryResponse;
import org.cybergarage.upnp.xml.NodeData;
import org.cybergarage.upnp.xml.StateVariableData;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class StateVariable extends NodeData {
    private static final String DATATYPE = "dataType";
    private static final String DEFAULT_VALUE = "defaultValue";
    public static final String ELEM_NAME = "stateVariable";
    private static final String NAME = "name";
    private static final String SENDEVENTS = "sendEvents";
    private static final String SENDEVENTS_NO = "no";
    private static final String SENDEVENTS_YES = "yes";
    private Node serviceNode;
    private Node stateVariableNode;
    private UPnPStatus upnpStatus;
    private Object userData;

    public StateVariable() {
    }

    public static boolean isStateVariableNode(Node node) {
    }

    private void setQueryResponse(QueryResponse queryResponse) {
    }

    public AllowedValueList getAllowedValueList() {
    }

    public AllowedValueRange getAllowedValueRange() {
    }

    public String getDataType() {
    }

    public String getDefaultValue() {
    }

    public String getName() {
    }

    public QueryListener getQueryListener() {
    }

    public QueryResponse getQueryResponse() {
    }

    public UPnPStatus getQueryStatus() {
    }

    public Service getService() {
    }

    public Node getServiceNode() {
    }

    public StateVariableData getStateVariableData() {
    }

    public Node getStateVariableNode() {
    }

    public UPnPStatus getStatus() {
    }

    public Object getUserData() {
    }

    public String getValue() {
    }

    public boolean hasAllowedValueList() {
    }

    public boolean hasAllowedValueRange() {
    }

    public boolean isSendEvents() {
    }

    public boolean performQueryListener(QueryRequest queryRequest) {
    }

    public boolean postQuerylAction() {
    }

    public void set(StateVariable stateVariable) {
    }

    public void setAllowedValueList(AllowedValueList allowedValueList) {
    }

    public void setAllowedValueRange(AllowedValueRange allowedValueRange) {
    }

    public void setDataType(String str) {
    }

    public void setDefaultValue(String str) {
    }

    public void setName(String str) {
    }

    public void setQueryListener(QueryListener queryListener) {
    }

    public void setSendEvents(boolean z) {
    }

    void setServiceNode(Node node) {
    }

    public void setStatus(int i, String str) {
    }

    public void setUserData(Object obj) {
    }

    public void setValue(String str) {
    }

    public void setStatus(int i) {
    }

    public StateVariable(Node node, Node node2) {
    }

    public void setValue(int i) {
    }

    public void setValue(long j) {
    }
}
