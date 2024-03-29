package Advanced.DefiningClasses.Lab.BankAccount;

public class BankAccount {

    private static int nextID = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;


    public BankAccount(){
        this.id = nextID++;
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate (double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public double getInterest (int years){
        return balance*years*interestRate;
    }
    public void deposit(double amount){
        balance+=amount;
    }

}
