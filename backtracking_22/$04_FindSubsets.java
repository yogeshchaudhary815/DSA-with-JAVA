package backtracking_22;

public class $04_FindSubsets{

    public static void findSubsets(String str, String ans, int i){
        if( str.length() == i){
            if(ans == ""){
                System.out.println("null");
                return;
            }
            System.out.println(ans);
            return;
        }
        findSubsets(str , ans+str.charAt(i) , i+1);
        findSubsets(str, ans, i+1);

          return;
    }

    public static void main(String[] args){
        String str = "abc";
        findSubsets(str, "", 0);
    }
   
}
