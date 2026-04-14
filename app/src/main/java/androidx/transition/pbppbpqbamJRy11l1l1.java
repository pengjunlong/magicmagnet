package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000.fu1;
import p000.ns0;
import p000.o80;
import p000.qdqddftZvRmltIahaEHKjU1l11ll1l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class pbppbpqbamJRy11l1l1 implements Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private static final ns0 STRAIGHT_PATH_MOTION = null;
    private static ThreadLocal<qdqddftZvRmltIahaEHKjU1l11ll1l1<Animator, dpbdpqRKAscW1lll1l>> sRunningAnimators;
    private ArrayList<Animator> mAnimators;
    boolean mCanRemoveViews;
    ArrayList<Animator> mCurrentAnimators;
    long mDuration;
    private dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 mEndValues;
    private ArrayList<qbddqbdJBkudFfhX1ll1l111> mEndValuesList;
    private boolean mEnded;
    private ppbdpwWWljzmXXdHNabfWhgjl111l11 mEpicenterCallback;
    private TimeInterpolator mInterpolator;
    private ArrayList<dqpqqqbqQyjyB11111l1> mListeners;
    private int[] mMatchOrder;
    private String mName;
    private qdqddftZvRmltIahaEHKjU1l11ll1l1<String, String> mNameOverrides;
    private int mNumInstances;
    bdddqmITkkeGpsxVXHR1l1llll mParent;
    private ns0 mPathMotion;
    private boolean mPaused;
    fu1 mPropagation;
    private long mStartDelay;
    private dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 mStartValues;
    private ArrayList<qbddqbdJBkudFfhX1ll1l111> mStartValuesList;
    private ArrayList<View> mTargetChildExcludes;
    private ArrayList<View> mTargetExcludes;
    private ArrayList<Integer> mTargetIdChildExcludes;
    private ArrayList<Integer> mTargetIdExcludes;
    ArrayList<Integer> mTargetIds;
    private ArrayList<String> mTargetNameExcludes;
    private ArrayList<String> mTargetNames;
    private ArrayList<Class<?>> mTargetTypeChildExcludes;
    private ArrayList<Class<?>> mTargetTypeExcludes;
    private ArrayList<Class<?>> mTargetTypes;
    ArrayList<View> mTargets;

    private static class bpdqqiQNVROMLC1ll1l1l11 {
        static <T> ArrayList<T> dbpqdHhmDSIHIJiwc1ll1l1(ArrayList<T> arrayList, T t) {
        }

        static <T> ArrayList<T> dpbdbdpbLwkLpObyKsq1lll1(ArrayList<T> arrayList, T t) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends ns0 {
        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.ns0
        public Path getPath(float f, float f2, float f3, float f4) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends AnimatorListenerAdapter {
        final /* synthetic */ qdqddftZvRmltIahaEHKjU1l11ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ pbppbpqbamJRy11l1l1 dpbdbdpbLwkLpObyKsq1lll1;

        dpbdbdpbLwkLpObyKsq1lll1(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, qdqddftZvRmltIahaEHKjU1l11ll1l1 qdqddftzvrmltiahaehkju1l11ll1l1) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private static class dpbdpqRKAscW1lll1l {
        pbppbpqbamJRy11l1l1 bpdqqiQNVROMLC1ll1l1l11;
        View dbpqdHhmDSIHIJiwc1ll1l1;
        String dpbdbdpbLwkLpObyKsq1lll1;
        bdpdqYMMfHmzHyUIbllllll1 dpbdpqRKAscW1lll1l;
        qbddqbdJBkudFfhX1ll1l111 dqqppqiKzJi1l1lll1l;

        dpbdpqRKAscW1lll1l(View view, String str, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, bdpdqYMMfHmzHyUIbllllll1 bdpdqymmfhmzhyuibllllll1, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }
    }

    public interface dqpqqqbqQyjyB11111l1 {
        void onTransitionCancel(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);

        void onTransitionEnd(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);

        void onTransitionPause(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);

        void onTransitionResume(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);

        void onTransitionStart(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);
    }

    class dqqppqiKzJi1l1lll1l extends AnimatorListenerAdapter {
        final /* synthetic */ pbppbpqbamJRy11l1l1 dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public static abstract class ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        public abstract Rect dbpqdHhmDSIHIJiwc1ll1l1(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1);
    }

    public pbppbpqbamJRy11l1l1() {
    }

    private void addUnmatched(qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l1, qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l12) {
    }

    private static void addViewValues(dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l1, View view, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    private static boolean alreadyContains(int[] iArr, int i) {
    }

    private void captureHierarchy(View view, boolean z) {
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
    }

    private static qdqddftZvRmltIahaEHKjU1l11ll1l1<Animator, dpbdpqRKAscW1lll1l> getRunningAnimators() {
    }

    private static boolean isValidMatch(int i) {
    }

    private static boolean isValueChanged(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112, String str) {
    }

    private void matchIds(qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l1, qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l12, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
    }

    private void matchInstances(qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l1, qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l12) {
    }

    private void matchItemIds(qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l1, qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l12, o80<View> o80Var, o80<View> o80Var2) {
    }

    private void matchNames(qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l1, qdqddftZvRmltIahaEHKjU1l11ll1l1<View, qbddqbdJBkudFfhX1ll1l111> qdqddftzvrmltiahaehkju1l11ll1l12, qdqddftZvRmltIahaEHKjU1l11ll1l1<String, View> qdqddftzvrmltiahaehkju1l11ll1l13, qdqddftZvRmltIahaEHKjU1l11ll1l1<String, View> qdqddftzvrmltiahaehkju1l11ll1l14) {
    }

    private void matchStartAndEnd(dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l1, dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l12) {
    }

    private static int[] parseMatchOrder(String str) {
    }

    private void runAnimator(Animator animator, qdqddftZvRmltIahaEHKjU1l11ll1l1<Animator, dpbdpqRKAscW1lll1l> qdqddftzvrmltiahaehkju1l11ll1l1) {
    }

    public pbppbpqbamJRy11l1l1 addListener(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public pbppbpqbamJRy11l1l1 addTarget(View view) {
    }

    protected void animate(Animator animator) {
    }

    protected void cancel() {
    }

    public abstract void captureEndValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111);

    void capturePropagationValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    public abstract void captureStartValues(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111);

    void captureValues(ViewGroup viewGroup, boolean z) {
    }

    void clearValues(boolean z) {
    }

    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo872clone() throws CloneNotSupportedException {
    }

    public Animator createAnimator(ViewGroup viewGroup, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    protected void createAnimators(ViewGroup viewGroup, dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l1, dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l12, ArrayList<qbddqbdJBkudFfhX1ll1l111> arrayList, ArrayList<qbddqbdJBkudFfhX1ll1l111> arrayList2) {
    }

    protected void end() {
    }

    public pbppbpqbamJRy11l1l1 excludeChildren(View view, boolean z) {
    }

    public pbppbpqbamJRy11l1l1 excludeTarget(View view, boolean z) {
    }

    void forceToEnd(ViewGroup viewGroup) {
    }

    public long getDuration() {
    }

    public Rect getEpicenter() {
    }

    public ppbdpwWWljzmXXdHNabfWhgjl111l11 getEpicenterCallback() {
    }

    public TimeInterpolator getInterpolator() {
    }

    qbddqbdJBkudFfhX1ll1l111 getMatchedTransitionValues(View view, boolean z) {
    }

    public String getName() {
    }

    public ns0 getPathMotion() {
    }

    public fu1 getPropagation() {
    }

    public long getStartDelay() {
    }

    public List<Integer> getTargetIds() {
    }

    public List<String> getTargetNames() {
    }

    public List<Class<?>> getTargetTypes() {
    }

    public List<View> getTargets() {
    }

    public String[] getTransitionProperties() {
    }

    public qbddqbdJBkudFfhX1ll1l111 getTransitionValues(View view, boolean z) {
    }

    public boolean isTransitionRequired(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l1112) {
    }

    boolean isValidTarget(View view) {
    }

    public void pause(View view) {
    }

    void playTransition(ViewGroup viewGroup) {
    }

    public pbppbpqbamJRy11l1l1 removeListener(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public pbppbpqbamJRy11l1l1 removeTarget(View view) {
    }

    public void resume(View view) {
    }

    protected void runAnimators() {
    }

    void setCanRemoveViews(boolean z) {
    }

    public pbppbpqbamJRy11l1l1 setDuration(long j) {
    }

    public void setEpicenterCallback(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    public pbppbpqbamJRy11l1l1 setInterpolator(TimeInterpolator timeInterpolator) {
    }

    public void setMatchOrder(int... iArr) {
    }

    public void setPathMotion(ns0 ns0Var) {
    }

    public void setPropagation(fu1 fu1Var) {
    }

    public pbppbpqbamJRy11l1l1 setStartDelay(long j) {
    }

    protected void start() {
    }

    public String toString() {
    }

    public pbppbpqbamJRy11l1l1 addTarget(int i) {
    }

    public pbppbpqbamJRy11l1l1 clone() {
    }

    public pbppbpqbamJRy11l1l1 excludeChildren(int i, boolean z) {
    }

    public pbppbpqbamJRy11l1l1 excludeTarget(int i, boolean z) {
    }

    public pbppbpqbamJRy11l1l1 removeTarget(int i) {
    }

    String toString(String str) {
    }

    public pbppbpqbamJRy11l1l1 addTarget(String str) {
    }

    public pbppbpqbamJRy11l1l1 excludeChildren(Class<?> cls, boolean z) {
    }

    public pbppbpqbamJRy11l1l1 excludeTarget(String str, boolean z) {
    }

    public pbppbpqbamJRy11l1l1 removeTarget(String str) {
    }

    public pbppbpqbamJRy11l1l1 excludeTarget(Class<?> cls, boolean z) {
    }

    public pbppbpqbamJRy11l1l1 removeTarget(Class<?> cls) {
    }

    public pbppbpqbamJRy11l1l1 addTarget(Class<?> cls) {
    }

    @SuppressLint({"RestrictedApi"})
    public pbppbpqbamJRy11l1l1(Context context, AttributeSet attributeSet) {
    }
}
