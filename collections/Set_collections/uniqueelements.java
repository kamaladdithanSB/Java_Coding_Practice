package collections.Set_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;

public class uniqueelements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet <Integer> numbers = new HashSet<>();

        System.out.println("Enter 5 Integers: ");

        for(int i=0;i<5;i++){
            int num = s.nextInt();
            numbers.add(num);
        }
        List <Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);

        System.out.println("\n unique numbers in sorted order: ");
        for(int n:sortedList){
            System.out.println(n+" ");
        }
        s.close();;
    }

    
}
