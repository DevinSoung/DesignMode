package com.example.demo.strategy;

/**
 * Created by Devin on 2017/6/27.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        duck.performQuack();
        duck.performFly();

        Duck duck1 = new ModelDuck();
        duck1.performFly();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performFly();
    }
}
