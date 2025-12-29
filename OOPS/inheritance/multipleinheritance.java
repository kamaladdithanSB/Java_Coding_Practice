package OOPS.inheritance;

interface printable{
    void print();
}
interface showable{
    void show();
}

class alpha implements printable,showable{
    public void print(){
        System.out.println("printing");
    }
    public void show(){
        System.out.println("showing");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        alpha obj = new alpha();
        obj.print();
        obj.show();
    }
    
}
