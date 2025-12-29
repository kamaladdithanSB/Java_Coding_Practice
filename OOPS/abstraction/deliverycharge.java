package OOPS.abstraction;

import java.util.Scanner;

abstract class delivery{
    double amount;
    delivery(double amount){
        this.amount=amount;
    }
    abstract void packagecost();//abstract method
    void total(){
        System.out.println("this is the amount before delivery: "+amount);
    }
}

class expressdelivery extends delivery{
    
    expressdelivery(double amount){
        super(amount);
    }
    double extra = amount*(0.1);
    void packagecost(){
        amount = amount+extra;
        System.out.println("the package cost+express delivery is: "+amount);
    }
}

class generaldelivery extends delivery{
    generaldelivery(double amount){
        super(amount);
    }
    void packagecost(){
        System.out.println("the package cost+general delivery is: "+amount);

    }
}

public class deliverycharge{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the  package amount: ");
        int m = s.nextInt();
        delivery general = new generaldelivery(m);
        delivery express = new expressdelivery(m);
        
        general.packagecost();
        express.packagecost();
        s.close();
    }
}
