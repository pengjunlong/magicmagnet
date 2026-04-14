package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.wo1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class bpdqqiQNVROMLC1ll1l1l11 implements wo1 {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = null;
    private ArrayList<dqpqqqbqQyjyB11111l1> mActionItems;
    private dbpqdHhmDSIHIJiwc1ll1l1 mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private dqpqqqbqQyjyB11111l1 mExpandedItem;
    private boolean mGroupDividerEnabled;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList<dqpqqqbqQyjyB11111l1> mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList<dqpqqqbqQyjyB11111l1> mNonActionItems;
    private boolean mOptionalIconsVisible;
    private boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList<WeakReference<dbppbdqpeLmcbs11l11>> mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented;
    private ArrayList<dqpqqqbqQyjyB11111l1> mTempShortcutItemList;
    private ArrayList<dqpqqqbqQyjyB11111l1> mVisibleItems;

    public interface dbpqdHhmDSIHIJiwc1ll1l1 {
        boolean onMenuItemSelected(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem);

        void onMenuModeChange(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11);
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1 {
        boolean dpbdbdpbLwkLpObyKsq1lll1(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1);
    }

    public bpdqqiQNVROMLC1ll1l1l11(Context context) {
    }

    private dqpqqqbqQyjyB11111l1 createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
    }

    private void dispatchPresenterUpdate(boolean z) {
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
    }

    private boolean dispatchSubMenuSelected(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    private static int findInsertIndex(ArrayList<dqpqqqbqQyjyB11111l1> arrayList, int i) {
    }

    private static int getOrdering(int i) {
    }

    private void removeItemAtInt(int i, boolean z) {
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
    }

    private void setShortcutsVisibleInner(boolean z) {
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
    }

    protected MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
    }

    public void addMenuPresenter(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
    }

    public void changeMenuMode() {
    }

    @Override // android.view.Menu
    public void clear() {
    }

    public void clearAll() {
    }

    public void clearHeader() {
    }

    public final void close(boolean z) {
    }

    public boolean collapseItemActionView(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    boolean dispatchMenuItemSelected(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
    }

    public boolean expandItemActionView(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public int findGroupIndex(int i) {
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
    }

    public int findItemIndex(int i) {
    }

    dqpqqqbqQyjyB11111l1 findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
    }

    void findItemsWithShortcutForKey(List<dqpqqqbqQyjyB11111l1> list, int i, KeyEvent keyEvent) {
    }

    public void flagActionItems() {
    }

    public ArrayList<dqpqqqbqQyjyB11111l1> getActionItems() {
    }

    protected String getActionViewStatesKey() {
    }

    public Context getContext() {
    }

    public dqpqqqbqQyjyB11111l1 getExpandedItem() {
    }

    public Drawable getHeaderIcon() {
    }

    public CharSequence getHeaderTitle() {
    }

    public View getHeaderView() {
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
    }

    public ArrayList<dqpqqqbqQyjyB11111l1> getNonActionItems() {
    }

    boolean getOptionalIconsVisible() {
    }

    Resources getResources() {
    }

    public bpdqqiQNVROMLC1ll1l1l11 getRootMenu() {
    }

    public ArrayList<dqpqqqbqQyjyB11111l1> getVisibleItems() {
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
    }

    public boolean isGroupDividerEnabled() {
    }

    boolean isQwertyMode() {
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
    }

    public boolean isShortcutsVisible() {
    }

    void onItemActionRequestChanged(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    void onItemVisibleChanged(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public void onItemsChanged(boolean z) {
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
    }

    public void removeItemAt(int i) {
    }

    public void removeMenuPresenter(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    public void restoreActionViewStates(Bundle bundle) {
    }

    public void restorePresenterStates(Bundle bundle) {
    }

    public void saveActionViewStates(Bundle bundle) {
    }

    public void savePresenterStates(Bundle bundle) {
    }

    public void setCallback(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    public bpdqqiQNVROMLC1ll1l1l11 setDefaultShowAsAction(int i) {
    }

    void setExclusiveItemChecked(MenuItem menuItem) {
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 setHeaderIconInt(Drawable drawable) {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 setHeaderTitleInt(CharSequence charSequence) {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 setHeaderViewInt(View view) {
    }

    public void setOptionalIconsVisible(boolean z) {
    }

    public void setOverrideVisibleItems(boolean z) {
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
    }

    public void setShortcutsVisible(boolean z) {
    }

    @Override // android.view.Menu
    public int size() {
    }

    public void startDispatchingItemsChanged() {
    }

    public void stopDispatchingItemsChanged() {
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
    }

    public void addMenuPresenter(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11, Context context) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
    }

    public int findGroupIndex(int i, int i2) {
    }

    public boolean performItemAction(MenuItem menuItem, dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11, int i) {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 setHeaderIconInt(int i) {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 setHeaderTitleInt(int i) {
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.Menu
    public void close() {
    }
}
