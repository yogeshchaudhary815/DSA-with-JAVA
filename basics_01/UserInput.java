import java.util.Scanner;

public class UserInput {
   public static void main(String[] args){
          Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num1 = Integer.parseInt(input.nextLine());
            System.out.println("You entered: " + num1);
            System.out.print("enter your name = ");
            String num2 = input.nextLine();
            System.out.println("your name is " + num2);
           }
}

