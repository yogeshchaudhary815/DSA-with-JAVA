import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a lowest range: ");
        int lowestNum = input.nextInt();
        
        System.out.print("Enter a highest range: ");
        int highestNum = input.nextInt();
        
        // Ensure the lowest number is less than or equal to the highest number
        if (lowestNum > highestNum) {
            System.out.println("Lowest range must be less than or equal to highest range.");
        } else {
            for (int i = lowestNum; i <= highestNum; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " is a prime number.");
                } else {
                    System.out.println(i + " is not a prime number.");
                }
            }
        }

        input.close(); // Close the scanner to prevent resource leaks
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it is prime
    }
}
