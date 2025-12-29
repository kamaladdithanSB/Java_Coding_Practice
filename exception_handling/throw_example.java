package exception_handling;

public class throw_example {
    static void checkage(int age){
        if(age<10){
            throw new ArithmeticException("not eligible to vote");
        }
        else{
            System.out.println("eligible to vote");
        }
    }
    public static void main(String[] args) {
        checkage(16);
        System.out.println("end of the program");
        
    }
    
}
