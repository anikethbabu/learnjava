package bank;

public class BankAccountPractice {
    public static void main(String[] args) {
    BankAccount account = new BankAccount(123123);
    account.depositFunds(10000);
    account.withdrawFund(1000);
    account.withdrawFund(101000);
        System.out.println(account.getBalance());
    }

}
