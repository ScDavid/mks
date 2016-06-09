package Exercise6_2.Default;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
