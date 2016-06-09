package Exercise6.core;

import Exercise6.DataModels.IAccount;
import Exercise6.DataModels.RealAccountProxy;
import Exercise6.DataProcessing.Input;

public class MainAccount {

    public static void main(String[] args) {
        IAccount account = new RealAccountProxy(5000, "1234");
        Input input = new Input(account);
        input.startInput();
    }
}
