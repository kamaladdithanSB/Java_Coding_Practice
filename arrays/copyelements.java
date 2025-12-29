package arrays;

import java.util.Scanner;

public class copyelements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of elements in array; ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elemnts of the array: ");
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("the original array is: ");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);;
        }
        int[] arr2 = new int[n];
        for(int j=0;j<n;j++){
            arr2[j]=arr[j];
        }
        System.out.println("the copied array is: ");
        for(int j=0;j<n;j++){
            System.out.println(arr2[j]);
        }
        s.close();

        
    }
    
}
