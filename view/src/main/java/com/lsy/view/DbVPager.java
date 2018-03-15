package com.lsy.view;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
        ViewPagerAdapter adapter = new ViewPagerAdapter();

        List<String> imgList = new ArrayList<>();
        imgList.add("http://pic1.win4000.com/wallpaper/2017-10-14/59e1bb8433aa1.jpg");
        imgList.add("http://pic1.win4000.com/wallpaper/2017-12-19/5a387cb8439ea.jpg");
        imgList.add("http://pic1.win4000.com/wallpaper/2017-10-14/59e1bb8433aa1.jpg");
        adapter.bind(getContext(), imgList);
        viewPager.setAdapter(adapter);
    }
}
