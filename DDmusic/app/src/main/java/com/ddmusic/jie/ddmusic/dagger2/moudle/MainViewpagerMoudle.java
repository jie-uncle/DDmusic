//package com.ddmusic.jie.ddmusic.dagger2.moudle;
//
//import android.content.Context;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//
//import com.ddmusic.jie.ddmusic.ui.fragment.BaseFragment;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import dagger.Module;
//import dagger.Provides;
//
///**
// * Created by jie on 2017/7/4.
// */
//@Module
//public class MainViewpagerMoudle {
//    FragmentManager fm ;
//        ArrayList<BaseFragment> list;
//    Context context;
//
//    public MainViewpagerMoudle(FragmentManager fm, ArrayList<BaseFragment> list, Context context) {
//        this.fm = fm;
//        this.list = list;
//        this.context = context;
//    }
//    @Provides
//    FragmentManager provideFragmentManager(){
//        return fm;
//    }
//    @Provides
//    Context provideContext(){
//        return context;
//    }
//    @Provides
//    ArrayList<BaseFragment> provideArrayList(){
//        return list;
//    }
//}
