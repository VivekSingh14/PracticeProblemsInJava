package CdacFirstAssignment;

public class AccountApp {
    public static void main(String args[]){
        Account acc1 = new Account(1, "Vivek", 0.0, new OpeningDate(2021, 03, 11));
        Account acc2 = new Account(2, "Rajesh", 0.0, new OpeningDate(2021, 03, 14));
        
        System.out.println("Amount deposited. \n"+acc1.getAccountId() +"'s total balance is: " +acc1.deposit(2000));
        System.out.println("Amount deposited. \n"+acc2.getAccountId() +"'s total balance is: " +acc2.deposit(3000));
        Account.transfer(300, acc1, acc2);

    }
    
}
