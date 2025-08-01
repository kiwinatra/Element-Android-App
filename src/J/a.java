package J;

import androidx.fragment.app.Fragment;
import w0.i;

public final class a extends g {

    
    private final String f105b;

    
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        i.e(fragment, "fragment");
        i.e(str, "previousFragmentId");
        this.f105b = str;
    }
}
