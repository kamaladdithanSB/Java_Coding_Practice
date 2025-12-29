package OOPS.encapsulation;

class bankaccount{
    private String accountnumber;
    private double balance;

    ///instead of setter method...here we are using constructor
    public bankaccount(String accountnumber,double balance){
        this.accountnumber= accountnumber;
        this.balance=balance;
    }

    public String getaccountnumber(){
        return accountnumber;
    }
    public double getbalance(){
        return balance;
    }

    ///buisness logic is wriiten seperately in a seperate method under same class
    /// therefore...initailising in seperate method(constructor)
    /// printing the variable values in seperate method(getter)
    /// buisness logic in seperate method(below 2 methods)
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("deposited: "+amount);
        }
    }

    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance=balance-amount;
            System.out.println("withdrwan: "+amount);
            System.out.println("current balance is: "+balance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
}

public class banking {
    public static void main(String[] args) {
        bankaccount acc = new bankaccount("211238724395", 1000000);
        acc.deposit(50000);
        acc.withdraw(100000);
    }
    
}
