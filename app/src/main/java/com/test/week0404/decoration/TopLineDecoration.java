package com.test.week0404.decoration;

import android.content.Context;

import com.example.demonstrate.utils.UIUtils;
import com.test.week0404.R;
import com.yanyusong.y_divideritemdecoration.Y_Divider;
import com.yanyusong.y_divideritemdecoration.Y_DividerBuilder;
import com.yanyusong.y_divideritemdecoration.Y_DividerItemDecoration;

/**
 * Created by think on 2018/3/24.
 *
 */

public class TopLineDecoration extends Y_DividerItemDecoration {
    public TopLineDecoration(Context context) {
        super(context);
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        int widthDp = 1;
        int startPaddingDp = 20;
        int endPaddingDp = 20;

        return new Y_DividerBuilder()
                .setBottomSideLine(true, UIUtils.getColor(R.color.c_ccc9c9), widthDp, startPaddingDp, endPaddingDp)
                .create();
    }
}
