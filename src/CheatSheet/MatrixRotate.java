package CheatSheet;
import java.util.*;
public class MatrixRotate {
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int count=2;
         int index=1;
         while(index<=count) {
             for (int i = 0; i < arr[0].length; i++) {
                 for (int j = i + 1; j < arr.length; j++) {
                     int temp = arr[i][j];
                     arr[i][j] = arr[j][i];
                     arr[j][i] = temp;
                 }
             }

             for (int j = 0; j < arr.length; j++) {
                 int left = 0;
                 int right = arr[j].length - 1;
                 while (left <= right) {
                     int temp = arr[j][right];
                     arr[j][right] = arr[j][left];
                     arr[j][left] = temp;
                     left++;
                     right--;
                 }


             }
             index++;
         }
        for(int []a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
