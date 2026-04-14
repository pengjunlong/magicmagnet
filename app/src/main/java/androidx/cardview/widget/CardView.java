package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = null;
    private static final bpdqqiQNVROMLC1ll1l1l11 IMPL = null;
    private final dpbdpqRKAscW1lll1l mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements dpbdpqRKAscW1lll1l {
        private Drawable dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CardView dpbdbdpbLwkLpObyKsq1lll1;

        dbpqdHhmDSIHIJiwc1ll1l1(CardView cardView) {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public boolean bpdqqiQNVROMLC1ll1l1l11() {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public void dbpqdHhmDSIHIJiwc1ll1l1(Drawable drawable) {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public void dpbdpqRKAscW1lll1l(int i, int i2) {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public Drawable dqqppqiKzJi1l1lll1l() {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public View ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        @Override // androidx.cardview.widget.dpbdpqRKAscW1lll1l
        public void setShadowPadding(int i, int i2, int i3, int i4) {
        }
    }

    public CardView(Context context) {
    }

    static /* synthetic */ void access$001(CardView cardView, int i, int i2, int i3, int i4) {
    }

    static /* synthetic */ void access$101(CardView cardView, int i) {
    }

    static /* synthetic */ void access$201(CardView cardView, int i) {
    }

    public ColorStateList getCardBackgroundColor() {
    }

    public float getCardElevation() {
    }

    public int getContentPaddingBottom() {
    }

    public int getContentPaddingLeft() {
    }

    public int getContentPaddingRight() {
    }

    public int getContentPaddingTop() {
    }

    public float getMaxCardElevation() {
    }

    public boolean getPreventCornerOverlap() {
    }

    public float getRadius() {
    }

    public boolean getUseCompatPadding() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void setCardBackgroundColor(int i) {
    }

    public void setCardElevation(float f) {
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
    }

    public void setMaxCardElevation(float f) {
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
    }

    public void setRadius(float f) {
    }

    public void setUseCompatPadding(boolean z) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
    }
}
