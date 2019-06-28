package com.paykun.globallayoutlistener;

import android.content.Context;

public class Utils {

    public static int getStatusBarHeight(Context context) {
        int statusBarHeightId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (statusBarHeightId > 0) {
            return context.getResources().getDimensionPixelSize(statusBarHeightId);
        }
        return 0;
    }

    public static int getNavigationBarHeight( Context context) {
        int navBarHeightId = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (navBarHeightId > 0) {
            return context.getResources().getDimensionPixelSize(navBarHeightId);
        }
        return 0;
    }
}
