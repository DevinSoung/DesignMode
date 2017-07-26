package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    void display() {
        System.out.println("i am a model duck");
    }
}
