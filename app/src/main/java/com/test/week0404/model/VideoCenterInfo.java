package com.test.week0404.model;

import java.util.List;

/**
 * Created by think on 2018/3/23.
 * 视频中心,实体类.
 */

public class VideoCenterInfo {

    /**
     * success : 1
     * msg : 获取成功
     * data : [{"video_id":"1","video_url":"http://www.dessmann.com.cn/%E5%90%B4%E7%A7%80%E6%B3%A2%E5%AE%A3%E4%BC%A0%E7%89%87.mp4","video_content":"视频1","img_url":"http://116.62.142.20:85/Uploads/Picture/2018-01-04/5a4da45b2f597.jpg","view_num":"1","create_time":"2018-03-23 17:21:04"},{"video_id":"2","video_url":"http://www.dessmann.com.cn/%E5%90%B4%E7%A7%80%E6%B3%A2%E5%AE%A3%E4%BC%A0%E7%89%87.mp4","video_content":"视频2","img_url":"http://116.62.142.20:85/Uploads/Picture/2018-01-04/5a4da45b2f597.jpg","view_num":"1","create_time":"2018-03-23 17:21:04"},{"video_id":"3","video_url":"http://www.dessmann.com.cn/%E5%90%B4%E7%A7%80%E6%B3%A2%E5%AE%A3%E4%BC%A0%E7%89%87.mp4","video_content":"视频3","img_url":"http://116.62.142.20:85/Uploads/Picture/2018-01-04/5a4da45b2f597.jpg","view_num":"1","create_time":"2018-03-23 17:21:04"},{"video_id":"4","video_url":"http://www.dessmann.com.cn/%E5%90%B4%E7%A7%80%E6%B3%A2%E5%AE%A3%E4%BC%A0%E7%89%87.mp4","video_content":"视频4","img_url":"http://116.62.142.20:85/Uploads/Picture/2018-01-04/5a4da45b2f597.jpg","view_num":"1","create_time":"2018-03-23 17:21:04"}]
     * code : 0
     */

    private int success;
    private String msg;
    private int code;
    private List<DataBean> data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * video_id : 1
         * video_url : http://www.dessmann.com.cn/%E5%90%B4%E7%A7%80%E6%B3%A2%E5%AE%A3%E4%BC%A0%E7%89%87.mp4
         * video_content : 视频1
         * img_url : http://116.62.142.20:85/Uploads/Picture/2018-01-04/5a4da45b2f597.jpg
         * view_num : 1
         * create_time : 2018-03-23 17:21:04
         */

        private String video_id;
        private String video_url;
        private String video_content;
        private String img_url;
        private String view_num;
        private String create_time;

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        public String getVideo_content() {
            return video_content;
        }

        public void setVideo_content(String video_content) {
            this.video_content = video_content;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getView_num() {
            return view_num;
        }

        public void setView_num(String view_num) {
            this.view_num = view_num;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }
    }
}
