
/*Write a Java program to sum values of an array input from user. Also calculate the average value of the elements.*/
import java.util.Scanner;
public class SumArray
{
    public static void main(String[] args)
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average : " + sum/n);
    }
}
