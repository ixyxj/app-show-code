package com.xyxj.show;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silen on 2018/12/16 17:05
 * Copyright (c) 2018 in FORETREE
 */
public abstract class CodeShowAppCompatActivity extends AppCompatActivity {
    private List<Fragment> fragments = new ArrayList<>();
    public final static String[] TAB_NAMES = {"view", "code"};
    private String mCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initIntent(getIntent());
        setContentView(R.layout.activity_code_show);
        initView();
    }

    private void initIntent(Intent intent) {
        mCode = intent.getStringExtra("code");
    }

    protected void initView() {
        TabLayout tabLayout = findViewById(R.id.tl_tab);
        ViewPager vp = findViewById(R.id.vp_layout);

        fragments.add(getViewFragment());
        fragments.add(CodeCompatFragment.newInstance(getCodeText()));

        for (String tabName : TAB_NAMES) {
            tabLayout.addTab(tabLayout.newTab().setText(tabName));
        }

        vp.setAdapter(new TabFragmentPageAdapter(getSupportFragmentManager(), fragments));
        tabLayout.setupWithViewPager(vp, false);
    }

    protected String getCodeText() {
        return "";
    }

    protected abstract Fragment getViewFragment();
}
