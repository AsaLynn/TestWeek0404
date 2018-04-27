package com.test.week0404.presenter;

import com.test.week0404.http.GiteeServier;
import com.test.week0404.model.TopLineInfo;
import com.test.week0404.view.TopView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * 懒人头条的p层,实现类.
 */
public class TopPresenterImpl implements TopPresenter {

    private TopView mTopView;

    public TopPresenterImpl(TopView topView) {
        this.mTopView = topView;
    }

    @Override
    public void initData(String url) {

        new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(GiteeServier.BASE_URL)
                .build()
                .create(GiteeServier.T4W40328.class)
                .getTopLineInfo(url)
                .enqueue(new Callback<TopLineInfo>() {
                    @Override
                    public void onResponse(Call<TopLineInfo> call, Response<TopLineInfo> response) {
                        TopLineInfo info = response.body();
                        mTopView.refreshView(info);
                    }

                    @Override
                    public void onFailure(Call<TopLineInfo> call, Throwable t) {

                    }
                });
    }
}
