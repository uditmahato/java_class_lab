import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the digits that you want to reverse : ");
        int num =input.nextInt();
        int rev = 0;
        while(num != 0)
        {
            int remain = num % 10;
            rev = rev * 10 + remain;
            num = num/10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
