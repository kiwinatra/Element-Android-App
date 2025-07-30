package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: g.b  reason: case insensitive filesystem */
public abstract class C0238b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f5409a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f5410b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f5411c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f5412d;

    /* renamed from: e  reason: collision with root package name */
    private int f5413e = 255;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5414f;

    /* renamed from: g  reason: collision with root package name */
    private int f5415g = -1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5416h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f5417i;

    /* renamed from: j  reason: collision with root package name */
    private long f5418j;

    /* renamed from: k  reason: collision with root package name */
    private long f5419k;

    /* renamed from: l  reason: collision with root package name */
    private c f5420l;

    /* renamed from: g.b$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0238b.this.a(true);
            C0238b.this.invalidateSelf();
        }
    }

    /* renamed from: g.b$b  reason: collision with other inner class name */
    private static class C0073b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: g.b$d */
    static abstract class d extends Drawable.ConstantState {

        /* renamed from: A  reason: collision with root package name */
        int f5423A = 0;

        /* renamed from: B  reason: collision with root package name */
        int f5424B = 0;

        /* renamed from: C  reason: collision with root package name */
        boolean f5425C;

        /* renamed from: D  reason: collision with root package name */
        ColorFilter f5426D;

        /* renamed from: E  reason: collision with root package name */
        boolean f5427E;

        /* renamed from: F  reason: collision with root package name */
        ColorStateList f5428F;

        /* renamed from: G  reason: collision with root package name */
        PorterDuff.Mode f5429G;

        /* renamed from: H  reason: collision with root package name */
        boolean f5430H;

        /* renamed from: I  reason: collision with root package name */
        boolean f5431I;

        /* renamed from: a  reason: collision with root package name */
        final C0238b f5432a;

        /* renamed from: b  reason: collision with root package name */
        Resources f5433b;

        /* renamed from: c  reason: collision with root package name */
        int f5434c;

        /* renamed from: d  reason: collision with root package name */
        int f5435d;

        /* renamed from: e  reason: collision with root package name */
        int f5436e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray f5437f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f5438g;

        /* renamed from: h  reason: collision with root package name */
        int f5439h;

        /* renamed from: i  reason: collision with root package name */
        boolean f5440i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f5441j;

        /* renamed from: k  reason: collision with root package name */
        Rect f5442k;

        /* renamed from: l  reason: collision with root package name */
        boolean f5443l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f5444m;

        /* renamed from: n  reason: collision with root package name */
        int f5445n;

        /* renamed from: o  reason: collision with root package name */
        int f5446o;

        /* renamed from: p  reason: collision with root package name */
        int f5447p;

        /* renamed from: q  reason: collision with root package name */
        int f5448q;

        /* renamed from: r  reason: collision with root package name */
        boolean f5449r;

        /* renamed from: s  reason: collision with root package name */
        int f5450s;

        /* renamed from: t  reason: collision with root package name */
        boolean f5451t;

        /* renamed from: u  reason: collision with root package name */
        boolean f5452u;

        /* renamed from: v  reason: collision with root package name */
        boolean f5453v;

        /* renamed from: w  reason: collision with root package name */
        boolean f5454w;

        /* renamed from: x  reason: collision with root package name */
        boolean f5455x = true;

        /* renamed from: y  reason: collision with root package name */
        boolean f5456y;

        /* renamed from: z  reason: collision with root package name */
        int f5457z;

        d(d dVar, C0238b bVar, Resources resources) {
            Resources resources2;
            int i2;
            SparseArray sparseArray;
            this.f5432a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f5433b;
            } else {
                resources2 = null;
            }
            this.f5433b = resources2;
            if (dVar != null) {
                i2 = dVar.f5434c;
            } else {
                i2 = 0;
            }
            int f2 = C0238b.f(resources, i2);
            this.f5434c = f2;
            if (dVar != null) {
                this.f5435d = dVar.f5435d;
                this.f5436e = dVar.f5436e;
                this.f5453v = true;
                this.f5454w = true;
                this.f5440i = dVar.f5440i;
                this.f5443l = dVar.f5443l;
                this.f5455x = dVar.f5455x;
                this.f5456y = dVar.f5456y;
                this.f5457z = dVar.f5457z;
                this.f5423A = dVar.f5423A;
                this.f5424B = dVar.f5424B;
                this.f5425C = dVar.f5425C;
                this.f5426D = dVar.f5426D;
                this.f5427E = dVar.f5427E;
                this.f5428F = dVar.f5428F;
                this.f5429G = dVar.f5429G;
                this.f5430H = dVar.f5430H;
                this.f5431I = dVar.f5431I;
                if (dVar.f5434c == f2) {
                    if (dVar.f5441j) {
                        this.f5442k = dVar.f5442k != null ? new Rect(dVar.f5442k) : rect;
                        this.f5441j = true;
                    }
                    if (dVar.f5444m) {
                        this.f5445n = dVar.f5445n;
                        this.f5446o = dVar.f5446o;
                        this.f5447p = dVar.f5447p;
                        this.f5448q = dVar.f5448q;
                        this.f5444m = true;
                    }
                }
                if (dVar.f5449r) {
                    this.f5450s = dVar.f5450s;
                    this.f5449r = true;
                }
                if (dVar.f5451t) {
                    this.f5452u = dVar.f5452u;
                    this.f5451t = true;
                }
                Drawable[] drawableArr = dVar.f5438g;
                this.f5438g = new Drawable[drawableArr.length];
                this.f5439h = dVar.f5439h;
                SparseArray sparseArray2 = dVar.f5437f;
                if (sparseArray2 != null) {
                    sparseArray = sparseArray2.clone();
                } else {
                    sparseArray = new SparseArray(this.f5439h);
                }
                this.f5437f = sparseArray;
                int i3 = this.f5439h;
                for (int i4 = 0; i4 < i3; i4++) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f5437f.put(i4, constantState);
                        } else {
                            this.f5438g[i4] = drawableArr[i4];
                        }
                    }
                }
                return;
            }
            this.f5438g = new Drawable[10];
            this.f5439h = 0;
        }

        private void e() {
            SparseArray sparseArray = this.f5437f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f5438g[this.f5437f.keyAt(i2)] = s(((Drawable.ConstantState) this.f5437f.valueAt(i2)).newDrawable(this.f5433b));
                }
                this.f5437f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f5457z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f5432a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f5439h;
            if (i2 >= this.f5438g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f5432a);
            this.f5438g[i2] = drawable;
            this.f5439h++;
            this.f5436e = drawable.getChangingConfigurations() | this.f5436e;
            p();
            this.f5442k = null;
            this.f5441j = false;
            this.f5444m = false;
            this.f5453v = false;
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f5439h;
                Drawable[] drawableArr = this.f5438g;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i3], theme);
                        this.f5436e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(C0073b.c(theme));
            }
        }

        public boolean c() {
            if (this.f5453v) {
                return this.f5454w;
            }
            e();
            this.f5453v = true;
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f5454w = false;
                    return false;
                }
            }
            this.f5454w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f5437f.get(i3);
                    if (constantState != null && C0073b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f5444m = true;
            e();
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            this.f5446o = -1;
            this.f5445n = -1;
            this.f5448q = 0;
            this.f5447p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f5445n) {
                    this.f5445n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f5446o) {
                    this.f5446o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f5447p) {
                    this.f5447p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f5448q) {
                    this.f5448q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f5438g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f5438g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f5437f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable s2 = s(((Drawable.ConstantState) this.f5437f.valueAt(indexOfKey)).newDrawable(this.f5433b));
            this.f5438g[i2] = s2;
            this.f5437f.removeAt(indexOfKey);
            if (this.f5437f.size() == 0) {
                this.f5437f = null;
            }
            return s2;
        }

        public int getChangingConfigurations() {
            return this.f5435d | this.f5436e;
        }

        public final int h() {
            return this.f5439h;
        }

        public final int i() {
            if (!this.f5444m) {
                d();
            }
            return this.f5446o;
        }

        public final int j() {
            if (!this.f5444m) {
                d();
            }
            return this.f5448q;
        }

        public final int k() {
            if (!this.f5444m) {
                d();
            }
            return this.f5447p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f5440i) {
                return null;
            }
            Rect rect2 = this.f5442k;
            if (rect2 != null || this.f5441j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f5441j = true;
            this.f5442k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f5444m) {
                d();
            }
            return this.f5445n;
        }

        public final int n() {
            int i2;
            if (this.f5449r) {
                return this.f5450s;
            }
            e();
            int i3 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            if (i3 > 0) {
                i2 = drawableArr[0].getOpacity();
            } else {
                i2 = -2;
            }
            for (int i4 = 1; i4 < i3; i4++) {
                i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
            }
            this.f5450s = i2;
            this.f5449r = true;
            return i2;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f5438g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f5438g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f5449r = false;
            this.f5451t = false;
        }

        public final boolean q() {
            return this.f5443l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z2) {
            this.f5443l = z2;
        }

        public final void u(int i2) {
            this.f5423A = i2;
        }

        public final void v(int i2) {
            this.f5424B = i2;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i2, int i3) {
            boolean z2;
            int i4 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            boolean z3 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z2 = androidx.core.graphics.drawable.a.m(drawable, i2);
                    } else {
                        z2 = false;
                    }
                    if (i5 == i3) {
                        z3 = z2;
                    }
                }
            }
            this.f5457z = i2;
            return z3;
        }

        public final void x(boolean z2) {
            this.f5440i = z2;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.f5433b = resources;
                int f2 = C0238b.f(resources, this.f5434c);
                int i2 = this.f5434c;
                this.f5434c = f2;
                if (i2 != f2) {
                    this.f5444m = false;
                    this.f5441j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f5420l == null) {
            this.f5420l = new c();
        }
        drawable.setCallback(this.f5420l.b(drawable.getCallback()));
        try {
            if (this.f5409a.f5423A <= 0 && this.f5414f) {
                drawable.setAlpha(this.f5413e);
            }
            d dVar = this.f5409a;
            if (dVar.f5427E) {
                drawable.setColorFilter(dVar.f5426D);
            } else {
                if (dVar.f5430H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.f5428F);
                }
                d dVar2 = this.f5409a;
                if (dVar2.f5431I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.f5429G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f5409a.f5455x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f5409a.f5425C);
            Rect rect = this.f5410b;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f5420l.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f5420l.a());
            throw th;
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f5414f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f5411c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x001f
            long r9 = r13.f5418j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f5413e
            r3.setAlpha(r9)
        L_0x001f:
            r13.f5418j = r6
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.b$d r9 = r13.f5409a
            int r9 = r9.f5423A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f5413e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f5412d
            if (r9 == 0) goto L_0x004d
            long r10 = r13.f5419k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f5412d = r0
        L_0x004d:
            r13.f5419k = r6
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$d r4 = r13.f5409a
            int r4 = r4.f5424B
            int r3 = r3 / r4
            int r4 = r13.f5413e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f5417i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0238b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f5409a.b(theme);
    }

    /* access modifiers changed from: package-private */
    public abstract d b();

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f5415g;
    }

    public boolean canApplyTheme() {
        return this.f5409a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f5412d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f5415g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$d r0 = r9.f5409a
            int r0 = r0.f5424B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f5412d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f5411c
            if (r0 == 0) goto L_0x0029
            r9.f5412d = r0
            g.b$d r0 = r9.f5409a
            int r0 = r0.f5424B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f5419k = r0
            goto L_0x0035
        L_0x0029:
            r9.f5412d = r4
            r9.f5419k = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f5411c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            g.b$d r0 = r9.f5409a
            int r1 = r0.f5439h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f5411c = r0
            r9.f5415g = r10
            if (r0 == 0) goto L_0x005a
            g.b$d r10 = r9.f5409a
            int r10 = r10.f5423A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f5418j = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f5411c = r4
            r10 = -1
            r9.f5415g = r10
        L_0x005a:
            long r0 = r9.f5418j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f5419k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f5417i
            if (r0 != 0) goto L_0x0073
            g.b$a r0 = new g.b$a
            r0.<init>()
            r9.f5417i = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0238b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f5413e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f5409a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f5409a.c()) {
            return null;
        }
        this.f5409a.f5435d = getChangingConfigurations();
        return this.f5409a;
    }

    public Drawable getCurrent() {
        return this.f5411c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f5410b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f5409a.q()) {
            return this.f5409a.i();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f5409a.q()) {
            return this.f5409a.m();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f5409a.q()) {
            return this.f5409a.j();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f5409a.q()) {
            return this.f5409a.k();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f5411c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f5409a.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            C0073b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z2;
        Rect l2 = this.f5409a.l();
        if (l2 != null) {
            rect.set(l2);
            if ((l2.right | l2.left | l2.top | l2.bottom) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                z2 = drawable.getPadding(rect);
            } else {
                z2 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f5409a = dVar;
        int i2 = this.f5415g;
        if (i2 >= 0) {
            Drawable g2 = dVar.g(i2);
            this.f5411c = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f5412d = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f5409a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f5409a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f5411c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f5409a.f5425C;
    }

    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f5412d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f5412d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f5414f) {
                this.f5411c.setAlpha(this.f5413e);
            }
        }
        if (this.f5419k != 0) {
            this.f5419k = 0;
            z2 = true;
        }
        if (this.f5418j != 0) {
            this.f5418j = 0;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f5416h && super.mutate() == this) {
            d b2 = b();
            b2.r();
            h(b2);
            this.f5416h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5412d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f5409a.w(i2, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f5412d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f5411c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f5414f || this.f5413e != i2) {
            this.f5414f = true;
            this.f5413e = i2;
            Drawable drawable = this.f5411c;
            if (drawable == null) {
                return;
            }
            if (this.f5418j == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z2) {
        d dVar = this.f5409a;
        if (dVar.f5425C != z2) {
            dVar.f5425C = z2;
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z2);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f5409a;
        dVar.f5427E = true;
        if (dVar.f5426D != colorFilter) {
            dVar.f5426D = colorFilter;
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z2) {
        d dVar = this.f5409a;
        if (dVar.f5455x != z2) {
            dVar.f5455x = z2;
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f5410b;
        if (rect == null) {
            this.f5410b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i2, i3, i4, i5);
        }
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f5409a;
        dVar.f5430H = true;
        if (dVar.f5428F != colorStateList) {
            dVar.f5428F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f5411c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f5409a;
        dVar.f5431I = true;
        if (dVar.f5429G != mode) {
            dVar.f5429G = mode;
            androidx.core.graphics.drawable.a.p(this.f5411c, mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f5412d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f5411c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: g.b$c */
    static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f5422a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f5422a;
            this.f5422a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f5422a = callback;
            return this;
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f5422a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f5422a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
