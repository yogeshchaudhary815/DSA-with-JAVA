package backtracking_22;

public class $12_GridWays{
    
    public static int findGridWays(int row , int col , int n,int m){

        //base condtion
         if(row == n-1 && col == m-1) {
            return 1;
         }else if(row == n || col == m) {
            return 0;
         }
        //
         int w1 =  findGridWays(row, col+1 , n, m);
         int w2 = findGridWays(row+1, col, n, m);
         return w1+w2;
    }

    public static void main(String[] args){
       int n = 3;
       int m = 3;
        System.out.println(findGridWays(0, 0, n, m));
    }
}