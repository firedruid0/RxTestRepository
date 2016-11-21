package com.narisolar.riyun.rxtest.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.annotations.Nullable;
import com.narisolar.riyun.rxtest.R;
import com.narisolar.riyun.rxtest.util.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        MainFragment mainFragment = (MainFragment) getFragmentManager().findFragmentById(R.id.contentFrame);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getFragmentManager(), mainFragment, R.id.contentFrame);
        }

        mMainPresenter = new MainPresenter(mainFragment);

        MainViewModel mainViewModel = new MainViewModel(mMainPresenter, getApplicationContext());

        mainFragment.setViewModel(mainViewModel);

    }
}
