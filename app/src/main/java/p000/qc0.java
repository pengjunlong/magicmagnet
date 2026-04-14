package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000.bpqpbicsQtfVpOtr11l1l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class qc0 extends bddpbqdILJRzmEaBtslswkll11ll1 implements MenuItem {
    private Method bpdqqiQNVROMLC1ll1l1l11;
    private final yo1 dpbdpqRKAscW1lll1l;

    private class bpdqqiQNVROMLC1ll1l1l11 implements MenuItem.OnMenuItemClickListener {
        final /* synthetic */ qc0 bpdqqiQNVROMLC1ll1l1l11;
        private final MenuItem.OnMenuItemClickListener dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(qc0 qc0Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    private class dbpqdHhmDSIHIJiwc1ll1l1 extends bpqpbicsQtfVpOtr11l1l {
        final /* synthetic */ qc0 bpdqqiQNVROMLC1ll1l1l11;
        final ActionProvider dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(qc0 qc0Var, Context context, ActionProvider actionProvider) {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public boolean bpdqqiQNVROMLC1ll1l1l11() {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public View dqqppqiKzJi1l1lll1l() {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public void ppbdpwWWljzmXXdHNabfWhgjl111l11(SubMenu subMenu) {
        }
    }

    private class dpbdbdpbLwkLpObyKsq1lll1 extends dbpqdHhmDSIHIJiwc1ll1l1 implements ActionProvider.VisibilityListener {
        final /* synthetic */ qc0 dqpqqqbqQyjyB11111l1;
        private bpqpbicsQtfVpOtr11l1l.dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdbdpbLwkLpObyKsq1lll1(qc0 qc0Var, Context context, ActionProvider actionProvider) {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public void dbppbdqpeLmcbs11l11(bpqpbicsQtfVpOtr11l1l.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public View dpbdpqRKAscW1lll1l(MenuItem menuItem) {
        }

        @Override // p000.bpqpbicsQtfVpOtr11l1l
        public boolean dqpqqqbqQyjyB11111l1() {
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
        }
    }

    private class dpbdpqRKAscW1lll1l implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ qc0 dpbdbdpbLwkLpObyKsq1lll1;

        dpbdpqRKAscW1lll1l(qc0 qc0Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
        }
    }

    static class dqqppqiKzJi1l1lll1l extends FrameLayout implements qqddpcfdNhICqJAqiJ1ll1llll {
        final CollapsibleActionView dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(View view) {
        }

        @Override // p000.qqddpcfdNhICqJAqiJ1ll1llll
        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        View dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.qqddpcfdNhICqJAqiJ1ll1llll
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    public qc0(Context context, yo1 yo1Var) {
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
    }

    public void ddbbbeXHXx111ll(boolean z) {
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
    }

    @Override // android.view.MenuItem
    public View getActionView() {
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
    }

    @Override // android.view.MenuItem
    public int getItemId() {
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
    }

    @Override // android.view.MenuItem
    public int getOrder() {
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
    }
}
