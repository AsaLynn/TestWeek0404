package com.test.week0404.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.test.week0404.R;
import com.test.week0404.decoration.TopLineDecoration;
import com.test.week0404.decoration.VideoCenterDecoration;
import com.test.week0404.impl.StickFunction;
import com.test.week0404.model.TopLineInfo;
import com.test.week0404.model.VideoCenterInfo;
import com.test.week0404.presenter.TopPresenter;
import com.test.week0404.presenter.TopPresenterImpl;
import com.test.week0404.presenter.VideoCenterPresenterImpl;
import com.test.week0404.view.TopView;
import com.test.week0404.view.VideoCenterView;
import com.xadapter.OnItemClickListener;
import com.xadapter.OnXBindListener;
import com.xadapter.adapter.XRecyclerViewAdapter;
import com.xadapter.holder.XViewHolder;

/**
 *
 */
public class PageFragment extends Fragment implements TopView<TopLineInfo>, VideoCenterView<VideoCenterInfo>, StickFunction {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private XRecyclerViewAdapter<TopLineInfo.DataBean> topAdapter;
    private TopPresenter mTopPresenter;
    private XRecyclerViewAdapter<VideoCenterInfo.DataBean> videoAdapter;
    private RecyclerView topLineRv;

    public PageFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PageFragment.
     */
    public static PageFragment newInstance(String param1, String param2) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        topLineRv = view.findViewById(R.id.page_rv);
        topLineRv.setHasFixedSize(true);
        topLineRv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        if (mParam2.equals("0")) {
            topLineRv.addItemDecoration(new TopLineDecoration(view.getContext()));
            topAdapter = new XRecyclerViewAdapter<>();
            topAdapter.setLayoutId(R.layout.item_top_line)
                    .onXBind(new OnXBindListener<TopLineInfo.DataBean>() {
                        @Override
                        public void onXBind(XViewHolder holder, int position, TopLineInfo.DataBean dataBean) {
                            holder.setTextView(R.id.title_tv, dataBean.getTitle());
                            holder.setTextView(R.id.count_tv, dataBean.getView_num() + "浏览");
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) holder.getView(R.id.top_iv);
                            simpleDraweeView.setImageURI(Uri.parse(dataBean.getImg_url()));
                        }
                    });
            topLineRv.setAdapter(topAdapter);

            mTopPresenter = new TopPresenterImpl(this);
            if (!TextUtils.isEmpty(mParam1)) {
                mTopPresenter.initData(mParam1);
            }
        } else {
            topLineRv.addItemDecoration(new VideoCenterDecoration(getContext()));
            videoAdapter = new XRecyclerViewAdapter<>();
            videoAdapter
                    .setLayoutId(R.layout.item_video_center)
                    .setOnItemClickListener(new OnItemClickListener<VideoCenterInfo.DataBean>() {
                        @Override
                        public void onItemClick(View view, int position, VideoCenterInfo.DataBean info) {

                        }
                    })
                    .onXBind(new OnXBindListener<VideoCenterInfo.DataBean>() {
                        @Override
                        public void onXBind(XViewHolder holder, int position, VideoCenterInfo.DataBean info) {
                            holder
                                    .setTextView(R.id.video_name, info.getVideo_content());
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) holder.getView(R.id.video_pic_iv);
                            simpleDraweeView.setImageURI(Uri.parse(info.getImg_url()));
                        }
                    });
            topLineRv.setAdapter(videoAdapter);

            VideoCenterPresenterImpl videoCenterPresenter = new VideoCenterPresenterImpl(this);
            if (!TextUtils.isEmpty(mParam1)) {
                videoCenterPresenter.initData(mParam1);
            }
        }

    }


    @Override
    public void refreshView(TopLineInfo data) {
        topAdapter.addAllData(data.getData());
    }


    @Override
    public void refreshVideoCenterView(VideoCenterInfo data) {
        videoAdapter.addAllData(data.getData());
    }

    @Override
    public void stick(int index) {
        topLineRv.scrollToPosition(0);
        if (0 == index) {
        } else if (1 == index) {
        }
    }
}
