import java.util.Scanner;

public class AtmMachine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pin : ");
        int a = sc.nextInt();

        if (a != 8348) {
            System.out.println("You have entered the Incorrect Pin,Please Try Again");
        } else {
            System.out.println("Enter the amount you want to withdraw: ");
            int withdraw = sc.nextInt();
            System.out.println("You have withdrawn " + withdraw + " from your account");
            int balance = 200000;
            System.out.println("Your remaining balance is " + (balance - withdraw));
        }
        sc.close();
    }
}
