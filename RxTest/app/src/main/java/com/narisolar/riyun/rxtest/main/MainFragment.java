package com.narisolar.riyun.rxtest.main;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.narisolar.riyun.rxtest.data.UserInfo;
import com.narisolar.riyun.rxtest.databinding.MainFragBinding;

/**
 * Created by Administrator on 2016/11/13.
 */

public class MainFragment extends Fragment implements MainContract.View {

    private MainContract.Presenter mPresenter;

    private MainViewModel mMainViewModel;

    public void setViewModel(MainViewModel viewModel) {
        this.mMainViewModel = viewModel;
    }

    public MainFragment() {

    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        MainFragBinding mainFragBinding = MainFragBinding.inflate(inflater, container, false);

        mainFragBinding.setViewModel(mMainViewModel);

        mainFragBinding.setPresenter(mPresenter);

        View root = mainFragBinding.getRoot();

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        mMainViewModel.setMUserInfo(userInfo);
    }
}
