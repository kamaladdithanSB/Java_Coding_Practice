package class_and_object;
class random{
    String brand;//it is a field
    int speed;//a field

    void drive(){
        System.out.println(brand +"is driving at"+speed+"km/h");
    }
    
}
public class example2 extends random{
    public static void main(String[] args) {
        random t1 = new example2();
        t1.brand="Honda";
        t1.speed=80;
        t1.drive();

        random t2 = new example2();
        t2.brand="audi";
        t2.speed=1000;
        t2.drive();
    }
}
