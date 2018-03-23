package com.lsy.view;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lsy.view.model.ImgGroups;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liusiyu.taloner on 2018/3/14.
 */

public class DbVPager extends RelativeLayout {
    ViewPager viewPager;
    TextView tv_index;
    TabLayout tab1;
    TabLayout tab2;
    private BarPositon mPositon = BarPositon.TOP;
    private List<ImgGroups> mDataSource;
    private int[] indexList;

    public void setPosition(BarPositon position) {
        this.mPositon = position;
    }

    public void setSource(List<ImgGroups> imgLists) {
        this.mDataSource = imgLists;
    }

    public DbVPager(Context context) {
        super(context);
        init();
    }

    public DbVPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DbVPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_db_vpager, this);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tv_index = (TextView) findViewById(R.id.tv_index);
        tab1 = (TabLayout) findViewById(R.id.tab1);
        tab2 = (TabLayout) findViewById(R.id.tab2);

        setTabPosition();

        ViewPagerAdapter adapter = new ViewPagerAdapter();

        List<String> imgList = new ArrayList<>();
        imgList.add("http://pic1.win4000.com/wallpaper/2017-10-14/59e1bb8433aa1.jpg");
        imgList.add("http://pic1.win4000.com/wallpaper/2017-12-19/5a387cb8439ea.jpg");
        imgList.add("http://image.3761.com/pic/50491421458201.jpg");
        imgList.add("http://5b0988e595225.cdn.sohucs.com/images/20170810/ac9e3d5a942943839caf47df299ef4bc.jpeg");
        adapter.bind(getContext(), imgList);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setTabPosition() {
        if (mPositon == BarPositon.TOP) {
            tab1.setVisibility(VISIBLE);
            tab2.setVisibility(GONE);
        } else if (mPositon == BarPositon.BOTTOM) {
            tab2.setVisibility(VISIBLE);
            tab1.setVisibility(GONE);
        } else if (mPositon == BarPositon.EMPTY) {
            tab1.setVisibility(GONE);
            tab1.setVisibility(GONE);
        } else {
            tab2.setVisibility(VISIBLE);
            tab1.setVisibility(GONE);
        }
    }

    private void intIndex() {
        for (ImgGroups item : mDataSource) {

        }
    }

    public enum BarPositon {
        TOP, BOTTOM, EMPTY;
    }
}
