import java.util.Scanner;

public class $_01_Fibonacci {
    public static void main(String[] args){
        System.out.print("enter How many Fibonacci numbers do you want? : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i<=num;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
