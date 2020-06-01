# NotchScreenUtill
用于国内各手机厂商刘海屏的适配
华为手机
小米手机
OPPO手机
VIVO手机
三星手机
ANDROID P全面屏手机

##使用方法
- Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
- Add the dependency

	dependencies {
	        implementation 'com.github.guqh:NotchScreenUtill:Tag'
	}
- 项目中的Activity都需要继承BaseNotchScreenActivity
- 适配全屏但不占用刘海情况
```
NotchTools.getFullScreenTools().fullScreenDontUseStatus(this);
```
- 适配全屏且占用刘海情况
```
   /**
     * 注： 对于需要使用刘海区域的适配中，比如返回按钮，或者标题栏等等。。。
     * 需要在OnNotchCallBack回调的onNotchPropertyCallback方法中获取状态栏高度notchHeight
     * 然后自行去为自己的布局或者View做下移操作
     * <p>
     * 比如这个  返回按钮（标题栏。。。）
     */
NotchTools.getFullScreenTools().fullScreenUseStatus(this, new OnNotchCallBack() {
            @Override
            public void onNotchPropertyCallback(NotchProperty notchProperty) {
                int marginTop = notchProperty.getMarginTop();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBackView.getLayoutParams();
                layoutParams.topMargin += marginTop;
                mBackView.setLayoutParams(layoutParams);
            }
        });
```
