package Data_Structures.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MADofArray {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>();
        List <Integer> diff = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers of elements in the array: ");
        int n = s.nextInt();
        s.nextLine();
        System.out.println("NOTE 1:THE ARRAY ELEMENTS MUST BE SORTED\nNOTE 2:THE TARGET MUST BE RATIONAL");
        for(int i=0;i<n;i++){
            System.out.println("enter the element"+(i+1)+": ");
            int r = s.nextInt();
            arr.add(r);
        }
        System.out.println("the array is: "+arr);
        System.out.println("enter the target: ");
        int target = s.nextInt();
        for(int c:arr){
            int d = Math.abs(c-target);
            diff.add(d);
        }
        System.out.println("the difference array is d: "+diff);
        int m=Collections.min(diff);
        System.out.println("the Minimum absolute difference is : "+m);
        s.close();
    }
    
}
