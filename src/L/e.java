package l;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap f5765a;

    /* renamed from: b  reason: collision with root package name */
    private int f5766b;

    /* renamed from: c  reason: collision with root package name */
    private int f5767c;

    /* renamed from: d  reason: collision with root package name */
    private int f5768d;

    /* renamed from: e  reason: collision with root package name */
    private int f5769e;

    /* renamed from: f  reason: collision with root package name */
    private int f5770f;

    /* renamed from: g  reason: collision with root package name */
    private int f5771g;

    /* renamed from: h  reason: collision with root package name */
    private int f5772h;

    public e(int i2) {
        if (i2 > 0) {
            this.f5767c = i2;
            this.f5765a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int e(Object obj, Object obj2) {
        int f2 = f(obj, obj2);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* access modifiers changed from: protected */
    public Object a(Object obj) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f5769e++;
        r1 = r4.f5765a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r4.f5765a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r4.f5766b += e(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        b(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        g(r4.f5767c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0056
            monitor-enter(r4)
            java.util.LinkedHashMap r0 = r4.f5765a     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0015
            int r5 = r4.f5771g     // Catch:{ all -> 0x0013 }
            int r5 = r5 + 1
            r4.f5771g = r5     // Catch:{ all -> 0x0013 }
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            return r0
        L_0x0013:
            r5 = move-exception
            goto L_0x0054
        L_0x0015:
            int r0 = r4.f5772h     // Catch:{ all -> 0x0013 }
            int r0 = r0 + 1
            r4.f5772h = r0     // Catch:{ all -> 0x0013 }
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r4.a(r5)
            if (r0 != 0) goto L_0x0024
            r5 = 0
            return r5
        L_0x0024:
            monitor-enter(r4)
            int r1 = r4.f5769e     // Catch:{ all -> 0x0039 }
            int r1 = r1 + 1
            r4.f5769e = r1     // Catch:{ all -> 0x0039 }
            java.util.LinkedHashMap r1 = r4.f5765a     // Catch:{ all -> 0x0039 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x003b
            java.util.LinkedHashMap r2 = r4.f5765a     // Catch:{ all -> 0x0039 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0044
        L_0x0039:
            r5 = move-exception
            goto L_0x0052
        L_0x003b:
            int r2 = r4.f5766b     // Catch:{ all -> 0x0039 }
            int r3 = r4.e(r5, r0)     // Catch:{ all -> 0x0039 }
            int r2 = r2 + r3
            r4.f5766b = r2     // Catch:{ all -> 0x0039 }
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x004c
            r2 = 0
            r4.b(r2, r5, r0, r1)
            return r1
        L_0x004c:
            int r5 = r4.f5767c
            r4.g(r5)
            return r0
        L_0x0052:
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            throw r5
        L_0x0054:
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            throw r5
        L_0x0056:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.c(java.lang.Object):java.lang.Object");
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f5768d++;
                this.f5766b += e(obj, obj2);
                put = this.f5765a.put(obj, obj2);
                if (put != null) {
                    this.f5766b -= e(obj, put);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (put != null) {
            b(false, obj, put, obj2);
        }
        g(this.f5767c);
        return put;
    }

    /* access modifiers changed from: protected */
    public int f(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f5766b     // Catch:{ all -> 0x0012 }
            if (r0 < 0) goto L_0x0055
            java.util.LinkedHashMap r0 = r4.f5765a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            int r0 = r4.f5766b     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0014
        L_0x0012:
            r5 = move-exception
            goto L_0x0074
        L_0x0014:
            int r0 = r4.f5766b     // Catch:{ all -> 0x0012 }
            if (r0 <= r5) goto L_0x0053
            java.util.LinkedHashMap r0 = r4.f5765a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0053
        L_0x0021:
            java.util.LinkedHashMap r0 = r4.f5765a     // Catch:{ all -> 0x0012 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0012 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0012 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0012 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0012 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0012 }
            java.util.LinkedHashMap r2 = r4.f5765a     // Catch:{ all -> 0x0012 }
            r2.remove(r1)     // Catch:{ all -> 0x0012 }
            int r2 = r4.f5766b     // Catch:{ all -> 0x0012 }
            int r3 = r4.e(r1, r0)     // Catch:{ all -> 0x0012 }
            int r2 = r2 - r3
            r4.f5766b = r2     // Catch:{ all -> 0x0012 }
            int r2 = r4.f5770f     // Catch:{ all -> 0x0012 }
            r3 = 1
            int r2 = r2 + r3
            r4.f5770f = r2     // Catch:{ all -> 0x0012 }
            monitor-exit(r4)     // Catch:{ all -> 0x0012 }
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x0012 }
            return
        L_0x0055:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0012 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r0.<init>()     // Catch:{ all -> 0x0012 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0012 }
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0012 }
            r5.<init>(r0)     // Catch:{ all -> 0x0012 }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x0074:
            monitor-exit(r4)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.g(int):void");
    }

    public final synchronized String toString() {
        int i2;
        try {
            int i3 = this.f5771g;
            int i4 = this.f5772h + i3;
            if (i4 != 0) {
                i2 = (i3 * 100) / i4;
            } else {
                i2 = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f5767c), Integer.valueOf(this.f5771g), Integer.valueOf(this.f5772h), Integer.valueOf(i2)});
    }

    /* access modifiers changed from: protected */
    public void b(boolean z2, Object obj, Object obj2, Object obj3) {
    }
}
