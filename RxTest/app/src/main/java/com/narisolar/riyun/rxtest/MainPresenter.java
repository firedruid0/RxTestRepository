package com.narisolar.riyun.rxtest;

import com.narisolar.riyun.rxtest.data.LoginParam;
import com.narisolar.riyun.rxtest.data.UserInfo;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by Administrator on 2016/11/4.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mMainView;

    private Subscriber<UserInfo> subscriber = new Subscriber<UserInfo>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(UserInfo userInfo) {


        }
    };

    @Override
    public void login(LoginParam loginParam) {

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("@string/base_url")
                .build();

        LoginApi loginApi = retrofit.create(LoginApi.class);

        Observable<UserInfo> userInfoObservable = loginApi.login(loginParam.getAccount(), loginParam.getPassword());


    }

    @Override
    public void start() {

    }
}
