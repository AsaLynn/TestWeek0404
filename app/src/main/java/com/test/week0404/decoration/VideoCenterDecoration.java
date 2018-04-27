package com.test.week0404.decoration;

import android.content.Context;

import com.example.demonstrate.utils.UIUtils;
import com.test.week0404.R;
import com.yanyusong.y_divideritemdecoration.Y_Divider;
import com.yanyusong.y_divideritemdecoration.Y_DividerBuilder;
import com.yanyusong.y_divideritemdecoration.Y_DividerItemDecoration;

/**
 * Created by think on 2018/3/23.
 * 视频中心列表分割线.
 */

public class VideoCenterDecoration extends Y_DividerItemDecoration {


    public VideoCenterDecoration(Context context) {
        super(context);
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        int widthDp = 10;
        return new Y_DividerBuilder()
                .setLeftSideLine(
                        true,
                        UIUtils.getColor(R.color.c_f4f4f4),
                        widthDp,
                        0,
                        0
                )
                .setTopSideLine(
                        true,
                        UIUtils.getColor(R.color.c_f4f4f4),
                        widthDp,
                        0,
                        0
                )
                .setRightSideLine(
                        true,
                        UIUtils.getColor(R.color.c_f4f4f4),
                        widthDp,
                        0,
                        0
                )
                .create();
    }
}
