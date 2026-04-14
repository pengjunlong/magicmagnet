package org.adblockplus.libadblockplus.android;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;
import org.adblockplus.libadblockplus.HttpClient;
import org.adblockplus.libadblockplus.HttpRequest;
import org.adblockplus.libadblockplus.ServerResponse;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AndroidHttpClientResourceWrapper extends HttpClient {
    public static final String ACCEPTABLE_ADS = "https://easylist-downloads.adblockplus.org/exceptionrules.txt";
    public static final String EASYLIST = "https://easylist-downloads.adblockplus.org/easylist.txt";
    public static final String EASYLIST_ARABIAN_FRENCH = "https://easylist-downloads.adblockplus.org/liste_ar+liste_fr+easylist.txt";
    public static final String EASYLIST_BULGARIAN = "https://easylist-downloads.adblockplus.org/bulgarian_list+easylist.txt";
    public static final String EASYLIST_CHINESE = "https://easylist-downloads.adblockplus.org/easylistchina+easylist.txt";
    public static final String EASYLIST_CZECH_SLOVAK = "https://easylist-downloads.adblockplus.org/easylistczechslovak+easylist.txt";
    public static final String EASYLIST_DUTCH = "https://easylist-downloads.adblockplus.org/easylistdutch+easylist.txt";
    public static final String EASYLIST_FRENCH = "https://easylist-downloads.adblockplus.org/liste_fr+easylist.txt";
    public static final String EASYLIST_GERMAN = "https://easylist-downloads.adblockplus.org/easylistgermany+easylist.txt";
    public static final String EASYLIST_INDONESIAN = "https://easylist-downloads.adblockplus.org/abpindo+easylist.txt";
    public static final String EASYLIST_ISRAELI = "https://easylist-downloads.adblockplus.org/israellist+easylist.txt";
    public static final String EASYLIST_ITALIAN = "https://easylist-downloads.adblockplus.org/easylistitaly+easylist.txt";
    public static final String EASYLIST_LATVIAN = "https://easylist-downloads.adblockplus.org/latvianlist+easylist.txt";
    public static final String EASYLIST_LITHUANIAN = "https://easylist-downloads.adblockplus.org/easylistlithuania+easylist.txt";
    public static final String EASYLIST_POLISH = "https://easylist-downloads.adblockplus.org/easylistpolish+easylist.txt";
    public static final String EASYLIST_ROMANIAN = "https://easylist-downloads.adblockplus.org/rolist+easylist.txt";
    public static final String EASYLIST_RUSSIAN = "https://easylist-downloads.adblockplus.org/ruadlist+easylist.txt";
    private Context context;
    private HttpClient httpClient;
    private Listener listener;
    private Storage storage;
    private Map<String, Integer> urlToResourceIdMap;

    public interface Listener {
        void onIntercepted(String str, int i);
    }

    public static class SharedPrefsStorage implements Storage {
        private static final String URLS = "urls";
        private SharedPreferences prefs;
        private Set<String> urls;

        public SharedPrefsStorage(SharedPreferences sharedPreferences) {
        }

        @Override // org.adblockplus.libadblockplus.android.AndroidHttpClientResourceWrapper.Storage
        public synchronized boolean contains(String str) {
        }

        @Override // org.adblockplus.libadblockplus.android.AndroidHttpClientResourceWrapper.Storage
        public synchronized void put(String str) {
        }
    }

    public interface Storage {
        boolean contains(String str);

        void put(String str);
    }

    public AndroidHttpClientResourceWrapper(Context context, HttpClient httpClient, Map<String, Integer> map, Storage storage) {
    }

    protected ServerResponse buildResourceContentResponse(int i) {
    }

    public Listener getListener() {
    }

    protected ByteBuffer readResourceContent(int i) throws IOException {
    }

    @Override // org.adblockplus.libadblockplus.HttpClient
    public void request(HttpRequest httpRequest, HttpClient.Callback callback) {
    }

    public void setListener(Listener listener) {
    }
}
