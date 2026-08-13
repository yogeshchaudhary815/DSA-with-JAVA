import java.util.Scanner;

public class $_02_DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = Math.abs(sc.nextLong());
        System.out.println("Number of digits: " + countDigits(num));
        sc.close();
    }
    
    public static int countDigits(long num) {
        int NumOfDigits = (num < 10) ? 1 : 1 + countDigits(num / 10);  //      condition ? value_if_true : value_if_false;
     
        return  NumOfDigits;
    }
}
