package CheatSheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrixDiagnolly {

    public static void main(String[] args){
        int [][]matrix={{3,3,1,1},{2,2,1,2},{1,1,1,2}};

        int row=matrix.length;
        int col=matrix[0].length;


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<col;i++){
            sortMatrix(matrix,0,i,row,col);
        }
        System.out.println("-------------------");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void sortMatrix(int[][] matrix,int row,int col,int m,int n){
        List<Integer> array=new ArrayList<>();

        int k=0;
        int r=row;
        int c=col;
        while(r<m&& c<n){
            array.add(matrix[r][c]);
            r++;
            c++;
        }

        Collections.sort(array);

        r=row;
        c=col;
        int l=0;
       while(r<m&&c<n){
           matrix[r][c]=array.get(k++);
           r++;c++;
       }

    }
}
