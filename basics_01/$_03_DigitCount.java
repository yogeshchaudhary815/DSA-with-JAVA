
    import java.util.Scanner;
    public class $_03_DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = Math.abs(sc.nextLong()); // Handle negative numbers
        
        System.out.println("Digits of the number:");
        printDigits(num);
        
        sc.close();
    }

    public static void printDigits(long num) {
        // Special case for zero
        if (num == 0) {
            System.out.println(0);
            return;
        }
        
        // Calculate number of digits
        int digitCount = countDigit(num);
        
        // Print digits from left to right
        for (int i = digitCount - 1; i >= 0; i--) {
            long digit = (num / (long)Math.pow(10, i)) % 10; // digit = (num / (long)Math.pow(10, i)) % 10; // let 10^i be the place value 
            // 10^i for i = 5 so 10^5 = 100000 
            System.out.println(digit);
        }

}
       public static int countDigit(long num) {
        int NumOfDigits = (num < 10) ? 1 : 1 + countDigit(num / 10);  //      condition ? value_if_true : value_if_false;
     
        return  NumOfDigits; 
    }
} 


