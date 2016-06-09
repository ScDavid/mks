package Exercise6.DataProcessing;

import Exercise6.DataModels.IAccount;
import java.util.Scanner;

public class Input {

    private final IAccount account;

    public Input(IAccount account) {
        this.account = account;
    }

    public void startInput() {
        Scanner scanner = new Scanner(System.in);
        String c = "a";
        while (!c.equals("x")) {
            System.out.println("Enter");
            System.out.println("   w to withdraw money");
            System.out.println("   d to deposit money");
            System.out.println("   x to quit");
            System.out.print("Choice: ");
            c = scanner.next();
            if (c.equals("w") || c.equals("d")) {
                int amount;
                System.out.print("Amount: ");
                amount = scanner.nextInt();
                switch (c) {
                    case "w":
                        account.withdraw(amount);
                        System.out.println("New amount: " + account.getAmount());
                        break;
                    case "d":
                        account.deposit(amount);
                        System.out.println("New amount: " + account.getAmount());
                        break;
                }
            }
        }        
        scanner.close();
    }
}
