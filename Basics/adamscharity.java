package Basics;
import java.util.Scanner;
public class adamscharity{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NO.OF DAYS ADAM DOES CHARITY: ");
        int n = s.nextInt();
        int total=0;
        for(int i=1;i<=n;i++){
            total=total + (i*i);
            
        }
        System.out.println("THE TOTAL AMOUNT ADAM DONATED IS: " + total);
        s.close();  
    }
}