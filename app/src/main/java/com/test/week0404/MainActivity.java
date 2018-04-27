package com.test.week0404;

import com.example.demonstrate.DialogPage;
import com.example.demonstrate.FirstActivity;
import com.test.week0404.listener.DialogItem1;

public class MainActivity extends FirstActivity {

    @Override
    protected void click0() {
        DialogPage.getInstance().setOnDialogItemListener(new DialogItem1(this));
    }
}
