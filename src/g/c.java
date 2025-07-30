package G;

import java.nio.ByteBuffer;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f63a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f64b;

    /* renamed from: c  reason: collision with root package name */
    private int f65c;

    /* renamed from: d  reason: collision with root package name */
    private int f66d;

    /* renamed from: e  reason: collision with root package name */
    d f67e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i2) {
        return i2 + this.f64b.getInt(i2);
    }

    /* access modifiers changed from: protected */
    public int b(int i2) {
        if (i2 < this.f66d) {
            return this.f64b.getShort(this.f65c + i2);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i2, ByteBuffer byteBuffer) {
        short s2;
        this.f64b = byteBuffer;
        if (byteBuffer != null) {
            this.f63a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f65c = i3;
            s2 = this.f64b.getShort(i3);
        } else {
            s2 = 0;
            this.f63a = 0;
            this.f65c = 0;
        }
        this.f66d = s2;
    }

    /* access modifiers changed from: protected */
    public int d(int i2) {
        int i3 = i2 + this.f63a;
        return i3 + this.f64b.getInt(i3) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i2) {
        int i3 = i2 + this.f63a;
        return this.f64b.getInt(i3 + this.f64b.getInt(i3));
    }
}
