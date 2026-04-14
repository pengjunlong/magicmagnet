package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.qdqddftZvRmltIahaEHKjU1l11ll1l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    static final boolean DEBUG = false;
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl mImpl;

    private static class Api21Impl {
        private Api21Impl() {
        }

        static MediaDescription getDescription(MediaBrowser.MediaItem mediaItem) {
        }

        static int getFlags(MediaBrowser.MediaItem mediaItem) {
        }
    }

    private static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        void setCallbacksMessenger(Messenger messenger) {
        }
    }

    public static class ConnectionCallback {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk;
        ConnectionCallbackInternal mConnectionCallbackInternal;

        private class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            final /* synthetic */ ConnectionCallback this$0;

            ConnectionCallbackApi21(ConnectionCallback connectionCallback) {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
            }
        }

        interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
        }
    }

    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final CustomActionCallback mCallback;
        private final Bundle mExtras;

        CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
        }
    }

    public static abstract class ItemCallback {
        final MediaBrowser.ItemCallback mItemCallbackFwk;

        private class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
            final /* synthetic */ ItemCallback this$0;

            ItemCallbackApi23(ItemCallback itemCallback) {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(String str) {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            }
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
        }
    }

    interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        protected final MediaBrowser mBrowserFwk;
        protected Messenger mCallbacksMessenger;
        final Context mContext;
        protected final CallbackHandler mHandler;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        protected final Bundle mRootHints;
        protected ServiceBinderWrapper mServiceBinderWrapper;
        protected int mServiceVersion;
        private final qdqddftZvRmltIahaEHKjU1l11ll1l1<String, Subscription> mSubscriptions;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1 */
        class RunnableC00011 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00011(MediaBrowserImplApi21 mediaBrowserImplApi21, ItemCallback itemCallback, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2 */
        class RunnableC00022 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00022(MediaBrowserImplApi21 mediaBrowserImplApi21, ItemCallback itemCallback, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3 */
        class RunnableC00033 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00033(MediaBrowserImplApi21 mediaBrowserImplApi21, ItemCallback itemCallback, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4 */
        class RunnableC00044 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ SearchCallback val$callback;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$query;

            RunnableC00044(MediaBrowserImplApi21 mediaBrowserImplApi21, SearchCallback searchCallback, String str, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5 */
        class RunnableC00055 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ SearchCallback val$callback;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$query;

            RunnableC00055(MediaBrowserImplApi21 mediaBrowserImplApi21, SearchCallback searchCallback, String str, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6 */
        class RunnableC00066 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ String val$action;
            final /* synthetic */ CustomActionCallback val$callback;
            final /* synthetic */ Bundle val$extras;

            RunnableC00066(MediaBrowserImplApi21 mediaBrowserImplApi21, CustomActionCallback customActionCallback, String str, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7 */
        class RunnableC00077 implements Runnable {
            final /* synthetic */ MediaBrowserImplApi21 this$0;
            final /* synthetic */ String val$action;
            final /* synthetic */ CustomActionCallback val$callback;
            final /* synthetic */ Bundle val$extras;

            RunnableC00077(MediaBrowserImplApi21 mediaBrowserImplApi21, CustomActionCallback customActionCallback, String str, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        }
    }

    static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
        }
    }

    static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        }
    }

    static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        static final int CONNECT_STATE_CONNECTED = 3;
        static final int CONNECT_STATE_CONNECTING = 2;
        static final int CONNECT_STATE_DISCONNECTED = 1;
        static final int CONNECT_STATE_DISCONNECTING = 0;
        static final int CONNECT_STATE_SUSPENDED = 4;
        final ConnectionCallback mCallback;
        Messenger mCallbacksMessenger;
        final Context mContext;
        private Bundle mExtras;
        final CallbackHandler mHandler;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        final Bundle mRootHints;
        private String mRootId;
        ServiceBinderWrapper mServiceBinderWrapper;
        final ComponentName mServiceComponent;
        MediaServiceConnection mServiceConnection;
        int mState;
        private final qdqddftZvRmltIahaEHKjU1l11ll1l1<String, Subscription> mSubscriptions;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1 */
        class RunnableC00081 implements Runnable {
            final /* synthetic */ MediaBrowserImplBase this$0;

            RunnableC00081(MediaBrowserImplBase mediaBrowserImplBase) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2 */
        class RunnableC00092 implements Runnable {
            final /* synthetic */ MediaBrowserImplBase this$0;

            RunnableC00092(MediaBrowserImplBase mediaBrowserImplBase) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3 */
        class RunnableC00103 implements Runnable {
            final /* synthetic */ MediaBrowserImplBase this$0;
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00103(MediaBrowserImplBase mediaBrowserImplBase, ItemCallback itemCallback, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4 */
        class RunnableC00114 implements Runnable {
            final /* synthetic */ MediaBrowserImplBase this$0;
            final /* synthetic */ ItemCallback val$cb;
            final /* synthetic */ String val$mediaId;

            RunnableC00114(MediaBrowserImplBase mediaBrowserImplBase, ItemCallback itemCallback, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5 */
        class RunnableC00125 implements Runnable {
            final /* synthetic */ MediaBrowserImplBase this$0;
            final /* synthetic */ SearchCallback val$callback;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$query;

            RunnableC00125(MediaBrowserImplBase mediaBrowserImplBase, SearchCallback searchCallback, String str, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6 */
        class RunnableC00136 implements Runnable {
            final /* synthetic */ MediaBrowserImplBase this$0;
            final /* synthetic */ String val$action;
            final /* synthetic */ CustomActionCallback val$callback;
            final /* synthetic */ Bundle val$extras;

            RunnableC00136(MediaBrowserImplBase mediaBrowserImplBase, CustomActionCallback customActionCallback, String str, Bundle bundle) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private class MediaServiceConnection implements ServiceConnection {
            final /* synthetic */ MediaBrowserImplBase this$0;

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1 */
            class RunnableC00141 implements Runnable {
                final /* synthetic */ MediaServiceConnection this$1;
                final /* synthetic */ IBinder val$binder;
                final /* synthetic */ ComponentName val$name;

                RunnableC00141(MediaServiceConnection mediaServiceConnection, ComponentName componentName, IBinder iBinder) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2 */
            class RunnableC00152 implements Runnable {
                final /* synthetic */ MediaServiceConnection this$1;
                final /* synthetic */ ComponentName val$name;

                RunnableC00152(MediaServiceConnection mediaServiceConnection, ComponentName componentName) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            MediaServiceConnection(MediaBrowserImplBase mediaBrowserImplBase) {
            }

            private void postOrRun(Runnable runnable) {
            }

            boolean isCurrent(String str) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        }

        private static String getStateLabel(int i) {
        }

        private boolean isCurrent(Messenger messenger, String str) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
        }

        void dump() {
        }

        void forceCloseConnection() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        }
    }

    interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public static abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
        }
    }

    private static class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        }

        void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
        }

        void connect(Context context, Messenger messenger) throws RemoteException {
        }

        void disconnect(Messenger messenger) throws RemoteException {
        }

        void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
        }

        void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {
        }

        void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
        }

        void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
        }

        void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
        }

        void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {
        }
    }

    private static class Subscription {
        private final List<SubscriptionCallback> mCallbacks;
        private final List<Bundle> mOptionsList;

        public SubscriptionCallback getCallback(Bundle bundle) {
        }

        public List<SubscriptionCallback> getCallbacks() {
        }

        public List<Bundle> getOptionsList() {
        }

        public boolean isEmpty() {
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
        }
    }

    public static abstract class SubscriptionCallback {
        final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
        WeakReference<Subscription> mSubscriptionRef;
        final IBinder mToken;

        private class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            final /* synthetic */ SubscriptionCallback this$0;

            SubscriptionCallbackApi21(SubscriptionCallback subscriptionCallback) {
            }

            List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
            }
        }

        private class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            final /* synthetic */ SubscriptionCallback this$0;

            SubscriptionCallbackApi26(SubscriptionCallback subscriptionCallback) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
            }
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str) {
        }

        public void onError(String str, Bundle bundle) {
        }

        void setSubscription(Subscription subscription) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
    }

    public void connect() {
    }

    public void disconnect() {
    }

    public Bundle getExtras() {
    }

    public void getItem(String str, ItemCallback itemCallback) {
    }

    public Bundle getNotifyChildrenChangedOptions() {
    }

    public String getRoot() {
    }

    public ComponentName getServiceComponent() {
    }

    public MediaSessionCompat.Token getSessionToken() {
    }

    public boolean isConnected() {
    }

    public void search(String str, Bundle bundle, SearchCallback searchCallback) {
    }

    public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
    }

    public void subscribe(String str, SubscriptionCallback subscriptionCallback) {
    }

    public void unsubscribe(String str) {
    }

    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
    }

    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = null;
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$1 */
        class C00161 implements Parcelable.Creator<MediaItem> {
            C00161() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MediaItem createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MediaItem[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public static MediaItem fromMediaItem(Object obj) {
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public MediaDescriptionCompat getDescription() {
        }

        public int getFlags() {
        }

        public String getMediaId() {
        }

        public boolean isBrowsable() {
        }

        public boolean isPlayable() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        MediaItem(Parcel parcel) {
        }
    }
}
