package com.shangjieba.client.android;

import com.shangjieba.client.android.util.DLogUtil;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;

public class BaseActivity extends Activity{

	protected Context mContext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = this;
		if(this.getResources().getConfiguration().orientation !=Configuration.ORIENTATION_PORTRAIT){
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		}
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		DLogUtil.d_i(this.getClass().getSimpleName());
		DLogUtil.d_w(this.getClass().getSimpleName());
		DLogUtil.d_e(this.getClass().getSimpleName());
	}
}
