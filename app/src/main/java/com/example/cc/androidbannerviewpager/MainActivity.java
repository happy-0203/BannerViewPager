package com.example.cc.androidbannerviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.cc.androidbannerviewpager.banner.BannerAdapter;
import com.example.cc.androidbannerviewpager.banner.BannerView;
import com.example.cc.androidbannerviewpager.bean.BannerDataBean;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private BannerView mBannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBannerView = findViewById(R.id.banner_view);


        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(20, TimeUnit.SECONDS)
                .build();


        Request request = new Request.Builder()
                .url("http://is.snssdk.com/2/essay/discovery/v3/?")
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {

            private String mSuccessData;

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                if (response != null && response.isSuccessful()) {
                    try {
                        mSuccessData = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        getDataSuccess(mSuccessData);
                    }
                });

            }
        });
    }

    private void getDataSuccess(String successData) {
        Gson gson = new Gson();

        BannerDataBean bannerDataBean = gson.fromJson(successData, BannerDataBean.class);

        initBanner(bannerDataBean.getData().getRotate_banner().getBanners());

    }

    /**
     * 初始化广告位
     *
     * @param banners
     */
    private void initBanner(final List<BannerDataBean.DataBean.RotateBannerBean.BannersBean> banners) {
        mBannerView.setAdapter(new BannerAdapter() {
            @Override
            public View getView(int position) {

                String url = banners.get(position).getBanner_url().getUrl_list().get(0).getUrl();

                ImageView bannerView = new ImageView(MainActivity.this);
                //bannerView.setScaleType(ImageView.ScaleType.CENTER_CROP);


                Glide.with(MainActivity.this).load(url).into(bannerView);

                return bannerView;
            }

            @Override
            public int getCount() {
                return banners.size();
            }


            @Override
            public String getBannerDesc(int currentPosition) {
                return banners.get(currentPosition).getBanner_url().getTitle();
            }
        });


        mBannerView.startRoll();
    }
}
