package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        // TODO 实现鸭子呱呱叫
        System.out.println("quack");
    }
}
