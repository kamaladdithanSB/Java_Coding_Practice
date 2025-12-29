package Data_Structures.stack;
import java.util.Stack;

public class Browsing_History {//public class
    private Stack <String> backStack;//declaring my stack from utility class
    private Stack <String> forwardStack;
    private String currentPage;//my instance
    private String homepage;


    //constructor
    public Browsing_History(String Homepage){//constructor[parameterized]
        backStack = new Stack<>();//initializing my stack
        forwardStack = new Stack<>();
        currentPage = homepage;
    }
    //visit a new webpage
    public void visit(String url){
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
    }

    //go back to the previous webpage
    public void back(){
        if(!backStack.isEmpty()){
            forwardStack.push(currentPage);//push operation adds elements
            currentPage = backStack.pop();//pop operation removes elements
        }else{
            System.out.println("no previous page available");
        }
    }
    
}
