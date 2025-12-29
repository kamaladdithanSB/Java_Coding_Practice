package exception_handling;

public class example2 {
    public static void main(String[] args) {
        try{
            String[] data = {"10","20","abc"};
            int num = Integer.parseInt(data[2]);//illegal argument...should be number but its string!
            System.out.println("Number: "+num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Index is out of range.");
        }
        catch (NumberFormatException e){
            System.out.println("Error:cannot convert non-numeric dasta to integer");
        }
        finally{
            System.out.println("multiple catch demo finished");
        }
    }
    
}
