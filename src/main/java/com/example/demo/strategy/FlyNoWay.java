package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
       // TODO 什么也不做，不会飞行
        System.out.println("I can't fly");
    }
}
