package string;
//all symbols are characters

import java.util.Scanner;

public class totalcharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = s.nextLine();
        int count = 0;
        for(char ch:str.toCharArray()){//advanced for loop
            if(ch != ' ')
                count++;
        }
        System.out.println("the total no.of .characters are: "+count);
        s.close();
    }
    
}
