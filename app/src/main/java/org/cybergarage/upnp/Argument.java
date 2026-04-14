package org.cybergarage.upnp;

import org.cybergarage.upnp.xml.ArgumentData;
import org.cybergarage.xml.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Argument {
    private static final String DIRECTION = "direction";
    public static final String ELEM_NAME = "argument";
    public static final String IN = "in";
    private static final String NAME = "name";
    public static final String OUT = "out";
    private static final String RELATED_STATE_VARIABLE = "relatedStateVariable";
    private Node argumentNode;
    private Node serviceNode;
    private Object userData;

    public Argument() {
    }

    private ArgumentData getArgumentData() {
    }

    private Node getServiceNode() {
    }

    public static boolean isArgumentNode(Node node) {
    }

    public Action getAction() {
    }

    public Node getActionNode() {
    }

    public Node getArgumentNode() {
    }

    public String getDirection() {
    }

    public int getIntegerValue() {
    }

    public String getName() {
    }

    public StateVariable getRelatedStateVariable() {
    }

    public String getRelatedStateVariableName() {
    }

    public Service getService() {
    }

    public Object getUserData() {
    }

    public String getValue() {
    }

    public boolean isInDirection() {
    }

    public boolean isOutDirection() {
    }

    public void setDirection(String str) {
    }

    public void setName(String str) {
    }

    public void setRelatedStateVariableName(String str) {
    }

    void setService(Service service) {
    }

    public void setUserData(Object obj) {
    }

    public void setValue(String str) {
    }

    public void setValue(int i) {
    }

    public Argument(Node node) {
    }

    public Argument(Node node, Node node2) {
    }

    public Argument(String str, String str2) {
    }
}
