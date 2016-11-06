package com.narisolar.riyun.rxtest.data;

/**
 * Created by Administrator on 2016/11/4.
 */

public class LoginParam {

    private String account;

    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginParam(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginParam{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
