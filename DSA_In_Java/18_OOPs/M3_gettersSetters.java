public class M3_gettersSetters {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(101);
        account.setAccountHolderName("Mayank");
        account.setAccountBalance(1000);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountBalance());
    }

}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public void setAccountNumber(int accountNumber) { // setter method
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() { // getter method
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) { // setter method
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
