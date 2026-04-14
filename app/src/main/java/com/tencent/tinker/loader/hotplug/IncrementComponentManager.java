package com.tencent.tinker.loader.hotplug;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class IncrementComponentManager {
    private static final AttrTranslator<ActivityInfo> ACTIVITY_INFO_ATTR_TRANSLATOR = null;
    private static final Map<String, ActivityInfo> CLASS_NAME_TO_ACTIVITY_INFO_MAP = null;
    private static final Map<String, IntentFilter> CLASS_NAME_TO_INTENT_FILTER_MAP = null;
    private static final String TAG = "Tinker.IncrementCompMgr";
    private static final int TAG_ACTIVITY = 0;
    private static final int TAG_PROVIDER = 2;
    private static final int TAG_RECEIVER = 3;
    private static final int TAG_SERVICE = 1;
    private static Context sContext = null;
    private static volatile boolean sInitialized = false;
    private static String sPackageName;

    /* renamed from: com.tencent.tinker.loader.hotplug.IncrementComponentManager$1 */
    static class C16531 extends AttrTranslator<ActivityInfo> {
        C16531() {
        }

        private int parseLaunchMode(String str) {
        }

        private int parseScreenOrientation(String str) {
        }

        @Override // com.tencent.tinker.loader.hotplug.IncrementComponentManager.AttrTranslator
        void onInit(Context context, int i, XmlPullParser xmlPullParser) {
        }

        @Override // com.tencent.tinker.loader.hotplug.IncrementComponentManager.AttrTranslator
        /* bridge */ /* synthetic */ void onTranslate(Context context, int i, String str, String str2, ActivityInfo activityInfo) {
        }

        /* renamed from: onTranslate, reason: avoid collision after fix types in other method */
        void onTranslate2(Context context, int i, String str, String str2, ActivityInfo activityInfo) {
        }
    }

    private static abstract class AttrTranslator<T_RESULT> {
        private AttrTranslator() {
        }

        void onInit(Context context, int i, XmlPullParser xmlPullParser) {
        }

        abstract void onTranslate(Context context, int i, String str, String str2, T_RESULT t_result);

        final void translate(Context context, int i, XmlPullParser xmlPullParser, T_RESULT t_result) {
        }

        /* synthetic */ AttrTranslator(C16531 c16531) {
        }
    }

    private IncrementComponentManager() {
    }

    static /* synthetic */ String access$100() {
    }

    private static synchronized void ensureInitialized() {
    }

    public static synchronized boolean init(Context context, ShareSecurityCheck shareSecurityCheck) throws IOException {
    }

    public static boolean isIncrementActivity(String str) {
    }

    private static synchronized ActivityInfo parseActivity(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    private static synchronized void parseIntentFilter(Context context, String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    private static synchronized void parseMetaData(Context context, ActivityInfo activityInfo, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    public static ActivityInfo queryActivityInfo(String str) {
    }

    public static ResolveInfo resolveIntent(Intent intent) {
    }

    private static void skipCurrentTag(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
    }
}
