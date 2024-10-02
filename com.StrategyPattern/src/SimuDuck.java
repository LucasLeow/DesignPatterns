import duckClasses.MallardDuck;
import duckClasses.Duck;

public class SimuDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
