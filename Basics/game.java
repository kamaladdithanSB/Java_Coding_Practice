package Basics;
import java.util.Scanner;
    public class game{
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the move of A: ");
            String a = s.nextLine();
            switch(a){
                case "rock":
                    System.out.println("papar");
                    break;
                case "paper":
                    System.out.println("scissors");
                    break;
                case "scissors":
                    System.out.println("rock");
                    break;
                default:
                    System.out.println("invalid input");
            }
            s.close();
        }
    }

