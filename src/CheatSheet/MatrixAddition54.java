package CheatSheet;

import java.util.Arrays;

public class MatrixAddition54 {
    public static void main(String[] args) {

        int matrix[][] = {{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};

        /*for(int arr[]:matrix)
            Arrays.sort(arr);*/

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length-1;j++){
              if(matrix[i][j]>matrix[i][j+1]){
                  int temp=matrix[i][j];
                  matrix[i][j]=matrix[i][j+1];
                  matrix[i][j+1]=temp;
              }
            }
        }

        int score=0;
        for(int i= matrix[0].length-1;i>=0;i--){
            int large=0;
            for(int j=0;j< matrix.length;j++){
                if(matrix[j][i]>large){
                    large=matrix[j][i];
                }
            }

            score+=large;

        }
        System.out.println(score);
    }

}
