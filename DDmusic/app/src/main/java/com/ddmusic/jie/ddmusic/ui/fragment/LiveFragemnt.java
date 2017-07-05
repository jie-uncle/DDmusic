package com.ddmusic.jie.ddmusic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ddmusic.jie.ddmusic.R;



import dagger.Module;

/**
 * Created by jie on 2017/6/29.
 */

public class LiveFragemnt extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fargment_live,container,false);
    }
}
