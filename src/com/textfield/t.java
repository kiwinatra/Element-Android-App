package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import y.C0299c;
import y.I;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f5155a;

    /* renamed from: b  reason: collision with root package name */
    final s f5156b;

    /* renamed from: c  reason: collision with root package name */
    final Context f5157c;

    /* renamed from: d  reason: collision with root package name */
    final CheckableImageButton f5158d;

    t(s sVar) {
        this.f5155a = sVar.f5125a;
        this.f5156b = sVar;
        this.f5157c = sVar.getContext();
        this.f5158d = sVar.r();
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0299c.a h() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i2) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
    }

    /* access modifiers changed from: package-private */
    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        this.f5156b.L(false);
    }

    /* access modifiers changed from: package-private */
    public void s() {
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
    }

    /* access modifiers changed from: package-private */
    public void o(View view, I i2) {
    }
}
