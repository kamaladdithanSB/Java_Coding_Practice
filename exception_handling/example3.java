package exception_handling;

public class example3 {
    public static void main(String[] args) {
        try{
        int a = 10;
        int b = 0;
        int result = a/b;
        System.out.println("Result: "+result);
    }
    catch(ArithmeticException e){
        System.out.println("Error:divison by zero is not allowed");
    }
    finally{
        System.out.println("Execution completed (finally block executed)");
    }
}
}
