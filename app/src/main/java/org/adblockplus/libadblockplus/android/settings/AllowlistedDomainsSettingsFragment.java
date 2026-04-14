package org.adblockplus.libadblockplus.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AllowlistedDomainsSettingsFragment extends BaseSettingsFragment<Listener> {
    private Adapter adapter;
    private ImageView addDomainButton;
    private EditText domain;
    private ListView listView;
    private final View.OnClickListener removeDomainClickListener;
    private SettingsViewModel settingsViewModel;

    /* renamed from: org.adblockplus.libadblockplus.android.settings.AllowlistedDomainsSettingsFragment$1 */
    class ViewOnClickListenerC17521 implements View.OnClickListener {
        final /* synthetic */ AllowlistedDomainsSettingsFragment this$0;

        ViewOnClickListenerC17521(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.settings.AllowlistedDomainsSettingsFragment$2 */
    class ViewOnClickListenerC17532 implements View.OnClickListener {
        final /* synthetic */ AllowlistedDomainsSettingsFragment this$0;

        ViewOnClickListenerC17532(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    private class Adapter extends BaseAdapter {
        final /* synthetic */ AllowlistedDomainsSettingsFragment this$0;

        private Adapter(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
        }

        /* synthetic */ Adapter(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment, ViewOnClickListenerC17521 viewOnClickListenerC17521) {
        }
    }

    private class Holder {
        final TextView domain;
        final ImageView removeButton;
        final /* synthetic */ AllowlistedDomainsSettingsFragment this$0;

        Holder(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment, View view) {
        }
    }

    public interface Listener extends BaseSettingsFragment.Listener {
        boolean isValidDomain(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment, String str, AdblockSettings adblockSettings);
    }

    static /* synthetic */ SettingsViewModel access$000(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
    }

    static /* synthetic */ Adapter access$100(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
    }

    static /* synthetic */ View.OnClickListener access$200(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
    }

    static /* synthetic */ EditText access$300(AllowlistedDomainsSettingsFragment allowlistedDomainsSettingsFragment) {
    }

    private void bindControls(View view) {
    }

    private void checkAndInitControls() {
    }

    private void initControls() {
    }

    public static AllowlistedDomainsSettingsFragment newInstance() {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment
    protected void onAdblockEngineReady() {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l
    public void onCreatePreferences(Bundle bundle, String str) {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment
    protected void onSettingsReady() {
    }
}
