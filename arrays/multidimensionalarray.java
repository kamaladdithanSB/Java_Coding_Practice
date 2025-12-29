package arrays;
import java.util.Scanner;

public class multidimensionalarray{
    //two dimensional array
    public static void main(String args[]){
        int[][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        //1.traversal of the 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        
        }
        //search for an element in 2D array
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int target = s.nextInt();
        int n = matrix1.length;
        boolean found = false;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<matrix1[i].length;j++){
                if(matrix1[i][j]== target){
                    found = true;
                    break;
                }
            }
        }
        System.out.println("Element found: " + found);

        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int counter1 = 0;
        int counter2 = 0;
        int m = matrix2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                counter1 = counter1+1;
            }
        }
        
        for(int k=0;k<n;k++){
            for(int l=0;l<m;l++){
                counter2 = counter2+1;
            }
        }

        if(counter1==counter2){
            System.out.println("Both matrices symmetric.");
        }else{
            System.out.println("Matrices are not symmetric.");
        }
        s.close();

    }
    
}
//this is to specify that
