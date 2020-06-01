package com.john.tools.notchscreen.base;

import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.john.tools.notchscreen.NotchTools;
import com.john.tools.notchscreen.R;

/**
 * 全部 activity 的最 基类
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * 刘海容器
     */
    private FrameLayout mNotchContainer;
    /**
     * 主内容区
     */
    private FrameLayout mContentContainer;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(R.layout.activity_base);
        mNotchContainer = findViewById(R.id.notch_container);
        mNotchContainer.setTag(NotchTools.NOTCH_CONTAINER);
        mContentContainer = findViewById(R.id.content_container);
        onBindContentContainer(layoutResID);
    }

    private void onBindContentContainer(int layoutResID) {
        LayoutInflater.from(this).inflate(layoutResID, mContentContainer, true);
    }
}
