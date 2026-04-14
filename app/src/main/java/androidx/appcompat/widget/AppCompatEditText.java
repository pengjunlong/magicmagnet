package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p000.br1;
import p000.ls1;
import p000.os1;
import p000.pddpdqqqwqOAXpzeQjdEzwEkBsp11111;
import p000.tn0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class AppCompatEditText extends EditText implements ls1, tn0, os1 {
    private final pbppbpqbamJRy11l1l1 mAppCompatEmojiEditTextHelper;
    private final bpdqqiQNVROMLC1ll1l1l11 mBackgroundTintHelper;
    private final br1 mDefaultOnReceiveContentListener;
    private dbpqdHhmDSIHIJiwc1ll1l1 mSuperCaller;
    private final bppbpdbCeZVhQNTixBml1lll11l mTextClassifierHelper;
    private final qbdqqpbqpCWRpIKEKtzoceYOll1ll1l mTextHelper;

    class dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ AppCompatEditText dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(AppCompatEditText appCompatEditText) {
        }

        public TextClassifier dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(TextClassifier textClassifier) {
        }
    }

    public AppCompatEditText(Context context) {
    }

    static /* synthetic */ TextClassifier access$001(AppCompatEditText appCompatEditText) {
    }

    static /* synthetic */ void access$101(AppCompatEditText appCompatEditText, TextClassifier textClassifier) {
    }

    private dbpqdHhmDSIHIJiwc1ll1l1 getSuperCaller() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
    }

    @Override // p000.ls1
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // p000.ls1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
    }

    void initEmojiKeyListener(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    public boolean isEmojiCompatEnabled() {
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
    }

    @Override // p000.tn0
    public pddpdqqqwqOAXpzeQjdEzwEkBsp11111 onReceiveContent(pddpdqqqwqOAXpzeQjdEzwEkBsp11111 pddpdqqqwqoaxpzeqjdezwekbsp11111) {
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    public void setEmojiCompatEnabled(boolean z) {
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // p000.os1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
    }

    @Override // p000.os1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
    }
}
