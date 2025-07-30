package J;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import w0.i;

public final class h extends g {

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f125b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        i.e(fragment, "fragment");
        i.e(viewGroup, "container");
        this.f125b = viewGroup;
    }
}
