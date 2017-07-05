package com.ddmusic.jie.ddmusic.dagger2.moudle;

import com.ddmusic.jie.ddmusic.presenter.impl.WelcomePresenter;
import com.ddmusic.jie.ddmusic.ui.act.WelcomeActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jie on 2017/7/4.
 */
@Module
public class Welcomemoudle {
    WelcomeActivity welcomeActivity;

    public Welcomemoudle(WelcomeActivity welcomeActivity) {
        this.welcomeActivity = welcomeActivity;
    }

    @Provides
    WelcomePresenter provideWelcomepst(){
        return new WelcomePresenter(welcomeActivity);
    }
}
