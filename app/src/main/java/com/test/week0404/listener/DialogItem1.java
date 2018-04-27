package com.test.week0404.listener;

import android.app.Activity;

import com.example.demonstrate.adapter.testname.p1.w4.BaseT4P1W4ILis;
import com.test.week0404.R;
import com.test.week0404.activity.Test1Activity;

/**
 * Created by think on 2018/3/25.
 */

public class DialogItem1 extends BaseT4P1W4ILis {

    public DialogItem1(Activity activity) {
        super(activity);
    }

    @Override
    public Class<?> getStartActivity(int which) {
        if (which == 0) {
            return Test1Activity.class;
        }
        return null;
    }

    @Override
    public int getDialogListId() {
        return R.array.test4_week4_dialog1_items;
    }
}
