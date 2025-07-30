package r;

import android.view.View;

/* renamed from: r.a  reason: case insensitive filesystem */
public abstract class C0280a {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
