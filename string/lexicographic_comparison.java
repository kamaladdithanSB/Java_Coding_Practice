package string;
///;exicography means dictionary order
/// enogram=cat and act are enogram...same letters in two different words

import java.util.Scanner;

public class lexicographic_comparison {
    public static void main(String[] args) {
        //string is a class
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first string: ");
        String a = s.nextLine();
        System.out.println("enter the second string: ");
        String b = s.nextLine();
        int result = a.compareTo(b);
        if(result==0)
            System.out.println("both the strings are equal");
        else if(result<0)
            System.out.println(a+" "+"comes before"+" "+b);
        else
            System.out.println(a+" "+"comes after"+" "+b);

        s.close();
    }

    
}
