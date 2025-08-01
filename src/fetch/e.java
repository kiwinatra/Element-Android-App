package B;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.C0127d;
import androidx.core.view.W;
import x.h;

public abstract class e {

    class a extends InputConnectionWrapper {

        
        final  c f2a;

        
        a(InputConnection inputConnection, boolean z2, c cVar) {
            super(inputConnection, z2);
            this.f2a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            if (this.f2a.a(f.f(inputContentInfo), i2, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i2, bundle);
        }
    }

    class b extends InputConnectionWrapper {

        
        final  c f3a;

        
        b(InputConnection inputConnection, boolean z2, c cVar) {
            super(inputConnection, z2);
            this.f3a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (e.e(str, bundle, this.f3a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(f fVar, int i2, Bundle bundle);
    }

    private static c b(View view) {
        h.g(view);
        return new d(view);
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        x.c.c(inputConnection, "inputConnection must be non-null");
        x.c.c(editorInfo, "editorInfo must be non-null");
        x.c.c(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, cVar);
        }
        if (c.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, cVar);
    }

    
    
    static boolean e(java.lang.String r7, android.os.Bundle r8, B.e.c r9) {
        
        throw new UnsupportedOperationException("Method not decompiled: B.e.e(java.lang.String, android.os.Bundle, B.e$c):boolean");
    }

    
    public static  boolean f(View view, f fVar, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                fVar.d();
                Parcelable parcelable = (Parcelable) fVar.e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        if (W.g0(view, new C0127d.a(new ClipData(fVar.b(), new ClipData.Item(fVar.a())), 2).d(fVar.c()).b(bundle).a()) == null) {
            return true;
        }
        return false;
    }
}
