# Keep WebAppInterface methods accessible from JavaScript
-keepclassmembers class com.example.myapp.WebAppInterface {
    @android.webkit.JavascriptInterface <methods>;
}

# Keep AdMob classes
-keep class com.google.android.gms.ads.** { *; }
