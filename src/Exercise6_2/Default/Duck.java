package Exercise6_2.Default;

public abstract class Duck implements IDuckStrategy{

    @Override
    public abstract void display();

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
