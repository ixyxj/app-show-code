package com.xyxj.show;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by silen on 2018/12/16 23:29
 * Copyright (c) 2018 in FORETREE
 */
public class CodeCompatFragment extends Fragment {
    public static final int STATE_SHOW = 1;
    public static final int STATE_NONE = 0;

    private int mState;
    protected View mContentView;
    private String mCode;

    public static CodeCompatFragment newInstance(String code) {
        Bundle args = new Bundle();
        args.putString("code", code);
        CodeCompatFragment fragment = new CodeCompatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        initArguments(getArguments() == null ? new Bundle() : getArguments());
    }

    private void initArguments(Bundle args) {
        mCode = args.getString("code");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getContentViewId(), null);
        TextView tv = view.findViewById(R.id.tv_code);
        tv.setText(mCode);
        LinearLayoutCompat linearCompat = new LinearLayoutCompat(getContext());
        linearCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, LinearLayoutCompat.LayoutParams.MATCH_PARENT));
        buildContainerParams(linearCompat);
        buildTextParams(tv);
        linearCompat.addView(view);
        mContentView = linearCompat;
        return linearCompat;
    }

    protected void buildTextParams(TextView view) {

    }

    protected void buildContainerParams(LinearLayoutCompat linearCompat) {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onAfterView();
    }

    protected void onAfterView() {

    }

    protected void changeShowState(int state) {
        mState = state;
        onShowStateChanged(state);
    }

    public void onShowStateChanged(int state) {

    }

    protected @LayoutRes
    int getContentViewId() {
        return R.layout.view_text;
    }

    public View getContentView() {
        return mContentView;
    }

    public int getState() {
        return mState;
    }
}
