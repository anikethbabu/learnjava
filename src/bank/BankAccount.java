package bank;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    public BankAccount(int accountNumber)
    {
        this(accountNumber, 0.0);
    }
    public BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    private String phoneNumber;
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        balance = balance + deposit;
        System.out.println("You have successfully deposited " + deposit);
        System.out.println("Your bank balance is now " + balance);
    }

    public void withdrawFund(double withdraw) {
        if (withdraw > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - withdraw;
            System.out.println("You have successfully withdrawn " + withdraw);
            System.out.println("Your bank balance is now " + balance);
        }
    }
}
