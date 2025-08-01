package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.W;
import androidx.core.content.res.k;
import androidx.vectordrawable.graphics.drawable.j;
import g.C0238b;
import g.C0241e;
import h.C0242a;
import h.C0244c;
import l.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;


public class C0237a extends C0241e implements androidx.core.graphics.drawable.b {

    
    private c f5395o;

    
    private g f5396p;

    
    private int f5397q;

    
    private int f5398r;

    
    private boolean f5399s;

    
    private static class b extends g {

        
        private final Animatable f5400a;

        b(Animatable animatable) {
            super();
            this.f5400a = animatable;
        }

        public void c() {
            this.f5400a.start();
        }

        public void d() {
            this.f5400a.stop();
        }
    }

    
    static class c extends C0241e.a {

        
        l.d f5401K;

        
        h f5402L;

        c(c cVar, C0237a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h hVar;
            if (cVar != null) {
                this.f5401K = cVar.f5401K;
                hVar = cVar.f5402L;
            } else {
                this.f5401K = new l.d();
                hVar = new h();
            }
            this.f5402L = hVar;
        }

        private static long D(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        
        public int B(int[] iArr, Drawable drawable, int i2) {
            int z2 = super.z(iArr, drawable);
            this.f5402L.i(z2, Integer.valueOf(i2));
            return z2;
        }

        
        public int C(int i2, int i3, Drawable drawable, boolean z2) {
            long j2;
            int a2 = super.a(drawable);
            long D2 = D(i2, i3);
            if (z2) {
                j2 = 8589934592L;
            } else {
                j2 = 0;
            }
            long j3 = (long) a2;
            this.f5401K.a(D2, Long.valueOf(j3 | j2));
            if (z2) {
                this.f5401K.a(D(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a2;
        }

        
        public int E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return ((Integer) this.f5402L.f(i2, 0)).intValue();
        }

        
        public int F(int[] iArr) {
            int A2 = super.A(iArr);
            if (A2 >= 0) {
                return A2;
            }
            return super.A(StateSet.WILD_CARD);
        }

        
        public int G(int i2, int i3) {
            return (int) ((Long) this.f5401K.f(D(i2, i3), -1L)).longValue();
        }

        
        public boolean H(int i2, int i3) {
            if ((((Long) this.f5401K.f(D(i2, i3), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        
        public boolean I(int i2, int i3) {
            if ((((Long) this.f5401K.f(D(i2, i3), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable() {
            return new C0237a(this, (Resources) null);
        }

        
        public void r() {
            this.f5401K = this.f5401K.clone();
            this.f5402L = this.f5402L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C0237a(this, resources);
        }
    }

    
    private static class d extends g {

        
        private final androidx.vectordrawable.graphics.drawable.e f5403a;

        d(androidx.vectordrawable.graphics.drawable.e eVar) {
            super();
            this.f5403a = eVar;
        }

        public void c() {
            this.f5403a.start();
        }

        public void d() {
            this.f5403a.stop();
        }
    }

    
    private static class e extends g {

        
        private final ObjectAnimator f5404a;

        
        private final boolean f5405b;

        e(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i3 = 0;
            if (z2) {
                i2 = numberOfFrames - 1;
            } else {
                i2 = 0;
            }
            i3 = !z2 ? numberOfFrames - 1 : i3;
            f fVar = new f(animationDrawable, z2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i2, i3});
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f5405b = z3;
            this.f5404a = ofInt;
        }

        public boolean a() {
            return this.f5405b;
        }

        public void b() {
            this.f5404a.reverse();
        }

        public void c() {
            this.f5404a.start();
        }

        public void d() {
            this.f5404a.cancel();
        }
    }

    
    private static class f implements TimeInterpolator {

        
        private int[] f5406a;

        
        private int f5407b;

        
        private int f5408c;

        f(AnimationDrawable animationDrawable, boolean z2) {
            b(animationDrawable, z2);
        }

        
        public int a() {
            return this.f5408c;
        }

        
        public int b(AnimationDrawable animationDrawable, boolean z2) {
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f5407b = numberOfFrames;
            int[] iArr = this.f5406a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f5406a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f5406a;
            int i3 = 0;
            for (int i4 = 0; i4 < numberOfFrames; i4++) {
                if (z2) {
                    i2 = (numberOfFrames - i4) - 1;
                } else {
                    i2 = i4;
                }
                int duration = animationDrawable.getDuration(i2);
                iArr2[i4] = duration;
                i3 += duration;
            }
            this.f5408c = i3;
            return i3;
        }

        public float getInterpolation(float f2) {
            float f3;
            int i2 = (int) ((f2 * ((float) this.f5408c)) + 0.5f);
            int i3 = this.f5407b;
            int[] iArr = this.f5406a;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    break;
                }
                i2 -= i5;
                i4++;
            }
            if (i4 < i3) {
                f3 = ((float) i2) / ((float) this.f5408c);
            } else {
                f3 = 0.0f;
            }
            return (((float) i4) / ((float) i3)) + f3;
        }
    }

    public C0237a() {
        this((c) null, (Resources) null);
    }

    public static C0237a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0237a aVar = new C0237a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        p(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray k2 = k.k(resources, theme, attributeSet, C0244c.f5486h);
        int resourceId = k2.getResourceId(C0244c.f5487i, 0);
        int resourceId2 = k2.getResourceId(C0244c.f5488j, -1);
        if (resourceId2 > 0) {
            drawable = W.h().j(context, resourceId2);
        } else {
            drawable = null;
        }
        k2.recycle();
        int[] j2 = j(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = j.c(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C0242a.a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            return this.f5395o.B(j2, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray k2 = k.k(resources, theme, attributeSet, C0244c.f5489k);
        int resourceId = k2.getResourceId(C0244c.f5492n, -1);
        int resourceId2 = k2.getResourceId(C0244c.f5491m, -1);
        int resourceId3 = k2.getResourceId(C0244c.f5490l, -1);
        if (resourceId3 > 0) {
            drawable = W.h().j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z2 = k2.getBoolean(C0244c.f5493o, false);
        k2.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.e.b(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C0242a.a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f5395o.C(resourceId, resourceId2, drawable, z2);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean r(int i2) {
        int i3;
        int G2;
        g gVar;
        g gVar2 = this.f5396p;
        if (gVar2 == null) {
            i3 = c();
        } else if (i2 == this.f5397q) {
            return true;
        } else {
            if (i2 != this.f5398r || !gVar2.a()) {
                i3 = this.f5397q;
                gVar2.d();
            } else {
                gVar2.b();
                this.f5397q = this.f5398r;
                this.f5398r = i2;
                return true;
            }
        }
        this.f5396p = null;
        this.f5398r = -1;
        this.f5397q = -1;
        c cVar = this.f5395o;
        int E2 = cVar.E(i3);
        int E3 = cVar.E(i2);
        if (E3 == 0 || E2 == 0 || (G2 = cVar.G(E2, E3)) < 0) {
            return false;
        }
        boolean I2 = cVar.I(E2, E3);
        g(G2);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E2, E3), I2);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.e) {
            gVar = new d((androidx.vectordrawable.graphics.drawable.e) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.f5396p = gVar;
        this.f5398r = i3;
        this.f5397q = i2;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.f5395o;
        cVar.f5435d |= C0242a.b(typedArray);
        cVar.x(typedArray.getBoolean(C0244c.f5482d, cVar.f5440i));
        cVar.t(typedArray.getBoolean(C0244c.f5483e, cVar.f5443l));
        cVar.u(typedArray.getInt(C0244c.f5484f, cVar.f5423A));
        cVar.v(typedArray.getInt(C0244c.f5485g, cVar.f5424B));
        setDither(typedArray.getBoolean(C0244c.f5480b, cVar.f5455x));
    }

    
    public void h(C0238b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f5395o = (c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f5396p;
        if (gVar != null) {
            gVar.d();
            this.f5396p = null;
            g(this.f5397q);
            this.f5397q = -1;
            this.f5398r = -1;
        }
    }

    
    
    public c b() {
        return new c(this.f5395o, this, (Resources) null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k2 = k.k(resources, theme, attributeSet, C0244c.f5479a);
        setVisible(k2.getBoolean(C0244c.f5481c, true), true);
        s(k2);
        i(resources);
        k2.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    public Drawable mutate() {
        if (!this.f5399s && super.mutate() == this) {
            this.f5395o.r();
            this.f5399s = true;
        }
        return this;
    }

    
    public boolean onStateChange(int[] iArr) {
        boolean z2;
        int F2 = this.f5395o.F(iArr);
        if (F2 == c() || (!r(F2) && !g(F2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z2 | current.setState(iArr);
        }
        return z2;
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        g gVar = this.f5396p;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C0237a(c cVar, Resources resources) {
        super((C0241e.a) null);
        this.f5397q = -1;
        this.f5398r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
