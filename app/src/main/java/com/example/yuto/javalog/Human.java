package com.example.yuto.javalog;

/**
 * Created by yuto on 2018/02/14.
 */
import android.util.Log;

public class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "人間";
    String hobby;

    // コンストラクタ
    public Human() {
        this.name = "ヒト";
        this.age = 0;
        this.hobby = "折り紙";
    }

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは人間クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は " + this.name + " です。年は " + this.age + " 歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は " + this.hobby + " について考える。");
    }
}
