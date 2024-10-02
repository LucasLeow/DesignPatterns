package duckClasses;

import behaviourClasses.FlyWithWings;
import behaviourClasses.Quack;
import behaviourInterfaces.*;

public abstract class Duck {
    protected FlyBehaviour flyBehavior;
    protected QuackBehaviour quackBehavior;
    public Duck(FlyBehaviour fB, QuackBehaviour qB) {
        this.flyBehavior = fB;
        this.quackBehavior = qB;
    }

    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    }
