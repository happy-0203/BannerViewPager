package com.example.cc.androidbannerviewpager.banner;

import android.view.View;

/**
 * Created by cc on 2017/12/8.
 */

public abstract class BannerAdapter {
    /**
     * 根据位置获取ViewPager里面的子view
     * @return
     */
    public abstract View getView(int position);

    public abstract int getCount();

    public String getBannerDesc(int currentPosition){

        return "";
    }
}
