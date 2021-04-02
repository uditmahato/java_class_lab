import java.util.Scanner;

public class DepositMachine {
    public static void main(String[] args) {
        int balance = 987655678;
        System.out.println("Your current balance is :- " + balance);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount that you want to deposit : ");
        int x = sc.nextInt();
        sc.close();
        System.out.print("Your new balance is " + (balance + x) + "\n" + "Thank You for using our service");
    }
}
