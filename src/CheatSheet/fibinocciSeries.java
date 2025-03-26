package CheatSheet;

public class fibinocciSeries {
    public static void main(String[] args){
        int row=4,column=4,n=row*column;
        int matrix[][]=new int[row][column];
        int fib[]=new int[n];
        int row_start=0,row_end=row-1,col_start=0,col_end=column-1;
        int count=0;


        fib[0]=0;
        if(n>1){
            fib[1]=1;
        }
        for(int j=2;j<n;j++){
            fib[j]=fib[j-1]+fib[j-2];
        }

        int index=0;
        while(col_start<=col_end && row_start<=row_end){

            for(int i=col_start;i<=col_end;i++){
                if(count<fib.length) {
                    matrix[row_start][i] = fib[index++];
                    count++;
                }
            }
            row_start++;

            for(int i=row_start;i<=row_end;i++){
                if(count<fib.length) {
                    matrix[i][col_end] = fib[index++];
                    count++;
                }
            }
            col_end--;

            for(int i=col_end;i>=col_start;i--){
                if(count<fib.length) {
                    matrix[row_end][i] = fib[index++];
                    count++;
                }
            }
            row_end--;

            for(int i=row_end;i>=row_start;i--){
                if(count<fib.length) {
                    matrix[i][col_start] = fib[index++];
                    count++;
                }
            }
            col_start++;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
