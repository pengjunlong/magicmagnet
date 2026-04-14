package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private TrackSelectionListener listener;
    private final Map<TrackGroup, TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final List<Tracks.Group> trackGroups;
    private Comparator<TrackInfo> trackInfoComparator;
    private TrackNameProvider trackNameProvider;
    private CheckedTextView[][] trackViews;

    private class ComponentListener implements View.OnClickListener {
        final /* synthetic */ TrackSelectionView this$0;

        private ComponentListener(TrackSelectionView trackSelectionView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        /* synthetic */ ComponentListener(TrackSelectionView trackSelectionView, C02211 c02211) {
        }
    }

    private static final class TrackInfo {
        public final Tracks.Group trackGroup;
        public final int trackIndex;

        public TrackInfo(Tracks.Group group, int i) {
        }

        public Format getFormat() {
        }
    }

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionView(Context context) {
    }

    static /* synthetic */ void access$100(TrackSelectionView trackSelectionView, View view) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Comparator comparator, TrackInfo trackInfo, TrackInfo trackInfo2) {
    }

    public static Map<TrackGroup, TrackSelectionOverride> filterOverrides(Map<TrackGroup, TrackSelectionOverride> map, List<Tracks.Group> list, boolean z) {
    }

    private static /* synthetic */ int lambda$init$0(Comparator comparator, TrackInfo trackInfo, TrackInfo trackInfo2) {
    }

    private void onClick(View view) {
    }

    private void onDefaultViewClicked() {
    }

    private void onDisableViewClicked() {
    }

    private void onTrackViewClicked(View view) {
    }

    private boolean shouldEnableAdaptiveSelection(Tracks.Group group) {
    }

    private boolean shouldEnableMultiGroupSelection() {
    }

    private void updateViewStates() {
    }

    private void updateViews() {
    }

    public boolean getIsDisabled() {
    }

    public Map<TrackGroup, TrackSelectionOverride> getOverrides() {
    }

    public void init(List<Tracks.Group> list, boolean z, Map<TrackGroup, TrackSelectionOverride> map, Comparator<Format> comparator, TrackSelectionListener trackSelectionListener) {
    }

    public void setAllowAdaptiveSelections(boolean z) {
    }

    public void setAllowMultipleOverrides(boolean z) {
    }

    public void setShowDisableOption(boolean z) {
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
    }
}
