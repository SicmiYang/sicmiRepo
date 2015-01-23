package com.shangjieba.client.android.activiy;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.shangjieba.client.android.BaseActivity;
import com.shangjieba.client.android.R;

public class WelcomeActivity extends BaseActivity{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageView imageView = new ImageView(mContext);
		imageView.setImageResource(R.drawable.sjb_startup_screen_bg);
		imageView.setScaleType(ScaleType.CENTER_CROP);
		setContentView(imageView);
	}
}
