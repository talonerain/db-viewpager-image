package com.lsy.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

/**
 * Created by liusiyu.taloner on 2018/3/15.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private List<String> imgList;

    public void bind(Context context, List<String> list) {
        imgList = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView view = new ImageView(context);
        view.setLayoutParams(new ViewPager.LayoutParams());
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(context).load(imgList.get(position))
                .apply(new RequestOptions().placeholder(R.drawable.loading3))
                .into(view);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
