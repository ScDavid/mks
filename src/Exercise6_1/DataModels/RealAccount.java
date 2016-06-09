package Exercise6_1.DataModels;

public class RealAccount implements IAccount {

    private int amount;

    public RealAccount(int amount) {
        this.amount = amount;
    }

    @Override
    public void withdraw(int money) {
        amount = amount - money;
    }

    @Override
    public void deposit(int money) {
        amount = amount + money;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
