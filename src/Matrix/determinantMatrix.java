package Matrix;

import java.util.Scanner;

public class determinantMatrix {
    public static int determin(int [][]matrix,int n){
        if(n==1)
            return matrix[0][0];
        if(n==2)
            return (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);

        int det=0;
        int sign=1;

        for(int i=0;i<n;i++){
            int [][]submatrix=getCofactor(matrix,n,i);
            det+=sign*matrix[0][i]* determin(submatrix,n-1);
            sign =-sign;
        }
        return det;
    }

    private static int[][] getCofactor(int [][]matrix,int n,int col){
        int [][]submatrix=new int[n-1][n-1];
        int rowIndex=0;
        for(int i=1;i<n;i++){
            int colIndex=0;
            for(int j=0;j<n;j++){
                if(j==col) continue;
                submatrix[rowIndex][colIndex++]=matrix[i][j];
            }
            rowIndex++;
        }
        return submatrix;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the matrix size 2-5 ");
        int n=scan.nextInt();
        if(n<2 || n>5){
            System.out.println("Matrix size must be between 2 - 5");
            return;
        }

        int matrix[][]={{1,2,3},{4,5,6},{7,10,9}};
//        int matrix[][]=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                matrix[i][j]= scan.nextInt();
//
//            }
//        }

        int det=determin(matrix,n);
        System.out.println("Determinant : "+det);

    }
}
