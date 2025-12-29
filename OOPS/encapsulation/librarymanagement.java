package OOPS.encapsulation;

import java.util.Scanner;

class library{
    private String author;
    private String title;
    private boolean available;

    //getter and setter method for author
    public String getauthor(){//getter method
        return author;
    }

    public void setauthor(String author){//setter method
        this.author = author;
    }

    //getter and setter methods for title
    public String gettitle(){
        return title;
    }

    public void settitle(String title){
        this.title = title;
    }

     //getter and setter method for availabe
    public boolean getavailabe(){//getter method
        return available;
    }



   

    public void borrowbook(String author,String title,boolean available){
        if(available==true){
            System.out.println("you can borrow the book by"+author+"with title: "+title);
        }
        else{
            System.out.println("you cannot borrow the book");
        }

    }
    public void returnbook(){
        System.out.println("you can have the book");
    }
}





public class librarymanagement {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    System.out.println("enter the book author name: ");
    String author = s.nextLine();
    System.out.println("enter the book title name: ");
    String title = s.nextLine();
    System.out.println("enter the availablity: ");
    boolean available = s.nextBoolean();

    library lib = new library();
    lib.borrowbook(author,title,available);
    System.out.println("enter the no.of.days you had the book: ");
    
    int days = s.nextInt();
    if(days<10){
    lib.returnbook();
    }
    else{
        System.out.println("return the book!!!");
    }
    s.close();

    }


    
}
