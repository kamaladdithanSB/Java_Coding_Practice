package string;

import java.util.Scanner;

public class longestword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = s.nextLine();
        System.out.println("enter the number of words: ");
        int n=s.nextInt();
        String[] newarr=(str.split(" "));
        String longest=" ";
        for(int i=0;i<n;i++){
            if(newarr[i].length()>newarr[i+1].length()){
                longest = newarr[i];
            }
        }
        System.out.println("the largest word in given string is: "+ longest);

        s.close();


    }
    
}
