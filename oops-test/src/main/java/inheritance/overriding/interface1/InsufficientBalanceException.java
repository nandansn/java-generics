package inheritance.overriding.interface1;

public class InsufficientBalanceException extends AccountException{
    public InsufficientBalanceException() {
        super("There is no sufficient balance");
    }
}
