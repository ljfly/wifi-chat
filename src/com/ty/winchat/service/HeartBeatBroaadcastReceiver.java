package com.ty.winchat.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ty.winchat.ui.MessageChat.MessageUpdateBroadcastReceiver;
/**
 *��ֻ���ͨ��˫��

 */
public class HeartBeatBroaadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent intent2=new Intent();
		intent2.setAction(MessageUpdateBroadcastReceiver.ACTION_HEARTBEAT);
		context.sendBroadcast(intent2);
	/*	intent.getData().getSchemeSpecificPart(); */
	}

}
