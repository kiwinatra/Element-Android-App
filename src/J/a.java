package J;

import androidx.fragment.app.Fragment;
import w0.i;

public final class a extends g {

    /* renamed from: b  reason: collision with root package name */
    private final String f105b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        i.e(fragment, "fragment");
        i.e(str, "previousFragmentId");
        this.f105b = str;
    }
}
