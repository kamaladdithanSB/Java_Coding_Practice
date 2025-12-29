package OOPS.inheritance;

class vehicle{
    void start(){
        System.out.println("vehicle starts");

    }
}

class car extends vehicle{
    void drive(){
        System.out.println("car is driving");
    }
}

class sportscar extends car{
    void boost(){
        System.out.println("boost mode activiated");
    }
}

///vehicle is super class
/// car is child of vehicle
/// sports car is child of car
/// sports car invokes all properties of every class

public class multilevelinheritance{
    public static void main(String[] args) {
        sportscar sc = new sportscar();
        sc.start();
        sc.drive();
        sc.boost();
    }
}