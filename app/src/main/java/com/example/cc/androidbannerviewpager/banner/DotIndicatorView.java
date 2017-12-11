package com.example.cc.androidbannerviewpager.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cc on 2017/12/9.
 */

public class DotIndicatorView extends View {
    private Drawable mDrawable;
    private Bitmap mCircleBitmap;

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

        if (mDrawable != null) {

//            mDrawable.setBounds(0,0,getMeasuredWidth(),getMeasuredHeight());
//            mDrawable.draw(canvas);

            //画圆
            Bitmap bitmap = drawableToBitmap(mDrawable);

            //把bitmap变成圆
            Bitmap circleBitmap = getCircleBitmap(bitmap);

            canvas.drawBitmap(circleBitmap, 0, 0, null);

        }

    }

    /**
     * 获取圆形指示器
     *
     * @param bitmap
     * @return
     */
    private Bitmap getCircleBitmap(Bitmap bitmap) {

        //创建Bitmap
        Bitmap circleBitmap = Bitmap.createBitmap(getMeasuredWidth(),getMeasuredHeight(), Bitmap.Config.ARGB_8888);

        //创建画布
        Canvas canvas = new Canvas(circleBitmap);
        //创建画笔
        Paint paint = new Paint();

        //设置抗锯齿
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        //设置防抖动
        paint.setDither(true);

        //在画布上画一个圆
        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,getMeasuredWidth()/2,paint);

        //取圆和bitmap的交集
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

        //再把bitmap画到圆上面
        canvas.drawBitmap(bitmap,0,0,paint);

        return circleBitmap;
    }

    /**
     * 从drawable中得到bitmap
     *
     * @param drawable
     * @return
     */
    private Bitmap drawableToBitmap(Drawable drawable) {

        //如果是BitmapDrawable就直接返回
        if (drawable instanceof BitmapDrawable) {

            return ((BitmapDrawable) drawable).getBitmap();
        }


        Bitmap outBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        //创建画布
        Canvas canvas = new Canvas(outBitmap);
        //把drawable画到Bitmap
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        return outBitmap;
    }


    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
        //重新绘制当前的View
        invalidate();
    }


}
