import java.util.Scanner;
// inverse digits ex: 21453 to 23154 
public class $_05_DigitInverse {
    public static void main(String[] args){
      Scanner inputDigit = new Scanner(System.in);
       System.out.print("enter digits : ");
       int digits = inputDigit.nextInt();
       int realDigits = digits;
       int inv = 0;
       int op = 1;
       while(digits != 0){
        int od = digits%10;
        int id = op;
        int ip =od;
        inv = inv + (id * ((int)Math.pow(10,ip - 1)));
        digits = digits/10;
        op++;
       }
       System.out.println("inverse of this " + realDigits + " to "  + inv);
    }
}
