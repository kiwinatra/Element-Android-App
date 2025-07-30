package c;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import p0.A;
import p0.C0271e;
import p0.k;
import w0.e;

public final class b extends C0211a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4139a = new a((e) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    /* renamed from: b */
    public Map a(int i2, Intent intent) {
        boolean z2;
        if (i2 != -1) {
            return A.d();
        }
        if (intent == null) {
            return A.d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return A.d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i3 : intArrayExtra) {
            if (i3 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(Boolean.valueOf(z2));
        }
        return A.g(k.i(C0271e.f(stringArrayExtra), arrayList));
    }
}
