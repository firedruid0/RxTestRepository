package com.narisolar.riyun.rxtest.main;

import com.narisolar.riyun.rxtest.BasePresenter;
import com.narisolar.riyun.rxtest.BaseView;
import com.narisolar.riyun.rxtest.data.LoginParam;

/**
 * Created by Administrator on 2016/11/4.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {


    }

    interface Presenter extends BasePresenter {

        void login(LoginParam loginParam);
    }

}
