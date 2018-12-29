package com.personal.revenant.taili.event;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by Administrator on 2018/8/23.
 */

public class JsApi {
    private JsCallback jsCallback;

    public JsApi(JsCallback callback) {
        this.jsCallback = callback;
    }


    @JavascriptInterface
    public void toPay(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.jsGetAlipayParams(params);
    }

    @JavascriptInterface
    public void addHeadImg(Object params) {
        Log.d("图片数据是", params.toString());
        jsCallback.addHeadImg(params);
    }

    @JavascriptInterface
    public void addBackImg(Object params) {
        Log.d("图片数据是", params.toString());
        jsCallback.addBackImg(params);
    }

    @JavascriptInterface
    public void addManyImg(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.addManyImg(params);
    }

    @JavascriptInterface
    public void share(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.takeShare(params);
    }

    @JavascriptInterface
    public void third_party_login(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.third_party_login(params);
    }

    @JavascriptInterface
    public void copyordercode(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.takeShare(params);
    }


    @JavascriptInterface
    public void canExit(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.takeExit(params);
    }


    @JavascriptInterface
    public void addLabel(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.addLabel(params);
    }

    @JavascriptInterface
    public void addCertificate(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.addCertificate(params);
    }

    @JavascriptInterface
    public void submitAfter(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.submitAfter(params);
    }

    @JavascriptInterface
    public void unInitalImg(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.unInitalImg(params);
    }


    @JavascriptInterface
    public void unInitalC(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.unInitalC(params);
    }
    @JavascriptInterface
    public void callPhone(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.callPhone(params);
    }
    @JavascriptInterface
    public void getClientId(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.getClientId(params);
    }

    @JavascriptInterface
    public void mapgetInfo(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.mapgetInfo(params);
    }

//    @JavascriptInterface
//    public void wechatLogin(Object params) {
//        Log.d("jsApi: params ---->>>>", params.toString());
//        jsCallback.wechatLogin(params);
//    }

    public interface JsCallback {
        /**
         * 调用支付
         **/
        void jsGetAlipayParams(Object params);

        /**
         * 上传头像
         **/
        void addHeadImg(Object params);

        /**
         * 多图上传
         **/
        void addManyImg(Object params);

        /**
         * 上传背景
         **/
        void addBackImg(Object params);

        /**
         * 分享
         **/
        void takeShare(Object params);

        /**
         * 拷贝到剪切板
         **/
        void takeCopy(Object params);

        /**
         * 是否可以退出
         **/
        void takeExit(Object params);

        void third_party_login(Object params);

        void addLabel(Object params);

        void addCertificate(Object params);

        void submitAfter(Object params);

        void unInitalImg(Object params);
        void unInitalC(Object params);
        void callPhone(Object params);

        void getClientId(Object params);
        void mapgetInfo(Object params);
//        void wechatLogin(Object params);


    }
}
