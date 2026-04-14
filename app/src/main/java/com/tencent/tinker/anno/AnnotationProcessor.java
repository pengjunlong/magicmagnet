package com.tencent.tinker.anno;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

@SupportedSourceVersion(SourceVersion.RELEASE_7)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AnnotationProcessor extends AbstractProcessor {
    private static final String APPLICATION_TEMPLATE_PATH = "/TinkerAnnoApplication.tmpl";
    private static final String SUFFIX = "$$DefaultLifeCycle";

    private void processDefaultLifeCycle(Set<? extends Element> set) {
    }

    public Set<String> getSupportedAnnotationTypes() {
    }

    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
    }
}
