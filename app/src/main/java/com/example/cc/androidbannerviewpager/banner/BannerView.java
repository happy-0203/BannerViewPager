package com.example.cc.androidbannerviewpager.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.cc.androidbannerviewpager.R;

/**
 * Created by cc on 2017/12/9.
 */

public class BannerView extends RelativeLayout {

    //自定义BannerView--轮播的ViewPager

    private BannerViewPager mBannerViewPager;
    //轮播的描述
    private TextView mBannerDescTv;
    //点的容器
    private LinearLayout mBannerDotContainer;

    private Context mContext;

    //正常状态的指示器
    private Drawable mDotIndicatorNormalDrawable;

    //选中状态的指示器

    private Drawable mDotIndicatorFocusDrawable;

    //当前选中的位置
    private int mCurrentPosition = 0;


    //自定义的BannerAdapter
    private BannerAdapter mAdapter;

    public BannerView(Context context) {
        this(context, null);

    }

    public BannerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public BannerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();

        mDotIndicatorFocusDrawable = new ColorDrawable(Color.RED);
        mDotIndicatorNormalDrawable = new ColorDrawable(Color.WHITE);


    }

    private void initView() {
        //加载布局
        //View view = View.inflate(context, R.layout.ui_banner_layout, this);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.ui_banner_layout, this, true);


        mBannerViewPager = view.findViewById(R.id.banner_vp);
        mBannerDescTv = view.findViewById(R.id.banner_desc_tv);
        mBannerDotContainer = view.findViewById(R.id.dot_container);
    }


    /**
     * 设置适配器
     *
     * @param adapter
     */
    public void setAdapter(BannerAdapter adapter) {
        this.mAdapter = adapter;
        mBannerViewPager.setAdapter(adapter);

        //初始化点的指示器
        initDotIndicator();

        mBannerViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                //监听当前选中的位置
                pageSelected(position);
            }
        });


        //初始化的时候获取第一条描述
        String firstDesc = mAdapter.getBannerDesc(0);
        mBannerDescTv.setText(firstDesc);
    }

    /**
     * 页面切换回调
     *
     * @param position
     */
    private void pageSelected(int position) {
        //设置前面选中的点,设置不选中
        DotIndicatorView oldDotIndicatorView = (DotIndicatorView) mBannerDotContainer.getChildAt(mCurrentPosition);
        oldDotIndicatorView.setDrawable(mDotIndicatorNormalDrawable);

        //设置当前的点选中
        mCurrentPosition = position % mAdapter.getCount();
        DotIndicatorView currentDotIndicatorView = (DotIndicatorView) mBannerDotContainer.getChildAt(mCurrentPosition);
        currentDotIndicatorView.setDrawable(mDotIndicatorFocusDrawable);

        //设置广告位
        String bannerDesc = mAdapter.getBannerDesc(mCurrentPosition);
        mBannerDescTv.setText(bannerDesc);

    }

    /**
     * 初始化点的位置
     */
    private void initDotIndicator() {
        int count = mAdapter.getCount();
        //点的位置
        mBannerDotContainer.setGravity(Gravity.RIGHT);

        for (int i = 0; i < count; i++) {
            //不断往点的指示器不断添加圆点
            DotIndicatorView dotIndicatorView = new DotIndicatorView(mContext);
            //设置位置
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DisplayUtils.dpToPx(8), DisplayUtils.dpToPx(8));
            layoutParams.leftMargin = layoutParams.rightMargin = DisplayUtils.dpToPx(2);

            dotIndicatorView.setLayoutParams(layoutParams);

            if (i == 0) {
                dotIndicatorView.setDrawable(mDotIndicatorFocusDrawable);
            } else {
                dotIndicatorView.setDrawable(mDotIndicatorNormalDrawable);
            }


            mBannerDotContainer.addView(dotIndicatorView);
        }
    }


    /**
     * 开始轮播
     */
    public void startRoll() {
        mBannerViewPager.startRoll();
    }
}
