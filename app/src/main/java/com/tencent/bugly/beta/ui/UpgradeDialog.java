package com.tencent.bugly.beta.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.proguard.C1581B;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class UpgradeDialog extends BaseDialogFrag {
    public static UpgradeDialog instance;
    public Runnable cancelRunnable;
    View.OnClickListener installTaskListener;
    View.OnClickListener negListener;
    private BetaOnPreDraw onPreDraw;
    View.OnClickListener startTaskListener;
    View.OnClickListener stopTaskListener;
    public C1581B strategyDetail;
    public DownloadTask strategyTask;
    DownloadListener taskListener;
    protected Bitmap titleBitmap;
    public BitmapDrawable titleDrawable;
    protected TextView tvApkInfoTop;
    protected TextView tvUpgradeInfoBottom;
    public UILifecycleListener upgradeDialogListener;
    public Runnable upgradeRunnable;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // com.tencent.bugly.beta.ui.BaseDialogFrag, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // com.tencent.bugly.beta.ui.BaseDialogFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag, androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag, androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
    }

    public synchronized void setUpgradeInfo(C1581B c1581b, DownloadTask downloadTask) {
    }

    public void updateBtn(DownloadTask downloadTask) {
    }

    public synchronized void updateView() {
    }
}
