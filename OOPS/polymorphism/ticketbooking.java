package OOPS.polymorphism;

import java.util.Scanner;

class basicdetails{
    String name;
    int type;

    basicdetails(String name,int age){
        this.name = name;
        this.type=type;
    }

}

class bus extends basicdetails{
    int busfare;
    String destination;
    bus(String name,int type,String destination){
        super(name,type);
        this.destination=destination;
        this.busfare=busfare;
    }
    void busticket(){
        if(destination=="chennai"){
            int busfare = 1000;
        }
        else if(destination=="salem"){
            int busfare = 900;
        }
        else if(destination=="delhi"){
            int busfare=4000;
        }
        System.out.println("your bus fare for destination"+destination+"using bus is: "+busfare+"rupees");


    }
}

class train extends basicdetails{
    int busfare = 0;
    String destination;
    train(String name,int type,String destination){
        super(name,type);
        this.destination=destination;
        this.busfare = busfare;
    }
    void trainticket(){
        if(destination=="chennai"){
            int busfare = 10;
        }
        else if(destination=="salem"){
            int busfare = 90;
        }
        else if(destination=="delhi"){
            int busfare=40;
        }
        System.out.println("your bus fare for destination"+destination+"using bus is: "+busfare+"rupees");


    }
}

public class ticketbooking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = s.nextLine();
        System.out.println("type of transport 1=bus");
        System.out.println("type of transport 2=train");
        int type = s.nextInt();
        System.out.println("enter your destination");
        String destination = s.nextLine();

        bus b = new bus(name,type,destination);
        train t = new train(name,type,destination);

        if(type==1){
            b.busticket();
        }
        else{
            t.trainticket();
        }
        s.close();
    }
    
}
