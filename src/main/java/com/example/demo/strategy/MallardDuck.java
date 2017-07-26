package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a real Mallard duck");
    }
}
