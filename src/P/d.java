package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m.C0258c;
import m.i;
import q.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private HashSet f5960a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f5961b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5962c;

    /* renamed from: d  reason: collision with root package name */
    public final e f5963d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5964e;

    /* renamed from: f  reason: collision with root package name */
    public d f5965f;

    /* renamed from: g  reason: collision with root package name */
    public int f5966g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f5967h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    i f5968i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5969a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p.d$b[] r0 = p.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5969a = r0
                p.d$b r1 = p.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.d$b r1 = p.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.d$b r1 = p.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p.d$b r1 = p.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x003e }
                p.d$b r1 = p.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p.d$b r1 = p.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x0054 }
                p.d$b r1 = p.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x0060 }
                p.d$b r1 = p.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5969a     // Catch:{ NoSuchFieldError -> 0x006c }
                p.d$b r1 = p.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f5963d = eVar;
        this.f5964e = bVar;
    }

    public boolean a(d dVar, int i2) {
        return b(dVar, i2, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i2, int i3, boolean z2) {
        if (dVar == null) {
            q();
            return true;
        } else if (!z2 && !p(dVar)) {
            return false;
        } else {
            this.f5965f = dVar;
            if (dVar.f5960a == null) {
                dVar.f5960a = new HashSet();
            }
            HashSet hashSet = this.f5965f.f5960a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f5966g = i2;
            this.f5967h = i3;
            return true;
        }
    }

    public void c(int i2, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f5960a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                q.i.a(((d) it.next()).f5963d, i2, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f5960a;
    }

    public int e() {
        if (!this.f5962c) {
            return 0;
        }
        return this.f5961b;
    }

    public int f() {
        d dVar;
        if (this.f5963d.V() == 8) {
            return 0;
        }
        if (this.f5967h == Integer.MIN_VALUE || (dVar = this.f5965f) == null || dVar.f5963d.V() != 8) {
            return this.f5966g;
        }
        return this.f5967h;
    }

    public final d g() {
        switch (a.f5969a[this.f5964e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f5963d.f5999Q;
            case 3:
                return this.f5963d.f5997O;
            case 4:
                return this.f5963d.f6000R;
            case 5:
                return this.f5963d.f5998P;
            default:
                throw new AssertionError(this.f5964e.name());
        }
    }

    public e h() {
        return this.f5963d;
    }

    public i i() {
        return this.f5968i;
    }

    public d j() {
        return this.f5965f;
    }

    public b k() {
        return this.f5964e;
    }

    public boolean l() {
        HashSet hashSet = this.f5960a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f5960a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f5962c;
    }

    public boolean o() {
        if (this.f5965f != null) {
            return true;
        }
        return false;
    }

    public boolean p(d dVar) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (dVar == null) {
            return false;
        }
        b k2 = dVar.k();
        b bVar = this.f5964e;
        if (k2 != bVar) {
            switch (a.f5969a[bVar.ordinal()]) {
                case 1:
                    if (k2 == b.BASELINE || k2 == b.CENTER_X || k2 == b.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (k2 == b.LEFT || k2 == b.RIGHT) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(dVar.h() instanceof h)) {
                        return z2;
                    }
                    if (z2 || k2 == b.CENTER_X) {
                        z4 = true;
                    }
                    return z4;
                case 4:
                case 5:
                    if (k2 == b.TOP || k2 == b.BOTTOM) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(dVar.h() instanceof h)) {
                        return z3;
                    }
                    if (z3 || k2 == b.CENTER_Y) {
                        z4 = true;
                    }
                    return z4;
                case 6:
                    if (k2 == b.LEFT || k2 == b.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f5964e.name());
            }
        } else if (bVar != b.BASELINE || (dVar.h().Z() && h().Z())) {
            return true;
        } else {
            return false;
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f5965f;
        if (!(dVar == null || (hashSet = dVar.f5960a) == null)) {
            hashSet.remove(this);
            if (this.f5965f.f5960a.size() == 0) {
                this.f5965f.f5960a = null;
            }
        }
        this.f5960a = null;
        this.f5965f = null;
        this.f5966g = 0;
        this.f5967h = Integer.MIN_VALUE;
        this.f5962c = false;
        this.f5961b = 0;
    }

    public void r() {
        this.f5962c = false;
        this.f5961b = 0;
    }

    public void s(C0258c cVar) {
        i iVar = this.f5968i;
        if (iVar == null) {
            this.f5968i = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.e();
        }
    }

    public void t(int i2) {
        this.f5961b = i2;
        this.f5962c = true;
    }

    public String toString() {
        return this.f5963d.t() + ":" + this.f5964e.toString();
    }

    public void u(int i2) {
        if (o()) {
            this.f5967h = i2;
        }
    }
}
