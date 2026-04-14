package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ActionMenuView extends LinearLayoutCompat implements bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1, androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1 {
    private int bdddqmITkkeGpsxVXHR1l1llll;
    private Context bpdqqiQNVROMLC1ll1l1l11;
    bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 dbppbdqpeLmcbs11l11;
    private androidx.appcompat.widget.dqqppqiKzJi1l1lll1l ddbbbeXHXx111ll;
    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;
    bpdqqiQNVROMLC1ll1l1l11 dqdqbpQposEBDyDxIyyz1ll11;
    private dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dqpdbEevAufTOvPphbjykClll1l11;
    private boolean dqpqqqbqQyjyB11111l1;
    private boolean pbppbpqbamJRy11l1l1;
    private int ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    public interface bpdqqiQNVROMLC1ll1l1l11 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public interface dbpqdHhmDSIHIJiwc1ll1l1 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1();

        boolean dpbdbdpbLwkLpObyKsq1lll1();
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1 implements dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dbpqdHhmDSIHIJiwc1ll1l1(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onCloseMenu(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
        }
    }

    private class dpbdpqRKAscW1lll1l implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ ActionMenuView dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(ActionMenuView actionMenuView) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onMenuModeChange(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    public static class dqqppqiKzJi1l1lll1l extends LinearLayoutCompat.dbpqdHhmDSIHIJiwc1ll1l1 {

        @ViewDebug.ExportedProperty
        public boolean bpdqqiQNVROMLC1ll1l1l11;

        @ViewDebug.ExportedProperty
        public boolean dbpqdHhmDSIHIJiwc1ll1l1;

        @ViewDebug.ExportedProperty
        public int dpbdbdpbLwkLpObyKsq1lll1;

        @ViewDebug.ExportedProperty
        public boolean dpbdpqRKAscW1lll1l;

        @ViewDebug.ExportedProperty
        public int dqqppqiKzJi1l1lll1l;
        boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dqqppqiKzJi1l1lll1l(Context context, AttributeSet attributeSet) {
        }

        public dqqppqiKzJi1l1lll1l(ViewGroup.LayoutParams layoutParams) {
        }

        public dqqppqiKzJi1l1lll1l(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        public dqqppqiKzJi1l1lll1l(int i, int i2) {
        }
    }

    public ActionMenuView(Context context) {
    }

    static int bdddqmITkkeGpsxVXHR1l1llll(View view, int i, int i2, int i3, int i4) {
    }

    private void dqdqbpQposEBDyDxIyyz1ll11(int i, int i2) {
    }

    public boolean bbdbbpdOJSuInlll111l() {
    }

    protected dqqppqiKzJi1l1lll1l bpdqqiQNVROMLC1ll1l1l11() {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l12) {
    }

    public boolean dbppbdqpeLmcbs11l11() {
    }

    public dqqppqiKzJi1l1lll1l ddbbbeXHXx111ll() {
    }

    public boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1
    public boolean dpbdbdpbLwkLpObyKsq1lll1(androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public void dpbdpqRKAscW1lll1l() {
    }

    protected boolean dqpdbEevAufTOvPphbjykClll1l11(int i) {
    }

    protected dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public Menu getMenu() {
    }

    public Drawable getOverflowIcon() {
    }

    public int getPopupTheme() {
    }

    public int getWindowAnimations() {
    }

    @Override // androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1
    public void initialize(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public boolean pbppbpqbamJRy11l1l1() {
    }

    public dqqppqiKzJi1l1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11(AttributeSet attributeSet) {
    }

    public androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 qbddqbdJBkudFfhX1ll1l111() {
    }

    public boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }

    public void setExpandedActionViewsExclusive(boolean z) {
    }

    public void setOnMenuItemClickListener(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    public void setOverflowIcon(Drawable drawable) {
    }

    public void setOverflowReserved(boolean z) {
    }

    public void setPopupTheme(int i) {
    }

    public void setPresenter(androidx.appcompat.widget.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ LinearLayoutCompat.dbpqdHhmDSIHIJiwc1ll1l1 generateDefaultLayoutParams() {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayoutCompat.dbpqdHhmDSIHIJiwc1ll1l1 generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ LinearLayoutCompat.dbpqdHhmDSIHIJiwc1ll1l1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }
}
