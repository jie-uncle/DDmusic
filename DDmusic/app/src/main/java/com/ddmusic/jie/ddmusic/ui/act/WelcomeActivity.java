package com.ddmusic.jie.ddmusic.ui.act;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ddmusic.jie.ddmusic.R;


import com.ddmusic.jie.ddmusic.dagger2.component.DaggerWelcomePstComponent;
import com.ddmusic.jie.ddmusic.dagger2.moudle.Welcomemoudle;
import com.ddmusic.jie.ddmusic.presenter.Iport.IWelcomePresenter;
import com.ddmusic.jie.ddmusic.presenter.impl.WelcomePresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends BaseActivity implements IWelcomePresenter.WelcomeView {


    @BindView(R.id.welcome_jump)
    TextView welcomeJump;
    @Inject
     WelcomePresenter welcomePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        DaggerWelcomePstComponent.builder().welcomemoudle(new Welcomemoudle(this)).build().inject(this);
        welcomePresenter.time();

    }


    @Override
    public void intent2main() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.welcome_jump)
    public void onViewClicked() {
        welcomePresenter.click();
    }


}
