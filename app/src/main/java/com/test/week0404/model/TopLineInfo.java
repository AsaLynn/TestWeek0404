package com.test.week0404.model;

import java.util.List;

/**
 * Created by think on 2018/3/23.
 */

public class TopLineInfo {

    @Override
    public String toString() {
        return "TopLineInfo{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    /**
     * success : 1
     * msg : 获取成功
     * data : [{"info_id":"19","title":"资讯10","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-02-02/5a7411d9a92bc.jpg","view_num":"1","create_time":"2018-02-02 15:23:09"},{"info_id":"20","title":"咨询11","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-02-02/5a7411e98790a.jpg","view_num":"1","create_time":"2018-02-02 15:23:26"},{"info_id":"21","title":"","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-03-22/5ab3104754325.png","view_num":"1","create_time":"2018-03-22 10:09:23"},{"info_id":"12","title":"成为公认的智能锁行业领导者","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-01-04/5a4d8f3315c81.jpg","view_num":"1","create_time":"2018-01-04 10:19:49"},{"info_id":"13","title":"来个牛排吧  大补","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-01-31/5a716fd2d6d50.jpg","view_num":"1","create_time":"2018-01-31 15:21:29"},{"info_id":"15","title":"资讯6","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-01-04/5a4da45b2f597.jpg","view_num":"1","create_time":"2018-02-02 15:21:56"},{"info_id":"22","title":"智能锁最常见的开门方式","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-03-22/5ab35015159cd.png","view_num":"1","create_time":"2018-03-22 14:42:14"},{"info_id":"14","title":"资讯5","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-01-04/5a4da48453119.jpg","view_num":"1","create_time":"2018-02-02 15:21:35"},{"info_id":"10","title":"作为唯一受邀的智能单品代表，德施曼参加2017中国通信产业大会","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-01-04/5a4d8e24e0206.jpg","view_num":"1","create_time":"2018-01-04 10:15:42"},{"info_id":"16","title":"资讯7","img_url":"http://test.sh.com/lrzk/Uploads/Picture/2018-02-02/5a74119e105a4.jpg","view_num":"1","create_time":"2018-02-02 15:22:13"}]
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

        @Override
        public String toString() {
            return "DataBean{" +
                    "info_id='" + info_id + '\'' +
                    ", title='" + title + '\'' +
                    ", img_url='" + img_url + '\'' +
                    ", view_num='" + view_num + '\'' +
                    ", create_time='" + create_time + '\'' +
                    '}';
        }

        /**
         * info_id : 19
         * title : 资讯10
         * img_url : http://test.sh.com/lrzk/Uploads/Picture/2018-02-02/5a7411d9a92bc.jpg
         * view_num : 1
         * create_time : 2018-02-02 15:23:09
         */

        private String info_id;
        private String title;
        private String img_url;
        private String view_num;
        private String create_time;

        public String getInfo_id() {
            return info_id;
        }

        public void setInfo_id(String info_id) {
            this.info_id = info_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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
