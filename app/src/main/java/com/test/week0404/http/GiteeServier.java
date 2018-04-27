package com.test.week0404.http;

import com.test.week0404.model.TopLineInfo;
import com.test.week0404.model.VideoCenterInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by think on 2018/3/26.
 */

public interface GiteeServier {

    String BASE_URL = "https://gitee.com/";

    interface T4W40328 {
        String TOP_URL = "https://gitee.com/little_bird_oh_777/test_data_collection/raw/master/toplins.json";
        String VIDEO_URL = "https://gitee.com/little_bird_oh_777/test_data_collection/raw/master/video.json";

        @GET()
        Call<TopLineInfo> getTopLineInfo(@Url String url);

        @GET()
        Call<VideoCenterInfo> getVideoCenterInfo(@Url String url);
    }
}
