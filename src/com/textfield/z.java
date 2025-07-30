package com.google.android.material.textfield;

import T.d;
import T.h;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

class z extends t {

    /* renamed from: e  reason: collision with root package name */
    private int f5206e = d.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    private EditText f5207f;

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f5208g = new y(this);

    z(s sVar, int i2) {
        super(sVar);
        if (i2 != 0) {
            this.f5206e = i2;
        }
    }

    private boolean w() {
        EditText editText = this.f5207f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText;
        PasswordTransformationMethod instance;
        EditText editText2 = this.f5207f;
        if (editText2 != null) {
            int selectionEnd = editText2.getSelectionEnd();
            if (w()) {
                editText = this.f5207f;
                instance = null;
            } else {
                editText = this.f5207f;
                instance = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(instance);
            if (selectionEnd >= 0) {
                this.f5207f.setSelection(selectionEnd);
            }
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i2, int i3, int i4) {
        r();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.password_toggle_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f5206e;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f5208g;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return !w();
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
        this.f5207f = editText;
        r();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (x(this.f5207f)) {
            this.f5207f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f5207f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
