package CheatSheet;


public class SpiralMatrixprogram25 {

    public static void main(String[] args) {
        int num = 6;
        int total = num * num;
        int matrix[][] = new int[num][num];
        int row_start = 0, row_end = num - 1, col_start = 0, col_end = num - 1;
        while(total>=1){
        for (int j = col_end; j >= col_start; j--) {
            matrix[row_start][j] = total;
            total--;
        }
        row_start++;
        for (int j = row_start; j <= row_end; j++) {
            matrix[j][col_start] = total;
            total--;
        }
        col_start++;
        for (int j = col_start; j <= col_end; j++) {
            matrix[row_end][j] = total;
            total--;
        }
        row_end--;
        for (int j = row_end; j >= row_start; j--) {
            matrix[j][col_end] = total;
            total--;
        }
        col_end--;
    }
int sum=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==j || i+j==num-1)
                    sum+=matrix[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The sum is: "+sum);

    }
}
