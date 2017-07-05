package com.ddmusic.jie.ddmusic.dagger2.component;


import com.ddmusic.jie.ddmusic.dagger2.moudle.Welcomemoudle;
import com.ddmusic.jie.ddmusic.ui.act.MainActivity;
import com.ddmusic.jie.ddmusic.ui.act.WelcomeActivity;

import dagger.Component;
import dagger.Module;

/**
 * Created by jie on 2017/7/1.
 */
@Component(modules = Welcomemoudle.class)
public interface WelcomePstComponent {
    void inject (WelcomeActivity activity);
}
