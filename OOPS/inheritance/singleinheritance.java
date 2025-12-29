package OOPS.inheritance;

class animal{
    void eat(){
        System.out.println("the animal eats grass");
    }
}


class dog extends animal{
    void bark(){
        System.out.println("the animal barks");
    }
}

public class singleinheritance{
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();//eat belongs to super class
        //eat is called by sub class here...single inheritance
        d.bark();
        
    }
}