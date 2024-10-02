package behaviourClasses;

import behaviourInterfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
