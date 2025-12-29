package arrays;

import java.util.Scanner;

public class alicemagicshoes {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of houses: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of stairs in each house: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%3==0){
                count += 1;
            }
            
        }
        System.out.println("Total number of stairs Alice has to climb: " + count);
        s.close();
    }
    
    
}
