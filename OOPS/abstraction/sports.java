package OOPS.abstraction;

interface player {
    void play();
}
 abstract class sportsperson implements player{
    abstract void name();
    abstract void age();
 }

 class cricketer extends sportsperson{
    void name(){
        System.out.println("the name of the player");
    }
    void age(){
        System.out.println("the age of the player");
    }
    public void play(){
        System.out.println("the player is playing cricket");
    }
 }

 class footballer extends sportsperson{
    void name(){
        System.out.println("the name of the player");
    }
    void age(){
        System.out.println("the age of the player");
    }
    public void play(){
        System.out.println("the player is playing football");
    }
 }
public class sports{
    public static void main(String[] args) {
    sportsperson sp = new cricketer();
    sportsperson fp = new footballer();
    sp.name();
    sp.age();
    sp.play();

    fp.name();
    fp.age();
    fp.play();
    }

    
}
