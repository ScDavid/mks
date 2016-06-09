package Exercise6_1.DataModels;

/**
 * @author Marco Tesch
 * @since 07.06.2016
 * @version 1.0
 */
public interface IAccount {
    
    void withdraw(int money);

    void deposit(int money);

    int getAmount();
}
