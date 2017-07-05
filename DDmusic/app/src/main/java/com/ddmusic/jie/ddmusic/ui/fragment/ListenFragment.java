package com.ddmusic.jie.ddmusic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ddmusic.jie.ddmusic.R;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jie on 2017/6/29.
 */

public class ListenFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listen,container,false);
    }
}
