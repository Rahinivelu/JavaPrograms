package InterviewPrep;

public class Suduko {
    private static final int grid_size=9;



    public static void main(String[] args){
        int [][] board={
                {7,0,2,0,5,0,6,0,0},
                {0,0,0,0,0,3,0,0,0},
                {1,0,0,0,0,9,5,0,0},
                {8,0,0,0,0,0,0,9,0},
                {0,4,3,0,0,0,7,5,0},
                {0,9,0,0,0,0,0,0,8},
                {0,0,9,7,0,0,0,0,5},
                {0,0,0,2,0,0,0,0,0},
                {0,0,7,0,4,0,2,0,3}
        };

        if(solveBoard(board))
         System.out.println("Successfully completed!");
        else
            System.out.println("Unable to solve");

        printboard(board);



    }
    private static void printboard(int[][] board){
        for(int i=0;i<grid_size;i++){
            if(i%3==0 && i!=0)
                System.out.println("------------");
            for(int j=0;j<grid_size;j++){
                if(j%3==0 && j!=0)
                    System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }

    private static boolean IsNumberInRow(int[][] board, int number,int row){
        for(int i=0;i<grid_size;i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }

    private static boolean IsNumberInColumn(int [][] board,int number,int column){
        for(int i=0;i<grid_size;i++){
            if(board[i][column]==number){
                return true;
            }
        }
        return false;
    }

    private static boolean IsNumberInBox(int [][]board, int number,int row,int column){
        int localrownum=row-row%3;
        int localcolnum=column-column%3;
        for(int i=localrownum;i<localrownum+3;i++){
            for(int j=localcolnum;j<localcolnum+3;j++){
                if(board[i][j]==number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidNumber(int [][]board,int row,int column,int number){
        if(!IsNumberInRow(board, number, row) &&
        !IsNumberInColumn(board, number, column)&&
        !IsNumberInBox(board, number,row,column))
            return true;
        return false;
    }

    private static boolean solveBoard(int[][] board){
        for(int row=0;row<grid_size;row++) {
            for (int column = 0; column < grid_size; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <=grid_size; numberToTry++) {
                        if (isValidNumber(board,  row, column,numberToTry)) {
                            board[row][column] = numberToTry;

                            if (solveBoard(board))
                                return true;
                            else
                                board[row][column] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }






}
