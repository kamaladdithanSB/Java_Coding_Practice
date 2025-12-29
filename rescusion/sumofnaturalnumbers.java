package rescusion;

import java.util.Scanner;

public class sumofnaturalnumbers {
    public static int naturalsum(int n){
        if(n==0||n<0){
            return 0;
        }
        else{
            return n+naturalsum(n-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = s.nextInt();
        int result = naturalsum(n);
        System.out.println("the sum of the number is: "+result);
        s.close();
    }
}
