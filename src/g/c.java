package G;

import java.nio.ByteBuffer;

public abstract class c {

    
    protected int f63a;

    
    protected ByteBuffer f64b;

    
    private int f65c;

    
    private int f66d;

    
    d f67e = d.a();

    
    public int a(int i2) {
        return i2 + this.f64b.getInt(i2);
    }

    
    public int b(int i2) {
        if (i2 < this.f66d) {
            return this.f64b.getShort(this.f65c + i2);
        }
        return 0;
    }

    
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

    
    public int d(int i2) {
        int i3 = i2 + this.f63a;
        return i3 + this.f64b.getInt(i3) + 4;
    }

    
    public int e(int i2) {
        int i3 = i2 + this.f63a;
        return this.f64b.getInt(i3 + this.f64b.getInt(i3));
    }
}
