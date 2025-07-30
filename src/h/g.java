package H;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f90a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f91b;

    /* renamed from: c  reason: collision with root package name */
    private f.C0042f f92c;

    /* renamed from: d  reason: collision with root package name */
    private int f93d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f94e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f95f;

    private static class a extends f.C0042f {

        /* renamed from: a  reason: collision with root package name */
        private final Reference f96a;

        a(EditText editText) {
            this.f96a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.b((EditText) this.f96a.get(), 1);
        }
    }

    g(EditText editText, boolean z2) {
        this.f90a = editText;
        this.f91b = z2;
        this.f95f = true;
    }

    private f.C0042f a() {
        if (this.f92c == null) {
            this.f92c = new a(this.f90a);
        }
        return this.f92c;
    }

    static void b(EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (!this.f95f || (!this.f91b && !f.i())) {
            return true;
        }
        return false;
    }

    public void c(boolean z2) {
        if (this.f95f != z2) {
            if (this.f92c != null) {
                f.c().u(this.f92c);
            }
            this.f95f = z2;
            if (z2) {
                b(this.f90a, f.c().e());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.f90a.isInEditMode() && !d() && i3 <= i4 && (charSequence instanceof Spannable)) {
            int e2 = f.c().e();
            if (e2 != 0) {
                if (e2 == 1) {
                    f.c().s((Spannable) charSequence, i2, i2 + i4, this.f93d, this.f94e);
                    return;
                } else if (e2 != 3) {
                    return;
                }
            }
            f.c().t(a());
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
