package J;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import w0.i;

public final class h extends g {

    
    private final ViewGroup f125b;

    
    public h(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        i.e(fragment, "fragment");
        i.e(viewGroup, "container");
        this.f125b = viewGroup;
    }
}
