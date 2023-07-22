package inheritance.overriding.interface1;

import inheritance.overriding.concrete.Account;

public class AccountException extends Exception {

    public AccountException(String message) {
        super(message);
    }
}
