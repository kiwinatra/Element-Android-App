package J;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import w0.i;

public final class d extends g {

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f123b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        i.e(fragment, "fragment");
        this.f123b = viewGroup;
    }
}
