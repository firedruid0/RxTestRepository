package com.narisolar.riyun.rxtest;

import com.narisolar.riyun.rxtest.data.UserInfo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/3.
 */

public interface LoginApi {

    @FormUrlEncoded
    @POST("user/login")
    Observable<UserInfo> login(@Field("account") String account,
                               @Field("password") String password);

}
