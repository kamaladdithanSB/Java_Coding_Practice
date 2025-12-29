package rescusion;

import java.util.Scanner;

public class checkpalindrome {
    static boolean ispalindome(String str){
        int left = 0;
        int right= str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
            
        }
        return true;
        
    }
    public static void main(String[]args){
        Scanner q = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = q.nextLine();
        System.out.println("the string is a plaindrome: "+ispalindome(str));
        q.close();
    }
    
}
