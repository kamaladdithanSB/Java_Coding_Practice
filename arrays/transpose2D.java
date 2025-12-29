package arrays;

import java.util.Scanner;

public class transpose2D {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n = s.nextInt();
        System.out.println("enter number of columns: ");
        int m = s.nextInt();

        int[][] matrix1 = new int[n][m];
        System.out.println("enter the elements of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        
        }
        int[][] matrix2= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j] = matrix1[j][i];
            }
        }
        System.out.println("matrix after transpose is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        
        }
        s.close();
    }


    
}
