package exception_handling;

public class example1 {
    public static void main(String[] args) {
        try{
        int[] arr ={10,20,30};
        System.out.println("accessing 5th element: "+arr[4]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("yo are trying to access the invalid index");
    }
    finally{
        System.out.println("the array accessed completed");
    }
}
}
