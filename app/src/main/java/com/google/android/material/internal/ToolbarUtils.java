package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.Comparator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ToolbarUtils {
    private static final Comparator<View> VIEW_TOP_COMPARATOR = null;

    /* renamed from: com.google.android.material.internal.ToolbarUtils$1 */
    class C03851 implements Comparator<View> {
        C03851() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View view, View view2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(View view, View view2) {
        }
    }

    private ToolbarUtils() {
    }

    public static ActionMenuItemView getActionMenuItemView(Toolbar toolbar, int i) {
    }

    public static ActionMenuView getActionMenuView(Toolbar toolbar) {
    }

    private static ImageView getImageView(Toolbar toolbar, Drawable drawable) {
    }

    public static ImageView getLogoImageView(Toolbar toolbar) {
    }

    public static ImageButton getNavigationIconButton(Toolbar toolbar) {
    }

    public static View getSecondaryActionMenuItemView(Toolbar toolbar) {
    }

    public static TextView getSubtitleTextView(Toolbar toolbar) {
    }

    private static List<TextView> getTextViewsWithText(Toolbar toolbar, CharSequence charSequence) {
    }

    public static TextView getTitleTextView(Toolbar toolbar) {
    }
}
