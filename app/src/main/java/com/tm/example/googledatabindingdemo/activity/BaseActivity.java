package com.tm.example.googledatabindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.InflateException;
import android.view.View;

/**
 * Created by Tian on 2017/4/20.
 * 通过DataBind直接拿到对象的Activity基类
 */
public abstract class BaseActivity<VB extends ViewDataBinding> extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    protected VB mBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: ==================");
        View root = View.inflate(this, getLayoutId(), null);
        mBinding = DataBindingUtil.bind(root);
        super.setContentView(root);

        if (mBinding == null) {
            if (getLayoutId() == 0) {
                throw new InflateException("布局没填充");
            } else {
                throw new NullPointerException("mBinding 不能为空");
            }
        }

        initView();
    }

    @LayoutRes
    protected abstract int getLayoutId();

    protected abstract void initView();

}
