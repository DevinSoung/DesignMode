package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fly){
        flyBehavior=fly;
    }

    public void setQuackBehavior(QuackBehavior quack){
        quackBehavior=quack;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    abstract void display();

    public void swim(){
        System.out.println("all ducks float,even decoys");
    }
}
