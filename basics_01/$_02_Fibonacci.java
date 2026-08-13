import java.util.Scanner;

public class $_02_Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter how many Fibonacci numbers do you want? : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fiboProcess(i) + " ");
        }
        
        input.close(); // Close the scanner to prevent resource leaks
    }

    public static int fiboProcess(int fiboNum) {
        if (fiboNum <= 1) {
            return fiboNum; // Base cases: F(0) = 0, F(1) = 1
        } else {
            return fiboProcess(fiboNum - 1) + fiboProcess(fiboNum - 2); // Recursive case
        }
    }
}
