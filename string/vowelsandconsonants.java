package string;

import java.util.Scanner;

public class vowelsandconsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = s.nextLine();
        int vowels=0;
        int consonants=0;
        for(char ch:str.toCharArray()){
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)!=-1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("the count of the vowels are: "+vowels);
        System.out.println("the count of the consonats are: "+consonants);

        s.close();
    }
    
}
