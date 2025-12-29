package arrays;

import java.util.Scanner;

public class sumof2Darray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n = s.nextInt();
        System.out.println("enter number of columns: ");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("enter the elements of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        
        }
        int matrixsum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrixsum = matrixsum+matrix[i][j];
            }
    }
    System.out.println("the sum of elements in matrix is: " + matrixsum);
     s.close();
    }
   
    
}
