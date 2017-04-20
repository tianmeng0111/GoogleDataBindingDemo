package com.tm.example.googledatabindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tm.example.googledatabindingdemo.DetailUser;
import com.tm.example.googledatabindingdemo.R;
import com.tm.example.googledatabindingdemo.User;
import com.tm.example.googledatabindingdemo.databinding.ActivityMainBinding;

/**
 * DataBinding的绑定用法
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        User user = new User("tian", "meng");
        binding.setUser(user);

        DetailUser detail = new DetailUser(null, "femail", "34");
        binding.setDetailUser(detail);
    }
}
