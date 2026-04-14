package cn.bingoogolapple.bgabanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BGAViewPager extends ViewPager {
    private boolean mAllowUserScrollable;
    private dbpqdHhmDSIHIJiwc1ll1l1 mAutoPlayDelegate;

    public interface dbpqdHhmDSIHIJiwc1ll1l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1(float f);
    }

    public BGAViewPager(Context context) {
    }

    private float getXVelocity() {
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setAllowUserScrollable(boolean z) {
    }

    public void setAutoPlayDelegate(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setBannerCurrentItemInternal(int i, boolean z) {
    }

    public void setPageChangeDuration(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setPageTransformer(boolean z, ViewPager.pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    public BGAViewPager(Context context, AttributeSet attributeSet) {
    }
}
