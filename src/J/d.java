package J;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import w0.i;

public final class d extends g {

    
    private final ViewGroup f123b;

    
    public d(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        i.e(fragment, "fragment");
        this.f123b = viewGroup;
    }
}
