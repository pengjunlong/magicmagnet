package com.tencent.tinker.loader.shareutil;

import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.anno.Keep;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.text.SimpleDateFormat;
import java.util.List;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class TinkerLogInlineFence extends Handler {
    private static final String TAG = "Tinker.TinkerLogInlineFence";
    private static final Handler mainThreadHandler = null;
    private static final List<Object[]> pendingLogs = null;

    /* renamed from: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence$1 */
    static class RunnableC16581 implements Runnable {
        final /* synthetic */ ShareTinkerLog.TinkerLogImp val$logImp;

        /* renamed from: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence$1$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ RunnableC16581 this$0;
            final /* synthetic */ Object[] val$argsRef;
            final /* synthetic */ SimpleDateFormat val$timestampFmt;

            AnonymousClass1(RunnableC16581 runnableC16581, SimpleDateFormat simpleDateFormat, Object[] objArr) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        RunnableC16581(ShareTinkerLog.TinkerLogImp tinkerLogImp) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    TinkerLogInlineFence() {
    }

    static /* synthetic */ List access$000() {
    }

    static /* synthetic */ Handler access$100() {
    }

    private static void dummyThrowExceptionMethod() {
    }

    private void handleMessageImpl(Message message) {
    }

    private void handleMessage_$noinline$(Message message) {
    }

    private static void printPendingLogs(ShareTinkerLog.TinkerLogImp tinkerLogImp) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }
}
