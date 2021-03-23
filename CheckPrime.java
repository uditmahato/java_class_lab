import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value that ypu want to check: ");
        int x = sc.nextInt();
        int count=0;
        for(int i=1;i<=x;i++){
            if( x%i==0)
            count++;
        }
        if(count==2){
            System.out.println(x+" is a prime number");
        }
        else{
            System.out.println(x+" is not a prime number");
        }

    }
}
