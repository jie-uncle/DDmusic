package com.ddmusic.jie.ddmusic.ui.act;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ddmusic.jie.ddmusic.R;
import com.ddmusic.jie.ddmusic.dagger2.component.DaggerFragmentComponent;
import com.ddmusic.jie.ddmusic.dagger2.moudle.FragmentMoudle;
import com.ddmusic.jie.ddmusic.ui.adapter.MainViewpagerAdapter;
import com.ddmusic.jie.ddmusic.ui.fragment.BaseFragment;
import com.ddmusic.jie.ddmusic.ui.fragment.ListenFragment;
import com.ddmusic.jie.ddmusic.ui.fragment.LiveFragemnt;
import com.ddmusic.jie.ddmusic.ui.fragment.VideoFragment;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.main_toolbar_tablay)
    TabLayout mainToolbarTablay;
    @BindView(R.id.main_activity_viewpager)
    ViewPager mainActivityViewpager;
    @BindView(R.id.main_bottom_menu_music_pic_small)
    ImageView mainBottomMenuMusicPicSmall;
    @BindView(R.id.main_bottom_menu_music_seekbar)
    SeekBar mainBottomMenuMusicSeekbar;
    @BindView(R.id.main_bottom_menu_music_name)
    TextView mainBottomMenuMusicName;
    @BindView(R.id.main_bottom_menu_music_progressbar)
    ProgressBar mainBottomMenuMusicProgressbar;
    @BindView(R.id.main_bottom_menu_music_singer)
    TextView mainBottomMenuMusicSinger;
    @BindView(R.id.main_bottom_menu_iv_previous)
    ImageView mainBottomMenuIvPrevious;
    @BindView(R.id.main_bottom_menu_iv_play)
    ImageView mainBottomMenuIvPlay;
    @BindView(R.id.main_bottom_menu_iv_pause)
    ImageView mainBottomMenuIvPause;
    @BindView(R.id.main_bottom_menu_iv_next)
    ImageView mainBottomMenuIvNext;
    @Inject
    ListenFragment listenFragment;
    @Inject
    LiveFragemnt liveFragemnt;
    @Inject
    VideoFragment videoFragment;
    ArrayList<BaseFragment> list;

    MainViewpagerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
        list = new ArrayList<>();
        DaggerFragmentComponent.builder().fragmentMoudle(new FragmentMoudle()).build().inject(this);
//        listenFragment = new ListenFragment();
//        liveFragemnt = new LiveFragemnt();
//        videoFragment = new VideoFragment();
        list.add(listenFragment);
        list.add(liveFragemnt);
        list.add(videoFragment);
        adapter = new MainViewpagerAdapter(getSupportFragmentManager(), list,this);
        mainActivityViewpager.setAdapter(adapter);
        mainToolbarTablay.setupWithViewPager(mainActivityViewpager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mian_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_menu_seek:
                Toast.makeText(this,"dianle",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
