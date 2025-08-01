package H;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.f;

final class c extends InputConnectionWrapper {

    
    private final TextView f77a;

    
    private final a f78b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
            return f.f(inputConnection, editable, i2, i3, z2);
        }

        public void b(EditorInfo editorInfo) {
            if (f.i()) {
                f.c().v(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f77a.getEditableText();
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        if (this.f78b.a(this, a(), i2, i3, false) || super.deleteSurroundingText(i2, i3)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        if (this.f78b.a(this, a(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3)) {
            return true;
        }
        return false;
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f77a = textView;
        this.f78b = aVar;
        aVar.b(editorInfo);
    }
}
