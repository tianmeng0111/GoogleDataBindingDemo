package com.tm.example.googledatabindingdemo;

/**
 * Created by Tian on 2016/9/30.
 */

public class DetailUser {
    private String name;
    private String sex;
    private String age;
    private boolean isAdult = false;

    public DetailUser(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        int i = Integer.parseInt(age);
        if (i >= 18) {
            isAdult = true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }
}
