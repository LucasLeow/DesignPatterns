package behaviourClasses;

import behaviourInterfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
