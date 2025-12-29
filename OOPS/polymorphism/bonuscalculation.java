package OOPS.polymorphism;

import java.util.Scanner;

class details{
    String name;
    int type;
   
    details(String name,int type){
        this.name = name;
        this.type= type;
    }

}
class permanent extends details{
    double salary;
    permanent(String name,int type,double salary){
        super(name,type);
        this.salary=salary;
    }
    void increment(){
        double bonus=salary*0.2;
        salary=salary+bonus;
        System.out.println("the incremented salary is: "+salary);;
        
    }
    
}
class contract extends details{
    double salary;
    contract(String name,int type,double salary){
        super(name, type);
        this.salary=salary;
    }
    void increment(){
        double bonus=salary*0.1;
        salary=salary+bonus;
        System.out.println("the incremented salary is: "+salary);
        
    }
    
}


public class bonuscalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = s.nextLine();
        System.out.println("option 1=permanent employee");
        System.out.println("option 2=contract employee");
        System.out.println("please choose your option below: ");
        int type = s.nextInt();
        System.out.println("enter your salary: ");
        double salary = s.nextDouble();

        permanent x  = new permanent(name,type,salary);
        contract y  = new contract(name,type,salary);
        if(type==1){
            x.increment();
        

        }
        else{
            y.increment();
            
        }
        s.close();

    }
    
}
