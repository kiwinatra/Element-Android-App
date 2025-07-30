package r0;

public abstract class c {
    private static final int a(int i2, int i3, int i4) {
        return c(c(i2, i4) - c(i3, i4), i4);
    }

    public static final int b(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            return i3 - a(i3, i2, i4);
        } else if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i2 <= i3) {
            return i3;
        } else {
            return i3 + a(i2, i3, -i4);
        }
    }

    private static final int c(int i2, int i3) {
        int i4 = i2 % i3;
        if (i4 >= 0) {
            return i4;
        }
        return i4 + i3;
    }
}
