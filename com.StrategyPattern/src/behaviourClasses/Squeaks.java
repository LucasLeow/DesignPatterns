package behaviourClasses;

import behaviourInterfaces.QuackBehaviour;

public class Squeaks implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak!");
    }
}
