package com.xunlei.downloadlib;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xunlei.downloadlib.parameter.BtIndexSet;
import com.xunlei.downloadlib.parameter.BtSubTaskDetail;
import com.xunlei.downloadlib.parameter.BtTaskParam;
import com.xunlei.downloadlib.parameter.BtTaskStatus;
import com.xunlei.downloadlib.parameter.CIDTaskParam;
import com.xunlei.downloadlib.parameter.EmuleTaskParam;
import com.xunlei.downloadlib.parameter.GetDownloadHead;
import com.xunlei.downloadlib.parameter.GetDownloadLibVersion;
import com.xunlei.downloadlib.parameter.GetFileName;
import com.xunlei.downloadlib.parameter.GetTaskId;
import com.xunlei.downloadlib.parameter.InitParam;
import com.xunlei.downloadlib.parameter.MagnetTaskParam;
import com.xunlei.downloadlib.parameter.MaxDownloadSpeedParam;
import com.xunlei.downloadlib.parameter.P2spTaskOriginResStat;
import com.xunlei.downloadlib.parameter.P2spTaskParam;
import com.xunlei.downloadlib.parameter.PeerResourceParam;
import com.xunlei.downloadlib.parameter.ScdnResourceParam;
import com.xunlei.downloadlib.parameter.ServerResourceParam;
import com.xunlei.downloadlib.parameter.TorrentInfo;
import com.xunlei.downloadlib.parameter.UrlQuickInfo;
import com.xunlei.downloadlib.parameter.XLConstant;
import com.xunlei.downloadlib.parameter.XLProductInfo;
import com.xunlei.downloadlib.parameter.XLTaskInfo;
import com.xunlei.downloadlib.parameter.XLTaskInfoEx;
import com.xunlei.downloadlib.parameter.XLTaskLocalUrl;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XLDownloadManager {
    private static final int GET_GUID_FIRST_TIME = 5000;
    private static final int GET_GUID_INTERVAL_TIME = 60000;
    private static final int QUERY_GUID_COUNT = 5;
    private static final String TAG = "XLDownloadManager";
    private static boolean mAllowExecution;
    public static XLConstant.XLManagerStatus mDownloadManagerState;
    private static Map<String, Object> mErrcodeStringMap;
    private static XLDownloadManager mInstance;
    private static boolean mIsLoadErrcodeMsg;
    private static int mRunningRefCount;
    private XLAppKeyChecker mAppkeyChecker;
    private Context mContext;
    private Timer mGetGuidTimer;
    private TimerTask mGetGuidTimerTask;
    private XLLoader mLoader;
    private int mQueryGuidCount;
    private NetworkChangeReceiver mReceiver;

    /* renamed from: com.xunlei.downloadlib.XLDownloadManager$1 */
    class C17171 extends TimerTask {
        final /* synthetic */ XLDownloadManager this$0;

        C17171(XLDownloadManager xLDownloadManager) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    private class NetworkChangeHandlerThread implements Runnable {
        private boolean m_allow_execution;
        private Context m_context;
        private XLLoader m_loader;
        final /* synthetic */ XLDownloadManager this$0;

        public NetworkChangeHandlerThread(XLDownloadManager xLDownloadManager, Context context, XLLoader xLLoader, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private class NetworkChangeReceiver extends BroadcastReceiver {
        private static final String TAG = "TAG_DownloadReceiver";
        final /* synthetic */ XLDownloadManager this$0;

        public NetworkChangeReceiver(XLDownloadManager xLDownloadManager) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    private XLDownloadManager() {
    }

    private XLDownloadManager(Context context) {
    }

    private XLDownloadManager(String str) {
    }

    static /* synthetic */ XLLoader access$000(XLDownloadManager xLDownloadManager) {
    }

    static /* synthetic */ boolean access$100() {
    }

    static /* synthetic */ int access$200(XLDownloadManager xLDownloadManager) {
    }

    static /* synthetic */ int access$208(XLDownloadManager xLDownloadManager) {
    }

    static /* synthetic */ Context access$300(XLDownloadManager xLDownloadManager) {
    }

    static /* synthetic */ void access$400(XLDownloadManager xLDownloadManager) {
    }

    private void decreRefCount() {
    }

    private void doMonitorNetworkChange() {
    }

    private String getGuid() {
    }

    public static XLDownloadManager getInstance() {
    }

    public static XLDownloadManager getInstance(Context context) {
    }

    private static XLDownloadManager getInstance(String str) {
    }

    private String getPeerid() {
    }

    private void increRefCount() {
    }

    private void loadErrcodeString(Context context) {
    }

    private int setLocalProperty(String str, String str2) {
    }

    private void startGetGuidTimer() {
    }

    private void stopGetGuidTimer() {
    }

    private void undoMonitorNetworkChange() {
    }

    public int addPeerResource(long j, PeerResourceParam peerResourceParam) {
    }

    public int addScdnResource(long j, ScdnResourceParam scdnResourceParam) {
    }

    public int addServerResource(long j, ServerResourceParam serverResourceParam) {
    }

    public int btAddPeerResource(long j, int i, PeerResourceParam peerResourceParam) {
    }

    public int btAddServerResource(long j, int i, ServerResourceParam serverResourceParam) {
    }

    public int btRemoveAddedResource(long j, int i, int i2) {
    }

    public int createBtMagnetTask(MagnetTaskParam magnetTaskParam, GetTaskId getTaskId) {
    }

    public int createBtTask(BtTaskParam btTaskParam, GetTaskId getTaskId) {
    }

    public int createCIDTask(CIDTaskParam cIDTaskParam, GetTaskId getTaskId) {
    }

    public int createEmuleTask(EmuleTaskParam emuleTaskParam, GetTaskId getTaskId) {
    }

    public int createP2spTask(P2spTaskParam p2spTaskParam, GetTaskId getTaskId) {
    }

    public int deselectBtSubTask(long j, BtIndexSet btIndexSet) {
    }

    public int enterPrefetchMode(long j) {
    }

    public int enterUltimateSpeed(int i) {
    }

    public int getBtSubTaskInfo(long j, int i, BtSubTaskDetail btSubTaskDetail) {
    }

    public int getBtSubTaskStatus(long j, BtTaskStatus btTaskStatus, int i, int i2) {
    }

    public int getDownloadHeader(long j, GetDownloadHead getDownloadHead) {
    }

    public int getDownloadLibVersion(GetDownloadLibVersion getDownloadLibVersion) {
    }

    public String getErrorCodeMsg(int i) {
    }

    public int getFileNameFromUrl(String str, GetFileName getFileName) {
    }

    public int getLocalUrl(String str, XLTaskLocalUrl xLTaskLocalUrl) {
    }

    public XLConstant.XLManagerStatus getManagerStatus() {
    }

    public int getMaxDownloadSpeed(MaxDownloadSpeedParam maxDownloadSpeedParam) {
    }

    public int getNameFromUrl(String str, String str2) {
    }

    public int getP2spTaskOriginResStat(long j, P2spTaskOriginResStat p2spTaskOriginResStat) {
    }

    public int getProductInfo(XLProductInfo xLProductInfo) {
    }

    public String getScdnUnixPath() {
    }

    public String getScdnVersion() {
    }

    public boolean getSdkEnabled() {
    }

    public int getTaskInfo(long j, int i, XLTaskInfo xLTaskInfo) {
    }

    public int getTaskInfoEx(long j, XLTaskInfoEx xLTaskInfoEx) {
    }

    public int getTorrentInfo(String str, TorrentInfo torrentInfo) {
    }

    public int getUrlQuickInfo(long j, UrlQuickInfo urlQuickInfo) {
    }

    public int init(Context context, InitParam initParam) {
    }

    public int init(Context context, InitParam initParam, boolean z) {
    }

    public int initScdn(String str) {
    }

    public boolean isLogTurnOn() {
    }

    int notifyNetWorkCarrier(int i) {
    }

    int notifyNetWorkType(int i, XLLoader xLLoader) {
    }

    int notifyWifiBSSID(String str, XLLoader xLLoader) {
    }

    public String parserThunderUrl(String str) {
    }

    public int releaseScdn() {
    }

    public int releaseTask(long j) {
    }

    public int removeServerResource(long j, int i) {
    }

    int requeryTaskIndex(long j) {
    }

    public int selectBtSubTask(long j, BtIndexSet btIndexSet) {
    }

    public int setBtPriorSubTask(long j, int i) {
    }

    public int setDownloadTaskOrigin(long j, String str) {
    }

    public int setFileName(long j, String str) {
    }

    public int setHttpHeaderProperty(long j, String str, String str2) {
    }

    int setImei(String str) {
    }

    int setMac(String str) {
    }

    public int setNetworkEnable() {
    }

    public int setOSVersion(String str) {
    }

    public int setOriginUserAgent(long j, String str) {
    }

    public int setReleaseLog(boolean z, String str) {
    }

    public int setReleaseLog(boolean z, String str, int i, int i2) {
    }

    public int setScdnLogEnable(int i) {
    }

    public int setScdnStableVersion(String str) {
    }

    public int setSpeedLimit(long j, long j2) {
    }

    public int setStatReportSwitch(boolean z) {
    }

    public int setTaskAllowUseResource(long j, int i) {
    }

    int setTaskAppInfo(long j, String str, String str2, String str3) {
    }

    public int setTaskGsState(long j, int i, int i2) {
    }

    public int setTaskLxState(long j, int i, int i2) {
    }

    public int setTaskUidWithPid(long j, int i, int i2) {
    }

    public int setUserId(String str) {
    }

    public int startTask(long j) {
    }

    public int statExternalInfo(long j, int i, String str, int i2) {
    }

    public int statExternalInfo(long j, int i, String str, String str2) {
    }

    public int stopScdnTask(String str) {
    }

    public int stopTask(long j) {
    }

    public int stopTaskWithReason(long j, int i) {
    }

    int switchOriginToAllResDownload(long j) {
    }

    public int uninit() {
    }
}
