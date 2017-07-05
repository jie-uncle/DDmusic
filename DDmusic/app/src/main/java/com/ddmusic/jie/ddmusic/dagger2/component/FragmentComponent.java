package com.ddmusic.jie.ddmusic.dagger2.component;

import com.ddmusic.jie.ddmusic.dagger2.moudle.FragmentMoudle;
import com.ddmusic.jie.ddmusic.ui.act.MainActivity;

import dagger.Component;

/**
 * Created by jie on 2017/7/4.
 */
@Component(modules = FragmentMoudle.class)
public interface FragmentComponent {
    void inject(MainActivity activity);
}
