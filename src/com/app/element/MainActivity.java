package com.app.mywebapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.C0089b;
import androidx.appcompat.app.C0091d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0138i0;
import androidx.core.view.C0165w0;
import androidx.core.view.V0;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.navigation.NavigationView;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends C0091d implements NavigationView.d {
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public static final String f4147T = "MainActivity";
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public SwipeRefreshLayout f4148B;

    /* renamed from: C  reason: collision with root package name */
    NavigationView f4149C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public String f4150D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public ValueCallback f4151E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f4152F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public View f4153G;

    /* renamed from: H  reason: collision with root package name */
    WebView f4154H;

    /* renamed from: I  reason: collision with root package name */
    ImageView f4155I;

    /* renamed from: J  reason: collision with root package name */
    String f4156J;

    /* renamed from: K  reason: collision with root package name */
    String f4157K;

    /* renamed from: L  reason: collision with root package name */
    ProgressBar f4158L;

    /* renamed from: M  reason: collision with root package name */
    WebChromeClient f4159M;

    /* renamed from: N  reason: collision with root package name */
    Context f4160N;

    /* renamed from: O  reason: collision with root package name */
    DrawerLayout f4161O;

    /* renamed from: P  reason: collision with root package name */
    C0089b f4162P;

    /* renamed from: Q  reason: collision with root package name */
    Toolbar f4163Q;

    /* renamed from: R  reason: collision with root package name */
    S.a f4164R;

    /* renamed from: S  reason: collision with root package name */
    Boolean f4165S = Boolean.FALSE;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            MainActivity.this.finish();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            MainActivity.this.f4165S = Boolean.FALSE;
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            MainActivity.this.finish();
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            MainActivity.this.f4160N.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    class g extends C0089b {
        g(Activity activity, DrawerLayout drawerLayout, int i2, int i3) {
            super(activity, drawerLayout, i2, i3);
        }

        public void b(View view) {
        }

        public void d(View view) {
        }
    }

    class h implements Runnable {
        h() {
        }

        public void run() {
            MainActivity.this.f4155I.setVisibility(8);
            MainActivity.this.f4154H.setVisibility(0);
            if (MainActivity.this.f4160N.getPackageName().equalsIgnoreCase("com.app.mywebapp")) {
                MainActivity.this.L0();
            }
        }
    }

    class i implements View.OnLongClickListener {
        i() {
        }

        public boolean onLongClick(View view) {
            return !MainActivity.this.getResources().getBoolean(R.bool.TextSelection);
        }
    }

    class j implements ViewTreeObserver.OnGlobalLayoutListener {
        j() {
        }

        public void onGlobalLayout() {
            if (MainActivity.this.f4154H.getRootView().getHeight() - MainActivity.this.f4154H.getHeight() < 100) {
                MainActivity.this.S0();
            }
        }
    }

    class k extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        private View f4176a;

        class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JsResult f4178a;

            a(JsResult jsResult) {
                this.f4178a = jsResult;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                this.f4178a.confirm();
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JsResult f4180a;

            b(JsResult jsResult) {
                this.f4180a = jsResult;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                this.f4180a.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JsResult f4182a;

            c(JsResult jsResult) {
                this.f4182a = jsResult;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                this.f4182a.confirm();
            }
        }

        k() {
        }

        public View getVideoLoadingProgressView() {
            if (this.f4176a == null) {
                this.f4176a = LayoutInflater.from(MainActivity.this).inflate(R.layout.video_progress, (ViewGroup) null);
            }
            return this.f4176a;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            onConsoleMessage(consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId());
            return true;
        }

        public void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(j3 * 2);
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        public void onHideCustomView() {
            super.onHideCustomView();
            if (MainActivity.this.f4153G != null) {
                MainActivity.this.f4153G.setVisibility(8);
                MainActivity.this.f4154H.setVisibility(0);
                MainActivity.this.getWindow().clearFlags(128);
                MainActivity.this.f4152F.onCustomViewHidden();
                View unused = MainActivity.this.f4153G = null;
            }
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            new AlertDialog.Builder(MainActivity.this).setTitle(MainActivity.this.getString(R.string.app_name)).setMessage(str2).setPositiveButton(17039370, new a(jsResult)).setCancelable(false).create().show();
            return true;
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            new AlertDialog.Builder(MainActivity.this.f4160N).setTitle(MainActivity.this.getString(R.string.app_name)).setMessage(str2).setPositiveButton(17039370, new c(jsResult)).setNegativeButton(17039360, new b(jsResult)).create().show();
            return true;
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (Build.VERSION.SDK_INT > 21) {
                permissionRequest.grant(permissionRequest.getResources());
            }
        }

        public void onProgressChanged(WebView webView, int i2) {
            if (i2 < 100 && MainActivity.this.f4158L.getVisibility() == 8) {
                MainActivity.this.f4158L.setVisibility(0);
            }
            MainActivity.this.f4158L.setProgress(i2);
            if (i2 == 100) {
                MainActivity.this.f4158L.setVisibility(8);
                if (MainActivity.this.f4148B.h()) {
                    MainActivity.this.f4148B.setRefreshing(false);
                }
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (MainActivity.this.f4153G != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            View unused = MainActivity.this.f4153G = view;
            MainActivity.this.f4154H.setVisibility(4);
            MainActivity.this.getWindow().addFlags(128);
            ((FrameLayout) MainActivity.this.getWindow().getDecorView()).addView(MainActivity.this.f4153G, new FrameLayout.LayoutParams(-1, -1));
            WebChromeClient.CustomViewCallback unused2 = MainActivity.this.f4152F = customViewCallback;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onShowFileChooser(android.webkit.WebView r4, android.webkit.ValueCallback r5, android.webkit.WebChromeClient.FileChooserParams r6) {
            /*
                r3 = this;
                com.app.mywebapp.MainActivity r4 = com.app.mywebapp.MainActivity.this
                android.webkit.ValueCallback r4 = r4.f4151E
                r6 = 0
                if (r4 == 0) goto L_0x0012
                com.app.mywebapp.MainActivity r4 = com.app.mywebapp.MainActivity.this
                android.webkit.ValueCallback r4 = r4.f4151E
                r4.onReceiveValue(r6)
            L_0x0012:
                com.app.mywebapp.MainActivity r4 = com.app.mywebapp.MainActivity.this
                android.webkit.ValueCallback unused = r4.f4151E = r5
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.media.action.IMAGE_CAPTURE"
                r4.<init>(r5)
                com.app.mywebapp.MainActivity r5 = com.app.mywebapp.MainActivity.this
                android.content.pm.PackageManager r5 = r5.getPackageManager()
                android.content.ComponentName r5 = r4.resolveActivity(r5)
                if (r5 == 0) goto L_0x006e
                com.app.mywebapp.MainActivity r5 = com.app.mywebapp.MainActivity.this     // Catch:{ IOException -> 0x003e }
                java.io.File r5 = r5.O0()     // Catch:{ IOException -> 0x003e }
                java.lang.String r0 = "PhotoPath"
                com.app.mywebapp.MainActivity r1 = com.app.mywebapp.MainActivity.this     // Catch:{ IOException -> 0x003c }
                java.lang.String r1 = r1.f4150D     // Catch:{ IOException -> 0x003c }
                r4.putExtra(r0, r1)     // Catch:{ IOException -> 0x003c }
                goto L_0x0049
            L_0x003c:
                r0 = move-exception
                goto L_0x0040
            L_0x003e:
                r0 = move-exception
                r5 = r6
            L_0x0040:
                java.lang.String r1 = com.app.mywebapp.MainActivity.f4147T
                java.lang.String r2 = "Image file creation failed"
                android.util.Log.e(r1, r2, r0)
            L_0x0049:
                if (r5 == 0) goto L_0x006f
                com.app.mywebapp.MainActivity r6 = com.app.mywebapp.MainActivity.this
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "file:"
                r0.append(r1)
                java.lang.String r1 = r5.getAbsolutePath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String unused = r6.f4150D = r0
                java.lang.String r6 = "output"
                android.net.Uri r5 = android.net.Uri.fromFile(r5)
                r4.putExtra(r6, r5)
            L_0x006e:
                r6 = r4
            L_0x006f:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.intent.action.GET_CONTENT"
                r4.<init>(r5)
                java.lang.String r5 = "android.intent.category.OPENABLE"
                r4.addCategory(r5)
                java.lang.String r5 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                r4.putExtra(r5, r0)
                java.lang.String r5 = "*/*"
                r4.setType(r5)
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r1 = "android.media.action.VIDEO_CAPTURE"
                r5.<init>(r1)
                r1 = 0
                if (r6 == 0) goto L_0x0098
                r2 = 2
                android.content.Intent[] r2 = new android.content.Intent[r2]
                r2[r1] = r6
                r2[r0] = r5
                goto L_0x009a
            L_0x0098:
                android.content.Intent[] r2 = new android.content.Intent[r1]
            L_0x009a:
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r6 = "android.intent.action.CHOOSER"
                r5.<init>(r6)
                java.lang.String r6 = "android.intent.extra.INTENT"
                r5.putExtra(r6, r4)
                java.lang.String r4 = "android.intent.extra.TITLE"
                java.lang.String r6 = "Choose File"
                r5.putExtra(r4, r6)
                java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
                r5.putExtra(r4, r2)
                com.app.mywebapp.MainActivity r4 = com.app.mywebapp.MainActivity.this
                r4.startActivityForResult(r5, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.mywebapp.MainActivity.k.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
        }
    }

    class l extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Boolean f4184a;

        class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f4186a;

            a(SslErrorHandler sslErrorHandler) {
                this.f4186a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                this.f4186a.proceed();
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f4188a;

            b(SslErrorHandler sslErrorHandler) {
                this.f4188a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                this.f4188a.cancel();
            }
        }

        l(Boolean bool) {
            this.f4184a = bool;
        }

        /* access modifiers changed from: package-private */
        public Boolean a(String str) {
            if (this.f4184a.booleanValue()) {
                return Boolean.valueOf(MainActivity.this.N0(str));
            }
            if (MainActivity.this.N0(str)) {
                return Boolean.TRUE;
            }
            if (str.contains(MainActivity.this.f4157K)) {
                return Boolean.FALSE;
            }
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return Boolean.TRUE;
        }

        public void onPageFinished(WebView webView, String str) {
            CookieSyncManager.getInstance().sync();
            if (MainActivity.this.getResources().getBoolean(R.bool.enableLiveTitle)) {
                MainActivity.this.f4163Q.setTitle((CharSequence) webView.getTitle());
            }
            super.onPageFinished(webView, str);
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            if (MainActivity.this.getResources().getBoolean(R.bool.isDebugMode)) {
                Context applicationContext = MainActivity.this.getApplicationContext();
                Toast.makeText(applicationContext, i2 + str + str2, 0).show();
            }
            webView.loadUrl("file:///android_asset/404r.html");
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (MainActivity.this.getResources().getBoolean(R.bool.isDebugMode)) {
                Toast.makeText(MainActivity.this.getApplicationContext(), sslError.getPrimaryError(), 0).show();
            }
            AlertDialog create = new AlertDialog.Builder(MainActivity.this).create();
            int primaryError = sslError.getPrimaryError();
            String str = (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? "SSL Certificate error." : "The date of the certificate is invalid" : "The certificate authority is not trusted." : "The certificate hostname mismatch." : "The certificate has expired." : "The certificate is not yet valid.") + " Do you want to continue anyway?";
            create.setTitle("SSL Certificate Error");
            create.setMessage(str);
            create.setButton(-1, "OK, Continue", new a(sslErrorHandler));
            create.setButton(-2, "Cancel", new b(sslErrorHandler));
            create.show();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            super.shouldOverrideUrlLoading(webView, str);
            if (a(str).booleanValue()) {
                return true;
            }
            webView.loadUrl(str);
            return false;
        }
    }

    class m implements DownloadListener {
        m() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            if (MainActivity.this.M0("WRITE_EXTERNAL_STORAGE")) {
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setMimeType(str4);
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
                    request.addRequestHeader("User-Agent", str2);
                    request.setDescription("Downloading file...");
                    request.setTitle(URLUtil.guessFileName(str, str3, str4));
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str, str3, str4));
                    ((DownloadManager) MainActivity.this.getSystemService("download")).enqueue(request);
                    Toast.makeText(MainActivity.this.getApplicationContext(), "Downloading File", 1).show();
                } catch (Exception e2) {
                    Toast.makeText(MainActivity.this.getApplicationContext(), e2.getMessage(), 0).show();
                }
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                MainActivity.this.startActivity(intent);
            }
        }
    }

    class n implements SwipeRefreshLayout.j {
        n() {
        }

        public void a() {
            MainActivity.this.f4154H.reload();
        }
    }

    class o implements DialogInterface.OnClickListener {
        o() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            MainActivity.this.finish();
        }
    }

    public class p {

        /* renamed from: a  reason: collision with root package name */
        Context f4193a;

        class a implements Runnable {
            a() {
            }

            public void run() {
                MainActivity.this.f4154H.reload();
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.P0(mainActivity.f4154H);
            }
        }

        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f4197a;

            c(boolean z2) {
                this.f4197a = z2;
            }

            public void run() {
                MainActivity.this.f4154H.setKeepScreenOn(this.f4197a);
            }
        }

        p(Context context) {
            this.f4193a = context;
        }

        @JavascriptInterface
        public void askEnableGPS() {
            MainActivity.this.I0();
        }

        @JavascriptInterface
        public void clickMenuButton() {
            MainActivity.this.openOptionsMenu();
        }

        @JavascriptInterface
        public void exitApp() {
            MainActivity.this.r0();
        }

        @JavascriptInterface
        public String getAppPackageName() {
            try {
                return MainActivity.this.getPackageManager().getPackageInfo(MainActivity.this.getPackageName(), 0).packageName;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return "ERROR";
            }
        }

        @JavascriptInterface
        public int getAppVersionCode() {
            try {
                return MainActivity.this.getPackageManager().getPackageInfo(MainActivity.this.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return 0;
            }
        }

        @JavascriptInterface
        public String getAppVersionName() {
            try {
                return MainActivity.this.getPackageManager().getPackageInfo(MainActivity.this.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return "Error Fetching Version Info";
            }
        }

        @JavascriptInterface
        public int getDeviceApiLevel() {
            return Build.VERSION.SDK_INT;
        }

        @JavascriptInterface
        public String getUniqueDeviceID() {
            return MainActivity.this.Q0();
        }

        @JavascriptInterface
        public void keepScreenOn(boolean z2) {
            MainActivity.this.f4154H.post(new c(z2));
        }

        @JavascriptInterface
        public void openExternal(String str) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }

        @JavascriptInterface
        public void printPage() {
            MainActivity.this.f4154H.post(new b());
        }

        @JavascriptInterface
        public void rateUs() {
            MainActivity.this.U0();
        }

        @JavascriptInterface
        public void refreshPage() {
            MainActivity.this.f4154H.post(new a());
        }

        @JavascriptInterface
        public void shareIntent() {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.f4193a.getString(R.string.sharesubject));
            intent.putExtra("android.intent.extra.TEXT", this.f4193a.getString(R.string.sharetext));
            this.f4193a.startActivity(Intent.createChooser(intent, "Share App via"));
        }

        @JavascriptInterface
        public void showAboutDialog() {
            MainActivity.this.W0();
        }

        @JavascriptInterface
        public void showToast(String str) {
            Toast.makeText(this.f4193a, str, 0).show();
        }

        @JavascriptInterface
        public void showAboutDialog(String str, String str2, String str3) {
            MainActivity.this.X0(str, str2, str3);
        }
    }

    private void H0() {
        if (getResources().getBoolean(R.bool.enableNavDrawer)) {
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            this.f4149C = navigationView;
            Menu menu = navigationView.getMenu();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(new String(this.f4164R.a(s0(R.raw.datx))));
            } catch (Exception e2) {
                Toast.makeText(this.f4160N, e2.getMessage(), 0).show();
            }
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                try {
                    menu.add(0, i2, 0, URLDecoder.decode(jSONArray.getJSONObject(i2).getString("title")));
                    i2++;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            if (getResources().getBoolean(R.bool.showAboutInNav)) {
                int length = jSONArray.length();
                menu.add(1, length + 1, 0, "Share App");
                menu.add(1, length + 2, 0, "Rate Us");
                menu.add(1, length + 3, 0, "About Us");
                menu.add(1, length + 4, 0, "Exit");
            }
            this.f4149C.invalidate();
        }
    }

    private void K0() {
        this.f4154H.setVisibility(8);
        new AlertDialog.Builder(this).setTitle("App Expired").setMessage("As part of the free edition’s terms, this app is available for a limited time from its creation date. To continue using our service without limitations, please consider upgrading to our premium version. For more details, visit our website or contact support.").setPositiveButton("Exit", new o()).setCancelable(false).show();
    }

    /* access modifiers changed from: private */
    public void L0() {
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - 1753554966666L) >= 3) {
            K0();
        } else {
            Y0();
        }
    }

    /* access modifiers changed from: private */
    public boolean M0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("android.permission.");
        sb.append(str);
        return checkCallingOrSelfPermission(sb.toString()) == 0;
    }

    /* access modifiers changed from: private */
    public boolean N0(String str) {
        Intent intent;
        if (str.startsWith("market://")) {
            try {
                this.f4154H.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
            }
            return true;
        }
        if (str.startsWith("tel:")) {
            intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
        } else if (str.startsWith("exit:")) {
            finish();
            return true;
        } else if (!str.startsWith("intent://") || !str.contains("scheme=http")) {
            if (str.startsWith("intent:") || str.startsWith("upi:")) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (parseUri != null) {
                        startActivity(parseUri);
                        return true;
                    }
                    String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                    if (stringExtra != null) {
                        this.f4154H.loadUrl(stringExtra);
                        return true;
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    Intent data = intent2.setData(Uri.parse("market://details?id=" + parseUri.getPackage()));
                    if (data.resolveActivity(getPackageManager()) != null) {
                        startActivity(data);
                        return true;
                    }
                } catch (URISyntaxException unused) {
                }
            } else if (str.startsWith("whatsapp:") || str.startsWith("skype:") || str.startsWith("geo:0,0?q=") || str.startsWith("maps:") || str.startsWith("tg:")) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            } else if (str.startsWith("sms:")) {
                intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            } else if (str.startsWith("mailto:")) {
                intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            } else if (str.contains("#___external")) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            }
            return false;
        } else {
            Matcher matcher = Pattern.compile("intent://(.*?)#").matcher(Uri.decode(str));
            if (!matcher.find()) {
                return false;
            }
            String group = matcher.group(1);
            intent = new Intent("android.intent.action.VIEW", Uri.parse("http://" + group));
        }
        startActivity(intent);
        return true;
    }

    /* access modifiers changed from: private */
    public File O0() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return File.createTempFile("img_" + format + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    public static boolean R0(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static final String T0(String str) {
        String str2 = str + "00110011";
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str2.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private void Y0() {
        new AlertDialog.Builder(this).setTitle("Important Notice").setMessage("This app has been created using the free edition of our platform. Please read the following carefully before using it:\n\n- Unverified Origin: The app may not be an official product of the website it represents. Ensure you trust the source before using the app.\n\n- Potential Cyber Risks: This app may not include certain security features. We advise caution when entering any personal, financial, or sensitive information.\n\n- Fraud Risk: There is a risk of fraudulent apps being created with malicious intent. Verify the authenticity of the app before making any transactions.\n\n- Liability Disclaimer: Our platform is not responsible for the content, security, or functionality of apps created using the free edition. By using this app, you accept full responsibility for any damages, losses, or harm resulting from its use.").setPositiveButton("I Understand", new b()).setNegativeButton("Exit", new a()).setCancelable(false).show();
    }

    private String s0(int i2) {
        InputStream openRawResource = getResources().openRawResource(i2);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, "UTF-8"));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return stringWriter.toString();
    }

    public void I0() {
        if (!R0(this.f4160N)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f4160N);
            builder.setTitle("Enable GPS");
            builder.setMessage("GPS is disabled. Do you want to enable it?");
            builder.setPositiveButton("Settings", new e());
            builder.setNegativeButton("Cancel", new f());
            builder.show();
        }
    }

    /* access modifiers changed from: protected */
    public void J0() {
        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.CAMERA"}, 200);
    }

    public void P0(WebView webView) {
        Context applicationContext;
        String str;
        PrintDocumentAdapter createPrintDocumentAdapter = webView.createPrintDocumentAdapter();
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setMediaSize(PrintAttributes.MediaSize.ISO_A5);
        PrintJob print = ((PrintManager) getSystemService("print")).print(getString(R.string.app_name) + " Document", createPrintDocumentAdapter, builder.build());
        if (print.isCompleted()) {
            applicationContext = getApplicationContext();
            str = "Print Completed";
        } else if (print.isFailed()) {
            applicationContext = getApplicationContext();
            str = "Print Failed";
        } else {
            return;
        }
        Toast.makeText(applicationContext, str, 1).show();
    }

    public String Q0() {
        return Settings.Secure.getString(this.f4160N.getContentResolver(), "android_id");
    }

    public void S0() {
        if (getResources().getBoolean(R.bool.fullscr)) {
            V0 a2 = C0138i0.a(getWindow(), getWindow().getDecorView());
            a2.d(2);
            a2.a(C0165w0.m.d());
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    public void U0() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f4160N.getPackageName()));
        intent.addFlags(1207959552);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f4160N.getPackageName())));
        }
    }

    /* access modifiers changed from: protected */
    public boolean V0() {
        return Build.VERSION.SDK_INT > 23;
    }

    public void W0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.tag);
        builder.setTitle(R.string.aboutTitle);
        builder.setPositiveButton("OK", (DialogInterface.OnClickListener) null);
        builder.setCancelable(true);
        if (!((Activity) this.f4160N).isFinishing()) {
            builder.create().show();
        }
    }

    public void X0(String str, String str2, String str3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setTitle(str2);
        builder.setPositiveButton(str3, (DialogInterface.OnClickListener) null);
        builder.setCancelable(true);
        if (!((Activity) this.f4160N).isFinishing()) {
            builder.create().show();
        }
    }

    public boolean m(MenuItem menuItem) {
        this.f4161O.d(8388611);
        int itemId = menuItem.getItemId();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray = new JSONArray(new String(this.f4164R.a(s0(R.raw.datx))));
        } catch (Exception unused) {
            Toast.makeText(this.f4160N, "Error Occured while initializing nav menu", 0).show();
        }
        try {
            int length = jSONArray.length();
            if (itemId == length + 4) {
                r0();
                return true;
            } else if (itemId == length + 3) {
                W0();
                return true;
            } else if (itemId == length + 2) {
                U0();
                return true;
            } else if (itemId == length + 1) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.sharesubject));
                intent.putExtra("android.intent.extra.TEXT", getString(R.string.sharetext));
                startActivity(Intent.createChooser(intent, "Share via"));
                return true;
            } else {
                this.f4154H.loadUrl(URLDecoder.decode(jSONArray.getJSONObject(itemId).getString("url")));
                this.f4149C.setCheckedItem(itemId);
                menuItem.setCheckable(true);
                return true;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri[] uriArr;
        int i4 = 0;
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1) {
            ValueCallback valueCallback = this.f4151E;
            if (valueCallback != null) {
                if (intent == null) {
                    String str = this.f4150D;
                    if (str != null) {
                        uriArr = new Uri[]{Uri.parse(str)};
                        this.f4151E.onReceiveValue(uriArr);
                        this.f4151E = null;
                    }
                } else if (valueCallback != null) {
                    try {
                        if (intent.getDataString() != null) {
                            uriArr = new Uri[]{Uri.parse(intent.getDataString())};
                        } else if (intent.getClipData() != null) {
                            int itemCount = intent.getClipData().getItemCount();
                            uriArr = new Uri[itemCount];
                            while (i4 < itemCount) {
                                try {
                                    uriArr[i4] = intent.getClipData().getItemAt(i4).getUri();
                                    i4++;
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    this.f4151E.onReceiveValue(uriArr);
                    this.f4151E = null;
                } else {
                    String dataString = intent.getDataString();
                    if (dataString != null) {
                        uriArr = new Uri[]{Uri.parse(dataString)};
                        this.f4151E.onReceiveValue(uriArr);
                        this.f4151E = null;
                    }
                }
            } else {
                return;
            }
        }
        uriArr = null;
        this.f4151E.onReceiveValue(uriArr);
        this.f4151E = null;
    }

    public void onBackPressed() {
        if (!this.f4165S.booleanValue() && this.f4154H.canGoBack()) {
            this.f4154H.goBack();
            this.f4165S = Boolean.TRUE;
        } else {
            r0();
        }
        new Handler().postDelayed(new c(), 200);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(R.bool.flag_secure)) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView((int) R.layout.activity_main);
        this.f4154H = (WebView) findViewById(R.id.webView);
        this.f4155I = (ImageView) findViewById(R.id.imageView);
        this.f4164R = new S.a(T0(getString(R.string.devid)).substring(0, 16), getString(R.string.devid).substring(0, 16));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh_items);
        this.f4148B = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(-16776961, -65536, -16711936);
        this.f4161O = (DrawerLayout) findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f4163Q = toolbar;
        o0(toolbar);
        e0().v(getResources().getBoolean(R.bool.enableNavDrawer));
        e0().s(getResources().getBoolean(R.bool.enableNavDrawer));
        g gVar = new g(this, this.f4161O, R.string.app_name, R.string.app_name);
        this.f4162P = gVar;
        this.f4161O.setDrawerListener(gVar);
        this.f4162P.i();
        H0();
        ((NavigationView) findViewById(R.id.nav_view)).setNavigationItemSelectedListener(this);
        this.f4160N = this;
        this.f4158L = (ProgressBar) findViewById(R.id.progressBar);
        if (!getResources().getBoolean(R.bool.defaultProgressBar)) {
            this.f4158L.setIndeterminateDrawable(getResources().getDrawable(R.drawable.spinr));
        }
        Boolean valueOf = Boolean.valueOf(getResources().getBoolean(R.bool.extlink));
        getString(R.string.csum).toUpperCase().substring(0, 16);
        WebSettings settings = this.f4154H.getSettings();
        if (V0()) {
            J0();
        }
        S0();
        if (getResources().getBoolean(R.bool.desktopMode)) {
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
        }
        if (getResources().getBoolean(R.bool.hideMobileUserAgent)) {
            settings.setUserAgentString(settings.getUserAgentString().replace("Mobile", "").replace("Android", ""));
        }
        this.f4156J = "https://elemsocial.com/?";
        Uri data = getIntent().getData();
        if (data != null) {
            this.f4156J = data.toString();
        }
        try {
            this.f4157K = new URL(this.f4156J).getHost();
        } catch (Exception unused) {
            this.f4157K = "Error";
        }
        this.f4154H.setVisibility(8);
        this.f4155I.setVisibility(0);
        if (!getResources().getBoolean(R.bool.enableToolBar)) {
            this.f4163Q.setVisibility(8);
        }
        if (!getResources().getBoolean(R.bool.enableNavDrawer)) {
            this.f4161O.setDrawerLockMode(1);
        }
        this.f4148B.setEnabled(getResources().getBoolean(R.bool.enablePullRefresh));
        new Handler().postDelayed(new h(), (long) getResources().getInteger(R.integer.duration));
        if (getString(R.string.CacheMode).equals("NoCache")) {
            settings.setCacheMode(2);
        } else if (getString(R.string.CacheMode).equals("HighCache")) {
            settings.setCacheMode(1);
        } else {
            settings.setCacheMode(-1);
        }
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        int i2 = Build.VERSION.SDK_INT;
        this.f4154H.setLayerType(2, (Paint) null);
        this.f4154H.setScrollBarStyle(33554432);
        settings.setSaveFormData(getResources().getBoolean(R.bool.SaveFormData));
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(getApplicationContext().getDir("database", 0).getPath());
        settings.setDomStorageEnabled(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        this.f4154H.setHapticFeedbackEnabled(true);
        this.f4154H.setHorizontalScrollBarEnabled(getResources().getBoolean(R.bool.ScrollBars));
        this.f4154H.setVerticalScrollBarEnabled(getResources().getBoolean(R.bool.ScrollBars));
        this.f4154H.setLongClickable(true);
        if (getResources().getBoolean(R.bool.hideWebView)) {
            this.f4154H.getSettings().setUserAgentString(this.f4154H.getSettings().getUserAgentString().replace("wv", ""));
        }
        settings.setGeolocationEnabled(true);
        settings.setMixedContentMode(2);
        if (getResources().getBoolean(R.bool.askGPS)) {
            I0();
        }
        WebView.setWebContentsDebuggingEnabled(getResources().getBoolean(R.bool.isDebugMode));
        if (getResources().getBoolean(R.bool.enableJsApi)) {
            this.f4154H.addJavascriptInterface(new p(this), "Android");
        }
        this.f4154H.setOnLongClickListener(new i());
        settings.setAllowFileAccess(getResources().getBoolean(R.bool.allow_file_access));
        boolean z2 = getResources().getBoolean(R.bool.allow_x_origin_from_file);
        settings.setAllowFileAccessFromFileURLs(z2);
        settings.setAllowUniversalAccessFromFileURLs(z2);
        this.f4154H.loadUrl(this.f4156J);
        this.f4154H.getViewTreeObserver().addOnGlobalLayoutListener(new j());
        this.f4154H.setScrollBarStyle(33554432);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(getResources().getBoolean(R.bool.gestureZoom));
        settings.setDisplayZoomControls(getResources().getBoolean(R.bool.Zoom));
        CookieManager.setAcceptFileSchemeCookies(true);
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.acceptCookie();
        CookieSyncManager.createInstance(this.f4160N);
        if (i2 > 21) {
            instance.setAcceptThirdPartyCookies(this.f4154H, true);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (bundle != null) {
            this.f4154H.restoreState(bundle);
        }
        k kVar = new k();
        this.f4159M = kVar;
        this.f4154H.setWebChromeClient(kVar);
        this.f4154H.setWebViewClient(new l(valueOf));
        this.f4154H.setDownloadListener(new m());
        this.f4148B.setOnRefreshListener(new n());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_home).setVisible(getResources().getBoolean(R.bool.showHomeBtn));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f4162P.f(menuItem)) {
            return true;
        }
        int itemId = menuItem.getItemId();
        Intent intent = new Intent("android.intent.action.SEND");
        if (itemId == R.id.action_exit) {
            r0();
            return true;
        } else if (itemId == R.id.action_tag) {
            W0();
            return true;
        } else if (itemId == R.id.rate_us) {
            U0();
            return true;
        } else if (itemId == R.id.action_share) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.sharesubject));
            intent.putExtra("android.intent.extra.TEXT", getString(R.string.sharetext));
            startActivity(Intent.createChooser(intent, "Share via"));
            return true;
        } else {
            if (itemId == R.id.action_home) {
                this.f4154H.loadUrl(this.f4156J);
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onPause() {
        CookieSyncManager.getInstance().stopSync();
        this.f4154H.onPause();
        super.onPause();
    }

    public void onResume() {
        S0();
        CookieSyncManager.getInstance().startSync();
        this.f4154H.onResume();
        super.onResume();
    }

    public void r0() {
        if (getResources().getBoolean(R.bool.confexit)) {
            new AlertDialog.Builder(this).setTitle(R.string.cnfExit).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, new d()).create().show();
        } else {
            finish();
        }
    }
}
