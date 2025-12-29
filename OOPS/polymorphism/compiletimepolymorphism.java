package OOPS.polymorphism;
class calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a ,double b){
        return a+b;
    }
    int add(int a ,int b,int c){
        return a+b+c;
    }
}


public class compiletimepolymorphism {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(5,10));
        System.out.println(c.add(5.5,10.5));
        System.out.println(c.add(5,10,15));
        
    }
    
}
