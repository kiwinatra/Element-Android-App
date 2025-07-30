package J;

import androidx.fragment.app.Fragment;
import w0.i;

public abstract class g extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f124a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Fragment fragment, String str) {
        super(str);
        i.e(fragment, "fragment");
        this.f124a = fragment;
    }

    public final Fragment a() {
        return this.f124a;
    }
}
