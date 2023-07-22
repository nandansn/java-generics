package inheritance.overriding.concrete;

public class Test {

    public static void main(String[] args) {
        Account account = new Account(1000, 123456);
        System.out.println(account.getBalance());
        account.withdraw(500);
        account.deposit(200);

        System.out.println(account.getBalance());

        Account.getName();

        System.out.println("my loan account");
        LoanAccount loanAccount = new LoanAccount(10000, 212345678);
        System.out.println(loanAccount.getBalance());
        LoanAccount.getName();

        loanAccount.deposit(1000);
        System.out.println(loanAccount.getBalance());
    }
}
