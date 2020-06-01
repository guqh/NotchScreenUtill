package com.john.tools.notchscreen.phone;

import android.app.Activity;
import android.view.Window;

import com.john.tools.notchscreen.core.AbsNotchScreenSupport;
import com.john.tools.notchscreen.core.OnNotchCallBack;

/**
 * 其他通用屏幕处理
 */
public class CommonScreen extends AbsNotchScreenSupport {

    @Override
    public boolean isNotchScreen(Window window) {
        return false;
    }

    @Override
    public int getNotchHeight(Window window) {
        return 0;
    }

    @Override
    public void fullScreenDontUseStatus(Activity activity, OnNotchCallBack notchCallBack) {
        super.fullScreenDontUseStatus(activity, notchCallBack);
    }

    @Override
    public void fullScreenUseStatus(Activity activity, OnNotchCallBack notchCallBack) {
        super.fullScreenUseStatus(activity, notchCallBack);
    }

}