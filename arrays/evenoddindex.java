package arrays;
//Rearrange array so that even numbers are at even indices and odd numbers at odd indices.

import java.util.Scanner;

public class evenoddindex {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of elements in array; ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elemnts of the array: ");
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("even odd index arrangement");
        int even=0;
        int odd=1;
        int[] result = new int[n];
        
            for(int i=0;i<n;i++){
                if(arr[i]%2==0&&even<n){
                    result[even]=arr[i];
                    even = even+2;
                }
                else{
                    if(odd<n){
                        result[odd]=arr[i];
                        odd=odd+2;
                }
            }
            }
        
        for(int j =0;j<n;j++){
            System.out.print(result[j]+" ");
        }
        
        s.close();

    }
    
}
