package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c0.C0212a;
import k0.g;
import k0.k;

/* renamed from: com.google.android.material.textfield.h  reason: case insensitive filesystem */
abstract class C0227h extends g {

    /* renamed from: z  reason: collision with root package name */
    b f5100z;

    /* renamed from: com.google.android.material.textfield.h$c */
    private static class c extends C0227h {
        c(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        public void r(Canvas canvas) {
            if (this.f5100z.f5101w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                boolean unused = canvas.clipOutRect(this.f5100z.f5101w);
            } else {
                canvas.clipRect(this.f5100z.f5101w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    private C0227h(b bVar) {
        super((g.c) bVar);
        this.f5100z = bVar;
    }

    /* access modifiers changed from: private */
    public static C0227h f0(b bVar) {
        return new c(bVar);
    }

    static C0227h g0(k kVar) {
        if (kVar == null) {
            kVar = new k();
        }
        return f0(new b(kVar, new RectF()));
    }

    /* access modifiers changed from: package-private */
    public boolean h0() {
        return !this.f5100z.f5101w.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void j0(float f2, float f3, float f4, float f5) {
        if (f2 != this.f5100z.f5101w.left || f3 != this.f5100z.f5101w.top || f4 != this.f5100z.f5101w.right || f5 != this.f5100z.f5101w.bottom) {
            this.f5100z.f5101w.set(f2, f3, f4, f5);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public Drawable mutate() {
        this.f5100z = new b(this.f5100z);
        return this;
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends g.c {
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public final RectF f5101w;

        private b(b bVar) {
            super(bVar);
            this.f5101w = bVar.f5101w;
        }

        public Drawable newDrawable() {
            C0227h e02 = C0227h.f0(this);
            e02.invalidateSelf();
            return e02;
        }

        private b(k kVar, RectF rectF) {
            super(kVar, (C0212a) null);
            this.f5101w = rectF;
        }
    }
}
