package duckClasses;

import behaviourClasses.FlyWithWings;
import duckClasses.Duck;
import behaviourClasses.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    public void display() {
        System.out.println("Im a Mallard Duck!");
    }
}
