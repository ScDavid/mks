package Exercise6_2.Default;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }

}
