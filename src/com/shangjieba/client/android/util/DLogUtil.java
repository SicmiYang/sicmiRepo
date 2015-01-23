package com.shangjieba.client.android.util;

import android.util.Log;

import com.shangjieba.client.android.config.Constants;

//日志管理
public class DLogUtil {
	public static void d_i(String msg){
		if(!Constants.LOG_SWITCH)return;
		Log.i(Constants.LOG_STRING, msg);
	}
	public static void d_w(String msg){
		if(!Constants.LOG_SWITCH)return;
		Log.w(Constants.LOG_STRING, msg);
	}
	public static void d_e(String msg){
		if(!Constants.LOG_SWITCH)return;
		Log.e(Constants.LOG_STRING, msg);
	}
	public static void syso(Object object){
		if(!Constants.LOG_SWITCH)return;
		System.out.print(object);
	}
}
