package com.google.android.exoplayer2.util;

import android.content.Context;
import com.google.android.exoplayer2.util.GlUtil;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, Attribute> attributeByName;
    private final Attribute[] attributes;
    private final int programId;
    private final Map<String, Uniform> uniformByName;
    private final Uniform[] uniforms;

    private static final class Attribute {
        private Buffer buffer;
        private final int index;
        private final int location;
        public final String name;
        private int size;

        private Attribute(String str, int i, int i2) {
        }

        public static Attribute create(int i, int i2) {
        }

        public void bind() throws GlUtil.GlException {
        }

        public void setBuffer(float[] fArr, int i) {
        }
    }

    private static final class Uniform {
        private final float[] floatValue;
        private int intValue;
        private final int location;
        public final String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;

        private Uniform(String str, int i, int i2) {
        }

        public static Uniform create(int i, int i2) {
        }

        public void bind() throws GlUtil.GlException {
        }

        public void setFloat(float f) {
        }

        public void setFloats(float[] fArr) {
        }

        public void setInt(int i) {
        }

        public void setSamplerTexId(int i, int i2) {
        }
    }

    public GlProgram(Context context, String str, String str2) throws IOException, GlUtil.GlException {
    }

    static /* synthetic */ int access$000(byte[] bArr) {
    }

    static /* synthetic */ int access$100(int i, String str) {
    }

    static /* synthetic */ int access$200(int i, String str) {
    }

    private static void addShader(int i, int i2, String str) throws GlUtil.GlException {
    }

    private static int getAttributeLocation(int i, String str) {
    }

    private static int getCStringLength(byte[] bArr) {
    }

    private static int getUniformLocation(int i, String str) {
    }

    public static String loadAsset(Context context, String str) throws IOException {
    }

    public void bindAttributesAndUniforms() throws GlUtil.GlException {
    }

    public void delete() throws GlUtil.GlException {
    }

    public int getAttributeArrayLocationAndEnable(String str) throws GlUtil.GlException {
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
    }

    public void setFloatUniform(String str, float f) {
    }

    public void setFloatsUniform(String str, float[] fArr) {
    }

    public void setIntUniform(String str, int i) {
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
    }

    public void use() throws GlUtil.GlException {
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
    }

    private int getAttributeLocation(String str) {
    }

    public int getUniformLocation(String str) {
    }
}
