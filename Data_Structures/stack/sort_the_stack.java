package Data_Structures.stack;
import java.util.Stack;

public class sort_the_stack {
    public static void main(String []args) {
        Stack <Integer> st1 = new Stack<>();
        Stack <Integer> st2 = new Stack<>();
        st1.push(34);
        st1.push(3);
        st1.push(31);
        st1.push(23);
        while(!st1.isEmpty()){
            int x = st1.pop();
            while(!st2.isEmpty()&&st2.peek()<x){
                st1.push(st2.pop());
            }
            st2.push(x);
        }
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        while(!st1.isEmpty()){
            int y=st1.pop();
            System.out.println(y);
        }

    }
    
}
