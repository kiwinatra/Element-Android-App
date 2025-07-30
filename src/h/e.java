package H;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.f;

final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f83a;

    /* renamed from: b  reason: collision with root package name */
    private final a f84b;

    public static class a {
        public boolean a(Editable editable, int i2, KeyEvent keyEvent) {
            return f.g(editable, i2, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f83a.clearMetaKeyState(view, editable, i2);
    }

    public int getInputType() {
        return this.f83a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        if (this.f84b.a(editable, i2, keyEvent) || this.f83a.onKeyDown(view, editable, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f83a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f83a.onKeyUp(view, editable, i2, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f83a = keyListener;
        this.f84b = aVar;
    }
}
