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
    public abstract View getView(int position,View convertView);

    public abstract int getCount();

    /**
     * 需要标题的时候实现
     * @param currentPosition
     * @return
     */
    public String getBannerDesc(int currentPosition){

        return "";
    }
}
