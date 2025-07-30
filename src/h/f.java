package H;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import x.h;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f85a;

    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f86a;

        /* renamed from: b  reason: collision with root package name */
        private final d f87b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f88c = true;

        a(TextView textView) {
            this.f86a = textView;
            this.f87b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f87b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f87b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray e2 = e(inputFilterArr);
            if (e2.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e2.size())];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (e2.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return ((h) transformationMethod).a();
            }
            return transformationMethod;
        }

        private void i() {
            this.f86a.setFilters(a(this.f86a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new h(transformationMethod);
            }
            return transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f88c) {
                return f(inputFilterArr);
            }
            return d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z2) {
            if (z2) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z2) {
            this.f88c = z2;
            j();
            i();
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z2) {
            this.f88c = z2;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f86a.setTransformationMethod(l(this.f86a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod l(TransformationMethod transformationMethod) {
            if (this.f88c) {
                return k(transformationMethod);
            }
            return h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        /* access modifiers changed from: package-private */
        public abstract void b(boolean z2);

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z2);
    }

    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f89a;

        c(TextView textView) {
            this.f89a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.f.i();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (d()) {
                return inputFilterArr;
            }
            return this.f89a.a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z2) {
            if (!d()) {
                this.f89a.b(z2);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z2) {
            if (d()) {
                this.f89a.g(z2);
            } else {
                this.f89a.c(z2);
            }
        }
    }

    public f(TextView textView, boolean z2) {
        b aVar;
        h.h(textView, "textView cannot be null");
        if (!z2) {
            aVar = new c(textView);
        } else {
            aVar = new a(textView);
        }
        this.f85a = aVar;
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f85a.a(inputFilterArr);
    }

    public void b(boolean z2) {
        this.f85a.b(z2);
    }

    public void c(boolean z2) {
        this.f85a.c(z2);
    }
}
