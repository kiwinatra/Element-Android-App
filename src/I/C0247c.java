package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.c;
import androidx.core.view.C0123b;
import java.lang.reflect.Method;
import u.C0287b;


public class C0247c extends C0246b implements MenuItem {

    
    private final C0287b f5546d;

    
    private Method f5547e;

    
    private class a extends C0123b implements ActionProvider.VisibilityListener {

        
        private C0123b.C0035b f5548d;
        

        
        public final ActionProvider f5549e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f5549e = actionProvider;
        }

        public boolean a() {
            return this.f5549e.hasSubMenu();
        }

        public boolean b() {
            return this.f5549e.isVisible();
        }

        public View c(MenuItem menuItem) {
            return this.f5549e.onCreateActionView(menuItem);
        }

        public boolean d() {
            return this.f5549e.onPerformDefaultAction();
        }

        public void e(SubMenu subMenu) {
            this.f5549e.onPrepareSubMenu(C0247c.this.d(subMenu));
        }

        public boolean f() {
            return this.f5549e.overridesItemVisibility();
        }

        public void i(C0123b.C0035b bVar) {
            a aVar;
            this.f5548d = bVar;
            ActionProvider actionProvider = this.f5549e;
            if (bVar != null) {
                aVar = this;
            } else {
                aVar = null;
            }
            actionProvider.setVisibilityListener(aVar);
        }

        public void onActionProviderVisibilityChanged(boolean z2) {
            C0123b.C0035b bVar = this.f5548d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z2);
            }
        }
    }

    
    static class b extends FrameLayout implements c {

        
        final CollapsibleActionView f5551a;

        b(View view) {
            super(view.getContext());
            this.f5551a = (CollapsibleActionView) view;
            addView(view);
        }

        
        public View a() {
            return (View) this.f5551a;
        }

        public void c() {
            this.f5551a.onActionViewExpanded();
        }

        public void f() {
            this.f5551a.onActionViewCollapsed();
        }
    }

    
    private class C0075c implements MenuItem.OnActionExpandListener {

        
        private final MenuItem.OnActionExpandListener f5552a;

        C0075c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f5552a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5552a.onMenuItemActionCollapse(C0247c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5552a.onMenuItemActionExpand(C0247c.this.c(menuItem));
        }
    }

    
    private class d implements MenuItem.OnMenuItemClickListener {

        
        private final MenuItem.OnMenuItemClickListener f5554a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f5554a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5554a.onMenuItemClick(C0247c.this.c(menuItem));
        }
    }

    public C0247c(Context context, C0287b bVar) {
        super(context);
        if (bVar != null) {
            this.f5546d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f5546d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f5546d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0123b b2 = this.f5546d.b();
        if (b2 instanceof a) {
            return ((a) b2).f5549e;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f5546d.getActionView();
        if (actionView instanceof b) {
            return ((b) actionView).a();
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f5546d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f5546d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f5546d.getContentDescription();
    }

    public int getGroupId() {
        return this.f5546d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f5546d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f5546d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5546d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f5546d.getIntent();
    }

    public int getItemId() {
        return this.f5546d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5546d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f5546d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f5546d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f5546d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f5546d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f5546d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f5546d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f5546d.getTooltipText();
    }

    public void h(boolean z2) {
        try {
            if (this.f5547e == null) {
                this.f5547e = this.f5546d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f5547e.invoke(this.f5546d, new Object[]{Boolean.valueOf(z2)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean hasSubMenu() {
        return this.f5546d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f5546d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f5546d.isCheckable();
    }

    public boolean isChecked() {
        return this.f5546d.isChecked();
    }

    public boolean isEnabled() {
        return this.f5546d.isEnabled();
    }

    public boolean isVisible() {
        return this.f5546d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f5543a, actionProvider);
        C0287b bVar = this.f5546d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    public MenuItem setActionView(int i2) {
        this.f5546d.setActionView(i2);
        View actionView = this.f5546d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f5546d.setActionView((View) new b(actionView));
        }
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f5546d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.f5546d.setCheckable(z2);
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        this.f5546d.setChecked(z2);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f5546d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.f5546d.setEnabled(z2);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f5546d.setIcon(i2);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5546d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5546d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f5546d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f5546d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C0075c cVar;
        C0287b bVar = this.f5546d;
        if (onActionExpandListener != null) {
            cVar = new C0075c(onActionExpandListener);
        } else {
            cVar = null;
        }
        bVar.setOnActionExpandListener(cVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        d dVar;
        C0287b bVar = this.f5546d;
        if (onMenuItemClickListener != null) {
            dVar = new d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        bVar.setOnMenuItemClickListener(dVar);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f5546d.setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f5546d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f5546d.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f5546d.setTitle(i2);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5546d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f5546d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        return this.f5546d.setVisible(z2);
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f5546d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f5546d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f5546d.setIcon(drawable);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f5546d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f5546d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f5546d.setTitle(charSequence);
        return this;
    }
}
