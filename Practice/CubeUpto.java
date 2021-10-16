import java.util.Scanner;
public class CubeUpto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num= input.nextInt();
        int i =1;
        System.out.println("Input number of terms : "+ num);
        for(i=1;i<=num;i++){
            long cube= (long) Math.pow(i,3);
            System.out.println("Number is : "+i+ " and cube of "+i+" is : "+ cube);
        }
    }
}
