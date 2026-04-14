package com.tencent.bugly.beta.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.bugly.beta.global.ResBean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BaseDialogFrag extends BaseFrag {
    protected ImageView mBannerImageView;
    protected LinearLayout mContentContainer;
    protected Context mContext;
    protected LinearLayout mCustomLayout;
    protected FrameLayout mFrameLayout;
    protected View mLayoutContainer;
    protected int mLayoutResId;
    protected TextView mLeftBtnTextView;
    protected ResBean mRes;
    protected TextView mRightBtnTextView;
    protected int mStyle;
    protected TextView mTitleTextView;

    /* renamed from: com.tencent.bugly.beta.ui.BaseDialogFrag$1 */
    class RunnableC15201 implements Runnable {
        final /* synthetic */ BaseDialogFrag this$0;
        final /* synthetic */ View.OnClickListener val$lListener;
        final /* synthetic */ String val$lText;
        final /* synthetic */ View.OnClickListener val$rListener;
        final /* synthetic */ String val$rText;

        RunnableC15201(BaseDialogFrag baseDialogFrag, String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.bugly.beta.ui.BaseDialogFrag$2 */
    class RunnableC15212 implements Runnable {
        final /* synthetic */ BaseDialogFrag this$0;
        final /* synthetic */ Animation val$exitAnim;

        RunnableC15212(BaseDialogFrag baseDialogFrag, Animation animation) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.bugly.beta.ui.BaseDialogFrag$3 */
    class AnimationAnimationListenerC15223 implements Animation.AnimationListener {
        final /* synthetic */ BaseDialogFrag this$0;

        AnimationAnimationListenerC15223(BaseDialogFrag baseDialogFrag) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    static /* synthetic */ void access$001(BaseDialogFrag baseDialogFrag) {
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag
    public void close() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    protected void setBtn(String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2) {
    }
}
