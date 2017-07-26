package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i am flying with a rocket");
    }
}
