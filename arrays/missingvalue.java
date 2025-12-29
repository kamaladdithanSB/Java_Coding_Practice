package arrays;
import java.util.Scanner;

public class missingvalue{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n-1;i++){
            arr[i] = s.nextInt();
        }

        int exp_sum=0;
        int act_sum=0;
        exp_sum = n*(n+1)/2;
        for(int i=0;i<n-1;i++){
            act_sum += arr[i];
        }
        int missing_value = exp_sum - act_sum;
        System.out.println("The missing value in the array is: " + missing_value);
        s.close();


    }
}
