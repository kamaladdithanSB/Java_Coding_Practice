package arrays;

import java.util.Scanner;


public class symmetric2D {
    
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
        int result = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==matrix[j][i]){
                    result+=0;
                }
                else{
                    result+=1;
                }
            }
        }
            if(result==0)
                System.out.println("it is symmetric");
            else
                System.out.println("it is not symmetric");

    
    s.close();
}
    
}
