package com.lsy.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by liusiyu.taloner on 2018/3/14.
 */

public class DbVPager extends ViewGroup {
    ViewPager viewPager;

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
    }
}
