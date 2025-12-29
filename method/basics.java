package method;

public class basics {
//concept 1: static method does not require object creation
//if static method is in same class, it can be called directly
//if static method is in different class, it can be called using class name
//concept 2: non-static method requires object creation

    static void greet(){
        System.out.println("Hello, welcome to Java programming!");
    }
    void add (int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public static void main(String args[]){
        greet();
        basics obj = new basics();
        obj.add(5,10);
    }
 
    
}
