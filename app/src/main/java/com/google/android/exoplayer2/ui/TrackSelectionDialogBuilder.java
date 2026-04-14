package com.google.android.exoplayer2.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.common.collect.ImmutableMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private ImmutableMap<TrackGroup, TrackSelectionOverride> overrides;
    private boolean showDisableOption;
    private int themeResId;
    private final CharSequence title;
    private Comparator<Format> trackFormatComparator;
    private final List<Tracks.Group> trackGroups;
    private TrackNameProvider trackNameProvider;

    public interface DialogCallback {
        void onTracksSelected(boolean z, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, List<Tracks.Group> list, DialogCallback dialogCallback) {
    }

    private Dialog buildForAndroidX() {
    }

    private Dialog buildForPlatform() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Player player, int i, boolean z, Map map) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(TrackSelectionDialogBuilder trackSelectionDialogBuilder, TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
    }

    private static /* synthetic */ void lambda$new$0(Player player, int i, boolean z, Map map) {
    }

    private /* synthetic */ void lambda$setUpDialogView$1(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
    }

    private DialogInterface.OnClickListener setUpDialogView(View view) {
    }

    public Dialog build() {
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean z) {
    }

    public TrackSelectionDialogBuilder setOverride(TrackSelectionOverride trackSelectionOverride) {
    }

    public TrackSelectionDialogBuilder setOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
    }

    public TrackSelectionDialogBuilder setTheme(int i) {
    }

    public void setTrackFormatComparator(Comparator<Format> comparator) {
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(TrackNameProvider trackNameProvider) {
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, Player player, int i) {
    }
}
