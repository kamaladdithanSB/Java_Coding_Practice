package arrays;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number of elements in array: ");
    int n = s.nextInt();
    int[] arr = new int[n];
    
    
    System.out.println("enter the elements of array: ");
    for(int i=0;i<n;i++){
         arr[i] = s.nextInt();
    }
    //sum of array
    int array_sum=0;
    for(int i=0;i<n;i++){
        array_sum=array_sum+arr[i];
    }
    System.out.println("the sum of the array is: "+ array_sum);
    s.close();
    
}
}