package com.example.jihuiquan.mockitodemo.data.login;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    public static final String USER_SOURCE_ID = "sourceId";
    public static final String USER_SUPPLIER_NAME = "supplierName";
    public static final String USER_ACCOUNT = "userAccount";
    public static final String USER_NO = "userNo";
    public static final String USER_NAME = "name";
    public static final String USER_ID = "id";
    public static final String USER_EMAIL = "email";
    public static final String USER_TOKEN = "token";
    public static final String USER_JOB = "job";

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            User var = new User();
            var.sourceId = source.readString();
            var.supplierName = source.readString();
            var.userAccount = source.readString();
            var.userNo = source.readString();
            var.name = source.readString();
            var.id = source.readString();
            var.job = source.readString();
            var.email = source.readString();
            var.token = source.readString();
            return var;
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    private String sourceId;
    private String supplierName;
    private String userAccount;
    private String userNo;
    private String name;
    private String id;
    private String job;
    private String email;
    private String token;

    public String getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserNo() {
        return this.userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sourceId);
        dest.writeString(this.supplierName);
        dest.writeString(this.userAccount);
        dest.writeString(this.userNo);
        dest.writeString(this.name);
        dest.writeString(this.id);
        dest.writeString(this.job);
        dest.writeString(this.email);
        dest.writeString(this.token);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "sourceId='" + sourceId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userNo='" + userNo + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
