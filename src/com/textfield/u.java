package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.a;
import androidx.core.view.W;
import com.google.android.material.internal.B;
import com.google.android.material.internal.CheckableImageButton;
import i0.b;
import java.util.Arrays;

abstract class u {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = a.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                a.o(drawable, colorStateList);
            } else {
                a.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static ImageView.ScaleType b(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    private static int[] c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = a.r(drawable).mutate();
            a.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    static void e(CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(b.a(checkableImageButton.getContext(), (int) B.c(checkableImageButton.getContext(), 4)));
        }
    }

    private static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean Q2 = W.Q(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (Q2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(Q2);
        checkableImageButton.setPressable(Q2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        W.y0(checkableImageButton, i2);
    }

    static void g(CheckableImageButton checkableImageButton, int i2) {
        checkableImageButton.setMinimumWidth(i2);
        checkableImageButton.setMinimumHeight(i2);
    }

    static void h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
