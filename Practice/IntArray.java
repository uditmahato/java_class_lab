/*Write a java program to input n integer values from user, store it into an array and print all the elements.*/
import java.util.Scanner;
public class IntArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements you want to take in array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the elements for array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("All the elements of array are : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

