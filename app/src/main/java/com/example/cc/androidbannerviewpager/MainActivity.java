package com.example.cc.androidbannerviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.cc.androidbannerviewpager.banner.BannerAdapter;
import com.example.cc.androidbannerviewpager.banner.BannerView;
import com.example.cc.androidbannerviewpager.banner.BannerViewPager;
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

public class MainActivity extends AppCompatActivity implements BannerViewPager.BannerItemClickListener {

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
                .url("https://bolemart.21chinamall.com/api/goods/13024?lg=id_ID")
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

        initBanner(bannerDataBean.getImages());

    }

    /**
     * 初始化广告位
     *
     * @param banners
     */
    private void initBanner(final List<String> banners) {
        mBannerView.setAdapter(new BannerAdapter() {
            @Override
            public View getView(int position,View convertView) {

                String url = banners.get(position);
                if (url.startsWith("https")) {
                    url = url.replace("https", "http");
                }

                ImageView bannerView = null;

                if (convertView == null){
                     bannerView = new ImageView(MainActivity.this);
                }else {
                    bannerView = (ImageView) convertView;
                }


                Glide.with(MainActivity.this).load(url).into(bannerView);

                return bannerView;
            }

            @Override
            public int getCount() {
                return banners.size();
            }
        });
        //开始自动轮播
        mBannerView.startRoll();


        mBannerView.setBannerViewItemClickListener(this);

    }

    @Override
    public void click(int position) {
        Toast.makeText(this,"position:"+position,Toast.LENGTH_SHORT).show();
    }
}
