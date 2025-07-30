package D;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.W;
import java.util.Arrays;

public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f31x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f32a;

    /* renamed from: b  reason: collision with root package name */
    private int f33b;

    /* renamed from: c  reason: collision with root package name */
    private int f34c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f35d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f36e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f37f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f38g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f39h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f40i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f41j;

    /* renamed from: k  reason: collision with root package name */
    private int f42k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f43l;

    /* renamed from: m  reason: collision with root package name */
    private float f44m;

    /* renamed from: n  reason: collision with root package name */
    private float f45n;

    /* renamed from: o  reason: collision with root package name */
    private int f46o;

    /* renamed from: p  reason: collision with root package name */
    private final int f47p;

    /* renamed from: q  reason: collision with root package name */
    private int f48q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f49r;

    /* renamed from: s  reason: collision with root package name */
    private final C0004c f50s;

    /* renamed from: t  reason: collision with root package name */
    private View f51t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f52u;

    /* renamed from: v  reason: collision with root package name */
    private final ViewGroup f53v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f54w = new b();

    class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.K(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, C0004c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f53v = viewGroup;
            this.f50s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f47p = i2;
            this.f46o = i2;
            this.f33b = viewConfiguration.getScaledTouchSlop();
            this.f44m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f45n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f49r = new OverScroller(context, f31x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean D(int i2) {
        if (C(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f43l.computeCurrentVelocity(1000, this.f44m);
        p(g(this.f43l.getXVelocity(this.f34c), this.f45n, this.f44m), g(this.f43l.getYVelocity(this.f34c), this.f45n, this.f44m));
    }

    private void H(float f2, float f3, int i2) {
        boolean c2 = c(f2, f3, i2, 1);
        if (c(f3, f2, i2, 4)) {
            c2 |= true;
        }
        if (c(f2, f3, i2, 2)) {
            c2 |= true;
        }
        if (c(f3, f2, i2, 8)) {
            c2 |= true;
        }
        if (c2) {
            int[] iArr = this.f40i;
            iArr[i2] = iArr[i2] | c2;
            this.f50s.f(c2 ? 1 : 0, i2);
        }
    }

    private void I(float f2, float f3, int i2) {
        s(i2);
        float[] fArr = this.f35d;
        this.f37f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f36e;
        this.f38g[i2] = f3;
        fArr2[i2] = f3;
        this.f39h[i2] = y((int) f2, (int) f3);
        this.f42k |= 1 << i2;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (D(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f37f[pointerId] = x2;
                this.f38g[pointerId] = y2;
            }
        }
    }

    private boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f39h[i2] & i3) != i3 || (this.f48q & i3) == 0 || (this.f41j[i2] & i3) == i3 || (this.f40i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f33b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f50s.g(i3)) {
            int[] iArr = this.f41j;
            iArr[i2] = iArr[i2] | i3;
            return false;
        } else if ((this.f40i[i2] & i3) != 0 || abs <= ((float) this.f33b)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(View view, float f2, float f3) {
        boolean z2;
        boolean z3;
        if (view == null) {
            return false;
        }
        if (this.f50s.d(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f50s.e(view) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            int i2 = this.f33b;
            if ((f2 * f2) + (f3 * f3) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z2) {
            if (Math.abs(f2) > ((float) this.f33b)) {
                return true;
            }
            return false;
        } else if (!z3 || Math.abs(f3) <= ((float) this.f33b)) {
            return false;
        } else {
            return true;
        }
    }

    private float g(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs <= f4) {
            return f2;
        }
        if (f2 > 0.0f) {
            return f4;
        }
        return -f4;
    }

    private int h(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs <= i4) {
            return i2;
        }
        if (i2 > 0) {
            return i4;
        }
        return -i4;
    }

    private void i() {
        float[] fArr = this.f35d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f36e, 0.0f);
            Arrays.fill(this.f37f, 0.0f);
            Arrays.fill(this.f38g, 0.0f);
            Arrays.fill(this.f39h, 0);
            Arrays.fill(this.f40i, 0);
            Arrays.fill(this.f41j, 0);
            this.f42k = 0;
        }
    }

    private void j(int i2) {
        if (this.f35d != null && C(i2)) {
            this.f35d[i2] = 0.0f;
            this.f36e[i2] = 0.0f;
            this.f37f[i2] = 0.0f;
            this.f38g[i2] = 0.0f;
            this.f39h[i2] = 0;
            this.f40i[i2] = 0;
            this.f41j[i2] = 0;
            this.f42k = (~(1 << i2)) & this.f42k;
        }
    }

    private int k(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.f53v.getWidth();
        float f2 = (float) (width / 2);
        float q2 = f2 + (q(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(q2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    private int l(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int h2 = h(i4, (int) this.f45n, (int) this.f44m);
        int h3 = h(i5, (int) this.f45n, (int) this.f44m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(h2);
        int abs4 = Math.abs(h3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (h2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i6;
        } else {
            f2 = (float) abs;
            f3 = (float) i7;
        }
        float f6 = f2 / f3;
        if (h3 != 0) {
            f4 = (float) abs4;
            f5 = (float) i6;
        } else {
            f4 = (float) abs2;
            f5 = (float) i7;
        }
        float f7 = f4 / f5;
        return (int) ((((float) k(i2, h2, this.f50s.d(view))) * f6) + (((float) k(i3, h3, this.f50s.e(view))) * f7));
    }

    public static c n(ViewGroup viewGroup, float f2, C0004c cVar) {
        c o2 = o(viewGroup, cVar);
        o2.f33b = (int) (((float) o2.f33b) * (1.0f / f2));
        return o2;
    }

    public static c o(ViewGroup viewGroup, C0004c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f2, float f3) {
        this.f52u = true;
        this.f50s.l(this.f51t, f2, f3);
        this.f52u = false;
        if (this.f32a == 1) {
            K(0);
        }
    }

    private float q(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private void r(int i2, int i3, int i4, int i5) {
        int left = this.f51t.getLeft();
        int top = this.f51t.getTop();
        if (i4 != 0) {
            i2 = this.f50s.a(this.f51t, i2, i4);
            W.a0(this.f51t, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.f50s.b(this.f51t, i3, i5);
            W.b0(this.f51t, i3 - top);
        }
        int i7 = i3;
        if (i4 != 0 || i5 != 0) {
            this.f50s.k(this.f51t, i6, i7, i6 - left, i7 - top);
        }
    }

    private void s(int i2) {
        float[] fArr = this.f35d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f36e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f37f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f38g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f39h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f40i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f41j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f35d = fArr2;
            this.f36e = fArr3;
            this.f37f = fArr4;
            this.f38g = fArr5;
            this.f39h = iArr;
            this.f40i = iArr2;
            this.f41j = iArr3;
        }
    }

    private boolean u(int i2, int i3, int i4, int i5) {
        int left = this.f51t.getLeft();
        int top = this.f51t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f49r.abortAnimation();
            K(0);
            return false;
        }
        this.f49r.startScroll(left, top, i6, i7, l(this.f51t, i6, i7, i4, i5));
        K(2);
        return true;
    }

    private int y(int i2, int i3) {
        int i4;
        if (i2 < this.f53v.getLeft() + this.f46o) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i3 < this.f53v.getTop() + this.f46o) {
            i4 |= 4;
        }
        if (i2 > this.f53v.getRight() - this.f46o) {
            i4 |= 2;
        }
        if (i3 > this.f53v.getBottom() - this.f46o) {
            return i4 | 8;
        }
        return i4;
    }

    public int A() {
        return this.f32a;
    }

    public boolean B(int i2, int i3) {
        return E(this.f51t, i2, i3);
    }

    public boolean C(int i2) {
        if (((1 << i2) & this.f42k) != 0) {
            return true;
        }
        return false;
    }

    public boolean E(View view, int i2, int i3) {
        if (view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void F(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f43l == null) {
            this.f43l = VelocityTracker.obtain();
        }
        this.f43l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f32a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (D(pointerId)) {
                                float x2 = motionEvent.getX(i3);
                                float y2 = motionEvent.getY(i3);
                                float f2 = x2 - this.f35d[pointerId];
                                float f3 = y2 - this.f36e[pointerId];
                                H(f2, f3, pointerId);
                                if (this.f32a != 1) {
                                    View t2 = t((int) x2, (int) y2);
                                    if (f(t2, f2, f3) && R(t2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (D(this.f34c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34c);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f37f;
                        int i4 = this.f34c;
                        int i5 = (int) (x3 - fArr[i4]);
                        int i6 = (int) (y3 - this.f38g[i4]);
                        r(this.f51t.getLeft() + i5, this.f51t.getTop() + i6, i5, i6);
                    } else {
                        return;
                    }
                    J(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x4 = motionEvent.getX(actionIndex);
                        float y4 = motionEvent.getY(actionIndex);
                        I(x4, y4, pointerId2);
                        if (this.f32a == 0) {
                            R(t((int) x4, (int) y4), pointerId2);
                            int i7 = this.f39h[pointerId2];
                            int i8 = this.f48q;
                            if ((i7 & i8) != 0) {
                                this.f50s.h(i7 & i8, pointerId2);
                                return;
                            }
                            return;
                        } else if (B((int) x4, (int) y4)) {
                            R(this.f51t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f32a == 1 && pointerId3 == this.f34c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.f34c) {
                                    View t3 = t((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.f51t;
                                    if (t3 == view && R(view, pointerId4)) {
                                        i2 = this.f34c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                G();
                            }
                        }
                        j(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f32a == 1) {
                    p(0.0f, 0.0f);
                }
            } else if (this.f32a == 1) {
                G();
            }
            a();
            return;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View t4 = t((int) x5, (int) y5);
        I(x5, y5, pointerId5);
        R(t4, pointerId5);
        int i9 = this.f39h[pointerId5];
        int i10 = this.f48q;
        if ((i9 & i10) != 0) {
            this.f50s.h(i9 & i10, pointerId5);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(int i2) {
        this.f53v.removeCallbacks(this.f54w);
        if (this.f32a != i2) {
            this.f32a = i2;
            this.f50s.j(i2);
            if (this.f32a == 0) {
                this.f51t = null;
            }
        }
    }

    public void L(int i2) {
        this.f46o = i2;
    }

    public void M(int i2) {
        this.f48q = i2;
    }

    public void N(float f2) {
        this.f45n = f2;
    }

    public boolean O(int i2, int i3) {
        if (this.f52u) {
            return u(i2, i3, (int) this.f43l.getXVelocity(this.f34c), (int) this.f43l.getYVelocity(this.f34c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f43l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f43l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f43l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.I(r7, r1, r2)
            int r3 = r0.f32a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f39h
            r1 = r1[r2]
            int r3 = r0.f48q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            D.c$c r4 = r0.f50s
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.t(r3, r1)
            android.view.View r3 = r0.f51t
            if (r1 != r3) goto L_0x0031
            r0.R(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f35d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f36e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f35d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f36e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.t(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            D.c$c r14 = r0.f50s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            D.c$c r5 = r0.f50s
            int r5 = r5.b(r7, r15, r14)
            D.c$c r14 = r0.f50s
            int r14 = r14.d(r7)
            D.c$c r15 = r0.f50s
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.H(r9, r10, r4)
            int r5 = r0.f32a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.R(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.t(r2, r3)
            android.view.View r3 = r0.f51t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f32a
            if (r3 != r4) goto L_0x0125
            r0.R(r2, r1)
        L_0x0125:
            int[] r2 = r0.f39h
            r2 = r2[r1]
            int r3 = r0.f48q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            D.c$c r4 = r0.f50s
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f32a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i2, int i3) {
        this.f51t = view;
        this.f34c = -1;
        boolean u2 = u(i2, i3, 0, 0);
        if (!u2 && this.f32a == 0 && this.f51t != null) {
            this.f51t = null;
        }
        return u2;
    }

    /* access modifiers changed from: package-private */
    public boolean R(View view, int i2) {
        if (view == this.f51t && this.f34c == i2) {
            return true;
        }
        if (view == null || !this.f50s.m(view, i2)) {
            return false;
        }
        this.f34c = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.f34c = -1;
        i();
        VelocityTracker velocityTracker = this.f43l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f43l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.f53v) {
            this.f51t = view;
            this.f34c = i2;
            this.f50s.i(view, i2);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f53v + ")");
    }

    public boolean d(int i2) {
        int length = this.f35d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (e(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i2, int i3) {
        boolean z2;
        boolean z3;
        if (!C(i3)) {
            return false;
        }
        if ((i2 & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 2) == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f2 = this.f37f[i3] - this.f35d[i3];
        float f3 = this.f38g[i3] - this.f36e[i3];
        if (z2 && z3) {
            int i4 = this.f33b;
            if ((f2 * f2) + (f3 * f3) > ((float) (i4 * i4))) {
                return true;
            }
            return false;
        } else if (z2) {
            if (Math.abs(f2) > ((float) this.f33b)) {
                return true;
            }
            return false;
        } else if (!z3 || Math.abs(f3) <= ((float) this.f33b)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean m(boolean z2) {
        if (this.f32a == 2) {
            boolean computeScrollOffset = this.f49r.computeScrollOffset();
            int currX = this.f49r.getCurrX();
            int currY = this.f49r.getCurrY();
            int left = currX - this.f51t.getLeft();
            int top = currY - this.f51t.getTop();
            if (left != 0) {
                W.a0(this.f51t, left);
            }
            if (top != 0) {
                W.b0(this.f51t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f50s.k(this.f51t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f49r.getFinalX() && currY == this.f49r.getFinalY()) {
                this.f49r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.f53v.post(this.f54w);
                } else {
                    K(0);
                }
            }
        }
        if (this.f32a == 2) {
            return true;
        }
        return false;
    }

    public View t(int i2, int i3) {
        for (int childCount = this.f53v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f53v.getChildAt(this.f50s.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f51t;
    }

    public int w() {
        return this.f47p;
    }

    public int x() {
        return this.f46o;
    }

    public int z() {
        return this.f33b;
    }

    /* renamed from: D.c$c  reason: collision with other inner class name */
    public static abstract class C0004c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i2) {
            return false;
        }

        public abstract void j(int i2);

        public abstract void k(View view, int i2, int i3, int i4, int i5);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i2);

        public int c(int i2) {
            return i2;
        }

        public void f(int i2, int i3) {
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }
    }
}
