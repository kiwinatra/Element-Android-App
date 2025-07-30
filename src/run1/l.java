package B0;

import w0.i;
import z0.d;

abstract class l extends k {
    public static final boolean a(String str, int i2, String str2, int i3, int i4, boolean z2) {
        i.e(str, "<this>");
        i.e(str2, "other");
        if (!z2) {
            return str.regionMatches(i2, str2, i3, i4);
        }
        return str.regionMatches(z2, i2, str2, i3, i4);
    }

    public static final String b(String str, String str2, String str3, boolean z2) {
        i.e(str, "<this>");
        i.e(str2, "oldValue");
        i.e(str3, "newValue");
        int i2 = 0;
        int e2 = m.e(str, str2, 0, z2);
        if (e2 < 0) {
            return str;
        }
        int length = str2.length();
        int a2 = d.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i2, e2);
                sb.append(str3);
                i2 = e2 + length;
                if (e2 >= str.length() || (e2 = m.e(str, str2, e2 + a2, z2)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    i.d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i2, e2);
                sb.append(str3);
                i2 = e2 + length;
                break;
            } while ((e2 = m.e(str, str2, e2 + a2, z2)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            i.d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String c(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return b(str, str2, str3, z2);
    }
}
