package com.test.week0404.presenter;


import com.test.week0404.http.GiteeServier;
import com.test.week0404.model.VideoCenterInfo;
import com.test.week0404.view.VideoCenterView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 视频中心p层实现
 */
public class VideoCenterPresenterImpl implements VideoCenterPresenter {
    private VideoCenterView mVideoCenterView;

    public VideoCenterPresenterImpl(VideoCenterView videoCenterView) {
        this.mVideoCenterView = videoCenterView;
    }

    @Override
    public void initData(String url) {
        new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(GiteeServier.BASE_URL)
                .build()
                .create(GiteeServier.T4W40328.class)
                .getVideoCenterInfo(url)
                .enqueue(new Callback<VideoCenterInfo>() {
                    @Override
                    public void onResponse(Call<VideoCenterInfo> call, Response<VideoCenterInfo> response) {
                        VideoCenterInfo info = response.body();
                        mVideoCenterView.refreshVideoCenterView(info);
                    }

                    @Override
                    public void onFailure(Call<VideoCenterInfo> call, Throwable t) {

                    }
                });
    }
}
