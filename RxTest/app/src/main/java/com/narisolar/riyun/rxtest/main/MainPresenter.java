package com.narisolar.riyun.rxtest.main;

import com.narisolar.riyun.rxtest.api.LoginApi;
import com.narisolar.riyun.rxtest.data.LoginParam;
import com.narisolar.riyun.rxtest.data.UserInfo;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/11/4.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mMainView;

    public MainPresenter(MainContract.View view) {
        //this.mMainView = mMainView;
        mMainView = view;
        mMainView.setPresenter(this);
    }

    private Subscriber<UserInfo> subscriber = new Subscriber<UserInfo>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(UserInfo userInfo) {

            mMainView.updateUserInfo(userInfo);
            System.out.println(userInfo);
        }
    };

    @Override
    public void login(MainViewModel viewModel) {

        System.out.println("into presenter");
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://61.164.207.202:10002/mapi/")
                .build();

        LoginApi loginApi = retrofit.create(LoginApi.class);

        Observable<UserInfo> userInfoObservable = loginApi.login(viewModel.getAccount(), viewModel.getPassword());

        System.out.println(userInfoObservable.toString());

        userInfoObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    @Override
    public void start() {

    }
}
