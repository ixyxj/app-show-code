package com.xyxj.show;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silen on 2018/12/17 0:06
 * Copyright (c) 2018 in FORETREE
 */
public class TabFragmentPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public TabFragmentPageAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = new ArrayList<>(fragments);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }
}
