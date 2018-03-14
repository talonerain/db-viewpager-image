package com.lsy.view;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by liusiyu.taloner on 2018/3/14.
 */

public class DbVPager extends ViewGroup {
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

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }

    private void init() {
        inflate(getContext(), R.layout.view_db_vpager, this);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tv_index = (TextView) findViewById(R.id.tv_index);
        tab1 = (TabLayout) findViewById(R.id.tab1);
        tab2 = (TabLayout) findViewById(R.id.tab2);
    }
}
