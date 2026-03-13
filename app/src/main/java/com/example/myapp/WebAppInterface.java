package com.example.myapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {

    private Context mContext;
    private Runnable showAdCallback;

    public WebAppInterface(Context context, Runnable showAdCallback) {
        this.mContext = context;
        this.showAdCallback = showAdCallback;
    }

    @JavascriptInterface
    public void showToast(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void showVideoAd() {
        if (showAdCallback != null) {
            ((android.app.Activity) mContext).runOnUiThread(showAdCallback);
        }
    }
}
