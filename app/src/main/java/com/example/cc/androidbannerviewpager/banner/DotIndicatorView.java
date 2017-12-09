package com.example.cc.androidbannerviewpager.banner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cc on 2017/12/9.
 */

public class DotIndicatorView extends View {
    private Drawable mDrawable;

    public DotIndicatorView(Context context) {
        this(context, null);
    }

    public DotIndicatorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DotIndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (mDrawable != null){

            mDrawable.setBounds(0,0,getMeasuredWidth(),getMeasuredHeight());
            mDrawable.draw(canvas);
        }

    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
        //重新绘制当前的View
        invalidate();
    }
}
