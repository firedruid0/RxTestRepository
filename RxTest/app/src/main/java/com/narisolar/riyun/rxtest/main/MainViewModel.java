package com.narisolar.riyun.rxtest.main;

import android.content.Context;
import android.databinding.BaseObservable;

/**
 * Created by Administrator on 2016/11/13.
 */

public class MainViewModel extends BaseObservable {

    private final MainContract.Presenter mPresenter;

    private Context mContext;

    public MainViewModel(MainContract.Presenter mPresenter, Context mContext) {
        this.mPresenter = mPresenter;
        this.mContext = mContext;
    }



}
