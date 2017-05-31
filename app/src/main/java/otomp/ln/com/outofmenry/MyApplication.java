package otomp.ln.com.outofmenry;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * date:2017/5/31
 * author:易宸锋(dell)
 * function:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化内存优化工具
        LeakCanary.install(this);
    }
}
