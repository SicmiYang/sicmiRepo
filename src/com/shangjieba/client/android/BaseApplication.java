package com.shangjieba.client.android;

import android.app.Application;

import com.shangjieba.client.android.enity.ScrnSize;
import com.shangjieba.client.android.util.DisplayUtil;

public class BaseApplication extends Application{

	private static BaseApplication instance;
	private ScrnSize scrn;
	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
		scrn = DisplayUtil.getScreenWidth(instance);
	}
	public static BaseApplication getInstence(){
		return instance;
	}
}
