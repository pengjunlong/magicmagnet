package org.cybergarage.upnp.std.av.server;

import java.io.File;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.StateVariable;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.std.av.server.action.BrowseAction;
import org.cybergarage.upnp.std.av.server.action.SearchAction;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.ContentNodeList;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatList;
import org.cybergarage.upnp.std.av.server.object.SearchCap;
import org.cybergarage.upnp.std.av.server.object.SearchCapList;
import org.cybergarage.upnp.std.av.server.object.SearchCriteriaList;
import org.cybergarage.upnp.std.av.server.object.SortCap;
import org.cybergarage.upnp.std.av.server.object.SortCapList;
import org.cybergarage.upnp.std.av.server.object.SortCriterionList;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.cybergarage.upnp.std.av.server.object.container.RootNode;
import org.cybergarage.util.Mutex;
import org.cybergarage.util.ThreadCore;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ContentDirectory extends ThreadCore implements ActionListener, QueryListener {
    public static final String BROWSE = "Browse";
    public static final String BROWSEDIRECTCHILDREN = "BrowseDirectChildren";
    public static final String BROWSEFLAG = "BrowseFlag";
    public static final String BROWSEMETADATA = "BrowseMetadata";
    public static final String COMPLETED = "COMPLETED";
    public static final String CONTAINERID = "ContainerID";
    public static final String CONTAINERUPDATEIDS = "ContainerUpdateIDs";
    public static final String CONTENT_EXPORT_URI = "/ExportContent";
    public static final String CONTENT_ID = "id";
    public static final String CONTENT_IMPORT_URI = "/ImportContent";
    public static final String CREATEOBJECT = "CreateObject";
    public static final String CREATEREFERENCE = "CreateReference";
    public static final String CURRENTTAGVALUE = "CurrentTagValue";
    private static final int DEFAULT_CONTENTUPDATE_INTERVAL = 60000;
    private static final int DEFAULT_SYSTEMUPDATEID_INTERVAL = 2000;
    public static final String DELETERESOURCE = "DeleteResource";
    public static final String DESTINATIONURI = "DestinationURI";
    public static final String DESTROYOBJECT = "DestroyObject";
    public static final String ELEMENTS = "Elements";
    public static final String ERROR = "ERROR";
    public static final String EXPORTRESOURCE = "ExportResource";
    public static final String FILTER = "Filter";
    public static final String GETSEARCHCAPABILITIES = "GetSearchCapabilities";
    public static final String GETSORTCAPABILITIES = "GetSortCapabilities";
    public static final String GETSYSTEMUPDATEID = "GetSystemUpdateID";
    public static final String GETTRANSFERPROGRESS = "GetTransferProgress";
    public static final String ID = "Id";
    public static final String IMPORTRESOURCE = "ImportResource";
    public static final String IN_PROGRESS = "IN_PROGRESS";
    public static final String NEWID = "NewID";
    public static final String NEWTAGVALUE = "NewTagValue";
    public static final String NUMBERRETURNED = "NumberReturned";
    public static final String OBJECTID = "ObjectID";
    public static final String REQUESTEDCOUNT = "RequestedCount";
    public static final String RESOURCEURI = "ResourceURI";
    public static final String RESULT = "Result";
    public static final String SCPD = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n   </specVersion>\n   <actionList>\n      <action>\n         <name>ExportResource</name>\n         <argumentList>\n            <argument>\n               <name>SourceURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>DestinationURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>StopTransferResource</name>\n         <argumentList>\n            <argument>\n               <name>TransferID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>DestroyObject</name>\n         <argumentList>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>DeleteResource</name>\n         <argumentList>\n            <argument>\n               <name>ResourceURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>UpdateObject</name>\n         <argumentList>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>CurrentTagValue</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TagValueList</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NewTagValue</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TagValueList</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>Browse</name>\n         <argumentList>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>BrowseFlag</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_BrowseFlag</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Filter</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Filter</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>StartingIndex</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Index</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>RequestedCount</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>SortCriteria</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_SortCriteria</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Result</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NumberReturned</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TotalMatches</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>UpdateID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_UpdateID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetTransferProgress</name>\n         <argumentList>\n            <argument>\n               <name>TransferID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferStatus</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferStatus</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferLength</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferLength</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferTotal</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferTotal</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetSearchCapabilities</name>\n         <argumentList>\n            <argument>\n               <name>SearchCaps</name>\n               <direction>out</direction>\n               <relatedStateVariable>SearchCapabilities</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>CreateObject</name>\n         <argumentList>\n            <argument>\n               <name>ContainerID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Elements</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>ObjectID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Result</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>Search</name>\n         <argumentList>\n            <argument>\n               <name>ContainerID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>SearchCriteria</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_SearchCriteria</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Filter</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Filter</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>StartingIndex</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Index</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>RequestedCount</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>SortCriteria</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_SortCriteria</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>Result</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Result</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NumberReturned</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TotalMatches</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_Count</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>UpdateID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_UpdateID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetSortCapabilities</name>\n         <argumentList>\n            <argument>\n               <name>SortCaps</name>\n               <direction>out</direction>\n               <relatedStateVariable>SortCapabilities</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>ImportResource</name>\n         <argumentList>\n            <argument>\n               <name>SourceURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>DestinationURI</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_URI</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>TransferID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_TransferID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>CreateReference</name>\n         <argumentList>\n            <argument>\n               <name>ContainerID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>ObjectID</name>\n               <direction>in</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n            <argument>\n               <name>NewID</name>\n               <direction>out</direction>\n               <relatedStateVariable>A_ARG_TYPE_ObjectID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n      <action>\n         <name>GetSystemUpdateID</name>\n         <argumentList>\n            <argument>\n              <name>Id</name>\n               <direction>out</direction>\n               <relatedStateVariable>SystemUpdateID</relatedStateVariable>\n            </argument>\n         </argumentList>\n      </action>\n   </actionList>\n   <serviceStateTable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_SortCriteria</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferLength</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>TransferIDs</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_UpdateID</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_SearchCriteria</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Filter</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>ContainerUpdateIDs</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Result</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Index</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferID</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TagValueList</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_URI</name>\n         <dataType>uri</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_ObjectID</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>SortCapabilities</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>SearchCapabilities</name>\n         <dataType>string</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_Count</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_BrowseFlag</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>BrowseMetadata</allowedValue>\n            <allowedValue>BrowseDirectChildren</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"yes\">\n         <name>SystemUpdateID</name>\n         <dataType>ui4</dataType>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferStatus</name>\n         <dataType>string</dataType>\n         <allowedValueList>\n            <allowedValue>COMPLETED</allowedValue>\n            <allowedValue>ERROR</allowedValue>\n            <allowedValue>IN_PROGRESS</allowedValue>\n            <allowedValue>STOPPED</allowedValue>\n         </allowedValueList>\n      </stateVariable>\n      <stateVariable sendEvents=\"no\">\n         <name>A_ARG_TYPE_TransferTotal</name>\n         <dataType>string</dataType>\n      </stateVariable>\n   </serviceStateTable>\n</scpd>";
    public static final String SEARCH = "Search";
    public static final String SEARCHCAPABILITIES = "SearchCapabilities";
    public static final String SEARCHCAPS = "SearchCaps";
    public static final String SEARCHCRITERIA = "SearchCriteria";
    public static final String SERVICE_TYPE = "urn:schemas-upnp-org:service:ContentDirectory:1";
    public static final String SORTCAPABILITIES = "SortCapabilities";
    public static final String SORTCAPS = "SortCaps";
    public static final String SORTCRITERIA = "SortCriteria";
    public static final String SOURCEURI = "SourceURI";
    public static final String STARTINGINDEX = "StartingIndex";
    public static final String STOPPED = "STOPPED";
    public static final String STOPTRANSFERRESOURCE = "StopTransferResource";
    public static final String SYSTEMUPDATEID = "SystemUpdateID";
    public static final String TOTALMATCHES = "TotalMatches";
    public static final String TRANSFERID = "TransferID";
    public static final String TRANSFERIDS = "TransferIDs";
    public static final String TRANSFERLENGTH = "TransferLength";
    public static final String TRANSFERSTATUS = "TransferStatus";
    public static final String TRANSFERTOTAL = "TransferTotal";
    public static final String UPDATEID = "UpdateID";
    public static final String UPDATEOBJECT = "UpdateObject";
    private long contentUpdateInterval;
    private DirectoryList dirList;
    private FormatList formatList;
    private int maxContentID;
    private MediaServer mediaServer;
    private Mutex mutex;
    private RootNode rootNode;
    private SearchCapList searchCapList;
    private SortCapList sortCapList;
    private int systemUpdateID;
    private long systemUpdateIDInterval;

    public ContentDirectory(MediaServer mediaServer) {
    }

    private boolean browseActionReceived(BrowseAction browseAction) {
    }

    private boolean browseDirectChildrenActionReceived(BrowseAction browseAction) {
    }

    private boolean browseMetadataActionReceived(BrowseAction browseAction) {
    }

    private ContainerNode createContainerNode() {
    }

    private DirectoryList getDirectoryList() {
    }

    private synchronized int getNextContentID() {
    }

    private String getSearchCapabilities() {
    }

    private int getSearchContentList(ContainerNode containerNode, SearchCriteriaList searchCriteriaList, SearchCapList searchCapList, ContentNodeList contentNodeList) {
    }

    private SearchCriteriaList getSearchCriteriaList(String str) {
    }

    private String getSortCapabilities() {
    }

    private SortCriterionList getSortCriteriaArray(String str) {
    }

    private void initRootNode() {
    }

    private void initSearchCaps() {
    }

    private void initSortCaps() {
    }

    private boolean searchActionReceived(SearchAction searchAction) {
    }

    private void setMediaServer(MediaServer mediaServer) {
    }

    private void sortContentNodeList(ContentNode[] contentNodeArr, SortCap sortCap, boolean z) {
    }

    @Override // org.cybergarage.upnp.control.ActionListener
    public boolean actionControlReceived(Action action) {
    }

    public boolean addDirectory(Directory directory) {
    }

    public boolean addPlugIn(Format format) {
    }

    public boolean addSearchCap(SearchCap searchCap) {
    }

    public boolean addSortCap(SortCap sortCap) {
    }

    public void contentExportRequestRecieved(HTTPRequest hTTPRequest) {
    }

    public ContentNode findContentNodeByID(String str) {
    }

    public String getContentExportURL(String str) {
    }

    public String getContentImportURL(String str) {
    }

    public long getContentUpdateInterval() {
    }

    public Directory getDirectory(int i) {
    }

    public Format getFormat(File file) {
    }

    public int getHTTPPort() {
    }

    public String getInterfaceAddress() {
    }

    public MediaServer getMediaServer() {
    }

    public int getNDirectories() {
    }

    public int getNFormats() {
    }

    public int getNSearchCaps() {
    }

    public int getNSortCaps() {
    }

    public int getNextContainerID() {
    }

    public int getNextItemID() {
    }

    public RootNode getRootNode() {
    }

    public SearchCap getSearchCap(int i) {
    }

    public SearchCapList getSearchCapList() {
    }

    public SortCap getSortCap(int i) {
    }

    public synchronized int getSystemUpdateID() {
    }

    public long getSystemUpdateIDInterval() {
    }

    public void lock() {
    }

    @Override // org.cybergarage.upnp.control.QueryListener
    public boolean queryControlReceived(StateVariable stateVariable) {
    }

    public boolean removeAllDirectories() {
    }

    public boolean removeDirectory(String str) {
    }

    @Override // org.cybergarage.util.ThreadCore, java.lang.Runnable
    public void run() {
    }

    public void setContentUpdateInterval(long j) {
    }

    public void setSystemUpdateInterval(long j) {
    }

    public void unlock() {
    }

    public synchronized void updateSystemUpdateID() {
    }

    public Format getFormat(int i) {
    }

    public SearchCap getSearchCap(String str) {
    }

    public SortCap getSortCap(String str) {
    }

    private ContentNodeList sortContentNodeList(ContentNodeList contentNodeList, String str) {
    }
}
