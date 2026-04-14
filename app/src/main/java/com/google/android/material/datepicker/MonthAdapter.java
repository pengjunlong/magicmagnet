package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class MonthAdapter extends BaseAdapter {
    private static final int MAXIMUM_GRID_CELLS = 0;
    static final int MAXIMUM_WEEKS = 0;
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;

    MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
    }

    private String getDayContentDescription(Context context, long j) {
    }

    private void initializeStyles(Context context) {
    }

    private boolean isSelected(long j) {
    }

    private boolean isToday(long j) {
    }

    private void updateSelectedState(TextView textView, long j, int i) {
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j) {
    }

    int dayToPosition(int i) {
    }

    int firstPositionInMonth() {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
    }

    boolean isEndOfRange(long j) {
    }

    boolean isFirstInRow(int i) {
    }

    boolean isLastInRow(int i) {
    }

    boolean isStartOfRange(long j) {
    }

    int lastPositionInMonth() {
    }

    int positionToDay(int i) {
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
    }

    boolean withinMonth(int i) {
    }

    @Override // android.widget.Adapter
    public Long getItem(int i) {
    }

    @Override // android.widget.Adapter
    public TextView getView(int i, View view, ViewGroup viewGroup) {
    }
}
