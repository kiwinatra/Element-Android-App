package com.google.android.material.textfield;

import T.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.W;
import f0.h;
import y.C0299c;
import y.I;

class q extends t {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f5109s = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f5110e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5111f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f5112g;

    /* renamed from: h  reason: collision with root package name */
    private AutoCompleteTextView f5113h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f5114i = new m(this);

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f5115j = new n(this);

    /* renamed from: k  reason: collision with root package name */
    private final C0299c.a f5116k = new o(this);

    /* renamed from: l  reason: collision with root package name */
    private boolean f5117l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5118m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5119n;

    /* renamed from: o  reason: collision with root package name */
    private long f5120o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    private AccessibilityManager f5121p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f5122q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f5123r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f5123r.start();
        }
    }

    q(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i2 = T.a.motionDurationShort3;
        this.f5111f = h.f(context, i2, 67);
        this.f5110e = h.f(sVar.getContext(), i2, 50);
        this.f5112g = h.g(sVar.getContext(), T.a.motionEasingLinearInterpolator, U.a.f255a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f5112g);
        ofFloat.setDuration((long) i2);
        ofFloat.addUpdateListener(new C0229j(this));
        return ofFloat;
    }

    private void F() {
        this.f5123r = E(this.f5111f, 0.0f, 1.0f);
        ValueAnimator E2 = E(this.f5110e, 1.0f, 0.0f);
        this.f5122q = E2;
        E2.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5120o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f5113h.isPopupShowing();
        O(isPopupShowing);
        this.f5118m = isPopupShowing;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f5158d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z2) {
        this.f5117l = z2;
        r();
        if (!z2) {
            O(false);
            this.f5118m = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(boolean z2) {
        AutoCompleteTextView autoCompleteTextView = this.f5113h;
        if (autoCompleteTextView != null && !r.a(autoCompleteTextView)) {
            W.y0(this.f5158d, z2 ? 2 : 1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f5118m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z2) {
        if (this.f5119n != z2) {
            this.f5119n = z2;
            this.f5123r.cancel();
            this.f5122q.start();
        }
    }

    private void P() {
        this.f5113h.setOnTouchListener(new C0230k(this));
        if (f5109s) {
            this.f5113h.setOnDismissListener(new C0231l(this));
        }
        this.f5113h.setThreshold(0);
    }

    private void Q() {
        if (this.f5113h != null) {
            if (G()) {
                this.f5118m = false;
            }
            if (!this.f5118m) {
                if (f5109s) {
                    O(!this.f5119n);
                } else {
                    this.f5119n = !this.f5119n;
                    r();
                }
                if (this.f5119n) {
                    this.f5113h.requestFocus();
                    this.f5113h.showDropDown();
                    return;
                }
                this.f5113h.dismissDropDown();
                return;
            }
            this.f5118m = false;
        }
    }

    private void R() {
        this.f5118m = true;
        this.f5120o = System.currentTimeMillis();
    }

    public void a(Editable editable) {
        if (this.f5121p.isTouchExplorationEnabled() && r.a(this.f5113h) && !this.f5158d.hasFocus()) {
            this.f5113h.dismissDropDown();
        }
        this.f5113h.post(new p(this));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return T.h.exposed_dropdown_menu_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return f5109s ? d.mtrl_dropdown_arrow : d.mtrl_ic_arrow_drop_down;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f5115j;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f5114i;
    }

    public C0299c.a h() {
        return this.f5116k;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i2) {
        return i2 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f5117l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f5119n;
    }

    public void n(EditText editText) {
        this.f5113h = D(editText);
        P();
        this.f5155a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f5121p.isTouchExplorationEnabled()) {
            W.y0(this.f5158d, 2);
        }
        this.f5155a.setEndIconVisible(true);
    }

    public void o(View view, I i2) {
        if (!r.a(this.f5113h)) {
            i2.m0(Spinner.class.getName());
        }
        if (i2.W()) {
            i2.w0((CharSequence) null);
        }
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f5121p.isEnabled() && !r.a(this.f5113h)) {
            boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f5119n && !this.f5113h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z2) {
                Q();
                R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        F();
        this.f5121p = (AccessibilityManager) this.f5157c.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f5113h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f5109s) {
                this.f5113h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
