package com.ddmusic.jie.ddmusic.dagger2.moudle;

import com.ddmusic.jie.ddmusic.ui.fragment.ListenFragment;
import com.ddmusic.jie.ddmusic.ui.fragment.LiveFragemnt;
import com.ddmusic.jie.ddmusic.ui.fragment.VideoFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jie on 2017/7/1.
 */
@Module
public class FragmentMoudle {
    @Provides
    ListenFragment ListtenerFragment(){
        return new ListenFragment();
    }

    @Provides
    LiveFragemnt  LiveFragemnt () {
        return new LiveFragemnt ();
    }

    @Provides
    VideoFragment VideoFragment () {
        return new VideoFragment ();
    }
}
