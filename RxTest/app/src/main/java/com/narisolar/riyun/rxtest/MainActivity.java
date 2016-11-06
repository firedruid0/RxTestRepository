package com.narisolar.riyun.rxtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.narisolar.riyun.rxtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;

    private EditText mEtAccount;

    private EditText mEtPassword;

    private Button mBtLogin;

    private TextView mTvUserInfo;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter
    }
}
