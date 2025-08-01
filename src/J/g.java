package J;

import androidx.fragment.app.Fragment;
import w0.i;

public abstract class g extends RuntimeException {

    
    private final Fragment f124a;

    
    public g(Fragment fragment, String str) {
        super(str);
        i.e(fragment, "fragment");
        this.f124a = fragment;
    }

    public final Fragment a() {
        return this.f124a;
    }
}
