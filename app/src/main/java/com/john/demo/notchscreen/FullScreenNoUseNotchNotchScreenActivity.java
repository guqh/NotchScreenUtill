package com.john.demo.notchscreen;

import android.os.Bundle;

import com.john.tools.notchscreen.NotchTools;
import com.john.tools.notchscreen.base.BaseNotchScreenActivity;

/**
 * 全屏但不占用刘海屏区域
 */
public class FullScreenNoUseNotchNotchScreenActivity extends BaseNotchScreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_no_use_notch);
        NotchTools.getFullScreenTools().fullScreenDontUseStatus(this);
    }

    /**
     * onWindowFocusChanged最好也进行全屏适配，防止失去焦点又重回焦点时的flag不正确。
     * @param hasFocus
     */
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            NotchTools.getFullScreenTools().fullScreenDontUseStatusForOnWindowFocusChanged(this);
        }
        super.onWindowFocusChanged(hasFocus);
    }
}
