import java.util.Scanner;

public class $_01_DigitCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = Math.abs(sc.nextLong());
        System.out.println("Number of digits: " + countDigits(num));
        sc.close();
    }
    public static int countDigits(Long num){
        int count = 0;
        while(num != 0){
            num = num/10; 
            count++;
        }
        return count;
    }
    
}
