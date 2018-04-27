package com.test.week0404.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.demonstrate.adapter.MyPageChangeLis;
import com.sevenheaven.segmentcontrol.SegmentControl;
import com.test.week0404.R;
import com.test.week0404.adapter.MyFragmentPagerAdapter;
import com.test.week0404.fragment.PageFragment;
import com.test.week0404.http.GiteeServier;
import com.test.week0404.impl.StickFunction;

import java.util.ArrayList;

public class Test1Activity extends AppCompatActivity {

    protected ViewPager contentVp;
    private String TAG = this.getClass().getSimpleName();
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        initView();
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        final SegmentControl mSegmentHorzontal = (SegmentControl) findViewById(R.id.segment_control);
        mSegmentHorzontal.setOnSegmentControlClickListener(new SegmentControl.OnSegmentControlClickListener() {
            @Override
            public void onSegmentControlClick(int index) {
                Log.i(TAG, "--->onSegmentControlClick: index = " + index);
                contentVp.setCurrentItem(index);
            }
        });
        mSegmentHorzontal.setSelectedIndex(0);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setImageResource();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentItem = contentVp.getCurrentItem();
                StickFunction stickFunction = (StickFunction) fragments.get(currentItem);
                stickFunction.stick(currentItem);
            }
        });
        contentVp = (ViewPager) findViewById(R.id.content_vp);
        fragments = new ArrayList<>();
        fragments.add(PageFragment.newInstance(GiteeServier.T4W40328.TOP_URL, "0"));
        fragments.add(PageFragment.newInstance(GiteeServier.T4W40328.VIDEO_URL, "1"));
        FragmentManager fm = getSupportFragmentManager();
        contentVp.setAdapter(new MyFragmentPagerAdapter(fm, fragments));

        contentVp.addOnPageChangeListener(new MyPageChangeLis() {

            @Override
            public void onPageSelected(int position) {
                mSegmentHorzontal.setSelectedIndex(position);
            }
        });
    }
}
