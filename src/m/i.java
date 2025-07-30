package m;

import java.util.Arrays;
import java.util.HashSet;

public class i implements Comparable {

    /* renamed from: r  reason: collision with root package name */
    private static int f5868r = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5869a;

    /* renamed from: b  reason: collision with root package name */
    private String f5870b;

    /* renamed from: c  reason: collision with root package name */
    public int f5871c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f5872d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f5873e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f5874f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5875g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f5876h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f5877i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    a f5878j;

    /* renamed from: k  reason: collision with root package name */
    C0257b[] f5879k = new C0257b[16];

    /* renamed from: l  reason: collision with root package name */
    int f5880l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f5881m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f5882n = false;

    /* renamed from: o  reason: collision with root package name */
    int f5883o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f5884p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    HashSet f5885q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f5878j = aVar;
    }

    static void c() {
        f5868r++;
    }

    public final void a(C0257b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f5880l;
            if (i2 >= i3) {
                C0257b[] bVarArr = this.f5879k;
                if (i3 >= bVarArr.length) {
                    this.f5879k = (C0257b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0257b[] bVarArr2 = this.f5879k;
                int i4 = this.f5880l;
                bVarArr2[i4] = bVar;
                this.f5880l = i4 + 1;
                return;
            } else if (this.f5879k[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.f5871c - iVar.f5871c;
    }

    public final void d(C0257b bVar) {
        int i2 = this.f5880l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f5879k[i3] == bVar) {
                while (i3 < i2 - 1) {
                    C0257b[] bVarArr = this.f5879k;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f5880l--;
                return;
            }
            i3++;
        }
    }

    public void e() {
        this.f5870b = null;
        this.f5878j = a.UNKNOWN;
        this.f5873e = 0;
        this.f5871c = -1;
        this.f5872d = -1;
        this.f5874f = 0.0f;
        this.f5875g = false;
        this.f5882n = false;
        this.f5883o = -1;
        this.f5884p = 0.0f;
        int i2 = this.f5880l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5879k[i3] = null;
        }
        this.f5880l = 0;
        this.f5881m = 0;
        this.f5869a = false;
        Arrays.fill(this.f5877i, 0.0f);
    }

    public void f(C0259d dVar, float f2) {
        this.f5874f = f2;
        this.f5875g = true;
        this.f5882n = false;
        this.f5883o = -1;
        this.f5884p = 0.0f;
        int i2 = this.f5880l;
        this.f5872d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5879k[i3].A(dVar, this, false);
        }
        this.f5880l = 0;
    }

    public void g(a aVar, String str) {
        this.f5878j = aVar;
    }

    public final void h(C0259d dVar, C0257b bVar) {
        int i2 = this.f5880l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5879k[i3].B(dVar, bVar, false);
        }
        this.f5880l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f5870b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f5870b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f5871c);
        }
        return sb.toString();
    }
}
