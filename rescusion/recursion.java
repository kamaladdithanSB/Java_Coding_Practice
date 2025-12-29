package rescusion;
import java.util.Scanner;

public class recursion {
    public static int factcal(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factcal(n-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = s.nextInt();
        int result = factcal(n);
        System.out.println("the factorial of the number is: "+result);
        s.close();
    }
    
}
