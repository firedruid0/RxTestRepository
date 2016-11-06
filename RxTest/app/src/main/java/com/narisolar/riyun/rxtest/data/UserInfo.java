package com.narisolar.riyun.rxtest.data;

/**
 * Created by Administrator on 2016/11/3.
 */

public class UserInfo {

    private String returnCode;

    private String msg;

    private Data data;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public UserInfo(String returnCode, String msg, Data data) {
        this.returnCode = returnCode;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "returnCode='" + returnCode + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public class Data {

        private String userId;

        private String nickname;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Data(String userId, String nickname) {
            this.userId = userId;
            this.nickname = nickname;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "userId='" + userId + '\'' +
                    ", nickname='" + nickname + '\'' +
                    '}';
        }
    }

}
