package com.xtremelabs.robolectric.shadows;

import android.graphics.Paint;
import android.graphics.Shader;
import com.xtremelabs.robolectric.util.Implementation;
import com.xtremelabs.robolectric.util.Implements;

/**
 * Shadow of {@code Paint} that has some extra accessors so that tests can tell whether a {@code Paint} object was
 * created with the expected parameters.
 */
@SuppressWarnings({"UnusedDeclaration"})
@Implements(Paint.class)
public class ShadowPaint {

    private int color;
    private Paint.Style style;
    private Paint.Cap cap;
    private Paint.Join join;
    private float width;
    private float shadowRadius;
    private float shadowDx;
    private float shadowDy;
    private int shadowColor;
    private Shader shader;
    private int alpha;

    @Implementation
    public Shader setShader(Shader shader) {
        this.shader = shader;
        return shader;
    }

    @Implementation
    public int getAlpha() {
        return alpha;
    }

    @Implementation
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }


    @Implementation
    public Shader getShader() {
        return shader;
    }

    @Implementation
    public void setColor(int color) {
        this.color = color;
    }

    @Implementation
    public int getColor() {
        return color;
    }

    @Implementation
    public void setStyle(Paint.Style style) {
        this.style = style;
    }

    @Implementation
    public Paint.Style getStyle() {
        return style;
    }

    @Implementation
    public void setStrokeCap(Paint.Cap cap) {
        this.cap = cap;
    }

    @Implementation
    public Paint.Cap getStrokeCap() {
        return cap;
    }

    @Implementation
    public void setStrokeJoin(Paint.Join join) {
        this.join = join;
    }

    @Implementation
    public Paint.Join getStrokeJoin() {
        return join;
    }

    @Implementation
    public void setStrokeWidth(float width) {
        this.width = width;
    }

    @Implementation
    public float getStrokeWidth() {
        return width;
    }

    @Implementation
    public void setShadowLayer(float radius, float dx, float dy, int color) {
        shadowRadius = radius;
        shadowDx = dx;
        shadowDy = dy;
        shadowColor = color;
    }

    /**
     * Non-Android accessor.
     *
     * @return shadow radius (Paint related shadow, not Robolectric Shadow)
     */
    public float getShadowRadius() {
        return shadowRadius;
    }

    /**
     * Non-Android accessor.
     *
     * @return shadow Dx (Paint related shadow, not Robolectric Shadow)
     */
    public float getShadowDx() {
        return shadowDx;
    }

    /**
     * Non-Android accessor.
     *
     * @return shadow Dx (Paint related shadow, not Robolectric Shadow)
     */
    public float getShadowDy() {
        return shadowDy;
    }

    /**
     * Non-Android accessor.
     *
     * @return shadow color (Paint related shadow, not Robolectric Shadow)
     */
    public int getShadowColor() {
        return shadowColor;
    }

    /**
     * Non-Android accessor.
     *
     * @return cap
     */
    public Paint.Cap getCap() {
        return cap;
    }

    /**
     * Non-Android accessor.
     *
     * @return join
     */
    public Paint.Join getJoin() {
        return join;
    }

    /**
     * Non-Android accessor.
     *
     * @return width
     */
    public float getWidth() {
        return width;
    }
}
