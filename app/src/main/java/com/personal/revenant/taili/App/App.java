package com.personal.revenant.taili.App;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.lzy.okgo.OkGo;
import com.personal.revenant.taili.utils.Constant;
import com.umeng.commonsdk.BuildConfig;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;
import okhttp3.OkHttpClient;

import static com.personal.revenant.taili.utils.Constant.QQAPP_ID;
import static com.personal.revenant.taili.utils.Constant.QQSECRET;

/**
 * Created by Administrator on 2018/8/23.
 */

public class App extends Application {
    public static OkHttpClient okHttpClient;
    @Override
    public void onCreate() {
        super.onCreate();
//        UMShareAPI.get(this);
        OkGo.getInstance().init(this);
        Stetho.initializeWithDefaults(this);
        if (BuildConfig.DEBUG) {
            UMConfigure.setLogEnabled(true);
        }
        UMConfigure.init(this, "5b8f62b9f29d98433c0002eb", "Umeng", UMConfigure.DEVICE_TYPE_PHONE,
                "");
        PlatformConfig.setWeixin(Constant.APP_ID, Constant.SECRET);
        PlatformConfig.setQQZone(QQAPP_ID,QQSECRET);
        initOkHttp();
    }

    private void initOkHttp() {
//        okHttpClient =  new OkHttpClient()
//                .newBuilder()
//                .addNetworkInterceptor(new StethoInterceptor()) // 这里添加一个拦截器即可
//                .build();
    }


}
