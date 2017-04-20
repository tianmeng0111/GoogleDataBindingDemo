package com.tm.example.googledatabindingdemo.activity;

/**
 * Created by Tian on 2017/4/20.
 */

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.tm.example.googledatabindingdemo.R;
import com.tm.example.googledatabindingdemo.databinding.ActivityMain2Binding;

/**
 * 直接拿到布局中的对象
 */

public class Main2Activity extends AppCompatActivity {

    ActivityMain2Binding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        mBinding.tv.setTextSize(40);
        mBinding.tv.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        mBinding.tv.setText("this is a new text!!");

    }
}
