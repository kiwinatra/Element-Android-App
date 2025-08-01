package f0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.b;

public abstract class a {

    
    private final TimeInterpolator f5373a;

    
    protected final View f5374b;

    
    protected final int f5375c;

    
    protected final int f5376d;

    
    protected final int f5377e;

    
    private b f5378f;

    public a(View view) {
        this.f5374b = view;
        Context context = view.getContext();
        this.f5373a = h.g(context, T.a.motionEasingStandardDecelerateInterpolator, androidx.core.view.animation.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f5375c = h.f(context, T.a.motionDurationMedium2, 300);
        this.f5376d = h.f(context, T.a.motionDurationShort3, 150);
        this.f5377e = h.f(context, T.a.motionDurationShort2, 100);
    }

    public float a(float f2) {
        return this.f5373a.getInterpolation(f2);
    }

    
    public b b() {
        if (this.f5378f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        b bVar = this.f5378f;
        this.f5378f = null;
        return bVar;
    }

    public b c() {
        b bVar = this.f5378f;
        this.f5378f = null;
        return bVar;
    }

    
    public void d(b bVar) {
        this.f5378f = bVar;
    }

    
    public b e(b bVar) {
        if (this.f5378f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        b bVar2 = this.f5378f;
        this.f5378f = bVar;
        return bVar2;
    }
}
