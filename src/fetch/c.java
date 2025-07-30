package B;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import x.h;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f0a = new String[0];

    private static class a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i2) {
            editorInfo.setInitialSurroundingSubText(charSequence, i2);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] a2 = editorInfo.contentMimeTypes;
            if (a2 != null) {
                return a2;
            }
            return f0a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f0a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray != null) {
            return stringArray;
        }
        return f0a;
    }

    private static boolean b(CharSequence charSequence, int i2, int i3) {
        if (i3 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i2));
        }
        if (i3 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i2));
    }

    private static boolean c(int i2) {
        int i3 = i2 & 4095;
        if (i3 == 129 || i3 == 225 || i3 == 18) {
            return true;
        }
        return false;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i2) {
        int i3;
        int i4;
        h.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i2);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        if (i5 > i6) {
            i3 = i6 - i2;
        } else {
            i3 = i5 - i2;
        }
        if (i5 > i6) {
            i4 = i5 - i2;
        } else {
            i4 = i6 - i2;
        }
        int length = charSequence.length();
        if (i2 < 0 || i3 < 0 || i4 > length) {
            g(editorInfo, (CharSequence) null, 0, 0);
        } else if (c(editorInfo.inputType)) {
            g(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i3, i4);
        } else {
            h(editorInfo, charSequence, i3, i4);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        int i4;
        CharSequence charSequence2;
        int i5 = i3 - i2;
        if (i5 > 1024) {
            i4 = 0;
        } else {
            i4 = i5;
        }
        int i6 = 2048 - i4;
        int min = Math.min(charSequence.length() - i3, i6 - Math.min(i2, (int) (((double) i6) * 0.8d)));
        int min2 = Math.min(i2, i6 - min);
        int i7 = i2 - min2;
        if (b(charSequence, i7, 0)) {
            i7++;
            min2--;
        }
        if (b(charSequence, (i3 + min) - 1, 1)) {
            min--;
        }
        int i8 = min2 + i4 + min;
        if (i4 != i5) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i7, i7 + min2), charSequence.subSequence(i3, min + i3)});
        } else {
            charSequence2 = charSequence.subSequence(i7, i8 + i7);
        }
        g(editorInfo, charSequence2, min2, i4 + min2);
    }
}
