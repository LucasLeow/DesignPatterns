package behaviourClasses;

import behaviourInterfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quack!");
    }
}
