package com.example.demo.strategy;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by Devin on 2017/6/27.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
       // TODO 实现鸭子飞行
        System.out.println("I am flying!");

    }
}
