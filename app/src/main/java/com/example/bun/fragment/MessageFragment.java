package com.example.bun.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bun.R;
import com.example.bun.fragment.base.BaseFragment;

/**
 * Created by leif
 * Data 2018/2/13.
 */

public class MessageFragment extends BaseFragment {

    private View mContentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_message_layout, container, false);
        return mContentView;
    }
}
