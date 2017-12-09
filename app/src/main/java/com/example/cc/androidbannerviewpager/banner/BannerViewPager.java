package com.example.cc.androidbannerviewpager.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Field;

/**
 * Created by cc on 2017/12/8.
 */

public class BannerViewPager extends ViewPager {


    /**
     * 实现自动轮播的消息
     */
    private static final int SCROLL_MSG = 0X0011;

    //页面切换时间
    private long mCutDownTime = 3500;


    //注意这里会造成内存泄漏,,如果不销毁mHandler会导致Activity不能销毁.

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //实现自动轮播
            setCurrentItem(getCurrentItem() + 1);

            startRoll();
        }
    };


    //自定义BannerViewPager -- 自定义Adapter
    private BannerAdapter mAdapter;
    //自定义页面切换的Scroller
    private BannerScroller mBannerScroller;


    public BannerViewPager(@NonNull Context context) {
        super(context);
        init(context);
    }

    public BannerViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);


    }

    private void init(Context context) {
        //改变ViewPager切换的速率
        //改变延时时间
        //改变Scroller
        try {
            Field field = ViewPager.class.getDeclaredField("mScroller");
            //设置参数,第一个object代表当前属性的哪个类,第二个参数代表要设置的属性值
            mBannerScroller = new BannerScroller(context);
            field.setAccessible(true);
            field.set(this, mBannerScroller);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置延时时间
     *
     * @param scrollerDuration
     */
    public void setScrollerDuration(int scrollerDuration) {
        mBannerScroller.setScrollerDuration(scrollerDuration);
    }


    public void setAdapter(BannerAdapter adapter) {

        this.mAdapter = adapter;

        //设置ViewPager的Adapter
        setAdapter(new BannerPagerAdapter());
    }


    /**
     * 设置开始自动轮播
     */
    public void startRoll() {

        mHandler.removeMessages(SCROLL_MSG);

        //消息,延时时间
        mHandler.sendEmptyMessageDelayed(SCROLL_MSG, mCutDownTime);
    }


    /**
     * 销毁Activity时会回调该方法,销毁mHandler,防止内存泄漏
     */
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mHandler.removeCallbacksAndMessages(null);
        mHandler = null;
    }

    private class BannerPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }


        /**
         * 创建ViewPager 条目回调的方法
         *
         * @param container
         * @param position
         * @return
         */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            //采用Adapter设置模式,来完成用户自定义条目


            View bannerItemView = mAdapter.getView(position % mAdapter.getCount());
            container.addView(bannerItemView);
            return bannerItemView;
        }

        /**
         * 销毁条目回调的方法
         * @param container
         * @param position
         * @param object
         */
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
            object = null;
        }
    }
}
