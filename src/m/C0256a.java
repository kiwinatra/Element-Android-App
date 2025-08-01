package m;

import java.util.Arrays;
import m.C0257b;


public class C0256a implements C0257b.a {

    
    private static float f5808l = 0.001f;

    
    int f5809a = 0;

    
    private final C0257b f5810b;

    
    protected final C0258c f5811c;

    
    private int f5812d = 8;

    
    private i f5813e = null;

    
    private int[] f5814f = new int[8];

    
    private int[] f5815g = new int[8];

    
    private float[] f5816h = new float[8];

    
    private int f5817i = -1;

    
    private int f5818j = -1;

    
    private boolean f5819k = false;

    C0256a(C0257b bVar, C0258c cVar) {
        this.f5810b = bVar;
        this.f5811c = cVar;
    }

    public float a(int i2) {
        int i3 = this.f5817i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f5809a) {
            if (i4 == i2) {
                return this.f5816h[i3];
            }
            i3 = this.f5815g[i3];
            i4++;
        }
        return 0.0f;
    }

    public final void b(i iVar, float f2) {
        if (f2 == 0.0f) {
            i(iVar, true);
            return;
        }
        int i2 = this.f5817i;
        if (i2 == -1) {
            this.f5817i = 0;
            this.f5816h[0] = f2;
            this.f5814f[0] = iVar.f5871c;
            this.f5815g[0] = -1;
            iVar.f5881m++;
            iVar.a(this.f5810b);
            this.f5809a++;
            if (!this.f5819k) {
                int i3 = this.f5818j + 1;
                this.f5818j = i3;
                int[] iArr = this.f5814f;
                if (i3 >= iArr.length) {
                    this.f5819k = true;
                    this.f5818j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f5809a) {
            int i6 = this.f5814f[i2];
            int i7 = iVar.f5871c;
            if (i6 == i7) {
                this.f5816h[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i5 = i2;
            }
            i2 = this.f5815g[i2];
            i4++;
        }
        int i8 = this.f5818j;
        int i9 = i8 + 1;
        if (this.f5819k) {
            int[] iArr2 = this.f5814f;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.f5814f;
        if (i8 >= iArr3.length && this.f5809a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.f5814f;
                if (i10 >= iArr4.length) {
                    break;
                } else if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr5 = this.f5814f;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.f5812d * 2;
            this.f5812d = i11;
            this.f5819k = false;
            this.f5818j = i8 - 1;
            this.f5816h = Arrays.copyOf(this.f5816h, i11);
            this.f5814f = Arrays.copyOf(this.f5814f, this.f5812d);
            this.f5815g = Arrays.copyOf(this.f5815g, this.f5812d);
        }
        this.f5814f[i8] = iVar.f5871c;
        this.f5816h[i8] = f2;
        int[] iArr6 = this.f5815g;
        if (i5 != -1) {
            iArr6[i8] = iArr6[i5];
            iArr6[i5] = i8;
        } else {
            iArr6[i8] = this.f5817i;
            this.f5817i = i8;
        }
        iVar.f5881m++;
        iVar.a(this.f5810b);
        int i12 = this.f5809a + 1;
        this.f5809a = i12;
        if (!this.f5819k) {
            this.f5818j++;
        }
        int[] iArr7 = this.f5814f;
        if (i12 >= iArr7.length) {
            this.f5819k = true;
        }
        if (this.f5818j >= iArr7.length) {
            this.f5819k = true;
            this.f5818j = iArr7.length - 1;
        }
    }

    public void c(i iVar, float f2, boolean z2) {
        float f3 = f5808l;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f5817i;
            if (i2 == -1) {
                this.f5817i = 0;
                this.f5816h[0] = f2;
                this.f5814f[0] = iVar.f5871c;
                this.f5815g[0] = -1;
                iVar.f5881m++;
                iVar.a(this.f5810b);
                this.f5809a++;
                if (!this.f5819k) {
                    int i3 = this.f5818j + 1;
                    this.f5818j = i3;
                    int[] iArr = this.f5814f;
                    if (i3 >= iArr.length) {
                        this.f5819k = true;
                        this.f5818j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f5809a) {
                int i6 = this.f5814f[i2];
                int i7 = iVar.f5871c;
                if (i6 == i7) {
                    float[] fArr = this.f5816h;
                    float f4 = fArr[i2] + f2;
                    float f5 = f5808l;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f5817i) {
                            this.f5817i = this.f5815g[i2];
                        } else {
                            int[] iArr2 = this.f5815g;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z2) {
                            iVar.d(this.f5810b);
                        }
                        if (this.f5819k) {
                            this.f5818j = i2;
                        }
                        iVar.f5881m--;
                        this.f5809a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i5 = i2;
                }
                i2 = this.f5815g[i2];
                i4++;
            }
            int i8 = this.f5818j;
            int i9 = i8 + 1;
            if (this.f5819k) {
                int[] iArr3 = this.f5814f;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.f5814f;
            if (i8 >= iArr4.length && this.f5809a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.f5814f;
                    if (i10 >= iArr5.length) {
                        break;
                    } else if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr6 = this.f5814f;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.f5812d * 2;
                this.f5812d = i11;
                this.f5819k = false;
                this.f5818j = i8 - 1;
                this.f5816h = Arrays.copyOf(this.f5816h, i11);
                this.f5814f = Arrays.copyOf(this.f5814f, this.f5812d);
                this.f5815g = Arrays.copyOf(this.f5815g, this.f5812d);
            }
            this.f5814f[i8] = iVar.f5871c;
            this.f5816h[i8] = f2;
            int[] iArr7 = this.f5815g;
            if (i5 != -1) {
                iArr7[i8] = iArr7[i5];
                iArr7[i5] = i8;
            } else {
                iArr7[i8] = this.f5817i;
                this.f5817i = i8;
            }
            iVar.f5881m++;
            iVar.a(this.f5810b);
            this.f5809a++;
            if (!this.f5819k) {
                this.f5818j++;
            }
            int i12 = this.f5818j;
            int[] iArr8 = this.f5814f;
            if (i12 >= iArr8.length) {
                this.f5819k = true;
                this.f5818j = iArr8.length - 1;
            }
        }
    }

    public final void clear() {
        int i2 = this.f5817i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5809a) {
            i iVar = this.f5811c.f5829d[this.f5814f[i2]];
            if (iVar != null) {
                iVar.d(this.f5810b);
            }
            i2 = this.f5815g[i2];
            i3++;
        }
        this.f5817i = -1;
        this.f5818j = -1;
        this.f5819k = false;
        this.f5809a = 0;
    }

    public boolean d(i iVar) {
        int i2 = this.f5817i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5809a) {
            if (this.f5814f[i2] == iVar.f5871c) {
                return true;
            }
            i2 = this.f5815g[i2];
            i3++;
        }
        return false;
    }

    public i e(int i2) {
        int i3 = this.f5817i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f5809a) {
            if (i4 == i2) {
                return this.f5811c.f5829d[this.f5814f[i3]];
            }
            i3 = this.f5815g[i3];
            i4++;
        }
        return null;
    }

    public void f(float f2) {
        int i2 = this.f5817i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5809a) {
            float[] fArr = this.f5816h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f5815g[i2];
            i3++;
        }
    }

    public final float g(i iVar) {
        int i2 = this.f5817i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5809a) {
            if (this.f5814f[i2] == iVar.f5871c) {
                return this.f5816h[i2];
            }
            i2 = this.f5815g[i2];
            i3++;
        }
        return 0.0f;
    }

    public float h(C0257b bVar, boolean z2) {
        float g2 = g(bVar.f5820a);
        i(bVar.f5820a, z2);
        C0257b.a aVar = bVar.f5824e;
        int k2 = aVar.k();
        for (int i2 = 0; i2 < k2; i2++) {
            i e2 = aVar.e(i2);
            c(e2, aVar.g(e2) * g2, z2);
        }
        return g2;
    }

    public final float i(i iVar, boolean z2) {
        if (this.f5813e == iVar) {
            this.f5813e = null;
        }
        int i2 = this.f5817i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f5809a) {
            if (this.f5814f[i2] == iVar.f5871c) {
                if (i2 == this.f5817i) {
                    this.f5817i = this.f5815g[i2];
                } else {
                    int[] iArr = this.f5815g;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    iVar.d(this.f5810b);
                }
                iVar.f5881m--;
                this.f5809a--;
                this.f5814f[i2] = -1;
                if (this.f5819k) {
                    this.f5818j = i2;
                }
                return this.f5816h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f5815g[i2];
        }
        return 0.0f;
    }

    public void j() {
        int i2 = this.f5817i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5809a) {
            float[] fArr = this.f5816h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f5815g[i2];
            i3++;
        }
    }

    public int k() {
        return this.f5809a;
    }

    public String toString() {
        int i2 = this.f5817i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5809a) {
            str = ((str + " -> ") + this.f5816h[i2] + " : ") + this.f5811c.f5829d[this.f5814f[i2]];
            i2 = this.f5815g[i2];
            i3++;
        }
        return str;
    }
}
