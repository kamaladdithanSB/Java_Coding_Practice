package OOPS.inheritance;

interface a{
    void methoda();
}
interface b{
    void methodb();
}
interface c extends a,b{
    void methodc();
}
class D implements c
{
    public void methoda(){
        System.out.println("its method a");
    }
    public void methodb(){
        System.out.println("its method b");
    }
    public void methodc(){
        System.out.println("its method c");
    }

}


public class hybridinheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methoda();
        obj.methodb();
        obj.methodc();
    }
    
}
