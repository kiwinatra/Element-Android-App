package G;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i2, ByteBuffer byteBuffer) {
        g(i2, byteBuffer);
        return this;
    }

    public void g(int i2, ByteBuffer byteBuffer) {
        c(i2, byteBuffer);
    }

    public a j(a aVar, int i2) {
        int b2 = b(6);
        if (b2 != 0) {
            return aVar.f(a(d(b2) + (i2 * 4)), this.f64b);
        }
        return null;
    }

    public int k() {
        int b2 = b(6);
        if (b2 != 0) {
            return e(b2);
        }
        return 0;
    }

    public int l() {
        int b2 = b(4);
        if (b2 != 0) {
            return this.f64b.getInt(b2 + this.f63a);
        }
        return 0;
    }
}
