package B0;

import p0.C0271e;
import w0.i;
import z0.a;
import z0.c;
import z0.d;

abstract class m extends l {
    public static final int d(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e(CharSequence charSequence, String str, int i2, boolean z2) {
        i.e(charSequence, "<this>");
        i.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return g(charSequence, str, i2, charSequence.length(), z2, false, 16, (Object) null);
    }

    private static final int f(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        a aVar;
        if (!z3) {
            aVar = new c(d.a(i2, 0), d.b(i3, charSequence.length()));
        } else {
            aVar = d.c(d.b(i2, d(charSequence)), d.a(i3, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a2 = aVar.a();
            int b2 = aVar.b();
            int c2 = aVar.c();
            if ((c2 <= 0 || a2 > b2) && (c2 >= 0 || b2 > a2)) {
                return -1;
            }
            while (true) {
                if (k(charSequence2, 0, charSequence, a2, charSequence2.length(), z2)) {
                    return a2;
                }
                if (a2 == b2) {
                    return -1;
                }
                a2 += c2;
            }
        } else {
            int a3 = aVar.a();
            int b3 = aVar.b();
            int c3 = aVar.c();
            if ((c3 <= 0 || a3 > b3) && (c3 >= 0 || b3 > a3)) {
                return -1;
            }
            while (true) {
                if (l.a((String) charSequence2, 0, (String) charSequence, a3, charSequence2.length(), z2)) {
                    return a3;
                }
                if (a3 == b3) {
                    return -1;
                }
                a3 += c3;
            }
        }
    }

    static /* synthetic */ int g(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
        boolean z4;
        if ((i4 & 16) != 0) {
            z4 = false;
        } else {
            z4 = z3;
        }
        return f(charSequence, charSequence2, i2, i3, z2, z4);
    }

    public static final int h(CharSequence charSequence, char c2, int i2, boolean z2) {
        i.e(charSequence, "<this>");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        return j(charSequence, new char[]{c2}, i2, z2);
    }

    public static /* synthetic */ int i(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = d(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return h(charSequence, c2, i2, z2);
    }

    public static final int j(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        i.e(charSequence, "<this>");
        i.e(cArr, "chars");
        if (z2 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b2 = d.b(i2, d(charSequence)); -1 < b2; b2--) {
                char charAt = charSequence.charAt(b2);
                for (char a2 : cArr) {
                    if (b.a(a2, charAt, z2)) {
                        return b2;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C0271e.i(cArr), i2);
    }

    public static final boolean k(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z2) {
        i.e(charSequence, "<this>");
        i.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!b.a(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static final String l(String str, char c2, String str2) {
        i.e(str, "<this>");
        i.e(str2, "missingDelimiterValue");
        int i2 = i(str, c2, 0, false, 6, (Object) null);
        if (i2 == -1) {
            return str2;
        }
        String substring = str.substring(i2 + 1, str.length());
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String m(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return l(str, c2, str2);
    }
}
