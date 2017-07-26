package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        // TODO 什么都不做，不会叫
        System.out.println("<slience>");
    }
}
