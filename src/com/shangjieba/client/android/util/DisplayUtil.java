package com.shangjieba.client.android.util;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;

import com.shangjieba.client.android.enity.ScrnSize;

public class DisplayUtil {
	public static ScrnSize getScreenWidth(Context context){
		DisplayMetrics dm = context.getResources().getDisplayMetrics();
		return new ScrnSize(dm.widthPixels, dm.heightPixels,dm.density);
	}

	/**
	 * dip转px
	 * @param context
	 * @param dipValue
	 * @return
	 */
	public static int dip2px(Context context, float dipValue){            
		final float scale = context.getResources().getDisplayMetrics().density;                 
		return (int)(dipValue * scale + 0.5f);         
	}     

	/**
	 * px转dip
	 * @param context
	 * @param pxValue
	 * @return
	 */
	public static int px2dip(Context context, float pxValue){                
		final float scale = context.getResources().getDisplayMetrics().density;                 
		return (int)(pxValue / scale + 0.5f);         
	} 
}
