package backtracking_22;

public class $08_NQueens{

    public static void printArr(char arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static boolean isSafe(char[][] board , int row, int col){
          
        // check diagonal leftHalf UP
        for(int i=row-1 ,j = col-1; i>=0 && j>=0; i-- , j--){

            if(board[i][j] == 'Q'){
                return false;
            }
        }
         // check diagonal RightHalf UP
        for(int i=row-1 ,j = col+1; i>=0 && j<board.length; i-- , j++){

            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // check vertical UP
        for(int i=row-1; i>=0; i--){

            if(board[i][col] == 'Q'){
                return false;
            }
        }
        
        return true;

    }

    public static void findNQueens(char board[][], int row){
        
        // base condition
        if(row == board.length){
            printArr(board);
            System.out.println("-------##--------");
            return;
        }
        //
        for(int col=0; col<board.length; col++){
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                findNQueens(board, row+1);
                board[row][col] = 'X';
            }

          
        }

        
    }

    public static void main(String[] args){
        int n = 4;        
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }

        findNQueens(board, 0);
    }
}
