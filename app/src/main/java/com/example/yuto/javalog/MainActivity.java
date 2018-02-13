package com.example.yuto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        Human human = new Human("サブロー", 2800,"マラソン");     // 名前をタロウ、年齢10歳で、Dogのインスタンスを作る

        Dog.introduce();
        dog.say();
        dog.move();

        Human.introduce();
        human.say();
        human.think();

    }
}
