# NotchScreenUtill
用于国内各手机厂商刘海屏的适配
华为手机
小米手机
OPPO手机
VIVO手机
三星手机
ANDROID P全面屏手机

##使用方法
- 1. 
- 2. 项目中的Activity都需要继承BaseNotchScreenActivity
- 3. 适配全屏但不占用刘海情况
     ```
     NotchTools.getFullScreenTools().fullScreenDontUseStatus(this);
     ```
