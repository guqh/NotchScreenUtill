package com.john.tools.notchscreen.core;

/**
 * 刘海适配回调接口
 */

public interface OnNotchCallBack {

    /**
     * 刘海（状态栏）的属性回调
     *
     * @param notchProperty
     */
    void onNotchPropertyCallback(NotchProperty notchProperty);

}
