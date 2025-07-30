package D;

import D.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0121a;
import androidx.core.view.W;
import java.util.ArrayList;
import java.util.List;
import l.h;
import y.I;
import y.J;
import y.K;

public abstract class a extends C0121a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f13n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f14o = new C0002a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.C0003b f15p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f16d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f17e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f18f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f19g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f20h;

    /* renamed from: i  reason: collision with root package name */
    private final View f21i;

    /* renamed from: j  reason: collision with root package name */
    private c f22j;

    /* renamed from: k  reason: collision with root package name */
    int f23k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    int f24l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private int f25m = Integer.MIN_VALUE;

    /* renamed from: D.a$a  reason: collision with other inner class name */
    class C0002a implements b.a {
        C0002a() {
        }

        /* renamed from: b */
        public void a(I i2, Rect rect) {
            i2.m(rect);
        }
    }

    class b implements b.C0003b {
        b() {
        }

        /* renamed from: c */
        public I b(h hVar, int i2) {
            return (I) hVar.k(i2);
        }

        /* renamed from: d */
        public int a(h hVar) {
            return hVar.j();
        }
    }

    private class c extends J {
        c() {
        }

        public I b(int i2) {
            return I.b0(a.this.H(i2));
        }

        public I d(int i2) {
            int i3;
            if (i2 == 2) {
                i3 = a.this.f23k;
            } else {
                i3 = a.this.f24l;
            }
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i3);
        }

        public boolean f(int i2, int i3, Bundle bundle) {
            return a.this.P(i2, i3, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f21i = view;
            this.f20h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (W.A(view) == 0) {
                W.y0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean E(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f21i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f21i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D.a.E(android.graphics.Rect):boolean");
    }

    private static int F(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 == 21) {
            return 17;
        }
        if (i2 != 22) {
            return 130;
        }
        return 66;
    }

    private boolean G(int i2, Rect rect) {
        I i3;
        boolean z2;
        Object d2;
        h y2 = y();
        int i4 = this.f24l;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            i3 = null;
        } else {
            i3 = (I) y2.e(i4);
        }
        I i6 = i3;
        if (i2 == 1 || i2 == 2) {
            if (W.C(this.f21i) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            d2 = b.d(y2, f15p, f14o, i6, i2, z2, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i7 = this.f24l;
            if (i7 != Integer.MIN_VALUE) {
                z(i7, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f21i, i2, rect2);
            }
            d2 = b.c(y2, f15p, f14o, i6, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        I i8 = (I) d2;
        if (i8 != null) {
            i5 = y2.h(y2.g(i8));
        }
        return T(i5);
    }

    private boolean Q(int i2, int i3, Bundle bundle) {
        if (i3 == 1) {
            return T(i2);
        }
        if (i3 == 2) {
            return o(i2);
        }
        if (i3 == 64) {
            return S(i2);
        }
        if (i3 != 128) {
            return J(i2, i3, bundle);
        }
        return n(i2);
    }

    private boolean R(int i2, Bundle bundle) {
        return W.f0(this.f21i, i2, bundle);
    }

    private boolean S(int i2) {
        int i3;
        if (!this.f20h.isEnabled() || !this.f20h.isTouchExplorationEnabled() || (i3 = this.f23k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.f23k = i2;
        this.f21i.invalidate();
        U(i2, 32768);
        return true;
    }

    private void V(int i2) {
        int i3 = this.f25m;
        if (i3 != i2) {
            this.f25m = i2;
            U(i2, 128);
            U(i3, 256);
        }
    }

    private boolean n(int i2) {
        if (this.f23k != i2) {
            return false;
        }
        this.f23k = Integer.MIN_VALUE;
        this.f21i.invalidate();
        U(i2, 65536);
        return true;
    }

    private boolean p() {
        int i2 = this.f24l;
        if (i2 == Integer.MIN_VALUE || !J(i2, 16, (Bundle) null)) {
            return false;
        }
        return true;
    }

    private AccessibilityEvent q(int i2, int i3) {
        if (i2 != -1) {
            return r(i2, i3);
        }
        return s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        I H2 = H(i2);
        obtain.getText().add(H2.B());
        obtain.setContentDescription(H2.t());
        obtain.setScrollable(H2.U());
        obtain.setPassword(H2.T());
        obtain.setEnabled(H2.N());
        obtain.setChecked(H2.K());
        L(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H2.q());
            K.c(obtain, this.f21i, i2);
            obtain.setPackageName(this.f21i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.f21i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private I t(int i2) {
        I Z2 = I.Z();
        Z2.r0(true);
        Z2.t0(true);
        Z2.m0("android.view.View");
        Rect rect = f13n;
        Z2.i0(rect);
        Z2.j0(rect);
        Z2.B0(this.f21i);
        N(i2, Z2);
        if (Z2.B() == null && Z2.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Z2.m(this.f17e);
        if (!this.f17e.equals(rect)) {
            int k2 = Z2.k();
            if ((k2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k2 & 128) == 0) {
                Z2.z0(this.f21i.getContext().getPackageName());
                Z2.I0(this.f21i, i2);
                if (this.f23k == i2) {
                    Z2.g0(true);
                    Z2.a(128);
                } else {
                    Z2.g0(false);
                    Z2.a(64);
                }
                boolean z2 = this.f24l == i2;
                if (z2) {
                    Z2.a(2);
                } else if (Z2.O()) {
                    Z2.a(1);
                }
                Z2.u0(z2);
                this.f21i.getLocationOnScreen(this.f19g);
                Z2.n(this.f16d);
                if (this.f16d.equals(rect)) {
                    Z2.m(this.f16d);
                    if (Z2.f6338b != -1) {
                        I Z3 = I.Z();
                        for (int i3 = Z2.f6338b; i3 != -1; i3 = Z3.f6338b) {
                            Z3.C0(this.f21i, -1);
                            Z3.i0(f13n);
                            N(i3, Z3);
                            Z3.m(this.f17e);
                            Rect rect2 = this.f16d;
                            Rect rect3 = this.f17e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        Z3.d0();
                    }
                    this.f16d.offset(this.f19g[0] - this.f21i.getScrollX(), this.f19g[1] - this.f21i.getScrollY());
                }
                if (this.f21i.getLocalVisibleRect(this.f18f)) {
                    this.f18f.offset(this.f19g[0] - this.f21i.getScrollX(), this.f19g[1] - this.f21i.getScrollY());
                    if (this.f16d.intersect(this.f18f)) {
                        Z2.j0(this.f16d);
                        if (E(this.f16d)) {
                            Z2.M0(true);
                        }
                    }
                }
                return Z2;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private I u() {
        I a02 = I.a0(this.f21i);
        W.d0(this.f21i, a02);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (a02.p() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                a02.d(this.f21i, ((Integer) arrayList.get(i2)).intValue());
            }
            return a02;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hVar.i(((Integer) arrayList.get(i2)).intValue(), t(((Integer) arrayList.get(i2)).intValue()));
        }
        return hVar;
    }

    private void z(int i2, Rect rect) {
        H(i2).m(rect);
    }

    public final int A() {
        return this.f24l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract void C(List list);

    /* access modifiers changed from: package-private */
    public I H(int i2) {
        if (i2 == -1) {
            return u();
        }
        return t(i2);
    }

    public final void I(boolean z2, int i2, Rect rect) {
        int i3 = this.f24l;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z2) {
            G(i2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i2, int i3, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void M(I i2);

    /* access modifiers changed from: protected */
    public abstract void N(int i2, I i3);

    /* access modifiers changed from: protected */
    public abstract void O(int i2, boolean z2);

    /* access modifiers changed from: package-private */
    public boolean P(int i2, int i3, Bundle bundle) {
        if (i2 != -1) {
            return Q(i2, i3, bundle);
        }
        return R(i3, bundle);
    }

    public final boolean T(int i2) {
        int i3;
        if ((!this.f21i.isFocused() && !this.f21i.requestFocus()) || (i3 = this.f24l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f24l = i2;
        O(i2, true);
        U(i2, 8);
        return true;
    }

    public final boolean U(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f20h.isEnabled() || (parent = this.f21i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f21i, q(i2, i3));
    }

    public J b(View view) {
        if (this.f22j == null) {
            this.f22j = new c();
        }
        return this.f22j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, I i2) {
        super.g(view, i2);
        M(i2);
    }

    public final boolean o(int i2) {
        if (this.f24l != i2) {
            return false;
        }
        this.f24l = Integer.MIN_VALUE;
        O(i2, false);
        U(i2, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f20h.isEnabled() || !this.f20h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B2 = B(motionEvent.getX(), motionEvent.getY());
            V(B2);
            if (B2 != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f25m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F2 = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z2 = false;
                        while (i2 < repeatCount && G(F2, (Rect) null)) {
                            i2++;
                            z2 = true;
                        }
                        return z2;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f23k;
    }

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i2, AccessibilityEvent accessibilityEvent) {
    }
}
