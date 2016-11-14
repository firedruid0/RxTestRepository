package com.narisolar.riyun.rxtest.main;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.narisolar.riyun.rxtest.data.LoginParam;
import com.narisolar.riyun.rxtest.data.UserInfo;

/**
 * Created by Administrator on 2016/11/13.
 */

public class MainViewModel extends BaseObservable {

    private final MainContract.Presenter mPresenter;

    private Context mContext;

    private LoginParam mLoginParam;

    private UserInfo mUserInfo;

    public MainViewModel(MainContract.Presenter mPresenter, Context mContext) {
        this.mPresenter = mPresenter;
        this.mContext = mContext;
    }

    public LoginParam getmLoginParam() {
        return mLoginParam;
    }

    public void setmLoginParam(LoginParam mLoginParam) {
        this.mLoginParam = mLoginParam;
    }

    public UserInfo getmUserInfo() {
        return mUserInfo;
    }

    public void setmUserInfo(UserInfo mUserInfo) {
        this.mUserInfo = mUserInfo;
    }

    @Bindable
    public String getResult(){
        return "userId: " + mUserInfo.getData().getUserId() + " nickname: " + mUserInfo.getData().getNickname();
    }

}
