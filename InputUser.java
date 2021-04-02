//w.a.p to take input from user and print the sum on the creen
import java.util.Scanner;
public class InputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of a+b ="+ sum );
        sc.close();
    }
}
