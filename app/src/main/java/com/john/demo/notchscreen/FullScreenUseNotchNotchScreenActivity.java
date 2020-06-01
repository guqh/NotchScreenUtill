package com.john.demo.notchscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.john.tools.notchscreen.NotchTools;
import com.john.tools.notchscreen.base.BaseNotchScreenActivity;
import com.john.tools.notchscreen.core.NotchProperty;
import com.john.tools.notchscreen.core.OnNotchCallBack;

/**
 * 全屏且占用刘海屏区域
 */
public class FullScreenUseNotchNotchScreenActivity extends BaseNotchScreenActivity implements OnNotchCallBack {


    private ImageView mBackView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_use_notch);
        mBackView = findViewById(R.id.img_back);
        mBackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        NotchTools.getFullScreenTools().fullScreenUseStatusForActivityOnCreate(this, this);
    }

    /**
     * 顶部的控件如果需要下移 需要在这个回调里面重新配置 位置
     * <p>
     * 比如这个  返回按钮（标题栏。。。）
     */
    @Override
    public void onNotchPropertyCallback(NotchProperty notchProperty) {
        int marginTop = notchProperty.getMarginTop();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBackView.getLayoutParams();
        layoutParams.topMargin += marginTop;
        mBackView.setLayoutParams(layoutParams);
    }

    /**
     * onWindowFocusChanged最好也进行全屏适配，防止失去焦点又重回焦点时的flag不正确。
     *
     * @param hasFocus
     */
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            NotchTools.getFullScreenTools().fullScreenUseStatusForOnWindowFocusChanged(this);
        }
        super.onWindowFocusChanged(hasFocus);
    }
}
