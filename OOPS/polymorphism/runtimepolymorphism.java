package OOPS.polymorphism;
class parent{
    void print(){
        System.out.println("parent class");
    }
}
class subclass1 extends parent{
    void print(){
        System.out.println("subclass1");
    }
}
class subclass2 extends parent{
    void print(){
        System.out.println("subclass2");
    }
}


public class runtimepolymorphism {
    public static void main(String[] args) {
        parent a;

        a = new subclass1();
        a.print();

        a=new subclass2();
        a.print();
    }
    
}
///runtime polymorphism is same as method overriding