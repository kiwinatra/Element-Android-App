package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.a;
import androidx.core.view.C0123b;
import u.C0287b;

/* renamed from: i.a  reason: case insensitive filesystem */
public class C0245a implements C0287b {

    /* renamed from: a  reason: collision with root package name */
    private final int f5523a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5524b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5525c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f5526d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f5527e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f5528f;

    /* renamed from: g  reason: collision with root package name */
    private char f5529g;

    /* renamed from: h  reason: collision with root package name */
    private int f5530h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f5531i;

    /* renamed from: j  reason: collision with root package name */
    private int f5532j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f5533k;

    /* renamed from: l  reason: collision with root package name */
    private Context f5534l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f5535m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f5536n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f5537o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f5538p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f5539q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5540r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5541s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f5542t = 16;

    public C0245a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f5534l = context;
        this.f5523a = i3;
        this.f5524b = i2;
        this.f5525c = i5;
        this.f5526d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f5533k;
        if (drawable == null) {
            return;
        }
        if (this.f5540r || this.f5541s) {
            Drawable r2 = a.r(drawable);
            this.f5533k = r2;
            Drawable mutate = r2.mutate();
            this.f5533k = mutate;
            if (this.f5540r) {
                a.o(mutate, this.f5538p);
            }
            if (this.f5541s) {
                a.p(this.f5533k, this.f5539q);
            }
        }
    }

    public C0287b a(C0123b bVar) {
        throw new UnsupportedOperationException();
    }

    public C0123b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C0287b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C0287b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C0287b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f5532j;
    }

    public char getAlphabeticShortcut() {
        return this.f5531i;
    }

    public CharSequence getContentDescription() {
        return this.f5536n;
    }

    public int getGroupId() {
        return this.f5524b;
    }

    public Drawable getIcon() {
        return this.f5533k;
    }

    public ColorStateList getIconTintList() {
        return this.f5538p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5539q;
    }

    public Intent getIntent() {
        return this.f5528f;
    }

    public int getItemId() {
        return this.f5523a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f5530h;
    }

    public char getNumericShortcut() {
        return this.f5529g;
    }

    public int getOrder() {
        return this.f5525c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f5526d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5527e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f5526d;
    }

    public CharSequence getTooltipText() {
        return this.f5537o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        if ((this.f5542t & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f5542t & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f5542t & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.f5542t & 8) == 0) {
            return true;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f5531i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.f5542t = z2 | (this.f5542t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        int i2;
        int i3 = this.f5542t & -3;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f5542t = i2 | i3;
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        int i2;
        int i3 = this.f5542t & -17;
        if (z2) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.f5542t = i2 | i3;
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f5533k = androidx.core.content.a.c(this.f5534l, i2);
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5538p = colorStateList;
        this.f5540r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5539q = mode;
        this.f5541s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f5528f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f5529g = c2;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5535m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f5529g = c2;
        this.f5531i = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f5526d = this.f5534l.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5527e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        int i2 = 8;
        int i3 = this.f5542t & 8;
        if (z2) {
            i2 = 0;
        }
        this.f5542t = i3 | i2;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f5531i = Character.toLowerCase(c2);
        this.f5532j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public C0287b setContentDescription(CharSequence charSequence) {
        this.f5536n = charSequence;
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f5533k = drawable;
        c();
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f5529g = c2;
        this.f5530h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f5529g = c2;
        this.f5530h = KeyEvent.normalizeMetaState(i2);
        this.f5531i = Character.toLowerCase(c3);
        this.f5532j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f5526d = charSequence;
        return this;
    }

    public C0287b setTooltipText(CharSequence charSequence) {
        this.f5537o = charSequence;
        return this;
    }

    public void setShowAsAction(int i2) {
    }
}
