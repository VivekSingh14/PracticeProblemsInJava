package CdacFirstAssignment;


public class Account {
    
    private int accountId;
    private String name;
    private double balance;
    private OpeningDate date;
    public Account(int accountId, String name, double balance, OpeningDate date) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
        this.date = date;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public OpeningDate getDate() {
        return date;
    }
    public void setDate(OpeningDate date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Account [balance=" + balance + ", date=" + date + ", name=" + name + "]";
    }
    
    public double deposit(double amount){
        return getBalance()+amount;
    }
    public double withdraw(double amount){
        return 0.0;
    }
    
}
