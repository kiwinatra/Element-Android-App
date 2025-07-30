package p0;

import java.util.List;
import w0.e;

/* renamed from: p0.b  reason: case insensitive filesystem */
public abstract class C0268b extends C0267a implements List {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6088a = new a((e) null);

    /* renamed from: p0.b$a */
    public static final class a {
        private a() {
        }

        public final void a(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void b(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }
}
