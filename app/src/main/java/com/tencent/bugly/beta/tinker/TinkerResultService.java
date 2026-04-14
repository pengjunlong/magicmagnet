package com.tencent.bugly.beta.tinker;

import com.tencent.bugly.beta.tinker.TinkerUtils;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.lib.service.PatchResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerResultService extends DefaultTinkerResultService {
    private static final String TAG = "Tinker.TinkerResultService";

    /* renamed from: com.tencent.bugly.beta.tinker.TinkerResultService$1 */
    class RunnableC15171 implements Runnable {
        final /* synthetic */ TinkerResultService this$0;
        final /* synthetic */ PatchResult val$result;

        RunnableC15171(TinkerResultService tinkerResultService, PatchResult patchResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.bugly.beta.tinker.TinkerResultService$2 */
    class C15182 implements TinkerUtils.ScreenState.IOnScreenOff {
        final /* synthetic */ TinkerResultService this$0;

        C15182(TinkerResultService tinkerResultService) {
        }

        @Override // com.tencent.bugly.beta.tinker.TinkerUtils.ScreenState.IOnScreenOff
        public void onScreenOff() {
        }
    }

    static /* synthetic */ void access$000(TinkerResultService tinkerResultService) {
    }

    private void restartProcess() {
    }

    @Override // com.tencent.tinker.lib.service.DefaultTinkerResultService, com.tencent.tinker.lib.service.AbstractResultService
    public void onPatchResult(PatchResult patchResult) {
    }
}
