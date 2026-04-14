package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$1 */
    class C02221 extends WebView {
        C02221(WebViewSubtitleOutput webViewSubtitleOutput, Context context, AttributeSet attributeSet) {
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.View
        public boolean performClick() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2 */
    static /* synthetic */ class C02232 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment = null;
    }

    public WebViewSubtitleOutput(Context context) {
    }

    private static int anchorTypeToTranslatePercent(int i) {
    }

    private static String convertAlignmentToCss(Layout.Alignment alignment) {
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
    }

    private String convertTextSizeToCss(int i, float f) {
    }

    private static String convertVerticalTypeToCss(int i) {
    }

    private static String getBlockShearTransformFunction(Cue cue) {
    }

    private void updateWebView() {
    }

    public void destroy() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
    }
}
