package OOPS.abstraction;


interface paygate{
     void checkpay();//abstract+default method
    
}

abstract class pay implements paygate{
    abstract void check();
}

class general extends pay{
    void check(){
        System.out.println("the check is for 1000rs");
    }
    public void checkpay(){
        System.out.println("the checkpay is for 10,000rs");
    }
}

public class interface_example{
    public static void main(String[] args) {
        
        pay cd = new general();
        cd.check();
        cd.checkpay();
    
    }
}