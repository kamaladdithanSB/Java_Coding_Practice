package Basics;
import java.util.Scanner;
public class secondhighscore{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("STUDENT 1,ENTER YOUR SCORE: ");
        int a = s.nextInt();
        System.out.print("STUDENT 2,ENTER YOUR SCORE: "); 
        int b = s.nextInt();
        System.out.print("STUDENT 3,ENTER YOUR SCORE: ");
        int c = s.nextInt();
        
        if ((a>b && a<c) || (a>c && a<b)){
            System.out.println("THE SECOND HIGHEST SCORE IS: " + a);
        }
        else if ((b>a && b<c) || (b>c && b<a)){
            System.out.println("THE SECOND HIGHEST SCORE IS: " + b);
        }
        else{
            System.out.println("THE SECOND HIGHEST SCORE IS: " + c);
        }
        
    s.close();
    }

}