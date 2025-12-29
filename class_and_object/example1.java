package class_and_object;
//regular class
class car{
    void drive(){
        System.out.println("car is driving");
    }
}

    //absract class
    abstract class vehicle{
        abstract void start();//abstract method
            void stop(){//concrete method
                System.out.print("vehile stopped");
            }

        }
    
    class bike extends vehicle{
        void start(){
            System.out.println("starting");
        }
    }
    //interface
    interface drivable{
        void driver();//abract method
    }
    class circle implements drivable{
        public void driver(){//overriding method
            System.out.println("\ndriving");

        }
    }
    
    //final 
    final class constant{
        double pi=3.14;
        void bus(){
            System.out.println("bus is running");
        }
    }
    
    public class example1{
        public static void main(String[] args) {
            vehicle v = new bike();//abstract class obj
            v.start();
            v.stop();
            drivable d = new circle();//interface obj
            d.driver();
            car c = new car();//regular class obj
            c.drive();
            constant b = new constant();
            b.bus();
            System.out.println(b.pi);//accessing final class


        }
    }
    
    //in vehicle v = new bike;///allowed via reference
            //vehicle is abstract class
            //bike is regular class
            //for which class obj is created?
            //after NEW keyword...what class follows=for that only obk is created
            //...so bike class

            //now constructors will be invoked
            // //interface=blue print of the class
    

    //cannot extend this class since final keyword



    
       
    


