package com.personal.revenant.taili.utils;

import android.content.Context;
import android.util.Log;

import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;
import com.personal.revenant.taili.bean.C;
import com.personal.revenant.taili.bean.Event;

import org.greenrobot.eventbus.EventBus;


public class DemoIntentService extends GTIntentService {
    private GetClientId getClientId;

    public DemoIntentService(GetClientId getClientId) {
        this.getClientId = getClientId;
    }

    public DemoIntentService() {

    }

    public interface GetClientId {
        void GetClientId(Object params);
    }

    @Override
    public void onReceiveClientId(Context context, String clientid) {
//        Log.e(TAG, "onReceiveClientId -> " + "clientid = " + clientid);
        Event event=new Event(C.EventCode.A,clientid);
        EventBus.getDefault().post(event);
//        getClientId.GetClientId(clientid);
    }

    @Override
    public void onReceiveServicePid(Context context, int i) {

    }

    @Override
    public void onReceiveMessageData(Context context, GTTransmitMessage gtTransmitMessage) {

    }

    @Override
    public void onReceiveOnlineState(Context context, boolean b) {

    }

    @Override
    public void onReceiveCommandResult(Context context, GTCmdMessage gtCmdMessage) {

    }

    @Override
    public void onNotificationMessageArrived(Context context, GTNotificationMessage gtNotificationMessage) {

    }

    @Override
    public void onNotificationMessageClicked(Context context, GTNotificationMessage gtNotificationMessage) {

    }


}