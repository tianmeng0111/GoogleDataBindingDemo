package com.tm.example.googledatabindingdemo.activity;

import com.tm.example.googledatabindingdemo.R;
import com.tm.example.googledatabindingdemo.databinding.ActivityDataBindingBinding;

/**
 * 在抽象基类中实现了视图绑定、实例化ViewDataBinding对象。
 * ActivityDataBindingBinding的名称是根据布局名称定的，必须拿到这个对象才能直接拿到内部的view
 */

public class DataBindingActivity extends BaseActivity<ActivityDataBindingBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_data_binding;
    }

    @Override
    protected void initView() {
        mBinding.tvBinding.setText("this is an Activity extends BaseActivity!");
    }
}
