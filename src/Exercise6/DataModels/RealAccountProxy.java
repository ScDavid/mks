package Exercise6.DataModels;

import java.util.Scanner;

/**
 * @author Marco Tesch
 * @since 07.06.2016
 * @version 1.0
 */
public class RealAccountProxy implements IAccount {

    private final RealAccount _realAccount;
    private final Scanner _scanner;
    private final String _pin;

    public RealAccountProxy(int amount, String pin) {
        _pin = pin;
        _realAccount = new RealAccount(amount);
        _scanner = new Scanner(System.in);
    }

    @Override
    public void withdraw(int money) {
        String pin;
        System.out.print("Enter PIN: ");
        pin = _scanner.next();

        if (_pin.equals(pin)) {
            _realAccount.withdraw(money);
        } else {
            System.out.println(">>> WRONG PIN <<<");
        }
    }

    @Override
    public void deposit(int money) {
        String pin;
        System.out.print("Enter PIN: ");
        pin = _scanner.next();

        if (_pin.equals(pin)) {
            _realAccount.deposit(money);
        } else {
            System.out.println(">>> WRONG PIN <<<");
        }
    }

    @Override
    public int getAmount() {
        return _realAccount.getAmount();
    }
}
