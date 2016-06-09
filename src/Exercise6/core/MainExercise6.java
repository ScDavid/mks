package Exercise6.core;

import Exercise6_1.DataModels.IAccount;
import Exercise6_1.DataModels.RealAccountProxy;
import Exercise6_1.DataProcessing.Input;
import Exercise6_2.Default.*;

public class MainExercise6 {

    public static void main(String[] args) {
        IAccount account = new RealAccountProxy(5000, "1234");
        Input input = new Input(account);
        // input.startInput();

        IDuckStrategy[] ducks = {new MallardDuck(), new RubberDuck(), new DecoyDuck()};

        for (IDuckStrategy duck : ducks) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();

            System.out.println("==========");
        }
    }
}
