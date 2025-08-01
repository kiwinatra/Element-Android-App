package H;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import x.h;

public final class a {

    
    private final b f69a;

    
    private int f70b = Integer.MAX_VALUE;

    
    private int f71c = 0;

    
    private static class C0005a extends b {

        
        private final EditText f72a;

        
        private final g f73b;

        C0005a(EditText editText, boolean z2) {
            this.f72a = editText;
            g gVar = new g(editText, z2);
            this.f73b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f72a, inputConnection, editorInfo);
        }

        
        public void c(boolean z2) {
            this.f73b.c(z2);
        }
    }

    static class b {
        b() {
        }

        
        public abstract KeyListener a(KeyListener keyListener);

        
        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        
        public abstract void c(boolean z2);
    }

    public a(EditText editText, boolean z2) {
        h.h(editText, "editText cannot be null");
        this.f69a = new C0005a(editText, z2);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f69a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f69a.b(inputConnection, editorInfo);
    }

    public void c(boolean z2) {
        this.f69a.c(z2);
    }
}
