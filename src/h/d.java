package H;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d implements InputFilter {

    
    private final TextView f79a;

    
    private f.C0042f f80b;

    private static class a extends f.C0042f {

        
        private final Reference f81a;

        
        private final Reference f82b;

        a(TextView textView, d dVar) {
            this.f81a = new WeakReference(textView);
            this.f82b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            CharSequence text;
            CharSequence p2;
            super.b();
            TextView textView = (TextView) this.f81a.get();
            if (c(textView, (InputFilter) this.f82b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (p2 = f.c().p(text))) {
                int selectionStart = Selection.getSelectionStart(p2);
                int selectionEnd = Selection.getSelectionEnd(p2);
                textView.setText(p2);
                if (p2 instanceof Spannable) {
                    d.b((Spannable) p2, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f79a = textView;
    }

    private f.C0042f a() {
        if (this.f80b == null) {
            this.f80b = new a(this.f79a, this);
        }
        return this.f80b;
    }

    static void b(Spannable spannable, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            Selection.setSelection(spannable, i2, i3);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.f79a.isInEditMode()) {
            return charSequence;
        }
        int e2 = f.c().e();
        if (e2 != 0) {
            if (e2 != 1) {
                if (e2 != 3) {
                    return charSequence;
                }
            } else if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.f79a.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i2 == 0 && i3 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return f.c().q(charSequence, 0, charSequence.length());
            }
        }
        f.c().t(a());
        return charSequence;
    }
}
