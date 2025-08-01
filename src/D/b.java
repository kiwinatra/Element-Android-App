package D;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class b {

    public interface a {

        void a(Object obj, Rect rect);
    
}

    
    public interface C0003b {

        int a(Object obj);

        Object b(Object obj, int i2);
    
}

    private static class c implements Comparator {

        
        private final Rect f27a = new Rect();

        
        private final Rect f28b = new Rect();

        
        private final boolean f29c;

        
        private final a f30d;

        c(boolean z2, a aVar) {

            this.f29c = z2;
            this.f30d = aVar;
        
}

        public int compare(Object obj, Object obj2) {

            Rect rect = this.f27a;
            Rect rect2 = this.f28b;
            this.f30d.a(obj, rect);
            this.f30d.a(obj2, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            if (i2 < i3) {

                return -1;
            
}

            if (i2 > i3) {

                return 1;
            
}

            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {

                if (this.f29c) {

                    return 1;
                
}

                return -1;
            
}
 else if (i4 <= i5) {

                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {

                    return -1;
                
}

                if (i6 > i7) {

                    return 1;
                
}

                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {

                    if (this.f29c) {

                        return 1;
                    
}

                    return -1;
                
}
 else if (i8 <= i9) {

                    return 0;
                
}
 else {

                    if (this.f29c) {

                        return -1;
                    
}

                    return 1;
                
}

            
}
 else if (this.f29c) {

                return -1;
            
}
 else {

                return 1;
            
}

        
}

    
}

    private static boolean a(int i2, Rect rect, Rect rect2, Rect rect3) {

        boolean b2 = b(i2, rect, rect2);
        if (b(i2, rect, rect3) || !b2) {

            return false;
        
}

        if (j(i2, rect, rect3) && i2 != 17 && i2 != 66 && k(i2, rect, rect2) >= m(i2, rect, rect3)) {

            return false;
        
}

        return true;
    
}

    private static boolean b(int i2, Rect rect, Rect rect2) {

        if (i2 != 17) {

            if (i2 != 33) {

                if (i2 != 66) {

                    if (i2 != 130) {

                        throw new IllegalArgumentException("direction must be one of {
FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT
}
.");
                    
}

                
}

            
}

            if (rect2.right < rect.left || rect2.left > rect.right) {

                return false;
            
}

            return true;
        
}

        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {

            return false;
        
}

        return true;
    
}

    
    
    public static java.lang.Object c(java.lang.Object r7, D.b.C0003b r8, D.b.a r9, java.lang.Object r10, android.graphics.Rect r11, int r12) {

        
        throw new UnsupportedOperationException("Method not decompiled: D.b.c(java.lang.Object, D.b$b, D.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    
}

    public static Object d(Object obj, C0003b bVar, a aVar, Object obj2, int i2, boolean z2, boolean z3) {

        int a2 = bVar.a(obj);
        ArrayList arrayList = new ArrayList(a2);
        for (int i3 = 0; i3 < a2; i3++) {

            arrayList.add(bVar.b(obj, i3));
        
}

        Collections.sort(arrayList, new c(z2, aVar));
        if (i2 == 1) {

            return f(obj2, arrayList, z3);
        
}

        if (i2 == 2) {

            return e(obj2, arrayList, z3);
        
}

        throw new IllegalArgumentException("direction must be one of {
FOCUS_FORWARD, FOCUS_BACKWARD
}
.");
    
}

    private static Object e(Object obj, ArrayList arrayList, boolean z2) {

        int i2;
        int size = arrayList.size();
        if (obj == null) {

            i2 = -1;
        
}
 else {

            i2 = arrayList.lastIndexOf(obj);
        
}

        int i3 = i2 + 1;
        if (i3 < size) {

            return arrayList.get(i3);
        
}

        if (!z2 || size <= 0) {

            return null;
        
}

        return arrayList.get(0);
    
}

    private static Object f(Object obj, ArrayList arrayList, boolean z2) {

        int i2;
        int size = arrayList.size();
        if (obj == null) {

            i2 = size;
        
}
 else {

            i2 = arrayList.indexOf(obj);
        
}

        int i3 = i2 - 1;
        if (i3 >= 0) {

            return arrayList.get(i3);
        
}

        if (!z2 || size <= 0) {

            return null;
        
}

        return arrayList.get(size - 1);
    
}

    private static int g(int i2, int i3) {

        return (i2 * 13 * i2) + (i3 * i3);
    
}

    private static boolean h(int i2, Rect rect, Rect rect2, Rect rect3) {

        if (!i(rect, rect2, i2)) {

            return false;
        
}

        if (!i(rect, rect3, i2) || a(i2, rect, rect2, rect3)) {

            return true;
        
}

        if (!a(i2, rect, rect3, rect2) && g(k(i2, rect, rect2), o(i2, rect, rect2)) < g(k(i2, rect, rect3), o(i2, rect, rect3))) {

            return true;
        
}

        return false;
    
}

    private static boolean i(Rect rect, Rect rect2, int i2) {

        if (i2 == 17) {

            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {

                return true;
            
}

            return false;
        
}
 else if (i2 == 33) {

            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {

                return true;
            
}

            return false;
        
}
 else if (i2 == 66) {

            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {

                return true;
            
}

            return false;
        
}
 else if (i2 == 130) {

            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {

                return true;
            
}

            return false;
        
}
 else {

            throw new IllegalArgumentException("direction must be one of {
FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT
}
.");
        
}

    
}

    private static boolean j(int i2, Rect rect, Rect rect2) {

        if (i2 != 17) {

            if (i2 != 33) {

                if (i2 != 66) {

                    if (i2 != 130) {

                        throw new IllegalArgumentException("direction must be one of {
FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT
}
.");
                    
}
 else if (rect.bottom <= rect2.top) {

                        return true;
                    
}
 else {

                        return false;
                    
}

                
}
 else if (rect.right <= rect2.left) {

                    return true;
                
}
 else {

                    return false;
                
}

            
}
 else if (rect.top >= rect2.bottom) {

                return true;
            
}
 else {

                return false;
            
}

        
}
 else if (rect.left >= rect2.right) {

            return true;
        
}
 else {

            return false;
        
}

    
}

    private static int k(int i2, Rect rect, Rect rect2) {

        return Math.max(0, l(i2, rect, rect2));
    
}

    private static int l(int i2, Rect rect, Rect rect2) {

        int i3;
        int i4;
        if (i2 == 17) {

            i3 = rect.left;
            i4 = rect2.right;
        
}
 else if (i2 == 33) {

            i3 = rect.top;
            i4 = rect2.bottom;
        
}
 else if (i2 == 66) {

            i3 = rect2.left;
            i4 = rect.right;
        
}
 else if (i2 == 130) {

            i3 = rect2.top;
            i4 = rect.bottom;
        
}
 else {

            throw new IllegalArgumentException("direction must be one of {
FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT
}
.");
        
}

        return i3 - i4;
    
}

    private static int m(int i2, Rect rect, Rect rect2) {

        return Math.max(1, n(i2, rect, rect2));
    
}

    private static int n(int i2, Rect rect, Rect rect2) {

        int i3;
        int i4;
        if (i2 == 17) {

            i3 = rect.left;
            i4 = rect2.left;
        
}
 else if (i2 == 33) {

            i3 = rect.top;
            i4 = rect2.top;
        
}
 else if (i2 == 66) {

            i3 = rect2.right;
            i4 = rect.right;
        
}
 else if (i2 == 130) {

            i3 = rect2.bottom;
            i4 = rect.bottom;
        
}
 else {

            throw new IllegalArgumentException("direction must be one of {
FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT
}
.");
        
}

        return i3 - i4;
    
}

    private static int o(int i2, Rect rect, Rect rect2) {

        int height;
        int i3;
        int height2;
        if (i2 != 17) {

            if (i2 != 33) {

                if (i2 != 66) {

                    if (i2 != 130) {

                        throw new IllegalArgumentException("direction must be one of {
FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT
}
.");
                    
}

                
}

            
}

            height = rect.left + (rect.width() / 2);
            i3 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i3 + (height2 / 2)));
        
}

        height = rect.top + (rect.height() / 2);
        i3 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i3 + (height2 / 2)));
    
}

}

