package com.narisolar.riyun.rxtest.main;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.annotations.Nullable;
import com.narisolar.riyun.rxtest.BR;
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
        mLoginParam = new LoginParam("","");
        mUserInfo = new UserInfo("","",null);
        mUserInfo.setData(mUserInfo.new Data("",""));
    }

    @Bindable
    public String getAccount() {
        return mLoginParam.getAccount();
    }

    @Bindable
    public String getPassword() {
        return mLoginParam.getPassword();
    }

    public void setAccount(String account) {
        mLoginParam.setAccount(account);
        notifyPropertyChanged(BR.mLoginParam);
    }

    public void setPassword(String password) {
        mLoginParam.setPassword(password);
        notifyPropertyChanged(BR.mLoginParam);
    }

    @Bindable
    public LoginParam getMLoginParam() {
        return mLoginParam;
    }

    public void setMLoginParam(LoginParam mLoginParam) {
        this.mLoginParam = mLoginParam;
        notifyPropertyChanged(BR.mLoginParam);
    }

    @Bindable
    public UserInfo getMUserInfo() {
        return mUserInfo;
    }

    public void setMUserInfo(UserInfo mUserInfo) {
        this.mUserInfo = mUserInfo;
        notifyPropertyChanged(BR.mUserInfo);
    }

    @Bindable
    public String getResult(){
        return "userId: " + mUserInfo.getData().getUserId() + " nickname: " + mUserInfo.getData().getNickname();
    }

}
