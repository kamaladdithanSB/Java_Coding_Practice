package OOPS.inheritance;

class animal1{
    void eat1(){
        System.out.println("eating");
    }
}

class dog1 extends animal1{
    void bark1(){
        System.out.println("barking");
    }
}

class cat1 extends animal1{
    void meow1(){
        System.out.println("meows");
    }
}

public class hireachialinheritance{
    public static void main(String[] args) {
        cat1 c = new cat1();
        dog1 d = new dog1();
        c.eat1();
        d.eat1();
        d.bark1();
        c.meow1();
    }
}

