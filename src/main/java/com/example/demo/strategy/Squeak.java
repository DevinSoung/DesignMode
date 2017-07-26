package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        // TODO 实现鸭子吱吱叫
        System.out.println("squeak");
    }
}
